/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.end, b.end));
        boolean flag = true;
        for(int i=0;i<intervals.size()-1;i++) {
            if(intervals.get(i).end > intervals.get(i+1).start) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
