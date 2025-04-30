package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorEnds_basicCase() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abXYZba");
        assertEquals("ab", result);
    }


    @Test
    public void testMirrorEnds_noMatch() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdefg");
        assertEquals("", result);
    }

    @Test
    public void testMirrorEnds_emptyString() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");
        assertEquals("", result);
    }

}
