public class interMethod {
    public static void main (String [] args){
        interPayment P1=new UPIPayment();
        P1.makePayment(500.34);

        interPayment P2=new CardPayment();
        P2.makePayment(2000);    
    }
}
