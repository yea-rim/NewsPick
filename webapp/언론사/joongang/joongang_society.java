package webapp.joongang;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class joongang_society {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://news.joins.com/society?cloc=joongang-section-gnb4";
		//사이트-중앙일보 사회
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div#content");//전체
		
		Iterator<Element> ie1=element.select("a").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}

}
