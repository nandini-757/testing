public class levenshtienalgo {
    public static int editDistance(String s1, String s2) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                count++;
            }
            i++;
            j++;
        }

        while (j < s2.length()) {
            count++;
            j++;
        }

        while (i < s1.length()) {
            count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Distance: " + editDistance("kitten", "sitting"));
        System.out.println("Distance: " + editDistance("flaw", "lawn"));
    }
}
