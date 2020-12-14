package Sql_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Insert_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		
		// 자료 insert 
		String sql = "INSERT INTO teltable5 values(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//gui로 입력 
		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는?"));
		String name =JOptionPane.showInputDialog("이름은?");
		String tel =JOptionPane.showInputDialog("전화번호?");
		String d =JOptionPane.showInputDialog("날짜는?");
		// 입력받아서 db로 ㄱㄱ
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, d);
		
			//행 넘버링		// dml사용시 : insert , update , delete  
		int rowcnt =pst.executeUpdate(); 	//executeQuery는 조회시에만사용
		
		System.out.println(rowcnt+"행 insert함");
		
		con.close();
		System.out.println("접속끝");
		
	}
}