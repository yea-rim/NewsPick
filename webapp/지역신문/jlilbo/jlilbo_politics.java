package jlilbo;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jlilbo_politics {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.jlilbo.com/section.php?sid=2";
	      //사이트-전라도일보 정치
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("td");
	      

	      Iterator<Element> ie1=element.select("a.subtitle").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      
	      

	   }

}
