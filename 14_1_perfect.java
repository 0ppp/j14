import java.util.*;
import java.io.*;

 class Slip14_1
{
	public static void main(String[] args) throws IOException
	{
   		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
    	int choice=0;
    	do
   		{
			String name="";
    	    double phone_number=0;
        	System.out.println("Choose an option:");
	        System.out.println("1.Add a new Name-Phone pair");
    	    System.out.println("2.Search Name and Display Phone No");
        	System.out.println("3.Exit");
	        System.out.println("Enter your choice:");
    	    choice=Integer.parseInt(b1.readLine());
        	switch(choice)
        	{
	        	case 1:
	        			System.out.println("Enter name:");
                    	name=b1.readLine();
               	     	System.out.println("Enter phone number:");
                	    phone_number=Double.parseDouble(b1.readLine());
	                    File f=new File("phone.txt");
	         			FileWriter f1=new FileWriter(f,true);
	         			PrintWriter p=new PrintWriter(f1);
	         			p.println(name);
	         			p.println(phone_number);
	         			p.close();
	                    	break;

				case 2:
								System.out.println("Enter a name to search:");
		                    	name=b1.readLine();
		                    	int foundflag=0;
		    	
		        	File ff=new File("phone.txt");
		           	Scanner sc=new Scanner(ff);
		           	while(sc.hasNextLine())
		           	{
						String line=sc.nextLine();
		                String number=sc.nextLine();
		                if(line.equals(name))
		               	{
		                	foundflag=1;
		                	System.out.println("Found entry : "+line+" : "+number);
		            	}
		           }
		       		
		       	
		       	if(foundflag==0)
		        	System.out.println("0 entries found for "+name);
                    	break;
				case 3:
						break;
            	default: System.out.println("Wut");
			}
		}while(choice!=3);
    }
}