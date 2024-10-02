class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int k = 1;
        while (arr.size() > 1) {
            int lastElement = arr.remove(arr.size() - 1);
            arr.add(0, lastElement);                    
            int indexToDelete = (arr.size()-k);
            arr.remove(indexToDelete);
            k++;
            if(k > arr.size()) break;
        }
        return arr.get(0);
    }
}
