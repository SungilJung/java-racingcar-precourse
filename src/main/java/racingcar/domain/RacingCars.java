package racingcar.domain;

import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class RacingCars {

    @NonNull
    private final List<RacingCar> racingCarList;

    public List<RacingCar> getRacingCars() {
        return Collections.unmodifiableList(racingCarList);
    }
}
