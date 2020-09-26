package jeju;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jeju_economy {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.jejudomin.co.kr/news/articleList.html?sc_section_code=S1N2&view_type=sm";
	      //사이트-제주도민일보 경제
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("tbody");
	      
	      Iterator<Element> ie1=element.select("td.list-titles").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	   }
}
