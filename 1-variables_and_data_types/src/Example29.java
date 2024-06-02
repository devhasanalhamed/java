public class Example29 {
    //    Count number of words in a string
    public static void main(String[] args) {
        String words = "One Two Three Four Five";
        int countWords = words.split(" ").length;
        System.out.println(countWords);
    }
}
