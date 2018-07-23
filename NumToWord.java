package convert;

import java.util.Scanner;

/**
* Created by Giridhar Ganneri on 20/07/2018.
*
* This class has a logic to convert a number upto 9 digits to its corresponding word format
*
*/

public class NumToWord{

	public static void main(String[] args) {
		int number = 0; //Number Initialization
		Scanner alpha = new Scanner(System.in);
		System.out.print("Please type a number from 0 to 999,999,999 or type -9 to exit:  "); //User input
		number = alpha.nextInt();
	    	while(number!=-9) { //-9 is used an exit for user input
	    		if(number>=0 && number<=999999999) { //Limits threshold as per the assignment
	    			if(number==0){
	    				System.out.print("Number in words:\nZero");
	    			} else {
	    				System.out.print("Number in words:\n");
/* Private class call. 
* Can be expanded to greater numbers without editing convertToWord class according to OOD standards
* */
				convertToWord(((number / 1000000)), "Million"); 
				convertToWord(((number / 1000) % 1000), "Thousand");
				convertToWord(((number / 100) % 10), "Hundred and");
				convertToWord((number % 100), " ");
	                    }

	    		} else {
	    			System.out.print("\nSorry, please enter only a number from 0 to 999999999");
	                }
	                System.out.print("\nPlease enter a number from 0 to 999999999 or type -9 to exit:  "); 
	                number = alpha.nextInt();
	            	}
		    }

/*
* private method to print the output.
*/

	private static void convertToWord(int value, String place) 
		{String ones[] = {" ", " One ", " Two ", " Three ", " Four ",	" Five ", " Six ", 
						" Seven ", " Eight ", " Nine ", " Ten ", " Eleven ", " Twelve ", " Thirteen ",
						" Fourteen ", " Fifteen ", " Sixteen ", " Seventeen ", " Eighteen ", " Nineteen "}; 
						//Ones value above for each digit's place
		String tens[] = {" ", " ", " Twenty ", " Thirty ", " Fourty ", " Fifty ", 
						" Sixty ", " Seventy ", " Eighty ", " Ninety "};
						//Tens value for each digit's place
		String hundreds[] = {" ", " One Hundred and ", " Two Hundred and ", " Three Hundred and ", " Four Hundred and ", 
							" Five Hundred and ", " Six Hundred and", "Seven Hundred and ", " Eight Hundred and ", 
							" Nine Hundred and "}; 
							//Hundreds value for each digit's place
	            
			if (value > 19) { //Output preparation
				System.out.print(hundreds[value / 100] + tens[(value / 10) % 10] + ones[value % 10]); 
			} else {
	                System.out.print(ones[value]);
	            	}
					if (value > 0) {
	                	System.out.print(place);
	            	}
	        }
	}