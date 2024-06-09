
public class BankCard{
    //This is a attributes of Bank Card
  private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
 // this is a constructor and this is used to initialize the instance variable and it  is called when a new object of the class is created
    public BankCard(String clientName,int balanceAmount, int cardId, String bankAccount, String issuerBank) {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        //According to question client name should be empty
       this.clientName = "";
    }
    //Getter method to access or read the value of cardId
    public int getcardId() {
        return cardId;
    }
//Getter method to access or read the value of client name
    public String getclientName() {
        return clientName;
    }
//Getter method to access or read the value ofissuer bank
    public String getissuerBank() {
        return issuerBank;
    }
///Getter method to access or read the value of  bank account
    public String getbankAccount() {
        return bankAccount;
    }
//Getter method to access or read the value of  balance amount
    public int getbalanceAmount() {
        return balanceAmount;
    }
//setter method to update or change the value of client name 
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
//setter method to update or change the value of balance amount
    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
//prints the values of the class
    public void display() {
        if (clientName==("")) {
            System.out.println("Client name not assigned.");
        } else {
            System.out.println("Card ID: " + cardId);
            System.out.println("Client Name: " + clientName);
            System.out.println("Issuer Bank: " + issuerBank);
            System.out.println("Bank Account: " + bankAccount);
            System.out.println("Balance Amount: " + balanceAmount);
        }
    }
    
} 