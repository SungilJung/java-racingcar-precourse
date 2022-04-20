package racingcar.domain;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class RacingCar {
    @NonNull
    private final RacingCarName name;

    @EqualsAndHashCode.Exclude
    private int moveCount = 0;

    public void move() {
        moveCount++;
    }

    @Override
    public String toString() {
        return name.getName() + " : " + toStringOfMoveCount();
    }

    private String toStringOfMoveCount() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moveCount; i++) {
            sb.append("-");
        }

        return sb.toString();
    }

    public static RacingCar newInstance(RacingCar car) {
        RacingCar newInstance = new RacingCar(car.name);
        newInstance.moveCount = car.moveCount;
        return newInstance;

    }
}
