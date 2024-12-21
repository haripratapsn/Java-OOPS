public class twodarray {
      public static void main(String[] args) {
        int[][] matrix=new int[5][2];
          matrix[0][0]=7;
          matrix[1][0]=7;
          matrix[2][0]=7;
          matrix[3][0]=7;
          matrix[4][0]=7;
          matrix[0][1]=1;
          matrix[1][1]=2;
          matrix[2][1]=3;
          matrix[3][1]=4;
          matrix[4][1]=5;
          for(int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                System.out.print(matrix[i][j]+" ");
            }
              System.out.println();
        }

    }
}
