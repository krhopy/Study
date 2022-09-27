package crawling0923;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test03_choongang {

	public static void main(String[] args) {
		// 중앙정보처리학원 웹페이지의 공지사항 제목만 크롤링 하기
		
		try {
			
			String URL="https://www.choongang.co.kr/html/sub07_01_n.php";
			
			
			// Test02_choongang - 공지사항 웹페이지에서 1~11 페이지 소스 가져오기
			for(int p=1; p<=11; p++) {
				String params="?page=" + p + "&mod=&idx=";
				//System.out.println(params);
				Document doc = Jsoup.connect(URL+params).get();
				//System.out.println(doc.toString());
				
				
				// Test03_choongang - 요소 선택하기 
				/*
				  	<tr class="board_default_list">
				  		<td class="default_title"> 빅데이터 분석기사 자격증 실기시험 대비반 </tb>
				 
				 */
	            Elements elements = doc.select(".board_default_list .default_title");
	            								//(공지사항에 있는 제목 부분을 모두 가져올 수 있다.)
	            								// . 점은 class 이므로 자바스크립트에서 했던 .으로 구분하는 코드이다 / id 태그면 #
	            for ( Element element : elements ) { 
	            // ( 개별 : 덩어리 ) = 반복할때마다 덩어리에서 값을 1개씩 꺼내서 개별에 넣어준다는 뜻 → : 대신 in연산자 가능 
	            	System.out.println(element.text());
	
	            }//for end
			}//for end
			
			
		} catch (Exception e) {
			System.out.println("크롤링 실패: " + e);
		}//end

		
		
		
		
	} // main() end
} // class end
