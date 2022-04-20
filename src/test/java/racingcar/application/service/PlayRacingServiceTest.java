package racingcar.application.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import racingcar.application.port.in.PlayRacingCommand;
import racingcar.application.port.in.PlayRacingUsecase;
import racingcar.application.port.out.GetRacingCarPort;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCarName;
import racingcar.domain.RacingCars;
import racingcar.domain.RacingResult;

class PlayRacingServiceTest {

    @Test
    void 레이싱_테스트() {
        PlayRacingUsecase playRacingUsecase = new PlayRacingService(new FakeRacingCarAdapter());
        RacingResult racingResult = playRacingUsecase.playRacing(new PlayRacingCommand("2"));

        assertFalse(racingResult.getRoundResultList().isEmpty());
    }

    private static class FakeRacingCarAdapter implements GetRacingCarPort {

        private final RacingCars racingCars;

        FakeRacingCarAdapter() {
            List<RacingCar> racingCarList = Stream.of(new RacingCar(new RacingCarName("a")),
                    new RacingCar(new RacingCarName("b")), new RacingCar(new RacingCarName("c")),
                    new RacingCar(new RacingCarName("d"))).collect(Collectors.toList());
            racingCars = new RacingCars(racingCarList);
        }

        @Override
        public RacingCars getRacingCars() {
            return racingCars;
        }
    }
}