package model;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class Main {

	public static void main(String[] args) throws Exception {
		
		Stone stone = new Stone();
		
		File file = new File("MyXML.xml");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();	// Building DOM parser (JSDK)
		
		Document doc = null;
		
		try {
			
			doc = dbf.newDocumentBuilder().parse(file);	// Recognition XML document
					
		} catch (IOException e) {
			
			e.printStackTrace();
			return;
			
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
			return;
		}
		
		Node rootNode = doc.getFirstChild();
		
		System.out.println("RootNode = " + rootNode.getNodeName());
		
		NodeList rootChilds = rootNode.getChildNodes();
		
		for(int i = 0; i < rootChilds.getLength(); i++ ) {
			
			if(rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!rootChilds.item(i).getNodeName().equals("stone")) {
				System.out.println("RootChilds != stone");
				continue;
			}
				
			
			String name;
			String presiousness;
			String origin;
			Integer value;
		
			NodeList stoneChilds = rootChilds.item(i).getChildNodes();
					
			for(int j = 0; j < stoneChilds.getLength(); j++ ) {
			
				if(stoneChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
							
				switch(stoneChilds.item(j).getNodeName()) {
			
					case "name": {
						name = stoneChilds.item(j).getTextContent();
						System.out.println("StoneChild " + stoneChilds.item(j).getNodeName() + " == " + name);
						break;
					}
					case "preciousness": {
						presiousness = stoneChilds.item(j).getTextContent();
						System.out.println("StoneChild " + stoneChilds.item(j).getNodeName() + " == " + presiousness);
						break;
					}
					case "origin": {
						origin = stoneChilds.item(j).getTextContent();
						System.out.println("StoneChild " + stoneChilds.item(j).getNodeName() + " == " + origin);
						break;
					}
					case "value": {
						value = Integer.valueOf(stoneChilds.item(j).getTextContent());
						System.out.println("StoneChild " + stoneChilds.item(j).getNodeName() + " == " + value);
						break;
					}
				}
			
			}
	
		}
	
	}

}
