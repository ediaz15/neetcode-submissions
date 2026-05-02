class Solution {
    public boolean isAnagram(String s, String t) {

        //since they are an anagram, we are guaranteed that they are the same length
        ///if not then we can easily return false

        if(s.length() != t.length()){
            return false;
        }   
        HashMap<String, Integer> mapS = new HashMap<>();
        HashMap<String, Integer> mapT = new HashMap<>();


        for(int i = 0; i < s.length(); i++){
            //we need to insert the values into the hashmaps
            //character : frequency
            //since order doesn't matter, we can get away with this
            String letterS = "" + s.charAt(i);
            String letterT = "" + t.charAt(i);

            if(!mapS.containsKey(letterS)){
                mapS.put(letterS, 1);

            }
            if(!mapT.containsKey(letterT)){
                mapT.put(letterT, 1);

            }
            int countS = mapS.get(letterS);
            mapS.put(letterS, ++countS);
            int countT = mapT.get(letterT);
            mapT.put(letterT, ++countT);
        }
        //after we have inserted them
        //we just need to check for only one instance where the frequencies dont match

        //we will use either string's keys, if the other map doesnt contain it NOR if its freq doesn't match
        //then we return false
    
        for(String letter: mapS.keySet()){
            //get returns false if either conditions mentioned are false, so we don't necessarily need a contains here
            
            if(!mapT.containsKey(letter)|| (!mapT.get(letter).equals(mapS.get(letter)))){
                return false;
            }
        }
        return true;
    }
}
