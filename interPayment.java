/**
 * interPayment
 */
public interface interPayment {

    void makePayment(double amount);

}
class UPIPayment implements interPayment{
    public void makePayment(double amount){
        System.out.println("UPI Payment successfull "+amount);
    }
}    

class CardPayment implements interPayment{
    public void makePayment(double amount){
        System.out.println("Card Payment successfull "+amount);
    }
}

