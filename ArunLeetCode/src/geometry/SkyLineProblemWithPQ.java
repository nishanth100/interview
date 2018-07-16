package geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SkyLineProblemWithPQ {
	
	static class BuildingPoint implements Comparable<BuildingPoint>{

		int x;
		boolean isStart;
		int height;
		// Here the base edge cases are
		// If the two start are the same take the higher height
		// if two end are same take the lower height
		// if start and end are the same stat should appear first
		@Override
		public int compareTo(BuildingPoint o) {
			if(this.x != o.x)
			  return this.x - o.x;
			else
				return (this.isStart ? -this.height : this.height) - (o.isStart ? -o.height : o.height);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("NEW ");
		int[][] buildings = {{1,3,4},{2,4,3},{1,2,5},{3,6,4}};
		
		List<int[]> res = getSkyLine(buildings);
		for(int[] i : res) {
			System.out.println(i[0] + " " + i[1]);
		}
	}

	private static List<int[]> getSkyLine(int[][] buildings) {
		
		BuildingPoint[] buildingPoints = new BuildingPoint[buildings.length * 2];
		int index = 0;
		for(int[] building : buildings) {
			buildingPoints[index] = new BuildingPoint();
			buildingPoints[index].x = building[0];
			buildingPoints[index].isStart = true;
			buildingPoints[index].height = building[2];
			
			buildingPoints[index+1] = new BuildingPoint();
			buildingPoints[index+1].x = building[1];
			buildingPoints[index+1].isStart = false;
			buildingPoints[index+1].height = building[2];
			index += 2;
		}
		Arrays.sort(buildingPoints);
		for(BuildingPoint bps : buildingPoints) {
			System.out.print(bps.x + ", ");
			System.out.print(bps.isStart+ ", ");
			System.out.print(bps.height+ ", ");
			System.out.println("QUEUE ******");
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.add(0);
		List<int[]> res = new ArrayList<>();
		int prevMaxHeight = 0;
		for(BuildingPoint bp : buildingPoints) {
			if(bp.isStart) {
				queue.add(bp.height);
			}else {
				queue.remove(bp.height);
			}
			
			int currentMaxHeight = queue.peek();
			
			if(prevMaxHeight != currentMaxHeight) {
				res.add(new int[] {bp.x,currentMaxHeight});
				prevMaxHeight = currentMaxHeight;
			}
		}
		return res;
	}

}

