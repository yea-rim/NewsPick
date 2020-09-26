package webapp.mbn;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class mbn_it {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.mbn.co.kr/news/world/";
		//사이트-mbn 국제
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.con_left_view");//전체
		
		Iterator<Element> ie1=element.select("dt.tit").iterator();//제목
		
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}

}
