package br.com.caelum.fj31.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.caelum.fj31.generated.Produto;



public class TesteUnmarshal {

	public static void main(String[] args) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(Produto.class);
		Unmarshaller info = ctx.createUnmarshaller();
		
		Produto produto = (Produto) info.unmarshal(new File("cursos.xml"));
		
		System.out.println(produto);
	}
	
}