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
}

public class SimpleCalculator{
      public static void main(String[] args){
            Calculator val = new Calculator();
            val.setFirstNumber(10);
            val.setSecondNumber(20);

            System.out.println(val.getAdditionResult());
            System.out.println(val.getMultiplication());
            System.out.println(val.getDivisionResult());
      }
}