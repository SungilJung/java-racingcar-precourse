package racingcar.application.port.in;

import racingcar.util.RacingCarNameCheck;
import racingcar.util.SelfValidating;

public class CreateRacingCarCommand extends SelfValidating<CreateRacingCarCommand> {

    @RacingCarNameCheck
    final String input;

    public CreateRacingCarCommand(String input) {
        this.input = input;
        super.validateSelf();
    }
}
