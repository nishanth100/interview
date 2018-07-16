package geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SkyLineProblemTreemap {
	
	static class BuildingPoint implements Comparable<BuildingPoint>{

		// Here edge cases are 
		// If the two starts are compared higher height start should be taken
		// If two ends are compared then lower height end should be taken
		// If start and ends are same then take start height
		int x;
		boolean isStart;
		int height;
		@Override
		public int compareTo(BuildingPoint o) {
			if(this.x != o.x) {
				return this.x - o.x;
			}else {
				return (this.isStart ? -this.height : this.height) - (o.isStart ? -o.height : o.height);
			}
		}
	}
	
	public List<int[]> getSkyLine(int[][] buildings) {

		BuildingPoint[] buildingPoints = new BuildingPoint[buildings.length*2];
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
			System.out.println(" MAP ******");
		}
		
		TreeMap<Integer,Integer> map = new TreeMap<>();
		map.put(0, 1);
		
		int prevMaxHeight = 0;
		List<int[]> res = new ArrayList<>();
		
		
		for(BuildingPoint bp : buildingPoints) {
			if(bp.isStart) {
				map.compute(bp.height, (key,value)->{
					if(value != null) {
						return value +1;
					}
					return 1;
				});
			}else {
				map.compute(bp.height, (key,value)->{
					if(value == 1) {
						return null;
					}
					return value-1;
				});
			}
			int currMaxHeight = map.lastKey();
			if(prevMaxHeight != currMaxHeight) {
				res.add(new int[] {bp.x,currMaxHeight});
				prevMaxHeight = currMaxHeight;
			}
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int[][] buildings = {{1,3,4},{2,4,3},{1,2,5},{3,6,4}};
		SkyLineProblemTreemap skMap = new SkyLineProblemTreemap();
		List<int[]> criticalPoints = skMap.getSkyLine(buildings);
		for(int[] cp : criticalPoints) {
			System.out.println(cp[0] + " " + cp[1]);
		}
	}

}
