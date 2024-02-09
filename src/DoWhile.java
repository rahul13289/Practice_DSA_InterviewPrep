/*Actully the do while loop is used to reduce size of the code and eliminate frequent bug*/
import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
        do{
            System.out.println("Enter the number:");
            //The variable declared with int or any datatype cannot be used outside the curely bracres
            value=sc.nextInt();
        }
        while(value!=2);
        System.out.println("Got 2");
    }
}
