class Solution {

    public int pairWithMaxSum(int[] arr) {

        int max=-1;

        for(int i=1;i<arr.length;i++){

            if(max<arr[i]+arr[i-1]) max=arr[i]+arr[i-1];

        }

        return max;

    }

}
