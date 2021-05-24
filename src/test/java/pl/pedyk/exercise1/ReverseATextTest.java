package pl.pedyk.exercise1;

import static pl.pedyk.exercise1.ReverseAText.reverseAText;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class ReverseATextTest {

    @DisplayName("should reverse a String")
    @ParameterizedTest
    @MethodSource
    void test1(String text, String reverse){
        Assertions.assertEquals(reverse, reverseAText(text));
    }

    private static Stream<Arguments> test1() {
        return Stream.of(
                Arguments.of("Norbert", "trebroN"),
                Arguments.of("12345", "54321"),
                Arguments.of(null,"")
        );

    }
}