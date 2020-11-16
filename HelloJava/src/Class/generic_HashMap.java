package Class;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class generic_HashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		System.out.println(hm1.size()); //0			//key,value
						
		// HashMap이면서 generic ? 
		// 찾아가는 키워드(hash code)가 있어서 금방찾아갈수있음  
		// 해쉬코드 : 앞에 값이 있음 
		// arraylist는 처음부터 검색을해야하므로 조금느림 ㅇ
		
		
		
		//값 입력
				  //key(Integer),value(String)
		hm1.put(new Integer(100), "멋쟁이");	
		hm1.put(new Integer(300), "공주");	
		hm1.put(new Integer(200), "왕자");
			//add , 
		//		String s1 = hm1.get(100);
//		System.out.println(s1);
		System.out.println(hm1.get(100));
		System.out.println(hm1.get(200));
		
		// 값 삭제
		hm1.remove(300);	 
		
		if (hm1.size()>0)
			System.out.println(hm1.size());//2
		
		// value 모음 출력
		Collection <String> v1 = hm1.values();
		System.out.println(v1);
		
		// key 모음 출력
		Set<Integer> s1 =hm1.keySet();
		System.out.println(s1);
		
		// key - value 출력   (1.키모음을 만든다음에 값을찾아서 출력)
		for(Integer i : s1) {	//키모음에서 앞에서부터 1개씩 출력 
			System.out.println(i + "\t"+ hm1.get(i));	//키에 맞는 value값을 get()으로 가져옴
		}					//key		//value
		
		// key - value 출력   (2.Map.Entry -> k + v 모음)
		Set<Map.Entry<Integer,String>> set3 = hm1.entrySet();
												//?hash Map 과비슷한 모양을 종이박스에 넣는다고 ?  
		for(Map.Entry<Integer, String> k : set3) {
			System.out.println(k.getKey() + "\t" + k.getValue());
		}
		
	}

}
