package ytn;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ytn_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://ytn.co.kr/";
	
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.impor_news");
		
		Iterator<Element> ie1=element.select("a").iterator();
		
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
		
	}

}
