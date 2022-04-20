package racingcar.application.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.application.port.in.PlayRacingCommand;
import racingcar.application.port.in.PlayRacingUsecase;
import racingcar.application.port.out.FakeRacingCarAdapter;
import racingcar.domain.RacingResult;

class PlayRacingServiceTest {

    @Test
    void 레이싱_테스트() {
        PlayRacingUsecase playRacingUsecase = new PlayRacingService(new FakeRacingCarAdapter());
        RacingResult racingResult = playRacingUsecase.playRacing(new PlayRacingCommand("2"));

        assertFalse(racingResult.getRoundResultList().isEmpty());
    }
}