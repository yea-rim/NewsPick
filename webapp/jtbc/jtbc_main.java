package webapp.jtbc;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jtbc_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://news.jtbc.joins.com/";
		//사이트-jtbc 메인
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.contant_area");//전체
		
		Iterator<Element> ie1=element.select("a").iterator();//제목
	
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}

}
