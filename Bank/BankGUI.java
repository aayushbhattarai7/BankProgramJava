

//Import swing and awt components
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class BankGUI{
   //Initialize variables of Jpanel,JLabel;JTextfield,JCombobox,JButton 
 private JFrame frame;
private JPanel pnl1,pnl2;
private JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9 ,l10,l11,l12;
private JTextField T1,T2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t13,t14,t15,t16,t17;
private JComboBox c1,c2,c3,c4,c5,c6;
private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
final static int INVALID = -1;
//ArrayList to store data of debitcard and creditcard
ArrayList<BankCard> list = new ArrayList<BankCard>();
//Constructor of BAnkGUI class
public BankGUI(){
    //At first creating frame
     frame = new JFrame("BankCard");
    frame.setSize(1600,1000);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font font = new Font(Font.SANS_SERIF ,Font.PLAIN,30);
    frame.setLayout(null);

//This is a debit card panel
pnl1 = new JPanel();
pnl1.setSize(800,400);
pnl1.setLocation(280,20);
pnl1.setVisible(true);
pnl1.setLayout(null);
pnl1.setBorder(BorderFactory.createTitledBorder("Debit Card"));
frame.add(pnl1);
pnl1.setBackground(Color.LIGHT_GRAY);
   
//label for add label in Debit card panel
    l1= new JLabel("Cardid");
    l1.setBounds(50,20,100,20);
    pnl1.add(l1);

//Textfield for input cardid
    T1= new JTextField();
    T1.setBounds(100,20,120,20);
    pnl1.add(T1);
   T1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

   //label for add label in Debit card panel
   l2= new JLabel("ClientName");
   l2.setBounds(30,60,100,20);
   pnl1.add(l2);

//Textfield for input clientName
   T2= new JTextField();
   T2.setBounds(100,60,120,20);
   pnl1.add(T2);
  T2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

  //label for add label in Debit card panel
  l3= new JLabel("IssuerBank");
  l3.setBounds(20,100,100,20);
  pnl1.add(l3);

//Textfield for input Issuer Bank
 t3= new JTextField();
 t3.setBounds(100,100,120,20);
  pnl1.add(t3);
t3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

  //label for add label in Debit card panel
  l4= new JLabel("BankAccount");
  l4.setBounds(20,140,100,20);
  pnl1.add(l4);

//Textfield for input Bank Account
 t4= new JTextField();
 t4.setBounds(100,140,120,20);
  pnl1.add(t4);
t4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

  //label for add label in Debit card panel
  l5= new JLabel("BalanceAmount");
  l5.setBounds(10,180,100,25);
  pnl1.add(l5);

//Textfield for input Balance Amount
 t5= new JTextField();
 t5.setBounds(100,180,120,20);
  pnl1.add(t5);
t5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Debit card panel
l6= new JLabel("PinNumber");
l6.setBounds(30,220,100,20);
pnl1.add(l6);

//Textfield for input PinNumber
t6= new JTextField();
t6.setBounds(100,220,120,20);
pnl1.add(t6);
t6.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Debit card panel
l7= new JLabel("WithdrawlAmount");
l7.setBounds(440,20,100,20);
pnl1.add(l7);

//Textfield for input WithdrawlAmount
t7= new JTextField();
t7.setBounds(540,20,120,20);
pnl1.add(t7);
t7.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Debit card panel
l8= new JLabel("dateOfWithdrawl");
l8.setBounds(440,60,100,20);
pnl1.add(l8);

//Combobox of Year for Dateof Withdrawl
String[] year= { "Year", "2010", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
"2019","2020","2021","2022","2023" };
c1 = new JComboBox<>(year);
c1.setBounds(540,60,60,20);
pnl1.add(c1);

   //Combobox of month for Dateof Withdrawl  
String[] month = { "Month", "January", "Febraury", "March", "April", "May", "June", "July", "August",
"September",
"Octuber", "November", "December" };
c2= new JComboBox<>(month);
c2.setBounds(610,60,70,20);
pnl1.add(c2);

//Combobox of Day for Dateof Withdrawl
String[] day = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
"16",
"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
c3 = new JComboBox<>(day);
c3.setBounds(699,60,70,20);
pnl1.add(c3);
  
//This is a credit card panel
pnl2 = new JPanel();
pnl2.setSize(800,390);
pnl2.setLocation(280,430);
pnl2.setBorder(BorderFactory.createTitledBorder("Credit Card"));
pnl2.setLayout(null);
pnl2.setVisible(true);
pnl2.setBackground(Color.lightGray);
frame.add(pnl2);

//label for add label in credit card panel
l1= new JLabel("Cardid");
l1.setBounds(50,20,100,20);
pnl2.add(l1);

//Textfield for input cardid
t13= new JTextField();
t13.setBounds(100,20,120,20);
pnl2.add(t13);
t13.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in credit card panel
l2= new JLabel("ClientName");
l2.setBounds(30,60,100,20);
pnl2.add(l2);

//Textfield for input clientName
t14= new JTextField();
t14.setBounds(100,60,120,20);
pnl2.add(t14);
t14.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in credit card panel
l3= new JLabel("IssuerBank");
l3.setBounds(20,100,100,20);
pnl2.add(l3);

//Textfield for input Issuer Bank
t15= new JTextField();
t15.setBounds(100,100,120,20);
pnl2.add(t15);
t15.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in credit card panel
l4= new JLabel("BankAccount");
l4.setBounds(20,140,100,20);
pnl2.add(l4);

//Textfield for input Bank Account
t16= new JTextField();
t16.setBounds(100,140,120,20);
pnl2.add(t16);
t16.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Debit card panel 
l5= new JLabel("BalanceAmount");
l5.setBounds(10,180,100,25);
pnl2.add(l5);

//Textfield for input Balance Amount
t17= new JTextField();
t17.setBounds(100,180,120,20);
pnl2.add(t17);
t17.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Credit card panel
l9= new JLabel("cvcNumber");
l9.setBounds(20,220,100,20);
pnl2.add(l9);

//Textfield for input cvcNumber
t8= new JTextField();
t8.setBounds(100,220,120,20);
pnl2.add(t8);
t8.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Credit card panel
l10= new JLabel("creditLimit");
l10.setBounds(400,100,100,20);
pnl2.add(l10);

//Textfield for input credit limit
t9= new JTextField();
t9.setBounds(480,100,120,20);
pnl2.add(t9);
t9.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Credit card panel
l11= new JLabel("gracePeriod");
l11.setBounds(400,140,100,20);
pnl2.add(l11);

//Textfield for input Graceperiod
t10= new JTextField();
t10.setBounds(480,140,120,20);
pnl2.add(t10);
t10.setBorder(BorderFactory.createLineBorder(Color.BLACK));


//label for add label in Credit card panel
l= new JLabel("InterestRate");
l.setBounds(20,260,100,20);
pnl2.add(l);

//Textfield for input InterestRate
t11= new JTextField();
t11.setBounds(100,260,120,20);
pnl2.add(t11);
t11.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//label for add label in Credit card panel
l12= new JLabel("expirationDate");
l12.setBounds(400,60,100,20);
pnl2.add(l12);

//combox for selecting year for expiration date
String[] Year= { "Year", "2010", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
"2019","2020","2021","2022","2023" };
c4 = new JComboBox<>(Year);
c4.setBounds(500,60,60,20);
pnl2.add(c4);

//combox for selecting Month for expiration date
String[] Month = { "Month", "January", "Febraury", "March", "April", "May", "June", "July", "August",
"September",
"Octuber", "November", "December" };
c5= new JComboBox<>(Month);
c5.setBounds(570,60,70,20);
pnl2.add(c5);

//combox for selecting Day for expiration date
String[] Day = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
"16",
"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
c6 = new JComboBox<>(Day);
c6.setBounds(650,60,70,20);
pnl2.add(c6);
  
//button to clear all the data entered in field
b2 = new JButton("clear");
b2.setBounds(200,270,150,30);
 b2.setLayout(null);
 pnl1.add(b2);
 b2.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("clear")){
      //reset textfields
      T1.setText("");
      T2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
      t6.setText("");
      t7.setText(""); 
      //reset combobox
      c1.setSelectedIndex(0);
      c2.setSelectedIndex(0);
      c3.setSelectedIndex(0);
    }
  }
});


