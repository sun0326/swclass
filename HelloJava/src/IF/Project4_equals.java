package IF;

public class Project4_equals {

	public static void main(String[] args) {
		
		String ppp=null;
		String qqq =""; // ���ڿ� , ���̰� 0�� ���ڿ�  
		
		//���� : �ѹ��� 'A' , ���ڿ� : �������� "A" , "tom"
		
		
		String yy = "ondal";
		
		//System.out.println(ppp.length()>0)); //null pointer error
		//System.out.println(qqq.length()>0)); //false
		
		String aa = "ondal";
		String bb = "ondal";
		if(aa==bb)			// => ������ 
			System.out.println(aa+"\t"+bb);
	
		if(aa.equals(bb))   // => ����� 
			System.out.println(aa+"\t"+bb);			

		String aa2 ="ondal2";
		String bb2 ="ondal3";
	
		if(aa2==bb2)			// => ������ 
			System.out.println("���̾ȳ���!!");
		
		if(aa2.equals(bb2))   //�Լ�,�޼ҵ� //���� 
			System.out.println("���̾ȳ���! ");			
		
		String cc= new String("ondal");
		String dd= new String("ondal");
		
		if(cc==dd)
			System.out.println("�������ٸ��� �̰��� ��¾���");
		if(cc.equals(dd))
			System.out.println("���� ������ �̰��� ��� ");
	
		/*
		  String aa = "ondal";
	      String bb = "ondal";
	      String cc = new String("ondal");
	      String dd = new String("ondal");
	         // '==' String �ּҰ� ������ Ȯ��  
	         // '.equals'String ������ ������ Ȯ��
	      System.out.println(aa==bb);
	      System.out.println(aa==cc);
	      System.out.println(aa.equals(bb));
	      System.out.println(aa.equals(cc));
	      System.out.println(cc==dd);
	      System.out.println(cc.equals(dd));
		*/	
		}						
		
		
}


