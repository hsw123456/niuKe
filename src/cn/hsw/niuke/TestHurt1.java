package cn.hsw.niuke;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class TestHurt1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int remote = scanner.nextInt();

		Point[] points = new Point[4];

		for (int i = 0; i < 4; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			points[i] = new Point(x, y);
		}

		int sum = 0;

		for (int i = 0; i < 3; i++) {

			if (points[i].compareTo(points[3]) <= remote) {
				sum += 1;
			}
		}

		System.out.println(sum + "x");

	}

	static class Point implements Comparable<Point> {

		// x 方向的坐标
		private int x;
		// y方向的坐标
		private int y;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			return (int) sqrt(pow((this.getX() - o.getX()), 2)
					+ pow((this.getY() - o.getY()), 2));

		}

	}

}
