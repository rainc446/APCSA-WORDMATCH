public class Main {
    public static void main (String[] args) {
        WordMatch one = new WordMatch("Mississippi");
        System.out.println(one.scoreGuess("i"));
        System.out.println(one.scoreGuess("iss"));
        System.out.println(one.scoreGuess("issipp"));
        System.out.println(one.scoreGuess("mississippi"));

        WordMatch two = new WordMatch("aaaabb");
        System.out.println("\n" + two.scoreGuess("a"));
        System.out.println(two.scoreGuess("aa"));
        System.out.println(two.scoreGuess("aaa"));
        System.out.println(two.scoreGuess("aabb"));
        System.out.println(two.scoreGuess("c"));




    }
}
