package seoul;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class seoul_main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String url="https://www.seoul.co.kr/";
      Document doc=null;
      try {
         doc=Jsoup.connect(url).get();
      }catch(IOException e) {
         e.printStackTrace();
      }
      Elements element=doc.select("div.S20_Tlist");
      
      Element hotNews = doc.select("li.lineclamp1").get(0);
      System.out.print(hotNews.toString());
      Elements news = hotNews.select("li");
      
      for(Element e : news){

    	    System.out.println(e.getElementsByAttribute("href").attr("href"));
    	}

      
      Iterator<Element> ie1=element.select("li.lineclamp1").iterator();
      
      while(ie1.hasNext()) {
         System.out.println(ie1.next().text()+"\n");
      }
      
      

   }

}