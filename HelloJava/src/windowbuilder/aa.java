package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class aa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aa frame = new aa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("눌러봐");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();// 지금 프레임 해제, 프레임 닫는것 // 안쓰면 메모리에 남아서 쓰레기값이쌓인댜고 ,,,,
				setVisible(false); // 지금창 안보이게
				new bb().setVisible(true); //aa.java /bb.java
				//bb 설계도의 객체를 만듬 
				
				// <<<<<<<<새창띄우기>>>>>>>>>>
				// 미리 두개의 창을 디자인해놓고
				// new 클래스이름().setVisible(true);
				// 이런식으로 키오스크를 만들ㄹㄹ 
			}
		});
		btnNewButton.setBounds(151, 180, 105, 27);
		contentPane.add(btnNewButton);
	}
}
