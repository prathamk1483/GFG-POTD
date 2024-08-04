class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int n, int start[], int end[])
    {
        int activities[][] = new int[end.length][3];
        for(int i=0;i<end.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities , Comparator.comparingDouble(x -> x[2]));
        int count=0;
        // ArrayList<Integer> meet = new ArrayList<>();
        int lastend = activities[0][2];
        // meet.add(activities[0][0]);
        count++;
        for(int i=0;i<n;i++){
            if(activities[i][1] > lastend){
                // meet.add(activities[i][0]);
                count++;
                lastend = activities[i][2];
            }
        }
        return count;
    }
}
