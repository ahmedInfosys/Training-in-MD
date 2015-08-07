package week1_fri;

public class get_item_code {
	protected double grand_total, price, tax_rate;
	
	private String code;
	
	public void get_item_code(String code){
		this.code = code;
		}
	public void check_code(){
		
		switch (code)
		{
			case "OR":
				price = 1;
				tax_rate = 0;
			break;
			case "AP":
				price = 0.91;
				tax_rate = 0;
				break;
			case "TM":
				price = 2.5;
				tax_rate = 0;
				break;
			case "PK":
				price = 1.2;
				tax_rate = 0;
				break;
			case "CG":
				price = 5;
				tax_rate = 0.2;
				break;
			case "LT":
				price = 2;
				tax_rate = 0.15;
				break;
			default:
				System.out.println("Sorry,the selected item available in the Grocery store");
				price = 0;
				tax_rate = 0;
			break;

		}
	}
}
