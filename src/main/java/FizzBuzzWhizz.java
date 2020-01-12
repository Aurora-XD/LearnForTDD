public class FizzBuzzWhizz {
    private final String fizz = "Fizz";
    private final String buzz = "Buzz";
    private final String whizz = "Whizz";

    public String fizzBuzz(int number) {
        if(includeSpecialNumber(number,5)){
            StringBuilder result = new StringBuilder();
            if(number%5 == 0){
                result.append(buzz);
            }
            if(number%7 == 0){
                result.append(whizz);
            }
            if("".equals(result.toString())){
                return String.valueOf(number);
            }
            return result.toString();
        }

        if(includeSpecialNumber(number,3)){
            return fizz;
        }

        return getResultForDivision(number);
    }

    private String getResultForDivision(int number){
        StringBuilder result = new StringBuilder();
        if(number%3 == 0){
            result.append(fizz);
        }
        if(number%5 == 0){
            result.append(buzz);
        }
        if(number%7 == 0){
            result.append(whizz);
        }
        if("".equals(result.toString())){
            return String.valueOf(number);
        }
        return result.toString();
    }

    private boolean includeSpecialNumber(int number, int specialNum) {
        return String.valueOf(number).contains(String.valueOf(specialNum));
    }
}
