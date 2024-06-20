import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class AppTest {
    @ParameterizedTest
    @MethodSource("provideListNonZeroDigits")
    void checkListOfNonZeroDigits(int[] input, int expected){
        Assertions.assertEquals(
                expected,App.getKatas(input));
    }
    private static Stream<Arguments> provideListNonZeroDigits(){
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 1234),
                Arguments.of(new int[]{9, 5,5,5, 1, 8}, 955518)
        );
    }

    @ParameterizedTest
    @MethodSource("provideListNonLeadingZeroDigits")
    void checkListOfNonLeadingZeroDigits(int[] input, int expected){
        Assertions.assertEquals(
                expected,App.getKatas(input));
    }
    private static Stream<Arguments> provideListNonLeadingZeroDigits(){
        return Stream.of(
                Arguments.of(new int[]{1, 0, 3, 4}, 1034),
                Arguments.of(new int[]{9, 5, 1, 0, 0, 0}, 951000)
        );
    }

    @ParameterizedTest
    @MethodSource("provideListLeadingZeroDigits")
    void checkListOfLeadingZeroDigits(int[] input, int expected){
        Assertions.assertEquals(
                expected,App.getKatas(input));
    }
    private static Stream<Arguments> provideListLeadingZeroDigits(){
        return Stream.of(
                Arguments.of(new int[]{0, 0, 0, 1}, 1),
                Arguments.of(new int[]{0,0,0, 5, 1, 0}, 510)
        );
    }

    @ParameterizedTest
    @MethodSource("provideListNegativeDigits")
    void checkListOfNegativeDigits(int[] input, int expected){
        Assertions.assertEquals(
                expected,App.getKatas(input));
    }
    private static Stream<Arguments> provideListNegativeDigits(){
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 0, 1}, 1001),
                Arguments.of(new int[]{-0,0,0, 5, 1, 0}, 510)
        );
    }
}
