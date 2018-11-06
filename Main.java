import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello! Let's reverse a linked list!");
        System.out.println("How many integers would you like to place in the list? ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //Handle invalid input.
        int size = 0;
        try {
            size = Integer.parseInt(input);
            if (size < 1) {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Please input all integers in order:");
        int num=0;
        LinkedList <Integer> list1= new LinkedList<Integer>();
        for (int i=0; i<size; i++) {
            num = sc.nextInt();
            list1.add(num);
        }


        //If size is 1, no need to reverse.
        if (size == 1) {
            System.out.println("The reversed linked list is: "+num);
            System.exit(0);
        }

        //Performing reversal.
        int temp;
        for (int i=size-1; i>0; i--) {
            temp = list1.remove();
            list1.add(i,temp);
        }

        System.out.print("The reversed linked list is: "+list1.toString());

    }
}
