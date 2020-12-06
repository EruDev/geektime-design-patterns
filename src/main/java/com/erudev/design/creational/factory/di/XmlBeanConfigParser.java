package com.erudev.design.creational.factory.di;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/10/2 8:17
 */
public class XmlBeanConfigParser implements BeanConfigParser {
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(inputStream);

            doc.getDocumentElement().normalize();

            NodeList beans = doc.getElementsByTagName("bean");

            for (int i = 0; i < beans.getLength(); i++) {
                Node node = beans.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) continue;

                Element element = (Element) node;
                BeanDefinition beanDefinition = new BeanDefinition(
                        element.getAttribute("id"), element.getAttribute("class"));
                if ("singleton".equals(element.getAttribute("scope"))){
                    beanDefinition.setScope(BeanDefinition.Scope.SINGLETON);
                }
                if ("true".equals(element.getAttribute("lazyInit"))){
                    beanDefinition.setLazyInit(true);
                }
                loadConstructorArgs(element.getElementsByTagName("constructor-arg"), beanDefinition);
                beanDefinitions.add(beanDefinition);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void loadConstructorArgs(NodeList nodes, BeanDefinition beanDefinition) {
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            Element element = (Element) node;

            BeanDefinition.ConstructorArg constructorArg = null;
            if (element.getAttribute("type") != null){
                constructorArg = new BeanDefinition.ConstructorArg.Builder()
                        .setArg(element.getAttribute("value"))
                        .setType(String.class)
                        .build();
            }
            if (element.getAttribute("ref") != null){
                constructorArg = new BeanDefinition.ConstructorArg.Builder()
                        .setRef(true)
                        .setArg(element.getAttribute("ref"))
                        .build();
            }

            beanDefinition.addConstructorArg(constructorArg);
        }
    }
}
