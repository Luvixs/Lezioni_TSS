package giochini;

public class Triangolo {
	public static void disegnaTriangolo() {
		int numRighe = 5;
		
		for(int i = 0; i < numRighe; i++) {
			for(int j = 0; j < numRighe; j++) {
				System.out.println(" ");
			}
			System.out.println();
			
			for(int k = 0; k < 2 * i; i++) {
				if(k == 0 || k == 2 * i || i == numRighe - 1) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		disegnaTriangolo();
	}
}
