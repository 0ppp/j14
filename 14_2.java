import java.io.*;
import java.util.*;
class color
  {
  	public static void main(String args[]) throws IOException
  	  {
  	  	 String data;
  	  	 LinkedList l1=new LinkedList();
  	  	 l1.add("Red");
  	  	 l1.add("Blue");
  	  	 l1.add("Yellow");
  	  	 l1.add("Orange");
  	  	 Iterator itr=l1.iterator();
  	  	 ListIterator litr=l1.listIterator();
         System.out.println("The contents of the list using Iterator is:");
         while(itr.hasNext())  	
           { 
          	 
          	 System.out.println(itr.next());
          	 litr.next();
           }
         System.out.println("The contents of the list in reverse order using ListIterator is:");
         while(litr.hasPrevious())  	
           {
          	 
          	 System.out.println(litr.previous());
           }
         LinkedList l2=new LinkedList();
  	  	 
  	  	
  	  	     
  	  	     
  	  	         l2.add("Pink");
  	  	         l2.add("Green");
l1.add(2,l2);
  	  	        
  	  	     
         System.out.println("The list containing the pink and green colors are:"+l1);
  	  }
  }
 
