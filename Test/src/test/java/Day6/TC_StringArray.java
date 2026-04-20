package Day6;

public class TC_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] products = {
				{"Laptop"},
				{"Mobile"},
				{"Tablet"},
				{"Charger"},
				{"Headphones"}
		};
		
		for(int i=0;i<products.length-1;i++)
		{
			for(int j=0;j<products.length-i-1;j++)
			{
				char c1 = products[j][0].toLowerCase().charAt(0);
				char c2 = products[j+1][0].toLowerCase().charAt(0);
				
				if(c1>c2)

                  {
                	  String[] temp = products[j];
                	  products[j] = products[j+1];
                	  products[j+1] = temp;
					
				}
			}
		}
       System.out.println("Sorted Products");
       for(String[] product :products)
       {
    	   System.out.println(product[0]);
       }
	}
}
