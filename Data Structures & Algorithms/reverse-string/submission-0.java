class Solution {
    public void reverseString(char[] s) {
        //two pointer inward traversal

        //swap elements from each pointer
        //stop until we meet in the middle
        
        //set up pointers to each side of the array of characters
        int i = 0;
        int j = s.length - 1;

        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
}   