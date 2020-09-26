package webapp.jtbc;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jtbc_it {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://news.jtbc.joins.com/section/index.aspx?scode=40";
		//사이트-jtbc 국제
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("ul#section_list");//전체
		
		Iterator<Element> ie1=element.select("dt.title_cr").iterator();//제목
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}
}
