
public class CodingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		int col = 3;
		int[][] testMatrix = makeMatrix(col,rows);
		printMatrix(testMatrix,col,rows);
		printSpiralMatrix(testMatrix,col,rows);
	}
	
	static void printSpiralMatrix(int[][] matrix, int rows, int columns){
        int columnIndex1 = 0;
        int columnIndex2 = columns-1;
        int rowIndex1 = 0;
        int rowIndex2 = rows-1;
        int indexVisited = 1;
        int i;
        while(indexVisited <= columns*rows){
            for(i = columnIndex1; i <= columnIndex2; i++){
                if(indexVisited == 1){
                    System.out.print(matrix[rowIndex1][i]);
                }else{
                    System.out.print("," + matrix[rowIndex1][i]);  
                }
                indexVisited++;
            }
            if(!(indexVisited <= columns*rows)) break;
            for(i = rowIndex1 + 1; i <= rowIndex2;i++){
                System.out.print("," + matrix[i][columnIndex2]);
                indexVisited++;
            }
            if(!(indexVisited <= columns*rows)) break;
            
            for(i = columnIndex2 - 1; i >= columnIndex1; i--){
                System.out.print("," + matrix[rowIndex2][i]);
                indexVisited++;
            }
            if(!(indexVisited <= columns*rows)) break;
            for(i = rowIndex2 - 1; i >= rowIndex1 + 1; i--){
                System.out.print("," + matrix[i][columnIndex1]);
                indexVisited++;
            }
            columnIndex1++;
            columnIndex2--;
            rowIndex1++;
            rowIndex2--;
        }
    }
	
	static int[][] makeMatrix(int rows, int col){
		int input = 0;
		int[][] matrix = new int[rows][col];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				matrix[i][j] = input;
				input++;
			}
		}
		return matrix;
	}
	//test my input scanning
    static void printMatrix(int[][] matrix, int rows,int columns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
