package oop0916;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

public class Test04_SetMap {

	public static void main(String[] args) {
		
		//2. Set 계열 : 순서가 없다
		
		Set set=new HashSet();
		set.add(3);				//set.size(1)		
		set.add(2.4);			//set.size(2)
		set.add('R');			//set.size(3)
		set.add("BUSAN");		//set.size(4)
		set.add(new Integer(7));//set.size(5)

		System.out.println(set.size());	//5
		
		
//		set.add에는 커서가 존재하는데 index0부터 마지막까지 조작을 할 수 있다.
//		마지막까지 내려가서 값이 없을 떈 false를 준다.
				
		
//		● cursor : 가리킬 요소가 있으면 true, 없으면 false 값 반환
//		[cursor를 이용해서 요소를 접근하는 경우]
		
		Iterator iter =set.iterator(); //cursor 함수
		while(iter.hasNext()) {	//다음 커서가 존재하는지?
			//cursor가 가리키는 요소 가져오기
			Object obj=iter.next();
			System.out.println(obj);
		}//while end
		
		System.out.println("-------------");

		
		
//		----------------------------------------------------
		
//		3. Map계열 : 순서가 없다
//		→ Key	: 이름표
//		→ Value	: 값
		
//		JSON, 파이썬(딕셔너리), NoSQL등에서 많이 사용하는 문법
		
		HashMap map=new HashMap();	//순서가 없기때문에 put순서대로 나오지 않음.
		map.put("one", 3);
		map.put("two", 2.4);
		map.put("three", 'R');
		map.put("four", "손흥민");
		//map.put(이름표, 값)
		
		System.out.println(map.size());
		
		System.out.println(map.get("four"));
		//map.get(이름표) 적어주면 값이 나온다.
		
		map.put("four", "박지성");
		//여기서 "four"값을 다시주면 	map.put("four", "손흥민"); 이 값이 사라지고 박지성이 들어간다.
		System.out.println(map.get("four"));
		
		System.out.println("-------------");
		
		
//		----------------------------------------------------
	
//		[Properties 클래스]
//		쇼핑 후 메일 날아옴 -> 메일서버가 있어야함 -> 메일값을 properties값을 달라고 요청함
		Properties db=new Properties();
		
		db.put("url", "http//localhost:1521");
		db.put("username", "itwill");
		db.put("password", "12341234");
		
		System.out.println(db.get("url"));
		System.out.println(db.get("username"));
		System.out.println(db.get("password"));
		
		System.out.println("-------------");

		
//		----------------------------------------------------

//		문제) = 문자를 기준으로 문자열을 분리해서 
//			 = 앞의 문자열은 key, = 뒤의 문자열은 value 값으로 구분해서 hm에 저장하고
//			 hm의 key값들 중에서 "read.do"를 호출하면
//			 value값으로 net.bbs.Read 출력하시오
		
		HashSet	command=new HashSet();
        command.add("list.do=net.bbs.List");
        command.add("read.do=net.bbs.Read");
        command.add("write.do=net.bbs.Write");
		
		
        System.out.println(command.size()); //3
        
        HashMap hm=new HashMap();
        
        
//      1) 커서 생성하기
        Iterator cursor=command.iterator();
        
        
//      2) 커서가 있을 때까지 반복
        while(cursor.hasNext()) {
        	//3)커서가 가리키는 요소를 가져와서 문자열 형변환
        	Object obj=cursor.next();
        	String line=(String)obj;//다형성
        	//System.out.println(line);
        	
        	
//          4) "=" 위치를 기준으로 문자열 분리하기
//          → split(), substring(), StringTokenizer 클래스
	        String[] word=line.split("=");
	        String key  =word[0];	//"=" 앞 문자열
	        String value=word[1];	//"=" 뒤 문자열은
	        System.out.println(key);
	        System.out.println(value);
        	
//	        5)hm에 저장하기
	        hm.put(key, value);
        }//while end

		//결과값
		System.out.println(hm.get("read.do"));


        
	} // main() end
	
} // class end
