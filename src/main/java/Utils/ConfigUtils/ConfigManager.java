package Utils.ConfigUtils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigManager {

    static Config readConfig(String fileName) {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load(fileName);
    }

    String helloNumberDataName = "HelloIfNumberAlgorithmData.conf";
    String checkNameDataName = "CheckNameAlgorithmData.conf";
    String arrayMultipleDataName = "ArrayMultipleElementsAlgorithmData.conf";

    Integer NUMBER = readConfig(helloNumberDataName).getInt("number");
    String GREETING_FOR_NUMBER_ALGO = readConfig(helloNumberDataName).getString("greetingMessage");
    String WELCOME_FOR_NUMBER_ALGO = readConfig(helloNumberDataName).getString("welcomeMessage");
    String MESSAGE_IF_NUMBER_LESS = readConfig(helloNumberDataName).getString("messageIfNumberWasLess");
    String MESSAGE_IF_NOT_A_NUMBER = readConfig(helloNumberDataName).getString("messageIfItWasNotANumber");

    String NAME = readConfig(checkNameDataName).getString("name");
    String GREETING_FOR_NAME_ALGO = readConfig(checkNameDataName).getString("greetingMessage");
    String WELCOME_FOR_NAME_ALGO = readConfig(checkNameDataName).getString("welcomeMessage");
    String MESSAGE_IF_NOT_SUCCESS = readConfig(checkNameDataName).getString("messageIfNotSuccessful");

    int[] ARRAY = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    Integer MULTIPLE_DEFAULT = readConfig(arrayMultipleDataName).getInt("multipleValue");
    String CONSOLE_GREETING = readConfig(arrayMultipleDataName).getString("consoleGreeting");
    Integer NUMBER_VALUES_FOR_CONSOLE_ARRAY = readConfig(arrayMultipleDataName).getInt("numbersOfValuesForConsole");
    String CORRECTING_MESSAGE = readConfig(arrayMultipleDataName).getString("correctingMessage");
    String CHECKING_MESSAGE = readConfig(arrayMultipleDataName).getString("checkingMessage");
    String MULTIPLE_MESSAGE = readConfig(arrayMultipleDataName).getString("multipleMessage");
    String MESSAGE_IF_NOT_OK = readConfig(arrayMultipleDataName).getString("messageIfNotSuccessful");
    String GREETING_FOR_DEFAULT_ARRAY = readConfig(arrayMultipleDataName).getString("greetingForDefaultArray");
    String MESSAGE_IF_ARRAY_FAILED = readConfig(arrayMultipleDataName).getString("messageIfDefaultArrayFailed");
}
