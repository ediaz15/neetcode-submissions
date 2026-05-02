class Solution {
    public String mergeAlternately(String word1, String word2) {
        //construct new string by merging alt order
        //abc + xyz = axbycz
        //two pointers can be used here
        //brute force use loops to split the characters individually
        //create a new string to get the characters and input them in alt order
        //the loops here would alternate between words to continue the pattern


        //two pointers
        //word1 pointer and word2 pointer
        //continue with word1 pointer then word2 pointer and add them to a new string

        //as we alternate
        //we must handle the case whether either string has no more characters to input

        //when this happens, we must figure out which word it was that ran out
        //if pointer = word1.length -> just concat the rest of word2 to the merged string
        //then break the loop
        //vice versa for the alt situation with word2.length and its pointer

        int ptr1 = 0;
        int ptr2 = 0;
        String combinedString = "";
        while((ptr1 < word1.length()) || (ptr2 < word2.length())){

            if(ptr1 == word1.length()){
                combinedString += word2.substring(ptr2, word2.length());
                break;
            }
            if(ptr1 == word2.length()){
                combinedString += word1.substring(ptr1, word1.length());
                break;
            }
            combinedString += word1.charAt(ptr1);
            combinedString += word2.charAt(ptr2);
            ptr1++;
            ptr2++;
        }
        return combinedString;
    }
}