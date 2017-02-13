package com.abyeti.common;

import org.hibernate.Session;
import com.abyeti.persistence.HibernateUtil;
import java.util.Scanner;

public class App
{
	
	public static Scanner scan = new Scanner(System.in);
	public static void main( String[] args )
    {
        System.out.println("Book Management System using Maven + Hibernate + MySQL");
        Integer option=1;
        
        functionimpl view = new functionimpl();
        //Login
        System.out.println("Please Login");
        System.out.print("=========>>");
        while(auth.login()==false){}
        
        //Session options
        while(option!=4)
        {
            System.out.println("Press ");
            System.out.println("1 for Books");
            System.out.println("2 for Users");
            System.out.println("3 for Sales");
            System.out.println("4 to quit");
            System.out.print("=========>>");
            option=scan.nextInt();
            switch(option)
            {
	      	case 1:
	        	{
	        		
	        		System.out.println("Press ");
	        		System.out.println("1 to add a book");
	        		System.out.println("2 to retrieve a book");
	        		System.out.println("3 to update a book");
	        		System.out.println("4 to delete a book");
	        		System.out.println("5 to display all books");
	        		System.out.print("=========>>");
	        		Integer option1=scan.nextInt();
	        		switch(option1)
	        		{
	        			case 1:
	        			{
	        				view.addBook();
	        				break;
	        			}
	        			case 2:
	        			{
	        				view.displayBook();
	        				break;
	        			}
	        			case 3:
	        			{
	        				view.updateBook();
	        				break;
	        			}
	        			case 4:
	        			{
	        				view.deleteBook();
	        				break;
	        			}
	        			case 5:
	        			{
	        				view.listallBook();
	        				break;
	        			}
	        		}
	        		break;
	        	}
	        	
	        	case 2:
	        	{
	        		System.out.println("Press ");
	        		System.out.println("1 to add a user");
	        		System.out.println("2 to retrieve a user");
	        		System.out.println("3 to update a user");
	        		System.out.println("4 to delete a user");
	        		System.out.println("5 to display all user");
	        		System.out.print("=========>>");
	        		Integer option2=scan.nextInt();
	        		switch(option2)
	        		{
	        			case 1:
	        			{
	        				view.addUser();
	        				break;
	        			}
	        			case 2:
	        			{
	        				view.displayUser();
	        				break;
	        			}
	        			case 3:
	        			{
	        				view.updateUser();
	        				break;
	        			}
	        			case 4:
	        			{
	        				view.deleteUser();
	        				break;
	        			}
	        			case 5:
	        			{
	        				view.listallUser();
	        				break;
	        			}
	        		}
	        		break;
	        	}
	        	case 3:
	        	{
	        		
	        		System.out.println("Press ");
	        		System.out.println("1 to add a sale");
	        		System.out.println("2 to retrieve a sale");
	        		System.out.println("3 to display all sale");
	        		System.out.print("=========>>");
	        		Integer option3=scan.nextInt();
	        		switch(option3)
	        		{
	        			case 1:
	        			{
	        				view.addSale();
	        				break;
	        			}
	        			case 2:
	        			{
	        				view.displaySale();
	        				break;
	        			}
	        			case 3:
	        			{
	        				view.listallSale();
	        				break;
	        			}
	        		}
	        		break;
	        		 
	        		
	        		
	        	}
	        	default: option=4;
            }
        }


    }
}
