package subway.domain.station;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import subway.domain.station.StationName;

class StationNameTest {

    @ParameterizedTest(name = "세글자부터 열글자 사이의 이름은 정상 생성된다.")
    @ValueSource(strings = {"일이삼", "일이삼사오륙칠팔구십"})
    void station_name_success_test(final String name) {
        final StationName stationName = assertDoesNotThrow(() -> new StationName(name));
        assertThat(stationName)
            .extracting("name")
            .isEqualTo(name);
    }

    @ParameterizedTest(name = "세글자 미만 열글자 초과의 이름은 예외가 발생한다.")
    @ValueSource(strings = {"일이", "영일이삼사오륙칠팔구십"})
    void station_name_fail_test(final String name) {
        assertThatThrownBy(() -> new StationName(name))
            .isInstanceOf(IllegalArgumentException.class)
            .extracting("message")
            .isEqualTo("역 이름 길이는 3~10여야 합니다.");
    }

}
