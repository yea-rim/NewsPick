package incheon;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class incheon_it {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="https://www.incheonilbo.com/news/articleList.html?sc_section_code=S1N9&view_type=sm";
	      //사이트-인천일보 경제
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.article-list");

	      
	      Iterator<Element> ie1=element.select("div.list-titles").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      

	   }

}
