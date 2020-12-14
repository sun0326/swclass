package Sql_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Update_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		
		// 자료 update
		String sql = "UPDATE teltable5 SET tel = ?, name = ? WHERE id = ? ";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//gui로 입력 
		int id = Integer.parseInt(JOptionPane.showInputDialog("검색할id?"));
		String name = JOptionPane.showInputDialog("수정할 이름?");
		String tel = JOptionPane.showInputDialog("수정할 전화번호?");

		pst.setString(1, tel);
		pst.setString(2, name);
		pst.setInt(3, id);
			
		int rowcnt =pst.executeUpdate(); 	//executeQuery는 조회시에만사용
		
		System.out.println(rowcnt+"행 update함");
		
		con.close();
		System.out.println("접속끝");
		
	}
}