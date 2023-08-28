package blog;

import org.junit.*;
import static org.junit.Assert.assertEquals;

class MicroBlogTest {

    private final MicroBlog microBlog = new MicroBlog();

    @Test
    void englishLanguageShort() {
        String expected = "Hi";
        assertEquals(expected, microBlog.truncate("Hi"));
    }

    ////    @Ignore("Remove to run test")
    @Test
    void englishLanguageLong() {
        String expected = "Hello";
        assertEquals(expected, microBlog.truncate("Hello there"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void germanLanguageShort_broth() {
        String expected = "brühe";
        assertEquals(expected, microBlog.truncate("brühe"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void germanLanguageLong_bearCarpet_to_beards() {
        String expected = "Bärte";
        assertEquals(expected, microBlog.truncate("Bärteppich"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void bulgarianLanguageShort_good() {
        String expected = "Добър";
        assertEquals(expected, microBlog.truncate("Добър"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void greekLanguageShort_health() {
        String expected = "υγειά";
        assertEquals(expected, microBlog.truncate("υγειά"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void mathsShort() {
        String expected = "a=πr²";
        assertEquals(expected, microBlog.truncate("a=πr²"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void mathsLong() {
        String expected = "∅⊊ℕ⊊ℤ";
        assertEquals(expected, microBlog.truncate("∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void englishAndEmojiShort() {
        String expected = "Fly 🛫";
        assertEquals(expected, microBlog.truncate("Fly 🛫"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void emojiShort() {
        String expected = "💇";
        assertEquals(expected, microBlog.truncate("💇"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void emojiLong() {
        String expected = "❄🌡🤧🤒🏥";
        assertEquals(expected, microBlog.truncate("❄🌡🤧🤒🏥🕰😀"));
    }

    //    @Ignore("Remove to run test")
    @Test
    void royalFlush() {
        String expected = "🃎🂸🃅🃋🃍";
        assertEquals(expected, microBlog.truncate("🃎🂸🃅🃋🃍🃁🃊"));
    }
}
