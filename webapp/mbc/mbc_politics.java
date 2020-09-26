package webapp.mbc;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class mbc_politics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://imnews.imbc.com/news/2020/politics/";
		//사이트-mbc 정치
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.section.content_area");//전체
		
		Iterator<Element> ie1=element.select("span.tit.ellipsis2").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
