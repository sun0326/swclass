package windowbuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class BurgerClass extends JFrame implements ActionListener{
	
	JLabel l1 = new JLabel("**굿버거 햄거버 입니다**");
	JLabel l2 = new JLabel("드실 메뉴를 선택하세요");
	
	JButton b1 = new JButton("매운 소스 햄버거 : 5000");
	JButton b2 = new JButton("더블 비프 햄버거 : 7000");
	JButton b3 = new JButton("야채 새우 햄버거 : 4500");
	JButton b4 = new JButton("세겹토마토햄버거 : 5500");
	JButton b5 = new JButton("주문합니다");
	JButton b6 = new JButton("취소합니다.");
	
	String order = "";
	int price = 0;
	int count = 0;
	
	String[] age = {"종로","종로외"};
	JComboBox jcb = new JComboBox(age);
	
	public BurgerClass() {

		setLayout(new GridLayout(0,2,30,30));
		
		l1.setFont(new Font("굴림", Font.BOLD, 25));
		l2.setFont(new Font("굴림", Font.BOLD, 25));
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b4.setFont(new Font("굴림", Font.BOLD, 20));
		b5.setFont(new Font("굴림", Font.BOLD, 20));
		b6.setFont(new Font("굴림", Font.BOLD, 20));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		b5.setFont(new Font("굴림", Font.BOLD, 25));
		b5.setForeground(Color.red); 
		b5.setBackground(Color.BLUE);
		b6.setFont(new Font("굴림", Font.BOLD, 25)); 
		b6.setForeground(Color.MAGENTA);
		b6.setBackground(Color.ORANGE);
		

		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		jcb.addActionListener(this);
		add(jcb);
		
		setSize(700,500);
		setTitle("어서오세요 굿버거입니다");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
				order += b1.getText()+"\n";
				price += 5000;
				count++;
			}
			if(e.getSource() == b2) {
				order +=  b2.getText() + "\n";
				price += 7000;
				count++;
			}
			if(e.getSource() == b3) {
				order +=  b3.getText() + "\n";
				price += 4500;
				count++;
			}
			if(e.getSource() == b4) {
				order += b4.getText() + "\n"; 
				price += 5500;
				count++;
			}
			if(e.getSource() == b5) {
				String msg = order + "총금액"+ price +"원\n"+ "총주문수량"+ count+"개";
				JOptionPane.showConfirmDialog(b5, msg,"확인하세요",JOptionPane.YES_NO_OPTION);
				reset();
			}
			if(e.getSource() == b6) {
				JOptionPane.showMessageDialog(b6, "취소되었습니다");
				reset();

			}
			if(e.getSource() == jcb) {
				price = price - 1000 ;
				jcb.setEnabled(false);
				if(count==0) {
					price = price +1000;
				}
			}
	}
		
		public void reset() {
			order = "";
			price = 0;
			count = 0;	
			jcb.setEnabled(true);
		}
	
}

public class JbuttonTest {
	public static void main(String[] args) {
		new BurgerClass();

	}

}
