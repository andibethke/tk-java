package andi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class StartDom {

	public static void main(String[] args) throws Exception {
		DocumentBuilder docBuilder=DocumentBuilderFactory
									.newInstance().newDocumentBuilder();
		Document doc=docBuilder.parse("c:/temp/tk-java/allelements.xml");
		
//		XPath x=XPathFactory.newInstance().newXPath();
//		NodeList li=(NodeList)x.evaluate("//NAME[starts-with(text(),'A')]/text()", doc, XPathConstants.NODESET);
//		
//		for (int i = 0; i < li.getLength(); i++) {
//			System.out.println(li.item(i));
//			
//		}
		
		
		
		NodeList li=doc.getElementsByTagName("ATOM");
		for (int i = 0; i < li.getLength(); i++) {
			Element el=(Element)li.item(i);
			System.out.printf("%s (%s)\n",
					el.getElementsByTagName("NAME").item(0).getTextContent(),
					el.getElementsByTagName("SYMBOL").item(0).getTextContent());
		}
	}

}
