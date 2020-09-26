package kgnews;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class kgnews_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="https://kgnews.co.kr/";
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("ul.summary_list.column.col02");
	      
	      
	      Iterator<Element> ie1=element.select("h4").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	     
	   }

}
