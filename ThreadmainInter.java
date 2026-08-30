public class ThreadmainInter {
    public static void main(String a[]){

        SampleThreadInter st=new SampleThreadInter();
        Thread t=new Thread(st);
        t.start();

        SampleThreadInter st1=new SampleThreadInter();
        Thread t1=new Thread(st1);
        t1.start();

        SampleThreadInter st2=new SampleThreadInter();
        Thread t2=new Thread(st2);
        t2.start();
    }
}
