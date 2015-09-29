package scheduler;

import org.springframework.scheduling.annotation.Scheduled;

import service.ProductService;

public class Tasks {

    private ProductService productService;

    public ProductService getProductService() {
	return productService;
    }

    public void setProductService(ProductService productService) {
	this.productService = productService;
    }

    @Scheduled(cron = "0 * * * * ?")
    // @Scheduled(fixedRate = 3000)
    public void showProducts() {
	productService.getSomeProducts().forEach(x -> System.out.println(x));
    }

}
