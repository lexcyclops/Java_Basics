package src.test2;

import java.util.Scanner;

import src.test1.SamplePackage1;

public class SamplePackage2 {

    SamplePackage2(){
        SamplePackage1 h=new SamplePackage1();
        Scanner s=new Scanner(System.in);

        h.display();
        SampleTest2 q=new SampleTest2();
        q.display();

    }
}
