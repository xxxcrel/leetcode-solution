package beer.cheese.greedy;

/**
 * LeetCode: 392
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t){
        //two pointer solution
        long sLen = s.length(), tLen = t.length();
        int i = 0, j = 0;
        while(i < sLen && j < tLen){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == sLen;
    }
}
