package com.manage.hotel;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelManage 
{
	public static void main(String[] args) 
	{
	  Scanner scan = new Scanner(System.in);
	  Date date= new Date();
	  System.out.println("Enter the Customer name :");
	  String name=scan.nextLine();
	  System.out.println(" ");
	  System.out.println("Hotel Name\t\t"+"User Name\t\t"+"Date and Time");
	  System.out.println(" ");
	  System.out.println("WELCOME TO ABHI HOTEL"+"\t"+name+"\t\t\t"+date.toLocaleString());
	  int a,b,c,d,e,f,l,i;
	  int eachcost=0;
	  int cost=0;
	  int price=0;
	  int y=0,v=0;
	  String item=new String();
	  
	  System.out.println(" ");
	  System.out.println("Our Menu Card ");
	  System.out.println(" ");
	  System.out.println("Item Name\t\t"+"Price\t\t"+"Press to Order");
	  System.out.println(" ");
	  System.out.println("Chicken Biryani\t\t"+"70\t\t"+"1");
	  System.out.println("Manchuriyan\t\t"+"50\t\t"+"2");
	  System.out.println("Veg Biryani\t\t"+"40\t\t"+"3");
	  System.out.println("Pav Bhaji\t\t"+"30\t\t"+"4");
	  System.out.println(" ");
	  
	  System.out.println(" ");
	  ArrayList order= new ArrayList();
	  ArrayList<Integer> pric= new ArrayList<>();
	  ArrayList plate= new ArrayList();
	  
	   //String order=;
	do
	   {
		   System.out.println("Press to Order :");
		   a=scan.nextInt();
		   int press[]=new int[]{a};
		  
		   System.out.println("Enter the Number of Plates :");
		   b=scan.nextInt();
		   System.out.println(" ");
		  
		   if(a==1)
		   {
			  item="Chicken Biryani";
			  price=70;
			  eachcost=price*b;
			  cost+=eachcost;
			  
			  boolean of=order.contains(item);
			  if(of)
			  {
				  order.add("");
				  pric.add(eachcost);
				  plate.add(b);
			  }
			  else
			  {
				  pric.add(eachcost);
				  plate.add(b);
				  order.add(item);
			  }
		   }
		   
		   
		   if(a==2)
		   {
				  item="Manchuriyan";
				  price=50;
				  eachcost=price*b;
				  cost+=eachcost;
				  
				  order.add(item);
				  pric.add(eachcost);
				  plate.add(b);
		   }
		   
		   if(a==3)
		   {
				  item="Veg Biryani";
				  price=40;
				  eachcost=price*b;
				  cost+=eachcost;
				  System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
				  order.add(item);
				  pric.add(eachcost);
				  plate.add(b);
		   }
		   
		   if(a==4)
		   {
				  item="Pav Bhaji";
				  price=30;
				  eachcost=price*b;
				  cost+=eachcost;
				  
				  order.add(item);
				  pric.add(eachcost);
				  plate.add(b);
		   }
		   
		   for(int k=0;k<press.length;k++)
		   {
			   String fetchitemname=" ";
			   if(press[k]==1)
			   {
				   fetchitemname="Chicken Biryani";  
			   }
			   if(press[k]==2)
			   {
				   fetchitemname="Manchuriyan";  
			   }
			   if(press[k]==3)
			   {
				   fetchitemname="Veg Biryani"; 
			   }
			   if(press[k]==4)
			   {
				   fetchitemname="Pav Bhaji"; 
			   }
		   }
		   
		   System.out.println("Do you want to Continue the Order(Press 1 for continue/Otherwise Press 0)");
		   y=scan.nextInt();
		   System.out.println(" ");
		  
       }while(y!=0);
	   
	   System.out.println(" ");
	   System.out.println(" ");
	   System.out.println("Item Names"+"\t\t\t\t\t\t"+"No. of plates"+"\t\t"+"Sub Total");
	   Iterator itr=order.iterator();
	   Iterator<Integer> itr1=pric.iterator();
	   Iterator itr2=plate.iterator();
	   
	   while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
	   {
		   System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr1.next());
		   System.out.println(" ");
	   }
	   System.out.println(" ");
	   System.out.println("Total Bill :"+"\t\t\t\t\t\t\t"+"   "+"\t\t"+cost);
	   System.out.println(" ");
	   
	   System.out.println("Do you want to Delete the order(Press 1 for continue/otherwise Press 0)");
	   l=scan.nextInt();
	   
	   System.out.println(" ");
	   
	   if(l==1)
	   {
		   do
		   {
			   if(order.isEmpty())
			   {
				   System.out.println("Your cart is Empty");
				   break;
			   }
			   else
			   {
				   System.out.println("Press to delete");
				   f=scan.nextInt();
				   int delete[]=new int[] {f};
				   
				   if(f==1)
				   {
					   item="Chicken Biryani";
					   boolean of=order.contains(item);
					   int of1=order.indexOf(item);
					   
					   if(of)
					   {
						   order.remove(item);
						   cost=cost-pric.remove(of1);
						   
						   plate.remove(of1);
					   }
				   }
				   
				   if(f==2)
				   {
					   item="Manchuriyan";
					   boolean of=order.contains(item);
					   int of1=order.indexOf(item);
					   
					   if(of)
					   {
						   order.remove(item);
						   cost=cost-pric.remove(of1);
						   
						   plate.remove(of1);
					   }
				   }
				   
				   if(f==3)
				   {
					   item="Veg Biryani";
					   boolean of=order.contains(item);
					   int of1=order.indexOf(item);
					   
					   if(of)
					   {
						   order.remove(item);
						   cost=cost-pric.remove(of1);
						   
						   plate.remove(of1);
					   }
				   }
				   
				   if(f==4)
				   {
					   item="Pav Bhaji";
					   boolean of=order.contains(item);
					   int of1=order.indexOf(item);
					   
					   if(of)
					   {
						   order.remove(item);
						   cost=cost-pric.remove(of1);
						   
						   plate.remove(of1);
					   }
				   }
				   System.out.println("Continue to delete the Order(Press 1 for continue/otherwise Press 0)");
				   v=scan.nextInt();
			   }
		   }while(v!=0);
		   System.out.println(" ");
		   System.out.println("Item Names"+"\t\t\t\t\t\t"+"No. of plates"+"\t\t"+"Sub Total");
		   itr =order.iterator();
		   itr1 =pric.iterator();
		   itr2 =plate.iterator();
		   int scost=0;
		   while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
		   {
			   System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr1.next());
			   System.out.println(" ");
			   
			   System.out.println(" ");
		   }
		   System.out.println("Total Bill :"+"\t\t\t\t\t\t\t"+"    "+"\t\t"+cost);
	   }
	   else
	   {
		   System.out.println("Item Names"+"\t\t\t\t\t\t"+"No. of plates"+"\t\t"+"Sub Total");
		   itr = order.iterator();
		   itr1 = pric.iterator();
		   itr2 = plate.iterator();
		   int scost1=0;
		   while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
		   {
			   System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr1.next());
			   System.out.println(" ");
			   
			   System.out.println(" ");
		   }
		   System.out.println("Total Bill :"+"\t\t\t\t\t\t\t"+"    "+"\t\t"+cost);
	   }
	   System.out.println("Thanks you for visiting our Hotel"+"  "+name+"\t\t\t"+"Signature");
	}
}
