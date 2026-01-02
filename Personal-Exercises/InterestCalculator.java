package interestcalculator;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("--- Interest Calculator\n");
    System.out.println("Please enter the initial investment amount(Principal): ");double P=input.nextDouble();
    System.out.println("Enter the annual interest rate: ");double r=(input.nextDouble()/100);
    System.out.println("Enter the numbers of year the money will be invested: ");int t=input.nextInt();
    System.out.println("How many times is interest compounded per year: ");int n=input.nextInt();
    if(validateInput(P,r,t,n)){
        double totalAmount=totalCalculator(P,r,t,n);
        System.out.printf("The total amount after %d years will be: %.2f",t,totalAmount);
    }
    else{
        System.out.println("Invalid input. Please run the program again, all values must be greater than 0.");
    }
    
    
    
    input.close();
    }
    
    public static double totalCalculator(double P,double r, int t,int n){
        return P * Math.pow((1+(r/n)),(n*t));
    }
    
    public static boolean validateInput(double P,double r,int t,int n){
        if((P>0)&&(r>0)&&(t>0)&&(n>0)){
        return true;
        }
        else{return false;
        }
    }
}
