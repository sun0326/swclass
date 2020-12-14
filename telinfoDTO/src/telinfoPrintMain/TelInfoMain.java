package telinfoPrintMain;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane; ////////////////

import TelinfovO.TelInfoVO;
import telinfoDAO.TelInfoDAO;

public class TelInfoMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

		int sel = 0;
		TelInfoDAO tidao = new TelInfoDAO();///////////////
		do {
			System.out.println("비상연락망관리!!");
			System.out.println("-------------------------------");
			System.out.println("1: 한명입력");
			System.out.println("2: 수정");
			System.out.println("3: 삭제");
			System.out.println("4: 전체출력");
			System.out.println("5: 종료");
			System.out.println("-------------------------------");
			System.out.println("이용할 메뉴를 선택하세요");

			sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));
			switch (sel) {
			case 1:
				int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는?"));
				String name = JOptionPane.showInputDialog("이름은?");
				String tel = JOptionPane.showInputDialog("전화번호는?");
				String sDate = JOptionPane.showInputDialog("날짜는?");

				boolean b1 = tidao.insert_nametel(id, name, tel, sDate);
				if (b1)
					System.out.println("insert ok");
				else
					System.out.println("insert error");
				break;
			case 2:
				String n1 = JOptionPane.showInputDialog("기존 이름은?");
				String n2 = JOptionPane.showInputDialog("바뀔 이름은?");

				boolean b2 = tidao.update_nametel(n1, n2);
				if (b2)

					System.out.println("update ok");
				else
					System.out.println("update error");
				break;
			case 3:
				int delid = Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디는?"));

				boolean del = tidao.delete_nametel(delid);
				if (del)
					System.out.println("delete ok");
				else
					System.out.println("delete error");
				break;
			case 4:
				ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
				for (TelInfoVO imsi : tiArray) {
					System.out.print(imsi.getId() + "\t");
					System.out.print(imsi.getName() + "\t");
					System.out.print(imsi.getTel() + "\t");
					System.out.println(imsi.getD());
				}
				break;
			case 5:
				int aa = JOptionPane.showConfirmDialog(null, "종료?????");
				if (aa == JOptionPane.YES_OPTION)
					System.exit(1);
				else
					JOptionPane.showMessageDialog(null, "종료안해..Good Luck!!!!!!!");

				break;
			}
		} while (sel != 5);

	}

}
