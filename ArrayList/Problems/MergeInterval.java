//InterviewBit /Google
package Problems;

public class MergeInterval {

}

// https:// www.interviewbit.com/problems/merge-intervals/

/**
 * Definition for an interval. public class Interval { int start; int end;
 * Interval() { start = 0; end = 0; } Interval(int s, int e) { start = s; end =
 * e; } }
 */

//public  class Solution {

// int Array Interval = [int a, int b];
// public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval
// newInterval) {
// if(intervals == null || intervals.size() == 0) return intervals;

// Interval toInsert = newInterval;
// List<Interval> newlist = new ArrayList<>();
// int i = 0;
// while(i < intervals.size()){ //iteret through the arraylist

// Interval current = intervals.get(i);
// if(toInsert.end > current.start){ //Case 1: when no overlaping and we don't
// reach the toInsert interval

// i++; //so to reach the interval we need to check new index
// continue;
// }
// else if(current.end < toInsert.start){ //Case 3: if toInsert is already
// reached
// intervals.add(i,toInsert); //then we will add that toInsert to this index and
// other left index automatically shift by 1 index
// break;
// }
// else{
// //Case 2: when there is overlaping that can we :
// //1. current.start < toInsert.start and current.end > toInsert.end
// //2. current.start > toInsert.start and current.end < toInsert.end
// //3. current.start < toInsert.start and current.end < toInsert.end
// //4. current.start > toInsert.start and current.end > toInsert.end

// //According to this we will check the new start and end point.
// toInsert.start = Math.min(current.start,toInsert.start);
// toInsert.end = Math.max(current.end,toInsert.end);
// intervals.remove(i);

// }

// if(i == intervals.size){
// intervals.add(toInsert);
// }

// }
// return intervals;
// }
// }
// }
// }
