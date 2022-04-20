package racingcar.application.port.in;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CreateRacingCarCommandTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "a,b,", "abcdef,ac", "ab,abcdefg"})
    void 예외_테스트(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> new CreateRacingCarCommand(input));
    }
}