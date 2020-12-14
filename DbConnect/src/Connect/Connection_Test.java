package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Test {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      // TODO Auto-generated method stub
      Connection con1 = null; // 접속객체 con1선언
      Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버로딩
      // 소대문자, 띄어쓰기 //스태틱메소드(new없이 사용)

      ///////// DB접속										//127.0.0.1은 루프백 아이피다;
      con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr"); 
                                             							// SID //user_id //password
      System.out.println("접속했습니다.");
   }
   
}