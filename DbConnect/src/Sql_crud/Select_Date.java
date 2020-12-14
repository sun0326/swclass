package Sql_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class Select_Date {
	
	// to_date 사용

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		
		// select 할때 to_date()한것을 to_char()하여 날짜와시간을 문자로 처리해 출력한다
		String sql = "SELECT id, name, tel ,to_char(d,'yyyy) from teltable5 where name = ?";
		PreparedStatement ps2 = con.prepareStatement(sql);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할이름 : ");
		String str_name =sc.next();
		ps2.setString(1, str_name);
		
		//ResultSet rs2 = st2.executeQuery(sql);
		ResultSet rs22 = ps2.executeQuery();	
					//to_char 때문에 종이상자에 문자형태로 날짜및 시간이들어가 있음
		while(rs22.next()) {
			int id =rs22.getInt("id");
			String name = rs22.getString("name");
			String tel = rs22.getString("tel");
			String strD = rs22.getString(4);
			
			System.out.println(rs22.getRow()+id+"\t"+name+"\t"+tel+"\t"+strD);
		}
		con.close();
		System.out.println("접속끝");
		
	}
}