//Button to add debit card
 b1 = new JButton("Add a Debit Card");
b1.setBounds(10,270,150,30);
b1.setLayout(null);
pnl1.add(b1);
b1.addActionListener(new ActionListener() { 
  public void actionPerformed(ActionEvent e){
    //add Debit method calling to add debit card
     addDebit();

  
  }
});
//Button for  withdraw Amount
b9 = new JButton("Withdraw from Debit Card");
 b9.setBounds(600,270,190,30);
 b9.setLayout(null);
 pnl1.add(b9);
 b9.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    //withdraw debit method calling to withdraw amount from debit card
   withdrawDebit();
    }
});

//Display button to display the information of debit card
b5 = new JButton("Display");
b5.setBounds(410,270,150,30);
 b5.setLayout(null);
 pnl1.add(b5);
 b5.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
   displayDebit();
    }
});

//Button to add credit card 
b3 = new JButton("Add a Credit Card");
 b3.setBounds(10,320,150,30);
 b3.setLayout(null);
 pnl2.add(b3);
 b3.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    //add Credit method calling to add credit card
  addCredit();
    }
});

//credit limit button to set credit limit
b4 = new JButton("Set CreditLimit");
 b4.setBounds(170,320,150,30);
 b4.setLayout(null);
 pnl2.add(b4);
 b4.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    setCredit();
  }
});

