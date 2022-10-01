package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set에 대해 중복 값을 삽입한 경우 크기 확인")
    void size() {
        // given
        int validSize = 3;
        int invalidSize = 4;

        // when
        int actualSize = numbers.size();

        // then
        assertThat(actualSize).isEqualTo(validSize);
        assertThat(actualSize).isNotEqualTo(invalidSize);
    }
}
