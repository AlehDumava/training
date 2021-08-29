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
			System.out.println("Open the file error!" + e.toString());
			return;
			
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
			System.out.println("Parsing the file error!" + e.toString());
			return;
		}
		
		Node dimondFund = doc.getFirstChild();
		System.out.println("RootNode = " + dimondFund.getNodeName());
		
		
		NodeList dimondFundChilds = dimondFund.getChildNodes();
		
		for(int i = 0; i < dimondFundChilds.getLength(); i++ ) {
			
			if(dimondFundChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!dimondFundChilds.item(i).getNodeName().equals("stone")) {
				System.out.println("RootChilds != stone");
				continue;
			}
			System.out.println("-------------------");	
			
			String name;
			String presiousness;
			String origin;
			Integer value;
		
			NodeList stoneChilds = dimondFundChilds.item(i).getChildNodes();
					
			for(int j = 0; j < stoneChilds.getLength(); j++ ) {
			
				if(stoneChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
							
				switch(stoneChilds.item(j).getNodeName()) {
			
					case "name": {
						name = stoneChilds.item(j).getTextContent();
						System.out.println(" StoneChild " + stoneChilds.item(j).getNodeName() + " == " + name);
						break;
					}
					case "preciousness": {
						presiousness = stoneChilds.item(j).getTextContent();
						System.out.println(" StoneChild " + stoneChilds.item(j).getNodeName() + " == " + presiousness);
						break;
					}
					case "origin": {
						origin = stoneChilds.item(j).getTextContent();
						System.out.println(" StoneChild " + stoneChilds.item(j).getNodeName() + " == " + origin);
						break;
					}
					case "value": {
						value = Integer.valueOf(stoneChilds.item(j).getTextContent());
						System.out.println(" StoneChild " + stoneChilds.item(j).getNodeName() + " == " + value);
						break;
					}
				}
			
								
				String	color;
				Byte	opacity;
				Byte	wayFaceting;
				
				NodeList visualParametersChilds = stoneChilds.item(j).getChildNodes();
			
				for(int k = 0; k < visualParametersChilds.getLength(); k++ ) {
			
					if(visualParametersChilds.item(k).getNodeType() != Node.ELEMENT_NODE) {
						continue;
					}
							
					switch(visualParametersChilds.item(k).getNodeName()) {
			
						case "color": {
							color = visualParametersChilds.item(k).getTextContent();
							System.out.println("  Visual Parameters Child " + visualParametersChilds.item(k).getNodeName() + " == " + color);
							break;
						}
						case "opacity": {
							opacity = Byte.valueOf(visualParametersChilds.item(k).getTextContent());
							System.out.println("  Visual Parameters Child " + visualParametersChilds.item(k).getNodeName() + " == " + opacity);
							break;
						}
						case "way_faceting": {
							wayFaceting = Byte.valueOf(visualParametersChilds.item(k).getTextContent());
							System.out.println("  Visual Parameters Child " + visualParametersChilds.item(k).getNodeName() + " == " + wayFaceting);
							break;
						}
					
					}
			
				}
			}
	
		}
	
	}

}
