package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ProductService;

public class ProductMain {

    public static void main(String[] args) {

	ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
		"product-context.xml");
	ProductService productService = classPathXmlApplicationContext.getBean(ProductService.class);
	productService.getSomeProducts().forEach(x -> System.out.println(x));
	classPathXmlApplicationContext.close();

    }

}
