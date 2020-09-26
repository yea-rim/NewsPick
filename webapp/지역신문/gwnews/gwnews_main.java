package gwnews;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class gwnews_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.gwnews.org/";
	      //사이트-강원신문 메인
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.index-columns.grid-1.width-full");

	      
	      Iterator<Element> ie1=element.select("a.auto-titles.size-16.line-4x2.auto-fontA.onload").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      
	      

	   }

}
