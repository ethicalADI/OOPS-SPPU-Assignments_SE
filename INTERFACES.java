

/*
BY:ADITYA KUMAR  
Topic:INTERFACES
*/

package mock;

import java.util.*;

interface Vehicles
{
	void gearchange();
	void speed();
	void brakes();
}

class Bicycle implements Vehicles{
	 int gear=0;
	 int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu()
	{
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange()
	{
		if(gear==5)
		 {
			System.out.println("Bicycle already at maximum gear.");
			System.out.println("Bicycle is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) 
		{
			gear++;
			speed+=5;
			System.out.println("Bicycle is at "+gear+"th gear. \n");
			System.out.println("Bicycle is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Bicycle is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Bicycle has come to rest! \n");
		}
		else {
			speed-=5;
			gear-=1;
			System.out.println("Bicycle is at "+gear+"th gear.");
			System.out.println("Bicycle is moving at "+speed+" speed");
		}
	}
	void drive(){
		int x=0;
		int y=1;
		while(y!=0){
			menu();
			x=sc.nextInt();
			switch(x){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
			    y=0;
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			
			}
		}
		
	}
}

class Bike implements Vehicles{
	 int gear=0;
	 int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu(){
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange(){
		if(gear==5) {
			System.out.println("Bike already at maximum gear.");
			System.out.println("Bike is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) {
			gear++;
			System.out.println("Bike is at "+gear+"th gear. \n");
			speed+=20;
			System.out.println("Bike is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Bike is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Bike has come to rest! \n");
		}
		else {
			speed-=20;
			gear-=1;
			System.out.println("Bike is at "+gear+"th gear.");
			System.out.println("Bike is moving at "+speed+" speed");
		}
	}
	void drive(){
		int x=0;
		int y=1;
		while(y!=0){
			menu();
			x=sc.nextInt();
			switch(x){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
			    y=0;
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			
			}
		}
		
	}
}

class Car implements Vehicles{
	 int gear=0;
	 int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu(){
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange(){
		if(gear==5) {
			System.out.println("Car already at maximum gear.");
			System.out.println("Car is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) {
			gear++;
			System.out.println("Car is at "+gear+"th gear. \n");
			speed+=25;
			System.out.println("Car is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Car is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Car has come to rest! \n");
		}
		else {
			speed-=25;
			gear-=1;
			System.out.println("Car is at "+gear+"th gear.");
			System.out.println("Car is moving at "+speed+" speed");
		}
	}
	void drive(){
		int x=0;
		int y=1;
		while(y!=0){
			menu();
			x=sc.nextInt();
			switch(x){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
			    y=0;
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			
			}
		}
		
	}
}

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bicycle a=new Bicycle();
		Bike b=new Bike();
		Car c=new Car();
		int x=0;
		int y=1;
		
		while(y!=0){
			System.out.println("Enter Your Choice : \n 1. Bicycle \n 2. Bike \n 3. Car \n 4. Exit \n");
			x=sc.nextInt();
			switch(x){
			case 1:
				a.drive();
				break;
			case 2:
				b.drive();
				break;
			case 3:
				c.drive();
				break;
			case 4:
				y=0;
				System.out.println("Exit \n");
				break;
			
			}
		}
		sc.close();
	}

}
