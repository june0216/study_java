package Final;

import java.util.Scanner;

class Point{
	int x;
	int y;
	
	Point(){}
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

}

class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 점을 입력");
		System.out.println("점1 x");
		int x = sc.nextInt();
		
		System.out.println("점1 y");
		int y = sc.nextInt();
		
		System.out.println("점2 x");
		int x2 = sc.nextInt();
		
		System.out.println("점2 y");
		int y2 = sc.nextInt();
		
		Point point[] = new Point[2];
		
		point[0] = new Point(x, y);
		point[1] = new Point(x2, y2);
		
		int xd = (int)Math.pow(point[0].x - point[1].x, 2);
		int yd = (int)Math.pow(point[0].y - point[1].y, 2);
		
		double res = Math.sqrt(xd + yd);
		System.out.println(res);
		
		

	}

}
