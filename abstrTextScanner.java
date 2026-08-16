public class abstrTextScanner {
    Abstrclass obj ;

    public abstrTextScanner(Abstrclass obj){
        this.obj=obj;
    }

    void scan(){
        obj.onText("Scanned text");
    }
}
