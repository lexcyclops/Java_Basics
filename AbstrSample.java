public class AbstrSample extends Abstrclass {
    
    void onText(String text){ 
        
        System.out.println(text);
        
    }

    AbstrSample(){
        abstrTextScanner ts=new abstrTextScanner(this);
        ts.scan();
    }

    public static void main(String [] args){
        AbstrSample s=new AbstrSample();
    }

}
