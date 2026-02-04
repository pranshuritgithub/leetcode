class Solution {
    public int countVowelSubstrings(String word) {

        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {

            boolean a = false, e = false, ii = false, o = false, u = false;

            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                // break if consonant
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                    break;

                if (ch == 'a') a = true;
                if (ch == 'e') e = true;
                if (ch == 'i') ii = true;
                if (ch == 'o') o = true;
                if (ch == 'u') u = true;

                // check if all vowels are present
                if (a && e && ii && o && u)
                    count++;
            }
        }

        return count;
    }
}
