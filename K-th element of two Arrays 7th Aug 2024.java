class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int temp[] = new int[arr1.length + arr2.length];
        int it = 0;
        for(int i:arr1) temp[it++] = i;
        for(int i:arr2) temp[it++] = i;
        
        Arrays.sort(temp);
        
        return temp[k-1];
    }
}
