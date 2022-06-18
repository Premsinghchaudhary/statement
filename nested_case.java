package statement;
import java.util.Scanner;
public class nested_case 
{
	

	public static void main(String[] args) 
	{
		
		
	
		
		  /*WAP to accept choice from the user and aCCORDINGLY DISPLAY THE OUTPUT
			1:Even Odd
			2:Square
			3:Vowel or Not
			4:Greater Between three No
	      */
              Scanner sc=new Scanner( System.in);
              System.out.println( " Select the choice :- \n 1:check Even or Odd \n 2:Square \n 3: check Vowel or Not \n 4:Greater Between three No "); //select the use itself
              
              System.out.println( " Enter your choice : ");//get from user 
              int choice = sc.nextInt();
              
              
              switch( choice) //using switch case
              {
              case 1: System.out.println(" Enter the number :  ");
                        int n1;         //variable declared
                       n1=sc.nextInt();              
                        if( n1%2==0) // using  if statement
                        {
                         System.out.println( " It is the EVEN no.");	
                        }
                        else 
                        {
                        	System.out.println( " it is the ODD no.");
                        }
                        
              case 2:System.out.println(" Enter the number :  ");
                       int n;
                      n=sc.nextInt();              
                     System.out.println(" The square is =  "+(n*n));  //calculate square and print the value  
                     
              case 3:System.out.println(" enter the character :-");
                      char ch;   //here datatype is char 
                     ch=sc.next().charAt(0);
                     switch( ch)  //switch case 
                     {
				     //check the vowel
                     case 'a': System.out.println(  " This  is a vowel "+ch);
                     break;
                     
                     case 'e': System.out.println (  " This  is a vowel "+ch);
                     break;
                     
                     case 'i': System.out.println (  " This  is a vowel"+ch);
                     break;
                     
                     case 'o': System.out.println (  " This  is a vowel"+ch);
                     break;
                     
                     case 'u': System.out.println (  " This  is a vowel "+ch);
                     break;
                     
                     default:
                           {
                         	 System.out.println ("This is not a vowel"); 
                         	 
                           }
                      	    break;
                     }
                        
              case 4:System.out.println( "enter the value of x : "); //get from the user 
                            int x,y,z; //declared variable
                            x=sc.nextInt();
                            
                            System.out.println( "enter the value of y : ");//get from the user 
                            y=sc.nextInt();
                            
                            System.out.println( "enter the value of z : ");//get from the user 
                            z=sc.nextInt();
                            
                            if(x>y&&x>z )  //using 'AND' logical opr. and condton statement 
                            {
                            	System.out.println( " x is greater no = "+x); //print the value of x
                            }
                          
                            else if ( y>x&&y>z) 
                            {
                            	System.out.println( " y is greater no = "+y);//print the value of y
                            }
                            else 
                            {
                            	System.out.println( " z is greater no = "+z);//print the value of z
                            }
                            break;
                            

                   }
            	  
		
	        }
     }