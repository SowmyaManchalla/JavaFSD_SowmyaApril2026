package Day14;
import java.util.ArrayList;
import java.util.Collections;

public class ProductService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mobile");
		products.add("Tablet");
		products.add("Keyboard");
		products.add("Mouse");
		
		Collections.sort(products);
		System.out.println("Sorted product names:");
		
		for(String product: products)
		{
			System.out.println(product);
		}

	}

}
