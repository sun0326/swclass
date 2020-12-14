package Connect2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connection_Test {

   public static void main(String[] args) 
		   throws ClassNotFoundException, SQLException {
      // TODO Auto-generated method stub
      Connection con1 = null; // 접속객체 con1선언
      Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버로딩
      // 소대문자, 띄어쓰기 //스태틱메소드(new없이 사용)

      ///////// DB접속										//127.0.0.1은 루프백 아이피다;
      con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr"); 
                                             							// SID //user_id //password
      //조건을 입력받아서 검색 (조건)
      Scanner sc= new Scanner(System.in);
      System.out.print("검색이름  ? : ");
      String input_name= sc.nextLine();
      
     // System.out.println("접속했습니다.");
     String sql2 = "select * from employees"
 		 // 조건을 정해서 검색! 
     		//	+ " where department_id = 30";
     			//(주의)employees 와 where 사이를 띄어주지 않으면 에러!!!!
     			// sql문 사용시 줄을 바꾸면 무조건 한칸 띄우고 시작할것 !!!!! 
    		 //	+ " where upper(first_name) = 'STEVEN'";
    		 
    	// 조건을 입력(Scanner)받아서 검색!
     		//	+ " where upper(first_name) = '" + input_name + "'";
     			// 귀찮쓰 ............ 문법있음 문법사용 ㄱㄱ 
     	//
    		 	+ " where upper(first_name) = ?"; 
     		//전체 문장이 아직 결정 안된상태 -> 문법이 달라짐

     // sql문장은 맞지만 역할은 x
     Statement st2 = con1.createStatement();
     // 문장       //문장객체    	   //sql문장이 됨
      //접속객체 con1 ,문장객체 st2
     ResultSet rs2 =st2.executeQuery(sql2);
     //종이박스에 들어감 	 //문장이 수행되면서  검색결과나옴
     
     //손가락을 대서 첫줄부터 읽어가면서 다음줄로 넘어가는 것처럼 위부터 아래로 읽어감
     // for or while을 사용해서 읽어가면됨 ! 
     
     	//종이박스 	 //문장객체.execute
     while(rs2.next()) {//손가락으로 짚은데 date가 있는지 물어봄, 없으면 while 종료 
    	 int id = rs2.getInt("employee_id");
    	 	//int id =rs2.getint(1); ->객체.메소드
    	 String fname = rs2.getString("first_name");
    	 	//String fname =rs2.getString(2);
    	 String h_date = rs2.getString("hire_Date");
    	 String hire_date =h_date.substring(0, 10);
    	 //2008-01-12					//0~10번째 ? 시간이 붙어있을수도 있으므로 잘라서사용
    	 System.out.println(rs2.getRow()+"\t"+id+"\t"+fname+"\t"+hire_date);
    	 					//열(row)의 번호
     }//while_end
     
     con1.close();//
     System.out.println("접속 끝");//
   }
   
}