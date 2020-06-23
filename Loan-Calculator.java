import java.util.Scanner;
public class CarLoan {
	public static void main(String[] args) {

      //This is a basic Program to calculate car Loan
      
      Scanner in - new Scanner(System.in);
      
      int carLoan = in.nextInt();
      int loanLength = in.nextInt();
      int interestRate = in.nextInt();
      int downPayment = in.nextInt();

      if(loanLength <= 0 && interestRate <= 0){
        System.out.println("Error! You must take out a valid car loan.");
      } else if(downPayment >= carLoan){
        System.out.println("The car can be paid in full.");
      }else{
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance  * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
      }

	}
}
