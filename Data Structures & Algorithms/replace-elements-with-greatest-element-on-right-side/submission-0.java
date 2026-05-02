class Solution {
    public int[] replaceElements(int[] arr) {
        //suffix max
        //as you go from right to left
        //update the new array with the maxRight value
        //maxRight is updated afterwards byy considering the PAST maxRight value and the arr[i] value
        //SINCE we inserted the maxRight value BEFORE the update, we essentially keep things in order for the next comparison
        int[] newArr = new int[arr.length];
        int length = arr.length;
        int rightMax = -1;
        for(int i = length - 1; i >= 0; i--){
            newArr[i] = rightMax; //since we start with -1 as right max, we ensure the value at the end is -1
            rightMax = Math.max(arr[i], rightMax); //upd rightMax for the next num -> desc order is preserved
        }
        return newArr;
    }
}