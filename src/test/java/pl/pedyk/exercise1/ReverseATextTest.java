package pl.pedyk.exercise1;

import static org.junit.jupiter.api.Assertions.*;
import static pl.pedyk.exercise1.ReverseAText.reverseAText;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ReverseATextTest {


    @DisplayName("Text should be reversed with the method")
    @ParameterizedTest
    @MethodSource("reversedTextExamples")
    void Test1(String text, String reverse) {
        //Then
        Assertions.assertEquals(reverse, reverseAText(text));
    }

    private static Stream<Arguments> reversedTextExamples() {
        return Stream.of(
                Arguments.of("Poniedziałek", "kełaizdeinoP"),
                Arguments.of("kajak", "kajak"),
                Arguments.of("Norbert", "trebroN"),
                Arguments.of(null,"")
        );
    }

}