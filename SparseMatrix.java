public class SparseMatrix {
    public static void main(String args[]) {
        int arr[][] = {
                {7, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, -3, 0, 9, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, 0, 0},
                {0, -6, 0, 0, -5, 1}
        };
        isSparse(arr);
    }

    public static void isSparse(int[][] arr) {
        int spaces = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) spaces++;
            }
        }

        int elements = arr.length * arr[0].length - spaces;

        int values[] = new int[elements];
        int rowc[] = new int[arr.length];
        int col[] = new int[elements];

        int cnt = 0;
        for (int i = 0, a = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0) {
                    values[a] = arr[i][j];
                    cnt++;
                    col[a++] = j;
                }
            }
            rowc[i] = cnt;
        }

        reverseEngineer(values, rowc, col);
//        System.out.println(values + " " + rowc + " " + col);
    }
    
    public static int[][] reverseEngineer(int values[], int rowc[], int col[]) {
        int arr[][] = new int[rowc.length][rowc.length];

        int cnt = 0;
        for (int i = 0, a = 0, b = 0; i < rowc.length; i++) {
            for (int j = 0; j < rowc.length; j++) {
                if(j == col[a] && cnt != rowc[i]) {
                    arr[i][j] = values[b++];
                    cnt++;
                    a++;
                }
                else
                    arr[i][j] = 0;
            }
        }

        System.out.println(arr);

        return arr;
    }
}
