package ksmnews;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ksm_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.ksmnews.co.kr/default/";
	      //사이트-경상매일신문 메인
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("tbody");
 
	      Iterator<Element> ie1=element.select("span.subject_font14").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	     
	   }

}
