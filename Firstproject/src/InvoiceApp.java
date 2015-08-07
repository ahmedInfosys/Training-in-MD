
public class InvoiceApp {
	public static void main(String [] args)
	{
		
		double subtotal = 100;
		
		double discountPercent = 0.2;
		
		double discountAmount = subtotal * discountPercent;
		
		double invoiceTotal = subtotal - discountAmount;
		
		System.out.println(" Welcome to the Invoice Total Calculator");
		
		System.out.println();
		System.out.println("Subtotal:              " + subtotal);
	}
}
