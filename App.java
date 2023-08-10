package com.jsp;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to employee management System");
		int count=0;
		while(count==0){
			Thread.sleep(2000);
			System.out.println("Select ur choice");
			System.out.println("1. create the employee details");
			System.out.println("2. read the employee details");
			System.out.println("3. update the employee details");
			System.out.println("4. Delete the employee details");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				Operation.Create();
				System.out.println("Do you want to perform further operation press 0 for exit press 1");
				count=sc.nextInt();
				break;
			case 2:
				System.out.println("do you want to get the employee details by id press 1");
				
				System.out.println("Do you want to get all the employee details press 2");
				int a=sc.nextInt();
				if(a==1){
					System.out.println("Enter the id of the employee");
					int id=sc.nextInt();
					Operation.Read(id);
				}
				else if(a==2){
					Operation.ReadAll();
				}
				
				System.out.println("Do you want to perform further operation press 0 for exit press 1");
				count=sc.nextInt();
				break;
			case 3:
				System.out.println("Update the Employee Details By Id");
				int id=sc.nextInt();
				
				Operation.Update(id);
				System.out.println("Do you want to perform further operation press 0 for exit press 1");
				count=sc.nextInt();
				break;
			case 4:
				System.out.println("Enter the employee id to be deleted");
				int x=sc.nextInt();
				
				Operation.Delete(x);
				System.out.println("Do you want to perform further operation press 0 for exit press 1");
				count=sc.nextInt();
				break;
			default:
				System.out.println("Wrong choice");
				break;
				
				
			
			}
		}
	}
}
