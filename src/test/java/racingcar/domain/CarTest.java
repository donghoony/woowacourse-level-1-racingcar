package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    Engine poweredOnEngine = new Engine(() -> 9);
    Engine poweredOffEngine = new Engine(() -> 0);

    @Test
    @DisplayName("움직이는 엔진의 경우, 올바르게 앞으로 전진한다.")
    void workingEngineTest() {
        // given
        Car car = new Car("car", poweredOnEngine);
        // when
        car.move();
        // then
        int position = car.getStatus().position();
        assertThat(position).isEqualTo(1);
    }

    @Test
    @DisplayName("움직이지 않는 엔진의 경우, 전진하지 않는다.")
    void stoppedEngineTest() {
        // given
        Car car = new Car("car", poweredOffEngine);
        // when
        car.move();
        // then
        int position = car.getStatus().position();
        assertThat(position).isZero();
    }
}
