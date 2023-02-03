package CodeTasks;

import java.util.Scanner;
import static Utils.ConfigUtils.ConfigManager.*;

public class HelloIfNumberAlgorithm {

    private static final int DEFAULT_NUMBER = NUMBER;

    public void checkEnteredNumber() {
        System.out.println(GREETING_FOR_NUMBER_ALGO);
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int enteredNumber = in.nextInt();
            if (enteredNumber > DEFAULT_NUMBER) {
                System.out.println(WELCOME_FOR_NUMBER_ALGO);
            } else {
                System.out.println(MESSAGE_IF_NUMBER_LESS);
                checkEnteredNumber();
            }
        } else {
            System.out.println(MESSAGE_IF_NOT_A_NUMBER);
            checkEnteredNumber();
        }
    }
}
