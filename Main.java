
import java.util.Scanner;
public class Main
{
    public static void display() // funcation
    {
        System.out.println(" Calculator "); //System.out.println = cout<<""
        System.out.println(" 1. Sum ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiply ");
        System.out.println(" 4. Modulus  "); 
        System.out.println(" 5. Divide  ");     
    }
    public static void main(String args[])
    {
      int a,b;
      int choice;
      while(true)
      {
        display();
        System.out.print("Enter the Choice : ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt(); //cin>>choice
        switch(choice)
        {
            case 1:
            {
                //Part of Sum
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                int sum = a+b;
                 System.out.println("Sum : " + sum);
                break;
            }
            case 2:
            {
               //Part of Subtract
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                  int sub = a-b;
                 System.out.println("Subtraction : " + sub);
                break;
            }
            case 3:
            {
               //Part of Multipelation
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                  int mul = a*b;
                 System.out.println("Multiplation : " + mul);
                break;
            }
            case 4:
            {
               //Modules
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                  int mode = a%b;
                 System.out.println("modulus : " + mode);
                break;
            }
            case 5:
            {
               //Dividision 
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                  int divid = a/b;
                 System.out.println("Divide : " + divid);
                break;
            }
           default:
             System.out.println("Error ! ");
              break;
            
        }
      }
        
    }
    
}
