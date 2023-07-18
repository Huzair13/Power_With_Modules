import java.util.Scanner;

public class PowerWithModules{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number A");
        int A=scanner.nextInt();

        System.out.println("Enter the number B");
        int B=scanner.nextInt();

        System.out.println("Enter the number C");
        int C=scanner.nextInt();

        int power=powerModules(A,B,C);
        System.out.println("Power with modules : "+power);
    }

    private static int powerModules(int a, int b, int c) {
        int result=1;
        for(int i=0;i<b;i++){
            result=(result*a)%c;
        }
        return (result%c);
    }
}