package ytn;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ytn_economy {
	
	public static void main(String[] args) {
		
		ytn_eco_select selectSql = new ytn_eco_select();
		ytn_eco_insert insertSql = new ytn_eco_insert();

		Document doc=null;
		String url="https://www.ytn.co.kr/news/news_list_0102.html";
		

		try {
		Connection connect=Jsoup.connect(url)
				.userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
				.header("Accept", "text/html")
		.header("Accept-Encoding", "gzip,deflate")
		.header("Accept-Language", "it-IT,en;q=0.8,en-US;q=0.6,de;q=0.4,it;q=0.2,es;q=0.2")
		.header("Connection", "keep-alive")
		.ignoreContentType(true)
		.timeout(30000);
		doc = connect.get();
		Elements  element=doc.select("div#zone1");
		Iterator<Element> ie1=element.select("dt").iterator();
		
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
			insertSql.insertQuery("Y_name");
		
		}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
