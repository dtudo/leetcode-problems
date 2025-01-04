package problems;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class P1TwoSumTest {
    @InjectMocks
    private P1TwoSum p1TwoSum;

    private static Stream<Arguments> provideStringAndLengthOfLastWord() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringAndLengthOfLastWord")
    public void GIVEN_word_WHEN_lengthOfLastWord_THEN_expectedValueIsReturned(int[] nums, int target, int[] output) {
        assertArrayEquals(output, p1TwoSum.twoSum(nums, target));
    }
}
