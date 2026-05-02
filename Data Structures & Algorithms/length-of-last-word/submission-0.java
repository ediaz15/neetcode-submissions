class Solution {
    public int lengthOfLastWord(String s) {
        //start from the end
        //setup a pointer to the end
        //skip any spaces 32 until you hit a letter
        //ONCE that letter occurs -> keep count of how many letters exist
        //STOP UNTIL you meet another space
        // _ moon _ _ _ _
        // STOP 4 3 2 1 _ _ _ _
        int n = s.length();
        int i = n - 1;
        int count = 0;
        //skip the white spaces from the end until we meet the next word!
        while (s.charAt(i) == ' ') {
            i--;
        }
        //decrement the next pointer as you count the words until you meet the next space
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            count++;
        }
        return count;

    }
}