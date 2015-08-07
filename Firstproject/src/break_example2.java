import java.util.Scanner;
public class break_example2 {
	public static void main(String[] args){
		Scanner key = new Scanner (System.in);
		
		System.out.println("Please enter a 3 digits number");
		
		int number = key.nextInt();
		
		Label:
			for(int i=1;i<100;i++){
				while(true){
					if (number == 999)
					{
						break Label;
					
					}
					number = key.nextInt();
				}
			}
		
	}

}
