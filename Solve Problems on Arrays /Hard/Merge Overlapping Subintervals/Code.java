class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){

            //No overlap
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }
            //Overlap
            else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}


TC : O(NLOGN) + O(N)
SC : O(N)
  
