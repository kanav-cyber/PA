class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>result = new ArrayList<>();
        int i = 0;
        int curr = newInterval[0];
        int next_curr = newInterval[1];

        while(i < intervals.length && intervals[i][1] < curr){
            result.add(intervals[i]);
            i++;
        }

        // merge overlapping intervals
        while(i < intervals.length && intervals[i][0] <= next_curr){
            curr = Math.min(intervals[i][0] , curr);
            next_curr = Math.max(intervals[i][1] , next_curr);
            i++;
        }

        result.add(new int[]{curr,next_curr});

        while(i < intervals.length){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}