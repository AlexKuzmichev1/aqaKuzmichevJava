package CodeTasks;

import java.util.Scanner;
import static Utils.ConfigUtils.ConfigManager.*;

public class CheckNameAlgorithm {

    private static final String DEFAULT_NAME = NAME;

    public void checkEnteredName() {
        System.out.println(GREETING_FOR_NAME_ALGO);
        Scanner in = new Scanner(System.in);
        String enteredName = in.nextLine();
        if (enteredName != null && enteredName.equals(DEFAULT_NAME)) {
            System.out.println(WELCOME_FOR_NAME_ALGO  +
                   NAME);
        } else {
            System.out.println(MESSAGE_IF_NOT_SUCCESS);
            checkEnteredName();
        }
    }
}
