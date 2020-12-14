package Test1203;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class goodBurger extends JFrame implements ActionListener {

   // label
   JLabel jl1 = new JLabel("**굿버거 햄버거 입니다**");
   JLabel jl2 = new JLabel("드실 메뉴를 선택하세요");

   // button
   JButton jb1 = new JButton("매운 소스 햄버거 : 5000");
   JButton jb2 = new JButton("더블 비프 햄버거 : 7000");
   JButton jb3 = new JButton("야채새우햄버거 : 4500 ");
   JButton jb4 = new JButton("세겹토마토햄버거 : 5500");
   JButton jb5 = new JButton("주문합니다");
   JButton jb6 = new JButton("취소합니다");
   
   // combobox
   String[] age1 = { "종로", "종로외" };
   JComboBox jcb1 = new JComboBox(age1);

   String Burger = "";
   int Price = 0;
   int Count = 0;

   public goodBurger() {
       setBounds(100,100,700,500);
       setLayout(null);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);

      jl1.setText("**굿버거 햄버거 입니다**");
      jl1.setFont(new Font("굴림", Font.BOLD, 16));
      jl1.setBounds(75,25,200,100);
      add(jl1);

      jl2.setText("드실 메뉴를 선택하세요");
      jl2.setFont(new Font("굴림", Font.BOLD, 16));
      jl2.setBounds(425,25,200,100);
      add(jl2);
      
       jb1.setFont(new Font("굴림", Font.BOLD, 12));
       jb1.setBounds(50,150,250,40);
       
       jb2.setFont(new Font("굴림", Font.BOLD, 12));
       jb2.setBounds(400,150,250,40);
         
       jb3.setFont(new Font("굴림", Font.BOLD, 12));
       jb3.setBounds(50,220,250,40);
         
       jb4.setFont(new Font("굴림", Font.BOLD, 12));
       jb4.setBounds(400,220,250,40);
         
       jb5.setFont(new Font("굴림", Font.BOLD, 12));
       jb5.setBounds(50,290,250,40);
       jb5.setBackground(new Color(255,127,0));
         
       jb6.setFont(new Font("굴림", Font.BOLD, 12));
       jb6.setBounds(400,290,250,40);
       jb6.setBackground(new Color(255,255,0));
       
       jcb1.setFont(new Font("굴림", Font.BOLD, 12));
       jcb1.setBounds(50,360,250,40);

      jb1.addActionListener(this); // 버튼을 모두 이벤트로 등록////////////
      add(jb1); // 창에 버튼을 add
      jb2.addActionListener(this);
      add(jb2);
      jb3.addActionListener(this);
      add(jb3);
      jb4.addActionListener(this);
      add(jb4);
      jb5.addActionListener(this);
      add(jb5);
      jb6.addActionListener(this);
      add(jb6);
      
      jcb1.addActionListener(this);// 콤보박스
      add(jcb1);
      
      setTitle("어서오세요 굿버거입니다");
      setSize(700, 700);
      setVisible(true);
   } // 생성자-end

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if (e.getSource() == jb1) {
         Burger += jb1.getText() + "\n";
         Price = Price + 5000;
         Count = Count + 1;
      }
      if (e.getSource() == jb2) {// 댄스
         Burger += jb2.getText() + "\n";
         Price = Price + 7000;
         Count = Count + 1;
      }
      if (e.getSource() == jb3) {// 영어웅변
         Burger += jb3.getText() + "\n";
         Price = Price + 4500;
         Count = Count + 1;
      }
      if (e.getSource() == jb4) {
         Burger += jb4.getText() + "\n";
         Price = Price + 5500;
         Count = Count + 1;
      }

      if (e.getSource() == jb5) {
         String msg1 = Burger + "총금액:" + String.valueOf(Price) + "원\n" + "총주문수량:" + Count + "개";
           String[] buttons = {"확인", "취소"};
           int num = JOptionPane.showOptionDialog(jb5, msg1, "확인하세요",
                   2, JOptionPane.QUESTION_MESSAGE, null, buttons, null);
         kaja();
          
      }
      if (e.getSource() == jb6) {
         JOptionPane.showMessageDialog(jb6, "취소되었습니다");
         kaja();
      }
      
      if (e.getSource() == jcb1) {
         Price = Price - 1000;
         jcb1.setEnabled(false);
      }

   }// actionPerformed-end

   private void kaja() {
      Burger = "";
      Price = 0;
      Count = 0;
   }
}// JButtonClass-end

public class burgertest {// JButtonMainClass .java
   public static void main(String args[]) {
      new goodBurger();

   }
}// JButtonMainClass-end