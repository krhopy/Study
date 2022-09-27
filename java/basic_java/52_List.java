package oop0916;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03_List {

	public static void main(String[] args) {
		// ● Java Collection Framework ●
		// → 자료를 모아서  저장할 수 있는 클래스 및 인터페이스
		
		/*
		컬렉션(Collection) 여러 요소들을 담을 수 있는 자료구조다. 
		즉, 다수의 데이터 그룹이며 다른 말로 컨테이너(Container)라고도 부른다. 
		배열과 비슷하지만 크기가 고정된 배열을 보완하여 Re-sizable 한 특성을 가진다.
		
		결론은 컬렉션 프레임워크는 배열의 문제점을 해결하고, 
		널리 알려져 있는 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 
		java.util 패키지에 컬렉션과 관련된 인터페이스와 클래스들을 포함시킨 것이다.
		*/
		
		
		/*
		 
			★ ▷ List		: 순서(Index)가 있다. 인덱스는 0부터 시작
							  → List, Vector, ArratList ~~~ 의 부모가 Interface List<E>
							  
			★ ▷ Set			: 순서가 없다.
							  → Set, HashSet ~~~
							  
							interface Set<E> (부모)
							HashSet (자식)
							  
			  ▷ Map (JSON)	: 순서가 없다. Key와 Value로 구성되어 있다.
			  				  → Map, HashMap, Properties, HashTable ~~~
		  
		  
		  					interface MAP <K,V> (부모) // K-key, V-value
							HashMap, Properties (자식)
		  					
		  ★ - 많이 사용함

			interface List{} //interface (추상메소드만 있는 것.)	
			class Vector implements List {} // Vector의 부모가 interface이므로 implements를 사용해야함.
			class ArrayList implements List {}
			
			
			interface Set{}
			class HashSet implements Set{}
			
			
			interface Map{}
			class HashMap implements Map{}
			class Properties implements Map{}
			
			
			//다형성 (부모가 자식테이블에 들어갈 수 있다)
			List list=new Vector()
			List list=new ArrayList()
			Set set  =new HashSet()
			Map map	 =new HashMap()
				
			** = 을 기준으로 좌우 이름이 다른데 오류가 나지 않으면 다형성! **
			*원래는 Vector vec =new Vector() 이렇게 사용함.
			 
		*/
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		//Java Collection Framework은 배열을 생각하면 된다.
		
		//배열 : 자료를 모아놓을 수 있음.
		int[] num=new int[100];
		
		
//		1. List 계열
//		<E> Element 요소
		Vector vec=new Vector();
		vec.add(3);
		vec.add(2.4);
		vec.add('R');
		vec.add("KOREA");
		vec.add(new Integer(5));
		vec.add(new Double(6.7));
		
		//Integer inte=new Integer(5)	Old Version
		//Integer inte=5				New Version
		
		System.out.println(vec.size()); //6 요소의 개수
		System.out.println("-------------");
		
		
		
		for (int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}//for end
		
		System.out.println("-------------");
		
		
		
		
		vec.remove(0);					// 0번째 요소 제거하기
		System.out.println(vec.size());	//5
		
		vec.removeAllElements(); 		//vec요소 전부 제거하기
		System.out.println(vec.size());	//0
		
		if(vec.isEmpty()) { 			//요소의 개수가 0개 인지 ? 
			System.out.println("비어 있다.");
		}else {
			System.out.println("비어 있지 않다.");
		}//if end
		
		System.out.println("-------------");
		
//		-----------------------------------------------------------
		
		
		//다형성
		List list=new ArrayList();
		list.add(5);	  //index0		//이게 지워지면		
		list.add(6.7);	  //index1		//index0		//이게 지워지면		
		list.add('M');	  //index2		//index1		//index0		//이게 지워지면	
		list.add("SEOUL");//index3		//index2		//index1		//index0
		
//		문제) remove() 이용해서 list 요소를 전부 삭제
//		--> 위에서부터 인덱스를 지우면 인덱스0의 위치가 계속 변경된다.
//		--> 아래에 있는 인덱스부터 지워야한다.
		
		System.out.println(list.size()); //4 - 위에 작성된 list.add의 개수가 4개라는 뜻!
		
		System.out.println("-------------");
				
		
//		문제) remove() 이용해서 list 요소를 전부 삭제
		
//		[내가 작성한 코드]
		
		/*
		for(int i=0; i<list.size(); i++) {
				list.remove(i--);
			}

		System.out.println(list.size()); //0
		*/

//		참고블로그 
//		https://youwn.tistory.com/entry/ArrayList%EC%9D%98-remove-%EC%82%AC%EC%9A%A9-%EC%8B%9C-%EC%A3%BC%EC%9D%98%EC%A0%90
		
		
		
		
		
//		[강사님 코드]
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}//for end
		
		System.out.println(list.size()); //0
		
		
		
		
	} // main() end
	
} // class end
