package web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/api")
public class ProductController {

	// private ProductService productService;
	//
	// public ProductController(ProductService productService) {
	// this.productService = productService;
	// }
	//
	// @RequestMapping(value = "/products", method = RequestMethod.GET)
	// public ResponseEntity<List<Product>> getProducts() {
	// return new
	// ResponseEntity<List<Product>>(productService.getSomeProducts(),
	// HttpStatus.OK);
	// }

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ResponseEntity<String> getProducts() {
		return new ResponseEntity<String>("some list", HttpStatus.OK);
	}
}