//Button to remove the credit card
b6 = new JButton("cancel credit card");
b6.setBounds(330,320,150,30);
 b6.setLayout(null);
 pnl2.add(b6);
 b6.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    cancelc();
  }
 });

//Display Button to display the information of credit card
 b7 = new JButton("Display");
b7.setBounds(500,320,150,30);
 b7.setLayout(null);
 pnl2.add(b7);
 b7.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    displayCredit();
  }
 });

//To clear the entered field in credit card
 b8 = new JButton("Clear");
b8.setBounds(660,320,130,30);
 b8.setLayout(null);
 pnl2.add(b8);
b8.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Clear")){
      //reset textfields
      t13.setText("");
      t14.setText("");
      t15.setText("");
      t16.setText("");
      t17.setText("");
      t8.setText("");
      t10.setText("");
      t9.setText("");
      t11.setText("");
      c4.setSelectedIndex(0);
      c5.setSelectedIndex(0);
      c6.setSelectedIndex(0);
      }}
});
//Make set visible true to make visible frame and we put it in last so all the components in frame visible easily
frame.setVisible(true);
}

//Getter method of cardid for debit card
public int getcardId(){
  
  int cardId=INVALID;
  try{
   cardId = Integer.parseInt(T1.getText().trim());
   if(cardId<=0){
     cardId =INVALID;
   }
  }catch(Exception e){
   
  }
    return cardId;
 }
 //Getter method of clientname for debit card
