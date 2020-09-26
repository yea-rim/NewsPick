package kgnews;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class kgnews_economy {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="https://kgnews.co.kr/news/section_list_all.html?sec_no=235";
	      //사이트-경기신문 경제
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.ara_007");
	      
	      
	      Iterator<Element> ie1=element.select("h2.clamp.c2").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	     
	   }

}
