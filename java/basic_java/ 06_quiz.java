package oop0905;

public class Test06_quiz {

	public static void main(String[] args) {
		// 연습문제
		// 참조 : 지폐개수 구하는 문제
		/*
			1년 : 365.2422일
			출력결과 : 365일 5시간 48분 46초
			
			1분 : 60초
			1시간 : 60분*60초 = 3600초
			1일 : 24시간*3600초 = 86400초
			1년 : 365.2422*86400 = 31,556,926.08
		 
		*/
		
		double year=365.2422;
		int total=(int)(year*86400);
		
		int day= total/86400;
		total=total%86400;
		
		int time = total/3600;
		total=total%3600;
		
		int boon = total/60;
		total=total%60;
		
		//int cho = total/1;
		
		System.out.print(day + "일 ");
		System.out.print(time + "시간 ");
		System.out.print(boon + "분 ");
		System.out.print(total+ "초");
		
		
		
		
		
	}//main() end

}//class end
