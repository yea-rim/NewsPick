package webapp.kmib;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class kmib_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://news.kmib.co.kr/article/list.asp?sid1=all";
		//사이트-국민일보 메인
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.NwsCon");//전체
		
		Iterator<Element> ie1=element.select("dt").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
