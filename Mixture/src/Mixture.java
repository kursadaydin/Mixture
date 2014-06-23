import java.util.Scanner;


public class Mixture {

	 public static int mix (){
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please entering the first number....");
	        String number1 =scanner.next();
	       
	        System.out.println("Please entering the second number....");
	        String number2 =scanner.next();
	       
	        String newnumber = "";
	       
	               
	        int basamaksayisi;
	        if (number1.length()>= number2.length()) {
	            basamaksayisi =number1.length();
	                   
	        }
	        else {
	            basamaksayisi =number2.length();
	        }
	       
	                   
	                for (int i = 0; i < basamaksayisi; i++) {
	                	
	                	if (number1.length()>=i+1) {
	                		newnumber = newnumber+ String.valueOf(number1.charAt(i));
							
						}
	                	if (number2.length()>=i+1) {
	                		newnumber = newnumber+ String.valueOf(number2.charAt(i));
							
						}
	                                        
	                }  
	                   
	                               
	        int intnewnumber = Integer.parseInt(newnumber);
	           
	       
	        return intnewnumber;
	    }
	   
	    public static void main (String []args){
	        System.out.println("After the mixturing process, the new number is :" + mix());
	       
	    }
	   
	    }


