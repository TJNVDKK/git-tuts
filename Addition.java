import java.util.Scanner;
class Addition{
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter 1st Value : ");
    int a = scan.nextInt();
    System.out.println("Enter 2nd Value : ");
    int b = scan.nextInt();
    System.out.println("The Addition Of "+a+" And "+b+" is : "+(a+b));
    }
    
}