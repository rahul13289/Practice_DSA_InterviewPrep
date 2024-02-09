import java.util.*;
public class GettingInputFromUser {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        //wait for user to enter input
        int value=sc.nextInt();
        //Tell them what to enter
        System.out.println(value);
    }

}
