package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParserTest01 {
	public static void main(String[] args) throws Exception {
		//Parser������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//DOM Parser
		DocumentBuilder domparser = factory.newDocumentBuilder();
		//Parser�� parse�޼ҵ带 ȣ���ϸ� xml�� �м��ؼ� Dom��ü�� ���� ��ȯ
		Document document = domparser.parse("src/openapi/dept.xml");
		
		//root ������Ʈ
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		//dept������Ʈ ����
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		for (int i = 0; i < nodelist.getLength(); i++) {
			Node node = nodelist.item(i);
			System.out.println("����:"+node.getNodeName());
		}
	}
}
