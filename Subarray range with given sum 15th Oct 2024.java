class Solution {
    static int subArraySum(int arr[], int tar) {
        Map<Integer,Integer> sumMap=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==tar){
                count++;
            }
            if(sumMap.containsKey(sum-tar)){
                count+=sumMap.get(sum-tar);
            }
            sumMap.put(sum,sumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
