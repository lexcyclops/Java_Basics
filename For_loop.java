import java.util.Scanner;

public class For_loop {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        
        int num=sc.nextInt();
        int sum=0;

        for (int i=0;i<num;i++){
            sum=sum+i;
        }
        System.out.println("Result :"+sum);
    
        sc.close();
    }
}
