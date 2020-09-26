package webapp.joongang;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class joongang_politics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://news.joins.com/politics?cloc=joongang-home-gnb2";
		//사이트-중앙일보 정치
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