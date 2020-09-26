package gwnews;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class gwnews_it {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.gwnews.org/news/articleList.html?sc_sub_section_code=S2N168&view_type=sm";
	      //사이트-강원신문 문화
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("ul.type2");

	      
	      Iterator<Element> ie1=element.select("h4.titles").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      
	      

	   }

}
