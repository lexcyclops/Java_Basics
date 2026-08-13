public class Bcons extends Acons {
    int a;

    Bcons(){
        System.out.println("Its B constructor");
    }

    Bcons(int a){
        super (10);
        System.out.println("Its B argument contructor");
    }

    public static void main(String [] args){

        Bcons b=new Bcons(80); 

    }
}
