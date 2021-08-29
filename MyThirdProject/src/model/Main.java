package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
	Разработать для своего варианта структуру XML документа, описать ее с
	помощью XSD. Создать файл XML, соответсвующий разработанной XSD схеме.
	
	Алмазный фонд.
	Драгоценные и полудрагоценные камни, содержащиеся в павильоне,
	имеют следующие характеристики:
		Name - название камня.
		Preciousness - может быть драгоценным или полудрагоценным.
		Origin - место добывания.
		Visual parameters (должно быть несколько) - могут быть:
			цвет (зеленый, красный, желтый и т.д.),
			прозрачность (измеряется в процентах 0-100%),
			способы огранки (количество граней 4-15).
		Value - вес камня (измеряется в каратах).
 */

public class Main {

	public static void main(String[] args) throws Exception {
		
		XsdValidator validator = new XsdValidator();
		
		if(validator.validateXMLSchema("MyXMLSchema.xsd", "MyXML.xml")) { // Validation XML file
			System.out.println("Validation -- Ok.");
		} else {
			System.out.println("Validation -- Err.");
		}
		
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
		
		Node dimondFundNode = doc.getFirstChild();
		System.out.println("RootNode = " + dimondFundNode.getNodeName());
		
		List<Stone> stoneList = new ArrayList<>();
		
		DimondFund dimondFund = new DimondFund();
		String attributeStone;
		NodeList dimondFundChilds = dimondFundNode.getChildNodes();
		
		for(int i = 0; i < dimondFundChilds.getLength(); i++ ) {
			
			Stone stone = new Stone();
			
			if(dimondFundChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			attributeStone = dimondFundChilds.item(i).getAttributes().getNamedItem("id").getNodeValue();
			stone.setAttribute(attributeStone);
			
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
						stone.setName(name);
						break;
					}
					case "preciousness": {
						presiousness = stoneChilds.item(j).getTextContent();
						stone.setPreciousness(presiousness);
						break;
					}
					case "origin": {
						origin = stoneChilds.item(j).getTextContent();
						stone.setOrigin(origin);
						break;
					}
					case "value": {
						value = Integer.valueOf(stoneChilds.item(j).getTextContent());
						stone.setValue(value);
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
							stone.setColor(color);
							break;
						}
						case "opacity": {
							opacity = Byte.valueOf(visualParametersChilds.item(k).getTextContent());
							stone.setOpacity(opacity);
							break;
						}
						case "way_faceting": {
							wayFaceting = Byte.valueOf(visualParametersChilds.item(k).getTextContent());
							stone.setWayFaceting(wayFaceting);
							break;
						}
					
					}
				
				}
				
			}
			stoneList.add(stone);
		}
		dimondFund.setStone(stoneList);
		System.out.println("---- Printing elements the file XML ----");
		System.out.println("-" + dimondFund.toString());
		
		Collections.sort(stoneList, new Comparator<Stone>() {
              @Override
              public int compare(Stone o1, Stone o2) {
                  return o1.getName().compareTo(o2.getName());
              }
          });
			
		System.out.println("\n---- Printing elements the file XML after sorting by Name----");
		System.out.println("-" + dimondFund.toString());
	}
	
}
