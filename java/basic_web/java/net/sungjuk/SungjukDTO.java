package net.sungjuk;

public class SungjukDTO { //Data Transfer Object 전송객체 ★★★ 많이 사용하는 함수 ★★★
						  //Value Object

	// sungjuk테이블의 칼럼명을 기준으로 멤버변수(field) 선언
   private int sno;
   private String uname;
   private int kor;
   private int eng;
   private int mat;
   private int aver;
   private String addr;
   private String wdate;
	
   public SungjukDTO() {} //기본생성자 default

   // private 멤버변수 각각에 대한 getter와 setter함수 작성
	public int getSno() {
		return sno;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getAver() {
		return aver;
	}
	
	public void setAver(int aver) {
		this.aver = aver;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getWdate() {
		return wdate;
	}
	
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() { // tostring 이걸 사용해주면 private에 있는 변수들이 값이 제대로 들어가있는지 확인할 수 있다.
		return "SungjukDTO [sno=" + sno + ", uname=" + uname + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", aver=" + aver + ", addr=" + addr + ", wdate=" + wdate + "]";
	}
   
	
}//class end
