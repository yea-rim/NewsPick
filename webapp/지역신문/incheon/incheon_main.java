package incheon;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class incheon_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="https://www.incheonilbo.com/";
	      //사이트-인천일보 메인
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.index-columns.width-full");

	      
	      Iterator<Element> ie1=element.select("a.auto-fontA.onload").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      
	      

	   }

}
