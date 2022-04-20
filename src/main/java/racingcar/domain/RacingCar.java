package racingcar.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class RacingCar {
    @NonNull
    @Getter
    final RacingCarName name;
}
