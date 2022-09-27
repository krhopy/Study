package crawling0923;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test08_itwill {

	public static void main(String[] args) {
		// 솔데스크 웹페이지에서 공지사항 제목만 크롤링해서 
		// soldesk.txt파일에 저장하기

		try {
			String fileName="I:/java202207/itwill.txt";
			FileWriter  fw  = new FileWriter(fileName, true); //추가모드
			PrintWriter out = new PrintWriter(fw, true); 
			
			String URL="https://www.itwill.co.kr/cmn/board/BBSMSTR_000000000071/bbsList.do";

			for(int p=1; p<=4; p++) {
				String params = "?pageIndex=" + p; 
					   
				Document doc = Jsoup.connect(URL+params).get();
				/*
				  	공지사항 제목 가져오기
                    <td class="td_left">
                        <a href="javascript:goDetail('00000001732022000002','bd_num');" title="">
                            <!--모바일에서는 td_m_date에 날짜가 나오게해놨습니다.-->
                            <span class="td_m_date">2022-03-31</span>
                            아마존AWS클라우드 13기 / 자바파이썬빅데이터 3기 모집중
                        </a>
                    </td>
				*/
				
	            Elements elements = doc.select(".bgcol01"); // 제목만 필요한데 등록일까지 가져오게된다.
				elements.select(".ac").remove();
	            
	            for ( Element element : elements ) { 
	            	System.out.println(element.text());	
	            	out.println(element.text()); 		//choocgang.txt 출력명령어
	            }//for end
			}//for end
			
			out.close();
			fw.close();
			
			System.out.println("-------itwill.txt 공지사항 제목 저장 완성!!");
			
			
		} catch (Exception e) {
			System.out.println("크롤링 실패: " + e);
		}//end

		
		
	}//main() end

}//class end
