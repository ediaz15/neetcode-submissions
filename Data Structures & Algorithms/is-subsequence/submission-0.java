class Solution {
    public boolean isSubsequence(String s, String t) {
        //two pointers uni directional order
        //slow and fast pointer
        //slow is tied to the s string and fast is tied to the t string
        //slow increments ONLY if t string has the letter that slow is in
        //we stop when slow meets the end of s string aka s.length and slow are matched
        int slow = 0;
        int fast = 0;
        //check IF BOTH pointers are in bounds
        while(fast < t.length() && slow < s.length()){
            //dont double increment the fast pointer otherwise you skip words!
            if(s.charAt(slow) == t.charAt(fast)){
                slow++;
            }
            //keep going until we find a match from the t string
            fast++;
        }
        return slow == s.length();
    }
}