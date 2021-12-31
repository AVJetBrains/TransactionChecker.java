import java.util.*;
public class rightPassword<actualpassword> {
    public String CustomerName;
    public double cardNo;
    public double cardLimit;
    private double Totallimitused;
    public String bankname;
    public String actualpassword;

    public rightPassword(String CustomerName, double cardNo, double cardLimit, String bankname, String actualpassword) {
        this.CustomerName = CustomerName;
        this.cardNo = cardNo;
        this.cardLimit = cardLimit;
        this.Totallimitused = 0;
        this.bankname = bankname;
        this.actualpassword = actualpassword;
    }

    public String getCustomerName() {
        System.out.println("Customer name :" + " " + CustomerName);
        return CustomerName;
    }

    public void setActualpassword(String args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Old password");
        String actualpassword = scan.nextLine();
        System.out.println("Enter new Password");
        String newpassword = scan.nextLine();

        if (actualpassword.equals(newpassword)) {
            this.actualpassword = newpassword;
        }
    }


    public boolean checkPassword(String password) {
        boolean isvalid = false;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        String actualpassword = this.actualpassword;

        if (actualpassword.equals(password)) {
            if (password.length() >= 8) {
                if (password.matches("[a-zA-Z0-9]+")) {
                    for (int i = 0; i < password.length(); i++) {
                        if (Character.isDigit(password.charAt(i))) {
                            count++;
                        }
                    }
                    if (count >= 2) {
                        isvalid = true;
                        System.out.println("Access Granted : Proceed with OTP Authentication\nRandomly Generated PIN sent");
                    }
                }
            } else
                System.out.println("InValid Password");

        }else {
            System.out.println("Declined - Identity Not verified");
            return false;
        }
        return true;
    }
}

