package webapp.sbs;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class sbs_it {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://news.sbs.co.kr/news/newsSection.do?sectionType=07&plink=SNB&cooper=SBSNEWS";
		//사이트-sbs 국제
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div#container.w_contents");//전체
		
		Iterator<Element> ie1=element.select("strong.sub").iterator();//제목
		
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
