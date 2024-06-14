package AssignmentQuastech;
public class InfiniteLoopDoWhile {

    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("Iteration: " + count);
            count++;
        } while (true);
    }
}
