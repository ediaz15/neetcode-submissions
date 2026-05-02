class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //at most one cookie for each child
        //greed factor == min size of cookie that child will accept
        //each cookie j has a size
        //if cooking j >= greed factor g, assign cookie to that child
        //maximize the number of children content with and output max num
        //greed factors are from g,cookie sizes are from s
        //two pointer technique
        //looks like the arrays are sorted? -> if not consider the test cases
        //start i ptr in g, j ptr in s
        //if s[j] >= g[i]
            //max++
            //i++
            //j++
        //continue until i < g.length && j < s.length
            //either we satisfied all kids or ran out of cookies
        //ISSUE WITH IMPLEMENTATION!!
        //assumes that both arrays are sorted

        //will increase time complexity to O(n log n)
        //could be O(n) space if algo isnt in place

        Arrays.sort(g);
        Arrays.sort(s);
        int maxChildren = 0;
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
            //if a given cookie is large enough to satisfy a child's greed factor
            if(s[j] >= g[i]){
                i++;
                j++;
                maxChildren++;
            } else if(s[j] < g[i]){
                //trying another cookie!
                j++;
            } else {
                //continue with each child's greed factor
                i++;
            }
        }
        return maxChildren;
    }
}