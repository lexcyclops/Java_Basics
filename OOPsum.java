public class OOPsum {
    public static void main(String a[]){
        int num1=100;
        int num2=200;
        
        int num3=150;
        int num4=250;
        
        SUM s=new SUM();
        SUM sc=new SUM();

        s.calculateSum(num1,num2);
        s.displaySum();


        sc.calculateSum(num3,num4);
        sc.displaySum();

        s.displaySum();
    }
}
