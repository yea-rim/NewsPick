package webapp.han;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class han_it {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://www.hani.co.kr/arti/international/home01.html";
		//사이트-한겨레 국제
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div#contents-section");//전체
		
		Iterator<Element> ie1=element.select("h4.article-title").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
