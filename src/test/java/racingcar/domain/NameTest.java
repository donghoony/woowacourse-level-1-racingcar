package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.exception.InvalidNameLengthException;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"a", "ab", "abc", "abcd", "abcde"})
    @DisplayName("올바른 조건의 이름이 입력되면 정상적으로 생성된다")
    void validName(String name) {
        Assertions.assertDoesNotThrow(() -> new Name(name));
    }

    @ParameterizedTest
    @CsvSource(value = {"abcdef", "abcdefg", "''", "NULL"}, nullValues = {"NULL"})
    @DisplayName("올바르지 않은 조건의 이름이 입력되면 예외가 발생한다")
    void invalidName(String name) {
        Assertions.assertThrows(InvalidNameLengthException.class, () -> new Name(name));
    }
}
