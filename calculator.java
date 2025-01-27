import java.util.Scanner;

public class calculator {
    public void display(){
        System.out.println("Calculator\n");
        System.out.println("==========\n");
        System.out.println("1.Addition\n");
        System.out.println("2.Subtraction\n");
        System.out.println("3.Multiplication\n");
        System.out.println("4.Division\n");
        System.out.println("5.Exit\n");
    }

    public void add(int num1, int num2){
        System.out.println("Addition of the two numbers is " + (num1+num2));
    }

    public void sub(int num1, int num2){
        System.out.println("Difference of the two numbers is " + (num1-num2));
    }

    public void mul(int num1, int num2){
        System.out.println("Product of the two numbers is " + (num1*num2));
    }

    public void div(int num1, int num2){
        if(num2 != 0){
            System.out.println("Division of the two numbers is " + (num1/num2));
        }
        else{
            System.out.println("Cannot be divided by zero");
        }  
    }

    public void end(){
        System.out.println("Thank you for using us!!");
    }

    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     calculator calci = new calculator();
     int choice;
     String ch;
     int num1;
     int num2;
     do{
        calci.display();
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter number 1:");
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            calci.add(num1,num2);
            break;

            case 2:
            System.out.println("Enter number 1:");
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            calci.sub(num1,num2);
            break;

            case 3:
            System.out.println("Enter number 1:");
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            calci.mul(num1,num2);
            break;

            case 4:
            System.out.println("Enter number 1:");
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            calci.div(num1,num2);
            break;

            case 5:
            calci.end();
            break;

            default:
            System.out.println("Not a valid choice..");
        }
        
        System.out.println("Do you want to continue(y/n):");
        ch = sc.next();
     } while (ch.equalsIgnoreCase("y"));

     
    }
}
