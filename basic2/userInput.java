package basic2;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age : " + age);

    }
}
