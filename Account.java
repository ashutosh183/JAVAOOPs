class BankDetails{
      private String accountNumber;
      private double accountBalance;
      private String customerName;
      private String customerEmailAddress;
      private String customerPhoneNumber;
      BankDetails(){
            //CALLING THE PARAMETEIZED CONSTRUCTOR FROM DEFAULT CONSTRUCTOR
            //this("567328903782", 4255662, "Ashutosh", "ashutoshdev16@gmail.com", "6384137446");
            System.out.println("Default constructor called");
      }
      BankDetails(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber){
            setAccountNumber(accountNumber);
            setAccountBalance(accountBalance);
            setCustomerName(customerName);
            this.customerEmailAddress = customerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
      }
      public void setAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
      }
      public void setAccountBalance(double accountBalance){
            this.accountBalance = accountBalance;
      }
      public void setCustomerEmailAddress(String customerEmailAddress){
            this.customerEmailAddress = customerEmailAddress;
      }
      public void setCustomerName(String customerName){
            this.customerName = customerName;
      }
      public void setCustomerPhoneNumber(String customerPhoneNumber){
            this.customerPhoneNumber = customerPhoneNumber;
      }
      public String getAccountNumber(){
            return this.accountNumber;
      }
      public String getCustomerName(){
            return this.customerName;
      }
      public double getAccountBalance(){
            return this.accountBalance;
      } 
      public String getCustomerEmailAddress(){
            return this.customerEmailAddress;
      }
      public String getCustomerPhoneNumber(){
            return this.customerPhoneNumber;
      }
      public void depositAmount(double amount){
            this.accountBalance = this.accountBalance + amount;
            System.out.println("Your new balance amount is: "+this.accountBalance);      
      }
      public void withDrawalAmount(double withDrawalAmount){
            if(this.accountBalance - withDrawalAmount < 0){
                  System.out.println("You don't have sufficient balance");
            }
            else{
                  this.accountBalance -= withDrawalAmount;
            }
      }
}

public class Account{
      public static void main(String[] args){
            BankDetails customer = new BankDetails();
            customer.setAccountNumber("5364753265");
            customer.setAccountBalance(500);
            customer.setCustomerEmailAddress("customer@xyz.com");
            customer.setCustomerName("Customer1");
            customer.setCustomerPhoneNumber("6737867850");
            customer.depositAmount(6735754);
            customer.withDrawalAmount(50000);
            System.out.println(customer.getCustomerName());
            System.out.println(customer.getAccountNumber());
            System.out.println(customer.getAccountBalance());
            // private String accountNumber;
            // private double accountBalance;
            // private String customerName;
            // private String customerEmailAddress;
            // private String customerPhoneNumber;
            BankDetails ashutoshAccount = new BankDetails("56432714323", 56333356435D, "Ashutosh Pandey", "ashutoshkumarpandey183@gmail.com", "6436563912");

      }
}