package webapp.ytn;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ytn_society {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.ytn.co.kr/news/news_list_0103.html";
		//사이트-ytn 사회
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div#zone1");//전체
		
		Iterator<Element> ie1=element.select("dt").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}

}