public String getclientName(){
 return T2.getText().trim();
 
}
//Getter method of issuerBank for debit card
public String getIssuerBank(){
 return t3.getText().trim();
}
//Getter method of BankAccount for debit card
public String getbankAccount(){
 return t4.getText().trim();
}
//Getter method of Balance AMount for debit card
public int getbalanceAmount(){
 int BalanceAmount = INVALID;
 //try and catch block to find and handle the exceptions
 try{ 
   BalanceAmount = Integer.parseInt(t5.getText().trim());
   if(BalanceAmount<=0){
     BalanceAmount =INVALID;
   
   }
  }catch(Exception e){
   
  }
  return BalanceAmount;
 
}
//Getter method of Pin number for debit card
public int getpinNumber(){
   int pinNumber = INVALID;
   //try and catch block to find and handle the exceptions
   try{
   pinNumber = Integer.parseInt(t6.getText().trim());
   if(pinNumber<=0){
    pinNumber= INVALID;
   
   }
  }catch(Exception e){
   
  }
  return pinNumber;
}
//Getter method of Withdrawl Amounnt for debit card
public int getwithdrawAmount(){
  int withdrawAmount = INVALID;
  //try and catch block to find and handle the exceptions
  try{
  withdrawAmount = Integer.parseInt(t7.getText().trim());
  if(withdrawAmount<=0){
   withdrawAmount= INVALID;
  
  }
 }catch(Exception e){
  
 }
 return withdrawAmount;
}
//Getter method of withdrawl date for debit card
public String getwithdrawDate (){
    String date = "";
    String year = c1.getSelectedItem().toString();
    String month = c2.getSelectedItem().toString();
    String day = c3.getSelectedItem().toString();

    if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
        date = null;
    } else {
        date = (year + "-" + month + "-" + day);
    }
    return date;
}


//Getter method of cardId for credit card
public int getfieldt13(){
    //try and catch block to find and handle the exceptions
  int CardId=INVALID;
  try{
   CardId = Integer.parseInt(t13.getText().trim());
   if(CardId<=0){
     CardId =INVALID;
   
   }
  }catch(Exception e){
   
  }

    return CardId;
 }

 //Getter method of clientName for credit card
public String getfieldt14(){
 return t14.getText().trim();
 
}

//Getter method of issuerBank for credit card
public String getfieldt15(){
 return t15.getText().trim();
}

//Getter method of Bank Account for credit card
public String getfieldt16(){
 return t16.getText().trim();
}

//Getter method of Balance Amount for credit card
public int getfieldt17(){
 int BalanceAmount = INVALID;
 //try and catch block to find and handle the exceptions
 try{
   BalanceAmount = Integer.parseInt(t17.getText().trim());
   if(BalanceAmount<=0){
     BalanceAmount =INVALID;
   
   }
  }catch(Exception e){
   
  }
  return BalanceAmount;
 
}
//Getter method of cvc number for credit card
public int getcvcNumber(){
  int cvcNumber = INVALID;
  //try and catch block to find and handle the exceptions
  try{
    cvcNumber = Integer.parseInt(t8.getText().trim());
    if(cvcNumber<=0){
      cvcNumber= INVALID;
    
    }
   }catch(Exception e){
   
   }
   return cvcNumber;
}
//Getter method of  for interest rate credit card
public int getinterestRate(){
  int interestRate = INVALID;
  //try and catch block to find and handle the exceptions
  try{
    interestRate = Integer.parseInt(t11.getText().trim());
    if(interestRate<=0){
      interestRate= INVALID;
    }
   }catch(Exception e){
    
   }
   return interestRate;
}

//Getter method of creditLimit for credit card
public double getCreditLimit(){
  double creditLimit = INVALID;
  //try and catch block to find and handle the exceptions
  try{
    creditLimit = Integer.parseInt(t9.getText().trim());
    if(creditLimit<=0){
      creditLimit= INVALID;
    }
   }catch(Exception e){
    
   }
   return creditLimit;
}

//Getter method of expiration date for credit card
public String getExpirationDate(){
  String Date = "";
  String Year = c4.getSelectedItem().toString();
  String Month = c5.getSelectedItem().toString();
  String Day = c6.getSelectedItem().toString();

  if (Year.equals("Year") || Month.equals("Month") || Day.equals("Day")) {
      Date = null;
  } else {
      Date = (Year + "-" + Month + "-" + Day);
  }
  return Date;
}

