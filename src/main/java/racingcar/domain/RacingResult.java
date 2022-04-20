package racingcar.domain;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RacingResult {

    @Getter
    private final List<RoundResult> roundResultList;
}
