class Solution {
    public boolean isPalindrome(String s) {
        //checking for palindromes
        //use two pointers that meet in middle
        //check if the characters are equal (moment they aren't return false)

        //first need to only keep alphanumeric characters, we can use ascii or regex
        //regex seems more readable for this simple condition


        //instead of using a while loop, had used a for loop
        //i goes up to mid while j starts from end and stops at middle as well
        //compares using equalsIgnoreCase() -> moment it doesnt equal, return false
        //two pointer to traverse string in O(n) time complexity\
        //space complexity is O(n) since we do an inplace algo + the string replace
        //the string replace method is O(n)
        String newS = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < newS.length() / 2; i++){
            int j = newS.length() - 1 - i;
            String letterI = newS.charAt(i) + "";
            String letterJ = newS.charAt(j) + "";
            if(!letterI.equalsIgnoreCase(letterJ)){
                return false;
            }
        }
        return true;
    }
}
