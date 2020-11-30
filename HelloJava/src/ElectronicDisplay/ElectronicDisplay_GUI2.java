package ElectronicDisplay;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

class EDisplay extends Frame implements ActionListener {
	static int sw = 0;
	static String s1 = "                         i love you";
	Timer t1 = new Timer();// back ground thread
	private Button b1 = new Button("시~~작~~");
	private Button b2 = new Button("끄~~읕~~");
	private TextField tf1 = new TextField();// 글상자
	/*
	 * Time sharing System shooting game 시간을 나누어 저장
	 */

	public EDisplay() {
		this.setLayout(null);// **absolute layout

		b1.setSize(200, 70);// 버튼크기
		b1.setForeground(new Color(0, 0, 255));
		b1.setBackground(new Color(255, 180, 100));
		b1.setFont(new Font("돋움", Font.BOLD, 20));
		this.add(b1);
		b1.addActionListener(this);

		b2.setSize(200, 70);// 버튼 크기
		b2.setForeground(new Color(0, 0, 255));
		b2.setBackground(new Color(255, 180, 100));
		b2.setFont(new Font("돋움", Font.BOLD, 20));
		b2.setLocation(150, 300); // 버튼 내부위치
		this.add(b2);// 버튼 추가
		b2.addActionListener(this); /// 버튼 이벤트를 위하여 이벤트등록

		tf1.setSize(400, 50);
		tf1.setForeground(new Color(0, 0, 255));
		tf1.setBackground(new Color(255, 255, 0));
		tf1.setFont(new Font("굴림", Font.BOLD, 35));
		tf1.setLocation(30, 70);// 텍스트 내부위치
		this.add(tf1);

		this.setBackground(new Color(0, 200, 0));
		this.setTitle("자바는 FUN FUN FUN !!!!!!");
		this.setSize(460, 400); // 프레임 크기
		this.setVisible(true);

		addWindowListener(new WindowAdapter() { //////////////////
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0); /// 종료 이걸안해주면 안꺼짐
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		if (e1.getSource() == b1 && sw == 0) {// 시작버튼이 눌려졌으면 (이벤트)
			b1.setEnabled(false);// 아이콘을 반투명으로 // 버튼을 눌러도 무반응 / 한번누르고 못누르게 
									// b1.setvisible(false);
			// scheduleAtFixedRate(인자1,2,3); /t1.schedule 도 가능
			// 속도지정  
			t1.scheduleAtFixedRate(new TimerTask() {
				public void run() { // 쓰레드 -런을 찾아감  ??? 타이머(쓰레드출신인데) 런이 있어야 사용할수있음 
					s1 = s1.substring(1, s1.length()) + s1.substring(0, 1);
							//substring (첫번째부터 시작해서 길이만큼 잘라라) 
							// ex) love일때 길이가 4이면  
					        // 1글자씩 뽑아서  뒤에 붙이는거 
					tf1.setText(s1);// 화면출력
				}// run-end
			}, 0, 250);// 0초 delay후 가동 // schedule-end/// 0초 지난다음 1/4 초 (250ms)마다 런메소드를 수행 
		} // if-end 					
		sw = 1; // 시작버튼이 한번만 작동되게 
		if (e1.getSource() == b2) {//b2( 끝 버튼) 눌려졌으면 (이벤트)
			t1.cancel();// 타이머끝
		}
	}// action performed-end
}// EDisplay class-end

public class ElectronicDisplay_GUI2 {
	public static void main(String[] args) {
		new EDisplay();
	}
}