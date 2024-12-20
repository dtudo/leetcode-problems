package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class P58LengthOfLastWordTest {
    @InjectMocks
    private P58LengthOfLastWord p58LengthOfLastWord;

    @Test
    public void GIVEN_word_WHEN_lengthOfLastWord_THEN_expectedValueIsReturned() {
        p58LengthOfLastWord.lengthOfLastWord("");
    }
}
