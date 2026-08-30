public class Threadmain {
    public static void main(String a[]){

        SampleThread st=new SampleThread(1);
        st.start();

        SampleThread st1=new SampleThread(2);
        st1.start();

        SampleThread st2=new SampleThread(3);
        st2.start();

    }
}
