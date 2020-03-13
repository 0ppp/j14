/*
  Program name:Create a link list containing the names of days in a week.
  Display the menu that has following option.
   1.Disply the content of the list in reverse order using list iterator.
   2.Disply the content of the list using iterator.
   3.Accept a day an disply it's index in the collection.
   4.Exit
*/
import java.util.*;
import java.io.*;
import java.lang.String;
class clistdemo
{
	public static void main(String args[]) throws Exception
  	{
		LinkedList ll=new LinkedList();
		int ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ll.add("Sunday");
		ll.add("Monday");
		ll.add("Tuesday");
		ll.add("Wednesday");
		ll.add("Thursday");
		ll.add("Friday");
		ll.add("Saturday");
		do
		{
        	System.out.println("\nMENU");
	   		System.out.println("1.Display Contents \n2.Display in reverse order\n3.Accept day and display it's index\n4.Exit");
           	System.out.println("Enter your choice:");
	   		ch=Integer.parseInt(br.readLine());
	   		switch(ch)
			{
				case 1:
						System.out.println("Original Contents of LL:");
						Iterator itr=ll.iterator();
						while(itr.hasNext())
						{
							Object element=itr.next();
							System.out.println(element+"  ");
						}
						System.out.println();
						break;
		
				case 2:
						System.out.println("Contents of LL in reverse order:");
						ListIterator litr=ll.listIterator();
						while(litr.hasNext())
						{
							Object element=litr.next();
						}
						while(litr.hasPrevious())
						{
							Object element=litr.previous();
							System.out.println(element+"  ");
						}
						System.out.println();
						break;
		
				case 3:
						System.out.println("Enter the day:");
						String day=br.readLine(); 
						ListIterator litr1=ll.listIterator();
						/*while(litr1.hasNext())
						{
							Object element=litr1.next();
						}*/
						int index=ll.indexOf(day);
						System.out.println(index);
						break;
				case 4:
						System.exit(0);
			}
		}while(ch!=4);
	}
}