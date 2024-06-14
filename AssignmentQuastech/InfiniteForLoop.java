package AssignmentQuastech;
public class InfiniteForLoop {

    public static void main(String[] args) {
        for (;;) {
            System.out.println("Inside infinite loop");
            if (conditionToBreakLoop()) {
                break;
            }
        }
    }
    public static boolean conditionToBreakLoop() {
        return false;
    }
}

