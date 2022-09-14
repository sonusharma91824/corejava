package string.in.com;

public class StringMethods {
	public static void main(String[] args) {
		{    String s1="wrong";                     System.out.println(s1.length());                }

		{    String s2 ="right";                    System.out.println(s2.charAt(3));               }

		{    String s3= "improve";                  System.out.println(s3.indexOf("r"));            }
     
		{    String s4 = "correct";		            System.out.println(s4.lastIndexOf("c"));        }
		
		{    String s5 = "sonu sharma";             System.out.println(s5.toUpperCase());           }		
		
		{    String s6 = "khUshI shArMa";           System.out.println(s6.toLowerCase());           }
		
		{    String s7 = "madhav sharma";           System.out.println(s7.replace("m", "r"));       }
		
		{    String s8 = "radha sharma";            System.out.println(s8.substring(6));            }
		
		{    String s9 = "neeraj sharma";           System.out.print(s9.startsWith("neeraj"));  System.out.println(s9.startsWith("sahu"));  }
		
		{    String s10 = "sandhya sharma";           System.out.println(s10.substring(0,10));    }
		
		{    String s11 = "raghu sharma";           System.out.println(s11.trim());    }



	}
}
