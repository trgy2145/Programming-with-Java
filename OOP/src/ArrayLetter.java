public class ArrayLetter {

    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int k = 0; k < letter[i].length; k++) {
                if (i == 0 || i == 2) {
                    letter[i][k] = " * ";
                } else if (k == 0 || k == 3) {
                    letter[i][k] = " * ";
                } else {
                    letter[i][k] = "  ";
                    
                    
                    
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.println(col);

            }
            System.out.println();
            

        }

    }

}
