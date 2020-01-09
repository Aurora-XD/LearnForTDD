public class TransString {
    public String trans(String origin) {
        return origin.replaceAll("[AEIOUaeiou]","a")
                .replaceAll("a+","mommy");
    }
}
