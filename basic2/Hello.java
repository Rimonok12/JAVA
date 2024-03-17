package basic2;

public class Hello {
    // this is a block

    long count = 12;
    int countInt = (int) count;

    public static void main(String[] args) {
        int age = 127; // the max range is 127 / more than that will re count start from first
        byte myAge = (byte) age; // explicit conversion

        short myAge2 = (short) age; // type casting

        System.out.println("Hello");
        System.out.println("sout :  System.out.println ");
        System.out.println("psvm  : public static void main(String[] args) {} ");
        System.out.println(myAge + "\n" + myAge2);

    }

}