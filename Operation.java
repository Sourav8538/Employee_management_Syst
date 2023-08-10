package com.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Operation {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Employee>a1=new ArrayList<>();
	
	public static void Create(){
		int count=0;
		while(count==0){
			 Employee e1=new Employee();
			System.out.println("Enter the Employee id");
			e1.setId(sc.nextInt());
			System.out.println("Enter the Employee Name");
			e1.setName(sc.next());
			System.out.println("Enter the Employee designation");
			e1.setDesignation(sc.next());
			a1.add(e1);
			System.out.println(e1.getId() + " employee deatails added");
			System.out.println("Press 0 to add and press 1 to exit");
			count=sc.nextInt();
			if(count==1){
				System.out.println("Thank You");
			}
		}
	}
	public static void Read(int id){
//		Integer i1=new Integer(id);
//		if(i1.equals(e1.getId())){
//			System.out.println("Employee Id is "+e1.getId());
//			System.out.println("Employee name is "+e1.getName());
//			System.out.println("Employee designation is "+e1.getDesignation());
//		}
//		else{
//			System.out.println("Employee id invalid");
//		}
		
		for (int i=0;i<a1.size();i++){
			Employee e=a1.get(i);
			if(e.getId()==id){
				System.out.println(e.getId()+ " " +e.getName()+" "+e.getDesignation());
				
			}
		}
	}
	
	public static void ReadAll(){
		for (int i=0;i<a1.size();i++){
			Employee e=a1.get(i);
			
				System.out.println(e.getId()+ " " +e.getName()+" "+e.getDesignation());
				
			}
	}
	
	public static void Update(int id){
//		Integer i1=new Integer(id);
//		if(i1.equals(e1.getId())){
//			System.out.println("Enter the Employee name");
//			e1.setName(sc.next());
//			System.out.println("Enter the employee designation");
//			e1.setDesignation(sc.next());
//			if(e1!=null){
//				System.out.println(e1.getId() + "Employee update successfully");
//				
//			}
//		}
		for (int i=0;i<a1.size();i++){
			Employee e=a1.get(i);
			if(e.getId()==id){
				
				System.out.println("Enter the employee name");
				e.setName(sc.next());
				System.out.println("Enter the employee Designation");
				e.setDesignation(sc.next());
				System.out.println(id+ " Employee details updated successfully!!");
			}
		}
	
	}
	public static void Delete(int x){
		for(int i=0;i<a1.size();i++){
			Employee e=a1.get(i);
			if(e.getId()==x){
				a1.remove(i);
				System.out.println(x+ " is deleted Successfully");
			}
		}
		
	}

}
