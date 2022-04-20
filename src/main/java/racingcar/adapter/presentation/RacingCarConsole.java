package racingcar.adapter.presentation;

import camp.nextstep.edu.missionutils.Console;
import java.util.function.Consumer;

public class RacingCarConsole {
    public static final String PREFIX_ERROR_MESSAGE = "[ERROR] ";
    private final String message;
    private final String errorMessage;

    public RacingCarConsole(String message, String errorMessage) {
        this.message = message;
        this.errorMessage =
                errorMessage.startsWith(PREFIX_ERROR_MESSAGE) ? errorMessage : PREFIX_ERROR_MESSAGE + errorMessage;
    }

    public void execute(Consumer<String> callback) {
        System.out.print(message);
        boolean isValid;

        do {
            try {
                callback.accept(Console.readLine());
                isValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(errorMessage);
                isValid = false;

            }
        } while (!isValid);

    }

    public void print() {
        System.out.println(message);
    }
}
