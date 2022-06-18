//WAP by using switch display the choice 1:Add 2:Sub 3: Mul 4: Div5:MOd?

import java.util.Scanner; 
class switch_case
{
public static void main(String args[])  //main method 
{
  int x,y,choice; //declartion varaiable

 System.out.println("Enter the two numbers "); //get the number from user 
   
 Scanner sc = new Scanner(System.in); //scanner object
 
 x=sc.nextInt(); 
 y= sc.nextInt();


 System.out.println("Enter the choice/n 1 Add :+n/ 2 sub:+/n 3 Mul:+/n 4 Division :+/n 5 Modulas ");  //print thw choice from user select the no the get the result
 choice=sc.nextInt();  //choice object by using scanner
 switch(choice)//using switch case 
{
  case 1:
  System.out.println(" The addition of two numbers is : "+(x+y) ); //for addition 
  break;

  case 2:
  System.out.println(" The sub of two numbers is : "+(x-y) );  //for substraction
  break;
 
  case 3:
  System.out.println(" The multipicaltion  of two numbers is : "+(x*y) ); //for multiplication 
  break;

  case 4:
  System.out.println(" The Division of two numbers is : "+(x/y) ); //for division
  break;
  
  case 5:
  System.out.println(" The Modulas of two numbers is : "+(x%y) ); //for modulas
  break;

 default:
 System.out.println(" invaild : " );
  break;

}

 
}
}