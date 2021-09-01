package andi;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Start {

	public static void main(String[] args) throws Exception {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		parser.parse("c:/temp/tk-java/allelements.xml", new MyHandler());
	}

}

class MyHandler extends DefaultHandler{
	private boolean isName=false;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println("start: "+qName);
		if (qName.equalsIgnoreCase("NAME")) {
			isName=true;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		isName=false;
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (isName) {
			System.out.println(new String(ch,start,length));
		}
	}
}
