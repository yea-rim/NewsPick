package webapp.donga;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class donga_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.donga.com/";
		//사이트-동아일보
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.main_article");//전체
		
		Iterator<Element> ie1=element.select("span.txt").iterator();//제목
		
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
