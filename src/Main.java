public class Main {
    public static void main (String [] args ){

        rightPassword pass1 = new rightPassword("Akash" , 1234 , 30000 , "SBI","Akash1999" );
        Card card1 = new Card("Kunsh", 12333, 800000, "Bank of Baroda", "Kunsh1976");


        card1.getCustomerName();
        card1.getBankname();
        //*card1.doTransaction(34000);


        card1.doTransaction(70000);
        }
    }
