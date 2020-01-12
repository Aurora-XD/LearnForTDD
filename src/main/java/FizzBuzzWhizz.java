public class FizzBuzzWhizz {
    private final String fizz = "Fizz";
    private final String buzz = "Buzz";
    private final String whizz = "Whizz";

    public String fizzBuzz(int number) {

        return getResultForDivision(number);
    }

    private String getResultForDivision(int number){
        if(number%3 == 0){
            return fizz;
        }
        if(number%5 == 0){
            return buzz;
        }
        if(number%7 == 0){
            return whizz;
        }
        return String.valueOf(number);
    }

}
