interface Camera {//Example for mmultiple inheritance using interface method
    void takePicture();
}

interface Music {
    void playMusic();
}

class Laptop implements Camera, Music{

    public void takePicture(){
        System.out.println("Picture taken successfully..");
    }

    public void playMusic(){
        System.out.println("Music is playing..");
    }
}
public class MultiTask{
    public static void main (String [] args){
        Laptop s1=new Laptop();

        s1.takePicture();
        s1.playMusic();
    }
}

