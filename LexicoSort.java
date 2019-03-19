public class LexicoSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] words = { "Ruby", "C", "C++","CSharp" ,"Python","Perl","Java" };

        for(int i = 0; i < 6; ++i) {
            for (int j = i + 1; j < 7; ++j) {
                if (words[i].compareTo(words[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for(int i = 0; i < 7; i++) {
            System.out.println(words[i]);
        }
    }
}