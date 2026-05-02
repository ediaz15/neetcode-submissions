class Solution {
    public int countSeniors(String[] details) {
     //details
     //string length 15 (0 based indexing tho so all indeces subtract 1)
     //first 10 are phone#
     //next is gender (11)
     //next two is age (12-13)
     //seat alloted to that specific person (14-15)
    //return passengers who are strictlymore than 60 years old
        int count = 0;
        //iterate through the entire string[] details\
        for(int i = 0; i < details.length; i++){
            String age = "";
            age += details[i].charAt(11);
            age += details[i].charAt(12);
            if(Integer.parseInt(age) > 60){
                count++;
            }
        }
        return count;
    }
}