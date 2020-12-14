package Connect4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q_Connect {
	// 급여가 얼마이상인  사원이거나 매니저아이디가 얼마이상인 경우에 해당되는 
	//해당사원의 이름,급여,매니저아이디를 줄력하는 jdbc프로그램 작성 
	//매니저 아이디가 null인 경우 제외  / prepare, alias 사용 ( 이름, 급여, 매니저아이디)
	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		      Connection con = null;// 접속 객체 con1선언
		      Scanner sc = new Scanner(System.in);

		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		      
		      String sql = "SELECT first_name 이름 , salary 급여 , manager_id 매니저아이디 ,"
		      		+ " FROM EMPLOYEES "
		      		+ " WHERE (salary > = ? or manager_id >= ? )"
		      		+ " AND manager_id is not null";
		      
		      //Statement st2 = con1.createStatement();
		      						// 새로만든거 
		      //준비하다                                         //
		      PreparedStatement pst = con.prepareStatement(sql);
		      
		      System.out.println("급여 얼마이상?");
		      int salary_out = sc.nextInt();
		      
		      System.out.println("매니저아이디 얼마이상?");
		      int mid_out = sc.nextInt();
		       
		      pst.setInt(1, salary_out);// 몇번째 물음표에 무얼넣을거냐?
		      pst.setInt(2, mid_out);
		      		      
		      ResultSet rs2 = pst.executeQuery();

		      while (rs2.next()) {
		    	  //alias있을경우  1)alias순서 ,2)컬럼명, 3)alias 쓸수있음
		         String name= rs2.getString("이름");
		         int salary =rs2.getInt("급여");
		         int mid = rs2.getInt("매니저아이디");
		         System.out.println(rs2.getRow() + "\t" + name + "\t" + salary + "\t" + mid);// 출력문
		      }
		      con.close();
		      System.out.println("접속끝");
		   }
}