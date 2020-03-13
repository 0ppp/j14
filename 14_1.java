import java.io.*;

class s14_1
{
	
	public static void main(String []args) throws IOException
	{
		
		
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
	 String nn[]=new String[20];
	 String mm[]=new String[20]; int tot;
	 
	
		
		while(true)
		{
			System.out.println("1. search by name");
			System.out.println("2. Add");
			System.out.println("3. exit");
			int ch= Integer.parseInt(b.readLine());
			
			switch(ch)
			{
				
				case 1: 
							   
								FileInputStream fis= new FileInputStream("osim.txt");
									DataInputStream br= new DataInputStream(fis);
									
									if(fis.available()<=0)
									{
										System.out.println("Empty File...");
										fis.close();br.close();
										continue;
										
									}
									
	
									 System.out.println("Enter name");
								String temp1=b.readLine();
								
								
										String temp=br.readLine();
										String t[]=temp.split(" ");
					    
				     				for(int i=0;i<t.length-1;i++)
								      if(t[i].equals(temp1))      	
								      	{	System.out.println(t[i+1]);
								      	break; 
								      	 }
				      fis.close();br.close();
									
									break;
					case 2:
						
								FileInputStream fis1= new FileInputStream("osim.txt");
									DataInputStream br1= new DataInputStream(fis1);
									int i=0;
									if(fis1.available()>0)// to check whether file is empty or not.. (if true then not empty)
										{
														
														String whole=br1.readLine();
														String prev[]=whole.split(" ");
														for(int r=0;r<prev.length-1;r=r+2)
														{
															    
														     nn[i]=prev[r];
														     mm[i]=prev[r+1];				          
														     	i++;		      
														}
										}
							FileOutputStream fos= new FileOutputStream("osim.txt");
							
										DataOutputStream bw = new DataOutputStream(fos);
						System.out.println("Enter name");
								nn[i]=b.readLine();
								System.out.println("Enter number");
							mm[i]=b.readLine();
								i++;
							tot=i;
							for(int k=0;k<tot;k++)
								{
						      			
				     bw.writeBytes(nn[k]);
				     bw.writeBytes(" ");
				        bw.writeBytes(mm[k]);
				        bw.writeBytes(" ");
								}
				        fis1.close();br1.close(); fos.close(); bw.close();
									
									break;
						case 3: System.exit(0);
			}
			
			
		}
		
		

	}
	
}