package geometry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CovaxHull {

	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 4);
		Point p5 = new Point(3, 3);
		Point p6 = new Point(4, 2);
		
		Point[] points = new Point[6];
		points[0] = p1;
		points[1] = p2;
		points[2] = p3;
		points[3] = p4;
		points[4] = p5;
		points[5] = p6;
		
		List<Point> results = findCovaxHull(points);
		List<List<Integer>> pointList = new ArrayList<>();
		for(Point p : results) {
			List<Integer> pList = new ArrayList<>();
			pList.add(p.x);
			pList.add(p.y);
			pointList.add(pList);
		}
		System.out.println(pointList);
	}
	private static List<Point> findCovaxHull(Point[] points) {
		
		Point start = points[0];
		for(int i=1; i<points.length; i++) {
			if(points[i].x < start.x) {
				start = points[i];
			}
		}
		
		Point current = start;
		Set<Point> result = new HashSet<>();
		result.add(start);
		List<Point> collinearPoints = new ArrayList<>();
		
		while(true) {
			Point nextTarget = points[0];
			
			for(int i=1; i<points.length; i++) {
				if(points[i] == current) {
					continue;
				}
			
			int val = crossProduct(current,nextTarget, points[i]);
			if(val > 0 ) {
				nextTarget = points[i];
				collinearPoints = new ArrayList<>();
			}else if(val == 0) {
				if(distance(current,nextTarget,points[i]) < 0) {
					collinearPoints.add(nextTarget);
					nextTarget = points[i];
				}else {
					collinearPoints.add(points[i]);
				}
			 }
			}
			
			for(Point p : collinearPoints) {
				result.add(p);
			}
			if(nextTarget == start) {
				break;
			}
			result.add(nextTarget);
			current = nextTarget;
		}
		
		return new ArrayList<>(result);
	}
	private static int distance(Point a, Point b, Point c) {
		int y1 = a.y - b.y;
		int y2 = a.y - c.y;
		int x1 = a.x - b.x;
		int x2 = a.x - c.x;
		return Integer.compare(y1*y1+x1*x1, y2*y2+x2*x2);
	}
	private static int crossProduct(Point a, Point b, Point c) {
		int y1 = a.y - b.y;
		int y2 = a.y - c.y;
		int x1 = a.x - b.x;
		int x2 = a.x - c.x;
		return (y1*x2 - y2*x1);
	}
	static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
