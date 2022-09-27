package oop0914;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02_Calendar {

	public static void main(String[] args) {
		
//		● Calendar 날짜 관련 클래스 ● (년월일시분초 요일)
//		GregorianCalendar
//		Calendar
//		date
		
		GregorianCalendar now = new GregorianCalendar();
		
		System.out.println(now.get(1));		//년
		System.out.println(now.get(2));		//월	 (-1 값이 나온다)
		System.out.println(now.get(2)+1);	//월	 (+1 해줘야 현재 달이 나옴)
		System.out.println(now.get(5));		//일
		
		System.out.println("---------");
		
		System.out.println(now.get(Calendar.YEAR));		//년
		System.out.println(now.get(Calendar.MONTH));	//월	 (-1 값이 나온다)
		System.out.println(now.get(Calendar.MONTH)+1);	//월	 (+1 해줘야 현재 달이 나옴)
		System.out.println(now.get(Calendar.DATE));		//일

		System.out.println("---------");
		
		//24시간을 기준으로
		System.out.println(now.get(Calendar.HOUR_OF_DAY));	//10 (현재 10시43분)
		//요일(1일 2월 3화 4수 5목 6금 7토
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	//4 (현재 수요일)		
		
		System.out.println("---------");
		
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

		
//		[날짜 데이터의 연산]
		
//		- now날짜에 3년 더하기
		now.add(Calendar.YEAR, 3);	//2022+3
		System.out.println(now.get(Calendar.YEAR));
		
//		- now날짜에 5달 빼기
		now.add(Calendar.MONTH, -5);//8-5=4
		System.out.println(now.get(Calendar.MONTH));
		
//		- now날짜에 7일 더하기
		now.add(Calendar.DATE, 7);	//14+7=21
		System.out.println(now.get(Calendar.DATE));
		
		System.out.println("---------");
		
		
//		-----------------------------------------------------------------------------------	

//		[날짜 데이터 구성하기]
		
//		1989년 5월 30일
		GregorianCalendar myBirth=new GregorianCalendar();
		myBirth.set(Calendar.YEAR, 1989);
		myBirth.set(Calendar.MONTH, Calendar.MAY); // MONTH는 -1값이 오는데 Calendar.MAY를 쓰면 편하다.
		myBirth.set(Calendar.DATE, 30);
		
		System.out.println(myBirth.get(Calendar.YEAR));
		System.out.println(myBirth.get(Calendar.MAY));
		System.out.println(myBirth.get(Calendar.DATE));

		
		
		
		
		
		
		
	} // main() end
} // class end
