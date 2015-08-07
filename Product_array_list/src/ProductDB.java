
public class ProductDB {
	protected static Product pro = new Product();

	
	
	public static Product getProductInfo(String code){
		
		pro.code = code;
		switch (pro.code)
		{
			case "OR":
				pro.setPrice(1);
				pro.setDescription("Fresh orange.           ");
	
				
				break;
			case "AP":
				pro.setPrice(0.91);
				pro.setDescription("Organic apple.          ");

				break;
			case "TM":
				pro.setPrice(2.5);
				pro.setDescription("Soft tomato.            ");
	
				break;
			case "PK":
				pro.setPrice(1.2);
				pro.setDescription("spicy pickles.          ");

				break;
			case "CG":
				pro.setPrice(5);
				pro.setDescription("Marleborough cigarettes.");

				break;
			case "LT":
				pro.setPrice(2);
				pro.setDescription("Life-time lighter.      ");
	
				
				break;
			default:
				System.out.println("Sorry,the selected item available in the Grocery store.");
				pro.setPrice(0);
				pro.setDescription("                        ");

			break;
		
	}
		return pro;
	}
}
