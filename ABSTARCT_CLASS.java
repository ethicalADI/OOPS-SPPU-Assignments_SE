
/*
BY:ADITYA KUMAR  
Topic:ABSTRACT CLASS
*/


package mock;
import java.util.*;


abstract class BaseShape
 {
Scanner st=new Scanner(System.in);
 double a;
 double b;
 void getdata() {
	 System.out.println("Enter the first dimension: ");
	 a=st.nextDouble();
	 System.out.println("Enter the second dimension: ");
	 b=st.nextDouble();
 }
 public abstract void calculate_Area(double a,double b);
}

class Triangle extends BaseShape
{
 public void calculate_Area(double a,double b)
{
 double resultt=(a*b)/2.0;
 System.out.println("The value of area of triangle is: "+resultt);
 }
}
class Circle extends BaseShape
{
 public void calculate_Area(double a,double b)
{
 double resultc=(a*a)*3.14;
 System.out.println("The value of area of circle is : "+resultc);
 }
}
 class Rectangle extends BaseShape
{
 public void calculate_Area(double a,double b) {
 double resultr=a*b;
 System.out.println("The area of rectangle is : "+resultr);
 }
}
 public class Driver{
	 public static void main(String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int x=0;
	  int y=1;
	  while(y!=0)
	 {
	  System.out.println("Enter the value of choice for operation :\n  1.Triangle\n  2.Rectangle\n  3.Circle\n  4.Exit\n");
	  x=sc.nextInt();
	  switch(x){
	  
	  case 1:
	  Triangle t=new Triangle();
	  t.getdata();
	  t.calculate_Area(t.a,t.b);
	  break;
	  
	  case 2:
	  Rectangle r=new Rectangle();
	  r.getdata();
	  r.calculate_Area(r.a,r.b);
	  break;
	  
	  case 3:
	  Circle c=new Circle();
	  c.getdata();
	  c.calculate_Area(c.a,c.b);
	  break;
	  case 4:
		  y=0;
		  break;
	  }
	  }
	 
		 sc.close();
	  }
 }
