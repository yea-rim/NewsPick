package jeju;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jeju_main {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="http://www.jejudomin.co.kr/";
	      //사이트-제주도민일보 메인
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div.auto-article");

	      
	      Iterator<Element> ie1=element.select("a.auto-fontA.OnLoad").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n");
	      }
	   }
}
