package webapp;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class jtbc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://joongang.joins.com/?cloc=joongang-article-bi";
		//사이트-jtbc
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("main#content.main");//전체
		
		Iterator<Element> ie1=element.select("h2.headline").iterator();//제목
		Iterator<Element> ie2=element.select("span.text").iterator();//내용
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\n"+ie2.next().text());
		}
		
	}

}
