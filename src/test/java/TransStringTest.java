import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransStringTest {

    private TransString transString;

    @Before
    public void setUp(){
        transString = new TransString();
    }

    @Test
    public void should_return_origin_single_letter_when_not_vowel() {
        String origin = "h";
        String result = transString.trans(origin);
        Assert.assertEquals(origin,result);
    }

    @Test
    public void should_return_trans_letter_when_get_vowel() {
        String origin = "a";
        String result = transString.trans(origin);
        Assert.assertEquals("mommy",result);
    }

    @Test
    public void should_return_origin_string_when_exclude_vowel() {
        String origin = "http";
        String result = transString.trans(origin);
        Assert.assertEquals(origin,result);
    }

    @Test
    public void should_return_trans_string_when_include_vowel() {
        String origin = "baby";
        String result = transString.trans(origin);
        Assert.assertEquals("bmommyby",result);
    }

    @Test
    public void should_only_trans_letter_once_when_there_is_a_vowel_sequence() {
        String origin = "bear";
        String result = transString.trans(origin);
        Assert.assertEquals("bmommyr",result);
    }
}
