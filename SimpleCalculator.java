import java.util.Scanner;

class Calculator{
      private double firstNumber;
      private double secondNumber;
      public void setFirstNumber(double firstNumber){
            this.firstNumber = firstNumber;
      }
      public void setSecondNumber(double secondNumber){
            this.secondNumber = secondNumber;
      }
      public double getFirstNumber(){
            return this.firstNumber;
      }
      public double getSecondNumber(){
            return this.secondNumber;
      }
      public double getAdditionResult(){
            return this.firstNumber + this.secondNumber;
      }
      public double getDivisionResult(){
            return this.firstNumber / this.secondNumber;
      }
      public double getMultiplication(){
            return this.firstNumber * this.secondNumber;
      }
      public double getSubtraction(){
            return Math.abs(this.firstNumber - this.secondNumber);
      }
      public double getRemainder(){
            return this.firstNumber % this.secondNumber;
      }
}

public class SimpleCalculator{
      public static void main(String[] args){
            Calculator val = new Calculator();
            double num1, num2;
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            val.setFirstNumber(num1);
            val.setSecondNumber(num2);

            System.out.println(val.getAdditionResult());
            System.out.println(val.getSubtraction());
            System.out.println(val.getMultiplication());
            System.out.println(val.getDivisionResult());
            System.out.println(val.getRemainder());
      }
}