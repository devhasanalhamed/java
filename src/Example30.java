public class Example30 {
    //    Reverse a string
    public static void main(String[] args) {
        String word = "Hello";
        String reversedWord = "";

        for (int i = 0; i < word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }

        System.out.printf("Reversed string: %s", reversedWord);
    }
}
