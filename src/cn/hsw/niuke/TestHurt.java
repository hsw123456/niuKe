package cn.hsw.niuke;

import java.util.Scanner;
import static java.lang.Math.*;

public class TestHurt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int remote = scanner.nextInt();

		int[] x = new int[4];
		int[] y = new int[4];

		for (int i = 0; i < 4; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		double sum = 0;

		for (int i = 0; i < 3; i++) {
			if (distance(x[i], y[i], x[3], y[3]) <= remote) {
				sum += 1;
			}
		}

		System.out.println((int) sum + "x");

	}

	private static double distance(int x1, int y1, int x0, int y0) {

		return sqrt(pow((x1 - x0), 2) + pow((y1 - y0), 2));

	}

}
