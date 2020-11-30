package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AAA extends JFrame {

	private JPanel contentPane;
	private JTextField txtID; //전역
	private JTextField txtPW;
	private JButton btnNewButton;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AAA frame = new AAA();
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
	public AAA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(73, 155, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(73, 195, 62, 18);
		contentPane.add(lblNewLabel_1);
		
		txtID = new JTextField();
		txtID.setBounds(149, 152, 116, 24);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtPW = new JTextField();
		txtPW.setBounds(149, 192, 116, 24);
		contentPane.add(txtPW);
		txtPW.setColumns(10);
		
		btnNewButton = new JButton("인자갖고가쟈");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//----------------------------------
				dispose(); //지금창 해제//프레임을 닫는 것
				setVisible(false);//지금창 안보이게
				String id=txtID.getText(); ////////////////
				String pw=txtPW.getText(); 
//				new BBB(id,pw).setVisible(true);
				new FFF(id,pw).setVisible(true);
				//1_ FFF 는  textField 하나만들고 시작
				//2_ AAA 에서 빨간줄나오면 change..선택   -> 그러면 FFF 자동고쳐진다
				//3_ 이때 FFF에서 textField.setText(id+","+pw)추가
				//4_ 또한 main의 FFF()/발간줄나오면 BBB(인자){} 아래에 다음처
				//-----------------------------------
			}
			
		});
		btnNewButton.setBounds(73, 89, 209, 51);
		contentPane.add(btnNewButton);
	}
}
