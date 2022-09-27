package crawling0923;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test07_NaverMovie {

	public static void main(String[] args) {
		// 네이버 영화 평점 후기 크롤링하기
		// "공조2" 영화 평점 제목을 공감순으로 정렬 후 크롤링하기 (대략 9690건)
		// gongjo.txt 파일에 저장하기
		
		try {
		
			String fileName="I:/java202207/gongjo.txt";
			FileWriter  fw  = new FileWriter(fileName, true); 
			PrintWriter out = new PrintWriter(fw, true); 
			
			
			String    URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.naver";
			String params = "?code=201641";		     // 영화코드번호
				   params += "&type=after&onlyActualPointYn=N&onlySpoilerPointYn=N";
				   params += "&order=sympathyScore"; // 공감순
				   params += "&page=";			     // 대략 1~969페이지
			
		    //공감순     order=sympathyScore
		    //최신순     order=newest
		    //평점높은순  order=highest
		    //평점낮은순  order=lowest
			
			for(int p=1; p<=969; p++) {	//네이버 전체 페이지가 969페이지 까지 있음.
				System.out.println("데이터수집중 ...");
				Document doc = Jsoup.connect(URL+params).get();	
				for(int ment=0; ment<=9; ment++) { //코멘트 인덱스는 9개까지밖에 없다.
					Elements elements = doc.select("#_filtered_ment_" + ment); //평점 제목이 있는 요소
					for(Element element : elements ) {
						out.println(element.text());
					}//for end
				}//for
			}//for end
			
			
			out.close();
			fw.close();
			System.out.println("-------gongjo.txt 공조2 평점 저장 완성!!");

			
			
		} catch (Exception e) {
			System.out.println("크롤링 실패: " + e);
		}
		
		
		
		
		
	}//main() end

}//class end
