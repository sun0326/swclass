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

class Jbuttonclass1 extends JFrame implements ActionListener{
	
	JLabel l1 = new JLabel("kg주관");
	JLabel l2 = new JLabel("선발대회");
	JLabel l3 = new JLabel("잘한종목");
	
	JButton jb1 = new JButton("노래10점");
	JButton jb2 = new JButton("달리기20점");
	JButton jb3 = new JButton("댄스30점");
	JButton jb4 = new JButton("철인삼종40점");
	JButton jb5 = new JButton("어쩌구50점");
	JButton jb6 = new JButton("저쩌꾸60점");
	JButton jb7 = new JButton("취소");
	JButton jb8 = new JButton("총점");

	String [] age1 = {"10대","20대","30대"};
	JComboBox jcb = new JComboBox(age1);
	
	String hangmok = "";
	int jum = 0;
	
	public Jbuttonclass1() {
		setLayout(new GridLayout(0,3,30,30));
		
		l1.setFont(new Font("굴림",Font.BOLD,25));
		l2.setFont(new Font("굴림",Font.BOLD,25));
		l3.setFont(new Font("굴림",Font.BOLD,25));
		
		add(l1);
		add(l2);
		add(l3);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		
		jcb.addActionListener(this);
		
		add(jcb);
		
		//7취소
		jb7.setFont(new Font("굴림",Font.BOLD,30));
		jb7.setBackground(Color.BLUE);
		jb7.setForeground(Color.PINK);
		jb7.addActionListener(this);
		add(jb7);
		//8총점
		jb8.setFont(new Font("굴림",Font.BOLD,30));
		jb8.setBackground(Color.ORANGE);
		jb8.setForeground(Color.magenta);
		jb8.addActionListener(this);
		add(jb8);
		
		setTitle("kg방송국");
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {
			hangmok += jb1.getText()+ "\n";
			jum += 10;
			jb1.setEnabled(false);
		}
		if(e.getSource() == jb2) {
			hangmok += jb2.getText()+ "\n";
			jum += 20;
			jb2.setEnabled(false);
		}
		if(e.getSource() == jb3) {
			hangmok += jb3.getText()+ "\n";
			jum += 30;
			jb3.setEnabled(false);
		}
		if(e.getSource() == jb4) {
			hangmok += jb4.getText()+ "\n";
			jum += 40;
			jb4.setEnabled(false);
		}
		if(e.getSource() == jb5) {
			hangmok += jb5.getText()+ "\n";
			jum += 50;
			jb5.setEnabled(false);
		}
		if(e.getSource() == jb6) {
			hangmok += jb6.getText()+ "\n";
			jum += 60;
			jb6.setEnabled(false);
		}
		if (e.getSource() == jcb) {
			JOptionPane.showMessageDialog(jcb, (String)jcb.getSelectedItem()+"이군요");
			jum += 10;
			jcb.setEnabled(false);
		}
		if(e.getSource() == jb7) {
			hangmok = "";
			int jun = 0;
			JOptionPane.showMessageDialog(jb7, "취소");
			reset();
		}if(e.getSource() == jb8) {
			String msg1 = hangmok + "총점수는" + String.valueOf(jum)+"점입니다";
			JOptionPane.showMessageDialog(jb8,msg1); 
			hangmok = "";
			int jun = 0;
			reset();
		}
		
	}

	private void reset() {
		jb1.setEnabled(true);
		jb2.setEnabled(true);
		jb3.setEnabled(true);
		jb4.setEnabled(true);
		jb5.setEnabled(true);
		jb6.setEnabled(true);
		jb7.setEnabled(true);
		jb8.setEnabled(true);
		
	}
	
}


public class JbuttonMain { //Jbuttonmain.java
	public static void main(String[] args) {
		new Jbuttonclass1();
	}
}