//Getter method of grace period for credit card
public int getGracePeriod(){
  int gracePeriod = INVALID;
  //try and catch block to find and handle the exceptions
  try{
    gracePeriod= Integer.parseInt(t10.getText().trim());
   if(gracePeriod<=0){
    gracePeriod= INVALID;
   }
    } catch(Exception e){
      
    } 
  return gracePeriod;}

 //addDebit method to add Debit card
 public void addDebit(){
  int cardId = getcardId();
  String clientName = getclientName();
  String issuerBank = getIssuerBank();
  String bankAccount = getbankAccount();
  int balanceAmount = getbalanceAmount();
  int pinNumber = getpinNumber();
//Validation for CreditCard to confirm the field is empty or not
  if(cardId == INVALID||clientName.isEmpty()||issuerBank.isEmpty()||bankAccount.isEmpty()||balanceAmount==INVALID||pinNumber==INVALID) {
    JOptionPane.showMessageDialog(pnl1, "Please fill all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
return;
    }
    
  boolean found = CardIdUnique(cardId);
if(found == false)
{
  //call DebitCard class Object
        DebitCard db = new DebitCard(clientName, balanceAmount,cardId,bankAccount,issuerBank,pinNumber);
      list.add(db);
      JOptionPane.showMessageDialog(pnl1,"DebitCard Added Successfully","success",JOptionPane.INFORMATION_MESSAGE);
}
else{
  JOptionPane.showMessageDialog(pnl1,"card id must be unique","Error",JOptionPane.ERROR_MESSAGE);
}
}

//check if the cardid is unique or not for debit and credit card
public boolean CardIdUnique(int cardId){
  boolean here = false;
  for(BankCard obj :list){
    if(obj instanceof DebitCard){
      DebitCard debit = (DebitCard)obj;
      if(debit.getcardId()==cardId){
        here =true;
      }
    }
  }
  return here;
}

//add credit method to add credit card
public void addCredit(){
  int cardId =  getfieldt13();
  String clientName = getfieldt14();
  String issuerBank = getfieldt15();
  String bankAccount = getfieldt16();
  int balanceAmount = getfieldt17();
 int cvcNumber = getcvcNumber();
 int interestRate = getinterestRate();
 String expirationDate = getExpirationDate();

 //Validation of credit card
 if(cardId == INVALID||clientName.isEmpty()||issuerBank.isEmpty()||bankAccount.isEmpty()||balanceAmount==INVALID||cvcNumber==INVALID||interestRate==INVALID|| expirationDate==null){
  
    JOptionPane.showMessageDialog(pnl2,"Error,Fill all the blank area","Error",JOptionPane.ERROR_MESSAGE);
    return;
  }
    boolean found = CardIdUnique1(cardId);
    if(found == false)
  {
  CreditCard cc = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate,expirationDate);
  list.add(cc);
  JOptionPane.showMessageDialog(pnl2,"Credit card added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
 
}
else{
  JOptionPane.showMessageDialog(pnl2,"CardId must be unique","Error",JOptionPane.ERROR_MESSAGE);
}}


//creating method for withdraw amount from debit card
public void withdrawDebit(){
int cardId = getcardId();
if(cardId==INVALID){
  JOptionPane.showMessageDialog(pnl1,"Card id should be positive","Error",JOptionPane.ERROR_MESSAGE);
return;
}
int pinNumber = getpinNumber();
  if(pinNumber==INVALID){
    JOptionPane.showMessageDialog(pnl1,"Pin number should be positive","Error",JOptionPane.ERROR_MESSAGE);
  return;
}
String date = getwithdrawDate();
  if(date==null){
    JOptionPane.showMessageDialog(pnl1,"Please enter date","Error",JOptionPane.ERROR_MESSAGE);
    return;
  }
  int withdrawAmount = getwithdrawAmount();
  if(withdrawAmount==INVALID){
    JOptionPane.showMessageDialog(pnl1,"Please enter withdraw amount","Error",JOptionPane.ERROR_MESSAGE);
    return;
  }
  //iterte one bye one and check if the card id is already in the list or not
  boolean isFound = false;
  for(BankCard obj :list){
  if(obj instanceof DebitCard){
    DebitCard debit= (DebitCard)obj;
    if(debit.getcardId()==cardId ){
        isFound = true;
      debit.withdraw(withdrawAmount,date,pinNumber);
      break;
      
    }
    
  }
  }
  if(isFound==false){
     JOptionPane.showMessageDialog(pnl1,"Invalid card id","Error",JOptionPane.ERROR_MESSAGE); 
  }else{
      JOptionPane.showMessageDialog(pnl1,"Withdrawal successful","Success",JOptionPane.INFORMATION_MESSAGE);
  }
}
//method To display the info of debit card
public void displayDebit(){
  for(BankCard obj :list){
    if(obj instanceof DebitCard){
      DebitCard debit = (DebitCard)obj;
      debit.display();
    }
  }
  JOptionPane.showMessageDialog(pnl1,"Watch in terminal for detail","Success",JOptionPane.INFORMATION_MESSAGE);
}

//Method to display the info of credit card
public void displayCredit(){
  for(BankCard obj :list){
    if(obj instanceof CreditCard){
      CreditCard credit = (CreditCard)obj;
      credit.display();
    }
  }
  JOptionPane.showMessageDialog(pnl2,"Watch in terminal for detail","Success",JOptionPane.INFORMATION_MESSAGE);
}

//Method for set creditlimit
public void setCredit(){
  double creditLimit = getCreditLimit();
if(creditLimit==INVALID){
  JOptionPane.showMessageDialog(pnl2,"Enter credit limit","Error",JOptionPane.ERROR_MESSAGE);
return;
}
int cardId = getfieldt13();
  if(cardId==INVALID){
    JOptionPane.showMessageDialog(pnl2,"Please enter card id","Error",JOptionPane.ERROR_MESSAGE);
    return;
  }
  int gracePeriod = getGracePeriod();
  if(gracePeriod==INVALID){
    JOptionPane.showMessageDialog(pnl2,"Please enter grace period","Error",JOptionPane.ERROR_MESSAGE);
    return;
  }
  //iterates one by one and check if the cardid is added in list or not 
  boolean isFound = false;
  for(BankCard objj :list){
    if(objj instanceof CreditCard){
      CreditCard credit= (CreditCard)objj;
      if(credit.getcardId()==cardId ){
          isFound = true;
        credit.setCreditLimit(creditLimit,gracePeriod);
        break;
        
    }}}
      if(isFound==false){
          JOptionPane.showMessageDialog(pnl2,"Invalid card id","Error",JOptionPane.ERROR_MESSAGE);;
        }
    else{
        JOptionPane.showMessageDialog(pnl2,"CreditLimit set successfully","Success",JOptionPane.INFORMATION_MESSAGE);
      }}
      
      public boolean CardIdUnique1(int cardId){
  boolean here = false;
  for(BankCard obj :list){
     if(obj instanceof CreditCard){ 
      CreditCard credit = (CreditCard)obj;
      if(credit.getcardId()==cardId){
        here =true;
      }
    }}
    return here;
}
//Method to cancel credit card
public void cancelc(){
  for(BankCard obj:list){
    if(obj instanceof CreditCard){
CreditCard credit = (CreditCard)obj;
credit.cancelCreditCard();
JOptionPane.showMessageDialog(pnl2,"Credit Card cancelled ","Success",JOptionPane.INFORMATION_MESSAGE);
}}}

//MainMethod of BankGUI class
public static void main(String[] args) {
  //object of BankGUI class
    BankGUI bg= new BankGUI();
}
}

 