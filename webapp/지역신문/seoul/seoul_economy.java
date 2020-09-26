package seoul;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class seoul_economy {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String url="https://www.seoul.co.kr/news/newsList.php?section=economy/";
	      //사이트-서울신문 사회 
	      Document doc=null;
	      try {
	         doc=Jsoup.connect(url).get();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	      Elements element=doc.select("div#articleListDiv.S20_list_area");
	      
	      Element hotNews = doc.select("div.tit.lineclamp2").get(0);
	      System.out.print(hotNews.toString());
	      Elements news = hotNews.select("li");
	      
	      for(Element e : news){

	    	    System.out.println(e.getElementsByAttribute("href").attr("href"));
	    	}

	      
	      Iterator<Element> ie1=element.select("div.tit.lineclamp2").iterator();
	      Iterator<Element> ie2=element.select("div.tit.lineclamp2").iterator();
	      Iterator<Element> ie3=element.select("div.tit.lineclamp2").iterator();
	      
	      while(ie1.hasNext()) {
	         System.out.println(ie1.next().text()+"\n"+ie2.next().text()+"\n"+ie3.next().text()+"\n");
	      }
	      
	      
}
}
