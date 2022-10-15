package topics;

public class While {

    public static void myLoop(int initialNum, int lastNum) {

        while (initialNum <= lastNum) {
            System.out.println(initialNum);
            initialNum++;
        }
    }
}