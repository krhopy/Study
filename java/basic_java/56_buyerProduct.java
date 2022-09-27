package oop0919;

public class Product extends Object {
					//extends Object 생략가능
	public int price;	   //상품가격
	public int bonusPoint; //마일리지 (상품을 구매하면 마일리지가 쌓여아함)
	
	public Product() {}	   //default construct
	
	public Product(int price) {
		this.price=price;	//this.멤버변수=지역변수
		//상품가격의 10%를 보너스 점수 책정
		this.bonusPoint=(int)(price*0.1);
	}//Product end	
}//Product class end


// 족보만들기 (위에있는 Product 클래스를 상속받는다)
class SmartTV extends Product{
//	public int price;	    → 보이지 않지만 Product를 상속받았기 때문에 Product 안에 있는 값이 살아있다.
//	public int bonusPoint;
	
	public SmartTV() {
		super(100);		// 상품가격 price=100, bonusPount=10 
						// 부모가 먼저 생성되어야 내가 생성이 되기 때문에 super();로 부모에 값을 먼저 찍어준다.
	}
	
	@Override
		public String toString() {
			return "스마트TV"; //상품명
		}
}//class end



class Notebook extends Product{
//	public int price;	    → 보이지 않지만 Product를 상속받았기 때문에 Product 안에 있는 값이 살아있다.
//	public int bonusPoint; 
	
	public Notebook() {
		super(200);		  // 상품가격 price=200, bonusPount=20 
	}
	
	@Override
		public String toString() {
			return "노트북"; //상품명
		}
}//class end



class HandPhone extends Product{
//	public int price;	    → 보이지 않지만 Product를 상속받았기 때문에 Product 안에 있는 값이 살아있다.
//	public int bonusPoint;
	
	public HandPhone() {
		super(150);		  // 상품가격 price=150, bonusPount=15 
	}
	
	@Override
		public String toString() {
			return "핸드폰"; //상품명
		}
}//class end





