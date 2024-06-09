

public class CreditCard extends BankCard {
    //This is a attribute of Credit Card
    private int cvcNumber;
    private double creditLimit;
     private boolean isGranted;
    private double interestRate;
    private int gracePeriod;
    private String expirationDate;
// this is a constructor and this is used to initialize the instance variable and it  is called when a new object of the class is created
    public CreditCard(int cardId ,String clientName,String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate,String expirationDate) {
        super(clientName, balanceAmount,cardId,bankAccount, issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.isGranted = false;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        
    }
//Accessor method or getter method to access or read the value of cvc number
    public int getcvcNumber() {
        return cvcNumber;
    }
//Getter method to access or read the value of  creditlimit
    public double getcreditLimit() {
        return creditLimit;
    }
//Getter method to access or read  the value of interestrate
    public double getinterestRate() {
        return interestRate;
    }
//Getter method to access or read  the value of expiration date
     public String getexpirationDate() {
        return expirationDate;
    }
//Getter method to access or read  the value of grace period
    public int getgracePeriod() {
        return gracePeriod;
    }
    
//Getter method to access or read  the value of is granted
    public boolean getisGranted() {
        return isGranted;
    }
//setting credit limit by mutator method to change or update the value of creditlimit
    public void setCreditLimit(double newcreditLimit, int newgracePeriod) {
        if (newcreditLimit <= 2.5 * super.getbalanceAmount()) {
            this.creditLimit = newcreditLimit;
            this.gracePeriod = newgracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("The credit cannot be issued.");
        }
    }
// to cancel the creditcard set the values of the field to 0 and false resets the fields of the credit card
    public void cancelCreditCard() {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
 //prints the values of the class if isGranted is true
    public void display() {
        super.display();
        if (isGranted==true) {
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        }
        else{
            System.out.println("Credit is not granted");
        }
    }
    
}
