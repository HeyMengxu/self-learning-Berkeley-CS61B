package hw0;

public class DrawStriangle {
 
	public static void main(String[] args) {
		drawTriangle(5);
	}
	
	public static void drawTriangle(int N) {
		int row=0;
		int size= N;
		while(row<=size) {
			int col=0;
			while(col<=row) {
				System.out.print("*");
				col=col+1;
			}
			
			System.out.println("#");
			row=row+1;
		}
	}
}
