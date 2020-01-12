import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setUp(){
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_return_origin_number_when_could_not_divisible_by_3_or_5_or_7() {
        String result = fizzBuzzWhizz.fizzBuzz(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void should_return_Fizz_when_number_could_divisible_by_3() {
        String result = fizzBuzzWhizz.fizzBuzz(3);
        String expect = "Fizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Buzz_when_number_could_divisible_by_5() {
        String result = fizzBuzzWhizz.fizzBuzz(5);
        String expect = "Buzz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Buzz_when_number_could_divisible_by_7() {
        String result = fizzBuzzWhizz.fizzBuzz(7);
        String expect = "Whizz";
        Assert.assertEquals(expect,result);
    }
    @Test
    public void should_return_FizzBuzz_when_number_could_divisible_by_3_and_5() {
        String result = fizzBuzzWhizz.fizzBuzz(60);
        String expect = "FizzBuzz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_FizzWhizz_when_number_could_divisible_by_3_and_7() {
        String result = fizzBuzzWhizz.fizzBuzz(21);
        String expect = "FizzWhizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_BuzzWhizz_when_number_could_divisible_by_5_and_7() {
        String result = fizzBuzzWhizz.fizzBuzz(140);
        String expect = "BuzzWhizz";
        Assert.assertEquals(expect,result);
    }
}
