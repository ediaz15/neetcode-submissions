class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                //need to consider the index as the final pos and skip rather than that individual section
                //so like what you doing -> {S, A, S, B} -> {A,S}
                // what needs to be done is -> {S,A,S} KEPT EVERYTHING BUT aka index J
                //{P,O,B,O} -> {O,B,O} P NOT INSIDE

                //perhaps bring the indexes down so the helper method can check the rest
                //how to update the word tho....
                //dont increment the varables directly with i++ or --j here
                //use i + 1 or j - 1 as it DOESNT modify the variables, only calculates whats the operation and passes that as an argument
                boolean word1 = isPalindrome(s, i+1, j);
                boolean word2 = isPalindrome(s, i, j-1);
                return word1 || word2;
            }
            i++;
            j--;
        }
        //The helpermethod catches anny false
        //if the helpermethods dont catch any false
        //then the result overll is true
        //BUTTTTTTT if no deletions are necessary (meaning we can just breeze thru)
        //then we return true at the end since the extra palindrome check wasn't necessary
        return true;
    }
    public boolean isPalindrome(String word, int i, int j){
        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}