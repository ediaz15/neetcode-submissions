class Solution {
    public boolean isPalindrome(String s) {
        //checking for palindromes
        //use two pointers that meet in middle
        //check if the characters are equal (moment they aren't return false)

        //first need to only keep alphanumeric characters, we can use ascii or regex
        //regex seems more readable for this simple condition
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
