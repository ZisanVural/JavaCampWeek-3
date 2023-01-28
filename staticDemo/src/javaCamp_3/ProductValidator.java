package javaCamp_3;

public class ProductValidator {
	
	static {
		System.out.println("Static yapici blok çalıştı.");
	}
	
	public ProductValidator() {
		
		System.out.println("Yapici blok çalıştı");
	}
	public static boolean isValid(Product product) {
		
		if(product.price>0 && !!product.name.isEmpty()){
	
			return true;
		}
		
		else
			return false;
	}

}
