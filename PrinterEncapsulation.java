class Printer{
      private int numberOfPagesPrinted;
      private boolean isDuplex = true;
      private int tonerLevel;
      public Printer(int tonerLevel, boolean isDuplex){
            if(tonerLevel >= 1 && tonerLevel == 100 ){
                  this.tonerLevel = tonerLevel;
            }
            else{
                  this.tonerLevel = 0;
            }
            this.isDuplex = isDuplex;
            this.numberOfPagesPrinted = 0; 
      }

      public int addToner(int amount){
            if(tonerLevel >= 1 && tonerLevel <= 100){
                  if(this.tonerLevel + amount > 100){
                        return (this.tonerLevel+amount) - 100;
                  }
                  else{
                        this.tonerLevel = this.tonerLevel + amount;
                  }
            }
            return tonerLevel;
      }
      public int getTonerLevel(){
            return this.tonerLevel;
      }
      public int getNumberOfPages(){
            return this.numberOfPagesPrinted;
      }
}

public class PrinterEncapsulation{
      public static void main(String[] args){
            Printer newPrinter = new Printer(30, true);
            System.out.println(newPrinter.addToner(150));
            System.out.println(newPrinter.getTonerLevel());
            System.out.println("Number of pages printed = "+newPrinter.getNumberOfPages());
      }
}
