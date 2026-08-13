public class B extends A{
    int a;
    void display(){
        System.out.println("Its the class B");
        a=20;
        super.a=30;
        int c=a+super.a;
        System.out.println("Sum :"+c);
    }
}
