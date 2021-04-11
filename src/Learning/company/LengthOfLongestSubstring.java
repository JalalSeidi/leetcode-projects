package Learning.company;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String test = "";
        int last = 0;
        int first = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                test = s.substring(i,j);

            }
            System.out.println(test);
        }
        return last;
    }
}

