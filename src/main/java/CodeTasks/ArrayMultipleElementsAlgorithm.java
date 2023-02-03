package CodeTasks;

import java.util.ArrayList;
import java.util.Scanner;
import static Utils.ConfigUtils.ConfigManager.*;

public class ArrayMultipleElementsAlgorithm {

    private static final int[] DEFAULT_ARRAY = ARRAY;
    private static final int DEFAULT_MULTIPLE_NUMBER = MULTIPLE_DEFAULT;

    public int[] getDefaultArray() {
        return DEFAULT_ARRAY;
    }

    public void checkDefaultArrayMultipleElements() {
        System.out.println(GREETING_FOR_DEFAULT_ARRAY);
        ArrayList<Integer> suitableElements = new ArrayList<>();
        for (Integer element : DEFAULT_ARRAY) {
            if (element != 0 && element % DEFAULT_MULTIPLE_NUMBER == 0) {
                System.out.println(element);
                suitableElements.add(element);
            }
        }
        if (suitableElements.isEmpty()) {
            System.out.println(MESSAGE_IF_ARRAY_FAILED);
        }
    }

    public void checkConsoleArrayMultipleElements() {
        System.out.println(CONSOLE_GREETING);
        ArrayList<Integer> suitableElements = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int[] enteredArray = new int[NUMBER_VALUES_FOR_CONSOLE_ARRAY];
        int counter = 0;
        while (counter < NUMBER_VALUES_FOR_CONSOLE_ARRAY) {
            if (in.hasNextInt()) {
                enteredArray[counter] = in.nextInt();
                counter++;
            } else {
                System.out.println(CORRECTING_MESSAGE);
                break;
            }
        }
        System.out.printf(CHECKING_MESSAGE, DEFAULT_MULTIPLE_NUMBER);
        System.out.printf(MULTIPLE_MESSAGE, DEFAULT_MULTIPLE_NUMBER);
        for (int element : enteredArray) {
            if (element != 0 && element % DEFAULT_MULTIPLE_NUMBER == 0) {
                System.out.println(element);
                suitableElements.add(element);
            }
        }
        if (suitableElements.isEmpty()) {
            System.out.println(MESSAGE_IF_NOT_OK);
            checkConsoleArrayMultipleElements();
        }
    }
}
