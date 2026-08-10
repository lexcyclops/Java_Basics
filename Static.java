public class Static {
    int a=10;
    static int b=30;

    public static void main(String [] arg){
        
        Static h=new Static();
        Static h1=new Static();

        System.out.println(h.a);
        System.out.println(b);

        h.a=50;
        Static.b=100;

        h1.a=1000;
        Static.b=2000;

        System.out.println("h.a :"+h.a);
        System.out.println("h1.b :"+Static.b);


    }
}
