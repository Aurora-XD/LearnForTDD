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

    @Test
    public void should_return_FizzBuzzWhizz_when_number_could_divisible_by_357() {
        String result = fizzBuzzWhizz.fizzBuzz(210);
        String expect = "FizzBuzzWhizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Fizz_when_number_include_3_and_exclude_57_even_number_could_div_by_3_or_5_or_7() {
        String result = fizzBuzzWhizz.fizzBuzz(30);
        String expect = "Fizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Buzz_when_number_include_5_and_only_cloud_divisible_by_5() {
        String result = fizzBuzzWhizz.fizzBuzz(15);
        String expect = "Buzz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Whizz_when_number_include_5_and_only_cloud_divisible_by_7() {
        String result = fizzBuzzWhizz.fizzBuzz(56);
        String expect = "Whizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_BuzzWhizz_when_number_include_5_and_cloud_divisible_by_5_and_7() {
        String result = fizzBuzzWhizz.fizzBuzz(35);
        String expect = "BuzzWhizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_origin_number_when_number_include_5_and_cloud_not_divisible_by_5_or_7() {
        String result = fizzBuzzWhizz.fizzBuzz(52);
        String expect = "52";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Fizz_when_number_include_7_and_include_3(){
        String result = fizzBuzzWhizz.fizzBuzz(375);
        String expect = "Fizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Fizz_when_number_include_7_and_exclude_3_and_only_cloud_divisible_by_3() {
        String result = fizzBuzzWhizz.fizzBuzz(270);
        String expect = "Fizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_Whizz_when_number_include_7_and_exclude_3_and_only_cloud_divisible_by_7() {
        String result = fizzBuzzWhizz.fizzBuzz(7);
        String expect = "Whizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_FizzWhizz_when_number_include_7_and_exclude_3_and_cloud_divisible_by_3_and_7() {
        String result = fizzBuzzWhizz.fizzBuzz(1470);
        String expect = "FizzWhizz";
        Assert.assertEquals(expect,result);
    }

    @Test
    public void should_return_origin_number_when_number_include_7_and_exclude_3_and_cloud_not_divisible_by_3_or_7() {
        String result = fizzBuzzWhizz.fizzBuzz(17);
        String expect = "17";
        Assert.assertEquals(expect,result);
    }


}
