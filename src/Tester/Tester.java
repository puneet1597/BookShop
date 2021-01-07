package Tester;

import static Utils.CollectionsUtils.*;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map.Entry;

import com.app.core.Book;


import com.app.core.Customer;

import Utils.MyException;

import java.util.Scanner;
import java.util.Set;


public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Customer> al = new ArrayList<>();
			al.add(new Customer("user1", "123456"));
			al.add(new Customer("user2", "123456"));
			al.add(new Customer("user3", "123456"));
			al.add(new Customer("user4", "123456"));
			al.add(new Customer("user5", "123456"));
			
			Set<Book> ls = populateData();
			HashMap<Book,Integer> cart = new HashMap<>();
			System.out.println("Welcome to book store.........");
			System.out.println("enter the details username and password");
			boolean a = false;
			String name = sc.next();
			String password = sc.next();
			for (Customer value : al) {
				if (value.getName().equals(name) && value.getPassword().equals(password)) {
					System.out.println("user login");
					a = true;
				}
			}
			if (a == false) {
				throw new MyException("user not found");
			}
            while(true) {
			System.out.println("Press 1 to display all the books available book in the store  ");
			System.out.println("press 2 add avialable book to cart");
			System.out.println("press 3 To show the details of the cart");
			System.out.println("press 4 which book you wanna remove in the cart ");
			System.out.println("press 5 for exit and checkout");
			
			switch (sc.nextInt()) {
			case 1:
			    
				ls.forEach(i->System.out.println(i));

				break;
			case 2:
				try {
				System.out.println("enter the name book you wanna purchase");
				String bookName = sc.next();
				System.out.println("enter the quantity");
				int quant = sc.nextInt();
				boolean b=false;
				for(Book value:ls) {
			     if(value.getTitle().equals(bookName)) {
			    	 if(cart.containsKey(value)) {
			    		 Integer i=cart.get(value);
			    		 quant = quant+i;
			    		 cart.put(value, quant);
			    		  b=true;
			    	 }else {
			    	 cart.put(value, quant);
				       b=true;
				       }
			     }
				}
				if(b==false) {
				
					throw new MyException("SORRY,book not available in the store");
				}}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				for(@SuppressWarnings("rawtypes") Entry value:cart.entrySet()) {
					System.out.println(value.getKey());
					System.out.println("Quantity is ......" + value.getValue());
				}
				break;
			case 4:
				try {
				System.out.println("enter the name of book you wanna remove");
				
				String rmBook=sc.next();
	
				for(Book val:cart.keySet()) {
					if(val.getTitle().contains(rmBook)) {
				for(@SuppressWarnings("rawtypes") Entry value:cart.entrySet()) {
				
					int i =(int) value.getValue();
				if(i==1) {
					cart.remove(value.getKey());
					break;
				}else {
					System.out.println("enter the quantity you wanna remove");
					int quantity=sc.nextInt();
					if(quantity<=i) {
					cart.put((Book) value.getKey(), i-quantity);}
					else {
						System.out.println("check your quantity again");
					}
					break;
					}}}}}
				catch(Exception e) {
                    	System.out.println("book not in your account");
                    }
                    break;
			case 5:
				double totalBill=0;
				double price =0;
				double quantity =0;
				for(Book value:cart.keySet()) {
					System.out.println("book: "+value.getTitle());
					 price =price+value.getPrice();
				}
				for(Integer i:cart.values()) {
					quantity = quantity+i;
				}
			 
			System.out.println("total price:" + price*quantity);
			System.exit(0);
	}}}	
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
