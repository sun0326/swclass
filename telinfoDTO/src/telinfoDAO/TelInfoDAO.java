package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;//////////////////
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO {
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public TelInfoDAO() throws ClassNotFoundException, SQLException {

		con = new TelInfoDBConn().getConnection();

	}

	// 전체출력을 위해
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException {
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
		String sql = "SELECT * FROM TelTable5 ORDER BY id";

		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			Date d = rs.getDate("d");

			TelInfoVO tv = new TelInfoVO(id, name, tel, d);

			tiarray.add(tv);
		}
		return tiarray;
	}

//########### 1) insert_nametel() 작성방법  - 날짜처리 (1)

	/*
	 * public boolean insert_nametel(int id, String name, String tel, String sDate)
	 * throws ParseException{ String sql = "insert into TelTable5 values(?,?,?,?)";
	 * try{ pstmt=con.prepareStatement(sql); pstmt.setInt(1, id); pstmt.setString(2,
	 * name); pstmt.setString(3, tel);
	 * 
	 * 
	 * int year = Integer.parseInt(sDate.substring(0,4))-1900; int
	 * month=Integer.parseInt(sDate.substring(4,6))-1; int day =
	 * Integer.parseInt(sDate.substring(6,8)); Date d = new Date(year,month,day);
	 * pstmt.setDate(4, d);
	 * 
	 * pstmt.executeUpdate();/////////// }catch(SQLException e){
	 * System.out.println("insert Exception~~~"); return false; } return true; }
	 */

//########### 2) insert_nametel() 작성방법  - 날짜처리(2)    
	// 20160908
	public boolean insert_nametel(int id, String name, String tel, String sDate) throws ParseException {
		String sql = "insert into TelTable5 values(?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);

			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
			java.util.Date d2 = sdf2.parse(sDate);
			java.sql.Date sdate1 = new java.sql.Date(d2.getTime());
			pstmt.setDate(4, sdate1);

			pstmt.executeUpdate();///////////
		} catch (SQLException e) {
			System.out.println("insert Exception~~~");
			return false;
		}
		return true;
	}

	public boolean update_nametel(String name, String name2) {
		String sql = "update TelTable5 set name=? where name=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name2);
			pstmt.setString(2, name);
			pstmt.executeUpdate();///////////////
		} catch (SQLException e) {
			System.out.println("update Exception~~~");
			return false;
		}
		return true;
	}

	public boolean delete_nametel(int id) {
		String sql = "delete from TelTable5 where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();//////////
		} catch (SQLException e) {
			System.out.println("delete Exception~~~");
			return false;
		}
		return true;

	}
}
