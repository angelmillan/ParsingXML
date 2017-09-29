/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.parsingxml;
import com.iesvdc.acceso.dom.DomUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author matinal
 */
public class ParsingXML {
    static Document documento;
    
    void recursiveWalker (Node nodo){
        if(nodo.hasChildNodes()){
            recursiveWalker(nodo.getFirstChild());
        }
        nodo.getNextSibling()
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
    //if(args.length==1){
        try {
            Document documento = DomUtil.parse("books.xml",false);
            System.out.println("El tipo de nodo es : " + documento.getNodeType());
            System.out.println("El tipo del primer nodo hijo es : " + documento.getFirstChild().getNodeType());
            System.out.println("El tipo del nodo raiz es : " + documento.getDocumentElement().getNodeType());
            System.out.println("El nombre del nodo raiz es : " + documento.getDocumentElement().getNodeName());
            System.out.println("El nombre del nodo raiz es : " + documento.getDocumentElement().getNodeName());

            // vamos a buscar nietos, si los hay mostramos la etiqueta
            
            Node raiz = documento.getDocumentElement();
            if (raiz.hasChildNodes()){
                System.out.println("Raiz tiene hijo" + raiz.getNodeName()) ;
                Node hijo = raiz.getFirstChild();
                if (hijo.hasChildNodes()){
                    System.out.println("El hijo tene hijos, hay nieto " + hijo.getNodeName());                   
                    Node nieto = hijo.getFirstChild();
                    if (nieto.hasChildNodes()){
                        Node biznieto = nieto.getFirstChild();
                        System.out.println("El biznieto" + biznieto.getNodeName());
                    }
                }
            }
            
            
        } 
        catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        } 
    //}else{
        System.out.println("Uso del programa ...\n" + "ParsingXML [books.xml]\n");
    }
    
    
    
    
    }
    

