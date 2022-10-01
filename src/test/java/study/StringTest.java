package study;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    @DisplayName("문자열 \"1,2\"를 ,로 분리한 경우 배열의 값 및 사이즈")
    void splitByComma() {
        // given
        String data = "1,2";

        // when
        String[] splitArray = data.split(",");

        // then
        assertThat(splitArray).contains("1", "2");
        assertThat(splitArray.length).isEqualTo(2);
    }

    @Test
    @DisplayName("문자열 \"1\"을 ,로 분리한 경우 1만 포함되는지 여부")
    void splitByCommaContainsOneExactly() {
        // given
        String data = "1";

        // when
        String[] splitArray = data.split(",");

        // then
        assertThat(splitArray).containsExactly("1");
        assertThat(splitArray.length).isEqualTo(1);
    }
}
