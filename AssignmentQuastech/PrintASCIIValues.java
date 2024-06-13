package AssignmentQuastech;
public class PrintASCIIValues {

    public static void main(String[] args) {

        System.out.println("ASCII values from 0 to 127:");

        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII value of " + (char) i + " is " + i);
        }
    }
}
