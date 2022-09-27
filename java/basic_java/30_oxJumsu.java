package oop0913;

public class Jumsu {

//	[멤버변수 field]
	private int no; 				//번호
	private String name; 			//이름
	private char[] ox=new char[5];  //OX (배열)
	private int[] answer=new int[5];//답안지 제출 (목록엔 없지만 따로 추가해줘야한다)
	public int score;				//점수
	public int rank;				//등수
	
	// 답안지 제출하는게 빠짐
	
	
	
	
//	[생성자함수 constructor]
	public Jumsu() {}
	
	public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
		this.no=no;
		this.name=name;
		this.answer[0]=a0;
		this.answer[1]=a1;
		this.answer[2]=a2;
		this.answer[3]=a3;
		this.answer[4]=a4;
		this.rank=1;
	}//end
	
	
//	[멤버함수 method]
	public void compute() {
		//정답 
		int[] dap= {3,3,3,3,3};
		
		//문제) 정답(dap)과 제출한 답안(answer)를 비교해서 OX를 구하고
		//맞은 개수에 따라 점수(score)를 구하시오.
		
		/*
		  if(dap[0]==answer[0])
		  if(dap[1]==answer[1])
		  if(dap[2]==answer[2])
		  if(dap[3]==answer[3])
		  if(dap[4]==answer[4])
		*/

		
//		[강사님 풀이]
		for(int i=0; i<5; i++) {
			if(dap[i]==answer[i]) {	//맞았을 때
				ox[i]='O';
				score+=20;
			}else { 				//틀렸을 때
				ox[i]='X';
			}//id end
		}//for end
		
		
		
	/* 내가 작성한 코드..
		for(int i=0; i<dap.length; i++) {
			for (int j=dap[i]; j<answer.length; j++) {
				if(dap[i]==answer[j]) {
					score=score+20;
				}else {
					score+=0;
				}	
			}//for end
		}//for end
	*/
		
			
	}//compute() end
	
	
//	----------------------------------------------------------------
	
	
	public void disp() {
		System.out.print(no+" "); 
		System.out.print(name+" ");
		System.out.print(ox[0]+" ");
		System.out.print(ox[1]+" ");
		System.out.print(ox[2]+" ");
		System.out.print(ox[3]+" ");
		System.out.print(ox[4]+" ");
		System.out.print(score+" ");
		System.out.print(rank+" ");
		System.out.println();
	}//disp() end
	
}//class end
