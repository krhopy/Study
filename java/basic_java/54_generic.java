package oop0916;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

class Mountain {
	String name;	//산이름
	int height;		//산높이
	
	public Mountain() {}

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}//end
}//class end





public class Test05_generic {

	public static void main(String[] args) {
		// 제네릭 Generic
		/*
		  	- 요소를 수집하는 경우에 특정 자료형으로 제한할 수 있다
			- <E>	Element
			- <K,V>	Key, Vaelue
			- <T>	
			- <?>
		 	- <참조자료형>
		*/
		
		//int형만 num배열에 대입 가능하다
		int[] num=new int[3];
		
		//Vector<int> 기본자료형은 올 수 없다. 에러
		Vector<String> vec=new Vector<>();
		vec.add("개나리");
		vec.add("진달래");
		vec.add(new String("무궁화"));
//		vec.add(3);					  //int형 에러 String만 올 수 있음
//		vec.add(2.4);				  //int형 에러
//		vec.add(new Character('R'));  //character형 에러
		
		
		for(int i=0; i<vec.size(); i++) {
			String str=vec.get(i);
			System.out.println(str);
		}//for end
		
		
//		-----------------------------------------------------------
		
//		Vector는 데이터를 많이 잡아먹는다
//		Integer형 모음
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(new Integer(5));
//		list.add(2.4);		에러 : Integer형이 아니기 때문 double
//		list.add("KOREA");	에러	: Integer형이 아니기 때문 String
		
//		-----------------------------------------------------------
		
//		Double형 모음
		HashSet<Double> set=new HashSet<>();
		set.add(1.2);
		set.add(new Double(3.5));
//		set.add(7);		에러 : int형
//		set.add("");	에러	: String형
		
//		-----------------------------------------------------------
		
		
		HashMap<String, Character> map=new HashMap<>();
		map.put("one", 'R');
		map.put("two", new Character('r'));
//		map.put("", "");   에러 : 뒤에 String옴
		System.out.println(map.get("one"));
		
		
//		-----------------------------------------------------------
		
		Mountain m1=new Mountain("한라산", 1950);
		Mountain m2=new Mountain("관악산", 1500);
		Mountain m3=new Mountain("북한산", 1000);
		
//		데이터베이스에서 자주 사용할 예정
		
		ArrayList<Mountain> item=new ArrayList<>();
		
		item.add(m1);
		item.add(m2);
		item.add(m3);
//		item.add("");	다른 자료형이 오면 에러
		
		
		for(int i=0; i<item.size(); i++) {
			Mountain m=item.get(i);
			System.out.println(m.name);
			System.out.println(m.height);
		}//for end
		
		
//		내가 모은 것을 풀 때는 모은 순서 반대로 풀어주면 된다. (포장한 선물을 누군가가 뜯을 때를 생각해보자)
//		선물 포장 - 물건 포장지로 감싸고 리본을 묶는다
//		선물 뜯을 때 - 리본 풀고 포장지 뜯는다 (포장의 반대)
		
		
		
		

	} // main() end
	
} // class end
