package oop0920;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Test05_sungjuk {

	public static void main(String[] args) {
		//문제) 성적프로그램
		// 성적 입력 자료(sungjuk.txt)를 가져와서, 성적 결과 파일 완성하기(result.txt)
		// → input03						→ output
		
		/*
		  	1) 입력 데이터 파일 : sungjuk.txt 을 가지고
		  		- 이 텍스트 파일에서 뽑아온 텍스트들을 어떻게 배열에 넣을지?
		  		- 배열에 넣어서 성적결과를 뽑아내야함..
		  	
		  	
		  	2) 결과 결과파일을 생성 : result.txt
		  		
		  	  성 / 적 / 결 / 과
              -------------------------------------------------------
              	이름     국어   영어  수학   평균  등수   결과
              -------------------------------------------------------
		  		라일락    100   100   100    100    1     합격 ********** 장학생
              	진달래     50   55     60     55    4     불합격 *****
              	개나리     95   95     35     75    3     재시험 *******
              	무궁화     80   85     90     85    2     합격 ********
             	홍길동     60   40     30     43    5     불합격 ****
		      ------------------------------------------------------
		 
		 - 이름 5개 / 국어점수 5개 / 수학 5개 ... 평균과 등수
		 - 배열을 5개씩 잡고 한 사람에 대한 정보를 엔터를 기준으로 한 줄을 불러와서 콤마를 기준으로 토큰을 하기
		 
		 
		*/
		
		String inName="/Users/kangseonlee/Desktop/itwill/java202207/sungjuk.txt";
		String outName="/Users/kangseonlee/Desktop/itwill/java202207//result.txt";
		
		// input - 성적입력자료 가져오기
		FileReader fr=null;
		BufferedReader br=null;
		
		//성적 결과 파일 완성하기(result.txt)
		FileWriter fw=null;
		PrintWriter out=null;
		
		
		// tip! 어떤 문제를 풀 때 글로 풀어서 한번 써본다.
		// 프로젝트 할 때는 큰 그림을 그리고 소설처럼 (글로) 정리를 다 한 후에 코드를 어떻게 짤지 생각하기.
		
		
		try {
			
			// 1) 1단계 : 데이터 저장 변수 선언
//			 - 이름 5개 / 국어점수 5개 / 수학 5개 ... 평균과 등수로 배열 변수 생성하기
//			 - 배열을 5개씩 잡고 한 사람에 대한 정보를 엔터를 기준으로 한 줄을 불러와서 콤마를 기준으로 토큰을 하기
//			 - 데이터 구분을 콤마로 하면 다시 분해할 때는 콤마로 분해한다.
			
			String[] name = new  String[5];
			int[]  	  kor = new  int[5];
			int[] 	  eng = new  int[5];
			int[] 	  mat = new  int[5];
			int[] 	 aver = new  int[5];
			int 	 size = name.length;
			
			int[] rank= {1,1,1,1,1};
			int i = 0;
			
			
			//★ 2) 2단계 : 데이터 입력 파일(sungjuk.txt) 가져와서 내용을 읽도록 시키기
			fr = new FileReader(inName);
			br = new BufferedReader(fr); // BufferedReader에 담기
			

			// 가져온 sungjuk.txt 파일의 텍스트를 처음부터 끝까지 읽도록 시키는 문장
			while(true) {
				String line = br.readLine(); //커서 불러오기. 메모장 커서로 텍스트 순차적으로 읽어주는 기능.
				if(line==null) { // line 커서가 null이면 마지막까지 값을 읽었다는 의미이다.
					break;		 //마지막까지 값을 읽었으면 if문을 빠져 나간다.
				}//if end
				System.out.println(line); // 중간중간 값이 나왔는지 확인하는 작업.
				
				
				// ● , 콤마를 기준으로 문자열 분리한 후 1단계에서 선언한 변수에 저장하기 split()함수 사용
				String[] word=line.split(",");	// 콤마를 기준으로 문자열 분리한 것 배열 word변수에 넣기
				name[i]=word[0].trim();
				kor[i]=Integer.parseInt(word[1].trim());	//입력데이터의 배열이 다르거나 하면 word[1]같은 인덱스 안의 값이 달라질 수가 있다
				eng[i]=Integer.parseInt(word[2].trim());
				mat[i]=Integer.parseInt(word[3].trim());
				i++; //다음사람
			}//while end
				
			
				//3) 3단계 : 평균구하기
				for(int a=0; a<size; a++) {
					aver[a]=(kor[a]+eng[a]+mat[a])/3;
				}//for end
				
				
				//4) 4단계 : 등수구하기 (평균을 기준으로)
				for(int b=0; b<size; b++) {
					for(int j=0; j<size; j++) {
						if(aver[b]<aver[j]) {
							rank[b]=rank[b]+1;
						}//if end
					}//for end
				}//for end
				
				
				
				
				//★ 5) 5단계 : result.txt 결과 출력하기
				fw=new FileWriter(outName, false);
				out=new PrintWriter(fw, true); // 출력하는 곳. 여기는 반드시 true로.
				
				
				out.println("성/적/결/과");
				out.println("------------------------------------------------------------------");
				out.println("이름       국어   영어  수학   평균  등수   결과");
				out.println("------------------------------------------------------------------");
				
				
				
				//6) 5명의 데이터 출력하기
				for(i=0; i<size; i++) {
					out.printf("%-6s %5d %5d %5d %5d %5d　", name[i], kor[i], eng[i], mat[i], aver[i], rank[i]);
					
					//이름, 국어점수, 영어점수, 수학점수, 평균, 등수 까지 출력됨
					
					
					//7) 결과 - 과락
					if(aver[i]>=70) {
						if(kor[i]<40 || eng[i]<40 || mat[i]<40) {
							out.printf("%-10s ", "재시험"); //5칸 내에서 왼쪽정렬
						}else {
							out.printf("%-10s ", "합 격");
						}//if end
					}else {
						out.printf("%-10s ", "불합격");
					}//if end
					
					
					
					//8) 평균 10점당 별 * 한개씩
					for(int star=0; star<=aver[i]/10; star++) {
						out.printf("%s","*");
					}//for end
					
					
					//9) 평균 95점 이상이면 장학생
					if(aver[i]>=95) { 
						out.printf("%s","장학생");
					}//if end

					out.println("  "); //한사람 출력하고 줄바꿈
					
				}//for end
				
				out.println("------------------------------------------------------------------");
				
				System.out.println("result.txt 성적프로그램이 완성되었습니다.");
			
			
			
			
			
			
			
			
			
			
		/*	myCode
			//1)파일 가져오기
			fr=new FileReader(inName);
			
			br=new BufferedReader(fr); // BufferedReader에 담기
			
			String line=null;
			
			while(true) {
				line=br.readLine();
				if(line==null) { 		   //파일의 끝인지? (EOF)
					break;		 		   //반복문 빠져나감
				}//if end
//				System.out.printf("%s\n", line); //%d ++num 행번호 1씩증가, %s line 문자열 출력, \n 줄바꿈
				
				
			// 클래스. 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스.
			// public StringTokenizer(String str);
			// 문자열 쪼개는 함수 split과 차이는 ?? 
			StringTokenizer st=new StringTokenizer(line, ",");
			
			while(st.hasMoreTokens()) {
				name[idx]=st.nextToken(); //name[0]="무궁화"
				kor[idx]=Integer.parseInt(st.nextToken()); //kor[0]=90
				eng[idx]=Integer.parseInt(st.nextToken()); //eng[0]=95
				mat[idx]=Integer.parseInt(st.nextToken()); //mat[0]=60
			}//배열의 입력 자료 완료
			
			idx++;
			
			//hasMoreTokens() boolean - String Tokenizer :토큰이 존재하면 True리턴.
			
			}//while end
			
			//1) 평균 구하기
			for(idx=0; idx<size; idx++) {
				aver[idx] = (kor[idx]+eng[idx]+mat[idx])/3;
			}
			
			
			//2) 등수 구하기
			for(int a=0; a<size; a++) {
				for(int b=0; b<size; b++) {
					if(aver[a]<aver[b]) {
						rank[a]=rank[a]+1;
					}//if end
				}//for end
			}//for end
			
			
			fw=new FileWriter(outName, false);
			out=new PrintWriter(fw, true);
			
			// %s 문자열
			// %d 정수
			// %f 실수
			
			out.printf("%10s\n", "성적결과");
			out.printf("%s\n","-------------------------------------------------------");
			out.printf("%8s\n", "이름  국어   영어  수학   평균  등수   결과 ");
			out.printf("%s\n","-------------------------------------------------------");
			
			for(idx=0; idx<size; idx++) {
				out.printf("%6s %5d %5d %5d %5d %3d", name[idx], kor[idx], eng[idx], mat[idx], aver[idx], rank[idx]);
				
				
				//3) 과락
				if(aver[idx]>=70) {
					if(kor[idx]<40 || eng[idx]<40 || mat[idx]<40) {
						out.printf("\t%-5s", "재시험"); //5칸 내에서 왼쪽정렬
					}else {
						out.printf("\t%-5s", "합격");
					}//if end
				}else {
					out.printf("\t%-5s", "불합격");
				}//if end
				
				//4) 평균 10점당 별 * 한개씩
				for(int star=1; star<=aver[idx]/10; star++) {
					out.print("*");
				}//for end
				out.print("\n");
				
				
				//5) 평균 95점 이상이면 장학생
				if(aver[idx]>=95) { 
					out.printf("%-12s\n","장학생");
				}//if end
			}//for end
			
			out.printf("%s\n","-------------------------------------------------------");
			
			System.out.println("sungjuk.txt 데이터 파일 완성!!");
		*/
			
			
		} catch (Exception e) {
			System.out.println("성적프로그램 읽고, 쓰기 실패 : " + e);
		} finally {
			//자원반납
			//정상적으로 나와도 close, 비정상적으로 나와도 close 시켜줘야한다.
			try {
				if(br!=null) {br.close();}
			} catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			} catch (Exception e) {}
			try {
				if(out!=null) {out.close();}
			} catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			} catch (Exception e) {}
		}//end 
		
		
		//1. 입력 데이터 파일 : sungjuk.txt 을 가지고 - string으로 따로 뽑아햐 하는지?
		
	
		
		
	} // main() end
	
} // class end
