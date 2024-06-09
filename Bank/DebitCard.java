public class DebitCard extends BankCard{

    // this is a Attribute of Debitcard
   private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
// this is a constructor and this is used to initialize the instance variable and it  is called when a new object of the class is created
    public DebitCard(String clientName, int balanceAmount, int cardId, String bankAccount, String issuerBank, int pinNumber ) {
        super(clientName, balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.hasWithdrawn = false;
        this.pinNumber = pinNumber;
        
    }
    //Getter method to access or read the value of pin number
    public int getPinNumber() {
        return pinNumber;
    }
    //Getter method to access or read the value of withdrawl amount
    public int getwithdrawalAmount() {
        return withdrawalAmount;
    }
    //Getter method to access or read the value of dateof withdrawl
    public String getdateOfWithdrawal() {
        return dateOfWithdrawal;
    }
    //Getter method to access or read the value of has withdrawn
    public boolean getHasWithdrawn() {
        return hasWithdrawn;
    }
    //setter or mutator method to update or change the value of client name 
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
//this method is used to withdraw amount if the balance amount is greater or equals to withdrawl amount
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int PinNumber) {
        if (PinNumber == pinNumber) {
            if (withdrawalAmount <= getbalanceAmount()) {
                setWithdrawalAmount(withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                setBalanceAmount(super.getbalanceAmount() - withdrawalAmount);
                this.hasWithdrawn = true;
                System.out.println("Withdrawal successful. Your remaining Balance is: " + getbalanceAmount());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid pin number.");
        }
    }
   //prints the values of the class if hasWithdrawn is true
    public void display() {
        super.display();
        if (hasWithdrawn==true) {
            System.out.println("Pin Number: " + pinNumber);
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        } else {
            System.out.println("No transaction Found.");
        }
    }
}
