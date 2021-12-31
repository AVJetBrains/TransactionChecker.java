import java.util.Scanner;


public class Card extends rightPassword {
    public int Totallimitused;

    public Card(String CustomerName, double cardNo, double cardLimit, String bankname, String actualpassword) {
        super(CustomerName, cardNo, cardLimit, bankname, actualpassword);
    }

    public String getCustomerName() {
        System.out.println("Customer name : " + CustomerName);
        return CustomerName;
    }

    public String getBankname() {
        System.out.println("Bank Name :" + " " + bankname);
        return bankname;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public void doTransaction(int amount) {
        boolean ispass = false;

        if (cardLimit - Totallimitused >= amount) {
            System.out.println("Need Identity Password");
            Scanner sc = new Scanner(System.in);
            if (checkPassword(sc.nextLine())) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Need approval for Transaction - Please Enter Security PIN");
                int MPIN = (int) (Math.random() * 999 + 1000);
                String otp = String.valueOf(MPIN);
                System.out.println(otp);
                String Approval = scan.nextLine();
                if (Approval.equals(otp)) {
                    ispass = true;
                    Totallimitused = Totallimitused + amount;
                    System.out.println("Transaction Accepted : relocating to the page of" + " " + bankname + "\n" + "Current Limit is " + (cardLimit - Totallimitused));
                    Totallimitused = Totallimitused + amount;
                } else {
                    System.out.println("Transaction declined - incorrect MPIN");
                }
            } else {
                System.out.println("Invalid Access or Incorrect Login Password");
            }
        }
        else {
            System.out.println("Transaction declined - Card Limit lesser than"+" "+ amount);
        }
    }
    public void setCardLimit ( int newCardLimit){
        this.cardLimit = newCardLimit;
    }
}

