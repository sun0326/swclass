package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class BBB extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BBB frame = new BBB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public BBB(String id, String pw) {//인자가 있는 생성자 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(61, 37, 272, 115);
			contentPane.add(textArea);
			
			//이줄은 추가로 입력=================================
			textArea.setText("id="+id+ "이고   pw="+pw+"이군요");
			//===============================================
			//액박을 눌러 BBB(String,String)으로 변경
			//액박을 눌러 BBB() 생성자 만듬
		}
		public BBB() {
			getContentPane().setLayout(null);
			
		}
}
