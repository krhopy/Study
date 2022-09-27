package oop0919;

import java.util.Vector;

// 상품 구매 관련 클래스
public class Order {

	private int myMoney=1000;	// 나의 총 재산
	private int myMileage=0;	// 나의 마일리지 점수(bonusPoint에 누적시키기)
	private int i=0;
	
	//상품을 구매했을 때 어떤 상품을 구매했는지 저장시켜야함. (나의 구매상품 목록)
	private Vector<Product> item=new Vector<>();
	// 이걸 변경하면 밑에 item 변수가 모두 에러남.
	// item.___() 함수로 바꿔야한다.

	public Order() {}	
	
	public void buy(Product p) {
		
		if(p.price>this.myMoney) {
			System.out.println("잔액이 부족합니다!!");
			return;
		}//if end
		
		
		item.add(p);  //구매상품 저장 해야하기 때문에 item.add() 함수를 사용해야한다.
		this.myMoney=this.myMoney-p.price; 		   //나의 재산은 감소
		this.myMileage=this.myMileage+p.bonusPoint;//나의 마일리지는 증가
		
		
		
		/*  
		    잔액부족 문제풀기 myCode
			if(this.myMoney<=0) {
				System.out.println("잔액이 부족합니다.");
				return;
			}//if end
		*/
		
	}//buy() end
	
	public void disp() {
		
		if(item.isEmpty()) {
			System.out.println("구매상품 없음!!");
			return;
		}//if end
		
		
		// 구매 상품 목록
		StringBuilder shoplist=new StringBuilder();
		
		//사용금액
		int hap = 0;
		
		for(int n=0; n<item.size(); n++) {
//			if(item[n]==null) {	// 상품이 있을 때만 확인해야하므로 조건을 준다.
//				break;
//			}//if end
//			--> 위에 item.isEmpty() 조건을 줬다.
			Product p =item.get(n);				 //상품 하나씩 가져와서 Product p 변수에 넣기.
			shoplist.append(p.toString() + " "); //상품명
			hap=hap+p.price;
		}//for end
		
		
		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("사용금액 : " + hap);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	}//disp() end
	
	
	
	//반품을 하면 사용금액에 -p.price 되어야하고, 마일리지는 +p.bonusPoint 증가해야한다
	
	public void refund(Product p) {
		if(item.remove(p)) {
			System.out.println(p.toString() + "반품되었습니다.");
			this.myMoney  =this.myMoney+p.price; 		   
			this.myMileage=this.myMileage-p.bonusPoint;
		}else {
			System.out.println("구매 내역에 상품이 없습니다!");
		}//else end
	}//refund() end
	
	
}// class end
