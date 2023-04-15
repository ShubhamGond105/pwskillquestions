import java.util.Scanner;
public class newpaternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Star Print");
        int n = sc.nextInt();
        System.out.println("First Pattern");
        for (int i=0; i<n; i++){
        for (int j=0; j<n; j++) {
            if (i==0 || j==0 || i==n-1 || j==n-1){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
            System.out.println();
        }

        //new question
//        int m = sc.nextInt();
        System.out.println("Second Pattern");
        for (int i=0; i<n; i++ ){
            for (int j=0; j<n; j++){
                if (i==0 || j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //next pattern
        System.out.println("Third Pattern");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j==0 || j==n-1 || i==(n-1)/2 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Fourth Pattern");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0  ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Fifth Pattern");
        for (int i=0; i<n;i++ ){
            for (int j=0; j<n; j++){
                if (i==0 || j==0 || i==n-1 || j==n-1 || i==j || i+j==n || i-j==n/2 || i+j==n/2 ||j-i==n/2 || i+j==(n-1)+(n-1)/2  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("sixth pattern");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 && j<(n-2)/2 || j==0 && i<(n-1)/2|| i+j<=(n-1)/2 || i==0 && j>(n-1)/2 || j==n-1 && i<(n-1)/2|| j-i>=(n-1)/2 || j==n-1 && i>(n-1)/2 || i==n-1 && j>(n-1)/2 || i+j>=(n-1)+(n-1)/2 || j==0 &&i>(n-1)/2 || i==n-1 && j<(n-1)/2 || i-j>=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
