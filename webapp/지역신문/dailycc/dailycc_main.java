package dailycc;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class dailycc_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.dailycc.net/";
	      //사이트-충청신문 메인
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.clearfix");
	      
	      
	      Iterator<Element> ie1=element.select("a.auto-marbtm-8.line-height-3-x.letter-8.auto-fontA.onload").iterator();

	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	      
	      

	   }

}
