package facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
	
		List<Interval> intervals = new ArrayList<>();
		Interval it1 = new Interval(1,3);
		Interval it2 = new Interval(2,6);
		Interval it3 = new Interval(8,10);
		Interval it4 = new Interval(15,18);
		intervals.add(it1);
		intervals.add(it2);
		intervals.add(it3);
		intervals.add(it4);
		List<Interval> result = mergeIntervals(intervals);
	
		for(int i=0; i<result.size(); i++) {
			Interval inter = result.get(i);
			System.out.println(inter.start + " " + inter.end);
		}
	
	}
	
	private static List<Interval> mergeIntervals(List<Interval> intervals) {
		
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				if(o1.start <o2.start) {
					return -1;
				}else if(o1.start == o2.start) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		LinkedList<Interval> merged = new LinkedList<>();
		
		for(Interval interval : intervals) {
			
			 // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
			if(merged.isEmpty() || merged.getLast().end < interval.start) {
				merged.add(interval);
			}else {
				 // otherwise, there is overlap, so we merge the current and previous
	            // intervals.
				 merged.getLast().end = Math.max(merged.getLast().end, interval.end);
			}
			
		}
		return merged;
	}

	static class Interval {
		int start;
		int end;
		public Interval() {
			start =0;
			end =0;
		}
		public Interval (int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
}
