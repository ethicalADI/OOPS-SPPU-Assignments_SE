
/*
BY:ADITYA KUMAR  
Topic:COMPLEX  NUMBER
*/

import java.util.*;
public class ComplexNumber{
            double real;
            double imaginary;
            
            ComplexNumber(){}
            ComplexNumber(double real,double imaginary){
                this.real = real;
                this.imaginary = imaginary;
            }
            
        
         
          public  ComplexNumber sum(ComplexNumber a, ComplexNumber b)
          {
                ComplexNumber ans = new ComplexNumber(); 
                ans.real = a.real + b.real;
                ans.imaginary = a.imaginary + b.imaginary;
                return ans;
            }

         public static ComplexNumber diff(ComplexNumber a, ComplexNumber b)
         {
                ComplexNumber ans = new ComplexNumber();
                ans.real = a.real - b.real;
                ans.imaginary = a.imaginary - b.imaginary;
                return ans;
            }   
         public static ComplexNumber mul(ComplexNumber a, ComplexNumber b) 
         {
                ComplexNumber ans = new ComplexNumber();
                ans.real=a.real*b.real-a.imaginary*b.imaginary;
                ans.imaginary=a.real*b.imaginary+b.real*b.imaginary;
                return ans;

        }  
         public static ComplexNumber div(ComplexNumber a, ComplexNumber b){
             ComplexNumber ans = new ComplexNumber();
             ans.real= (a.real*b.real+a.imaginary*b.imaginary)/(b.real*b.real+b.imaginary*b.imaginary);
             ans.imaginary=(-a.real*b.imaginary+b.real*b.imaginary)/(b.real*b.real+b.imaginary*b.imaginary);
             return ans;
         }
         
        public void display() {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("real: \n");
            real = sc.nextDouble();
            System.out.println("imaginary: \n");
            imaginary = sc.nextDouble();
            
          
        }
        public static void main(String args[]){
        	Scanner sc = new Scanner(System.in);
       	    ComplexNumber num1 = new ComplexNumber();
            ComplexNumber num2 = new ComplexNumber();
            ComplexNumber test = new ComplexNumber();
        	
        	int x=0;
        	int y=1;
        	
        	
             while(y!=0){
        		       		        		        	       	       	
            
        	System.out.println("ENTER YOUR CHOICE: \n 1-Addition \n"
        			+" 2-Subtraction \n 3-Multiplication \n 4-Division\n 5-Exit");
        	x = sc.nextInt();
            
            
            switch(x){
            
            case 1 : {
            	num1.display();
            	num2.display();
            	ComplexNumber ans = test.sum(num1,num2);
                System.out.println("The addition of two complex numbers is : "+ans.real+" + "+ans.imaginary+"i");
                break;
            }
            case 2 : {
            	num1.display();
            	num2.display();
            	ComplexNumber answer1 = diff(num1,num2);
                System.out.println("The difference of two complex numbers is : "+answer1.real+" + "+answer1.imaginary+"i");
                break;
            }
            
            case 3: {
            	num1.display();
            	num2.display();
            	ComplexNumber answer2 = mul(num1,num2);
                System.out.println("The multiplication of two complex numbers is : "+answer2.real+" + "+answer2.imaginary+"i");
                break;
            }
            
            case 4:
            {  
            	num1.display();
            	num2.display();
            	if(num2.real==0 && num2.imaginary==0) {
            	System.out.println("ANSWER NOT DEFINED!");
            	break;
               	}
                else if(num1.real==0 && num1.imaginary==0) {
            	System.out.println("ANSWER NOT DEFINED!");
            	break;
                }
            	else{
            	ComplexNumber answer2 = div(num1,num2);
                System.out.println("The division of two complex numbers is : "+answer2.real+" + "+answer2.imaginary+"i");
                break;
            	}
            
            }
            case 5:
            { y=0;
             break;
             }
            }
                       	
        	} 
        	sc.close();
        }
    }
