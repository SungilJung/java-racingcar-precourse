package racingcar.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoundResult {

    private final int roundNum;

    private final RacingCars racingCars;

    @Override
    public String toString() {
        return racingCars + "\n";
    }
}
