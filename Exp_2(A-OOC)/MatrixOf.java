public class MatrixOf{
	public static void main(String[] args){

	int choice;
	int r1,r2,c1,c2;

 	System.out.print("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        int[][] a = new int[r1][c1];


 	System.out.print("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        int[][] b = new int[r2][c2];


	System.out.println("Enter elements of 1st matrix : ");
	for( int i=0; i<r1; i++){
	for ( int j=0; j<c1; j++){
		a[i][j] = sc.nextInt();
		}
	}

	System.out.println("Enter elements of 2nd matrix : ");
	for( int i=0; i<r2; i++){
	for ( int j=0; j<c2; j++){
		b[i][j] = sc.nextInt();
		}
	}

	System.out.println("\n--- Matrix Operations ---");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of First Matrix");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                if (r1 == r2 && c1 == c2) {
                    System.out.println("Addition Result:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Addition not possible!");
                }
                break;

            case 2:
                if (c1 == r2) {
                    System.out.println("Multiplication Result:");
                    int[][] mul = new int[r1][c2];

                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            mul[i][j] = 0;
                            for (int k = 0; k < c1; k++) {
                                mul[i][j] += a[i][k] * b[k][j];
                            }
                            System.out.print(mul[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Multiplication not possible!");
                }
                break;

            case 3:
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < c1; i++) {
                    for (int j = 0; j < r1; j++) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}

