package problems;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class P58LengthOfLastWordTest {
    @InjectMocks
    private P58LengthOfLastWord p58LengthOfLastWord;

    private static Stream<Arguments> provideStringAndLengthOfLastWord() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringAndLengthOfLastWord")
    public void GIVEN_word_WHEN_lengthOfLastWord_THEN_expectedValueIsReturned(String string, int lengthOfLastWord) {
        assertEquals(lengthOfLastWord, p58LengthOfLastWord.lengthOfLastWord(string));
    }
}
