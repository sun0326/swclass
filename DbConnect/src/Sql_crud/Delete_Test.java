package Sql_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Delete_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		
		// 자료 delete
		String sql = "DELETE FROM teltable5 WHERE id = ? ";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//gui로 입력 
		int id = Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디는?"));
		pst.setInt(1, id);
			
		int rowcnt =pst.executeUpdate(); 	//executeQuery는 조회시에만사용
		
		System.out.println(rowcnt+"행 delete함");
		
		con.close();
		System.out.println("접속끝");
		
	}
}