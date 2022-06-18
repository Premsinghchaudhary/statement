//Write a program to accept a no from user if no is even than find out the cube.

 import java.util.Scanner; 
 class cube
 {
     public static void main(String args[])
    {
  int a; //declared the variable 

 System.out.println("Enter the  numbers ");//get the number from user 
   
 Scanner sc = new Scanner(System.in);//scanner 
 
 a=sc.nextInt(); //pass the value of a in scanner 
// using condition statemnet 'else if'
 if( a==0) 
{
 System.out.println(" neither positive or nor negative = not defined ");

}
else if(a%2==0 )
{
 System.out.println("value of a is even now find a cube :" + (a*a*a) ); //calculate the cube and print
}
else
{

 System.out.println(" value of a is odd");

}
    }
}
