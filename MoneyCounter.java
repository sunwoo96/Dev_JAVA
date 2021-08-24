import java.util.Scanner;

public class MoneyCounter {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 10, 1}; 
		Scanner input = new Scanner(System.in); 
		System.out.print("금액을 입력하시오>> "); 
		
		int num=input.nextInt(); 
		for (int i=0; i<unit.length; i++) { 
			System.out.println(unit[i]+"원 짜리 : " + num/unit[i] +"개"); 
			num%= unit[i]; 
			
		} 
		input.close(); 	
	}

}
