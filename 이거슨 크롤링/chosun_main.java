package webapp;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class chosun_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.chosun.com/";
		//사이트-조선일보
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element=doc.select("div.sec_con");//전체
		
		Iterator<Element> ie1=element.select("a").iterator();//제목
		Iterator<Element> ie2=element.select("dd.desc").iterator();//내용
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\n"+ie2.next().text());
		}
		
	}

}
