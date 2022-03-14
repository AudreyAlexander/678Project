public class grid {
    private int rows;
    private int cols;
    private String[][] board;
    public static int numOfWords = 0;

    public grid(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        board = new String[rows][cols];

        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                board[i][j] = " ";
            }
        }
    }

    public void enterWord(String word, int rowNum, int colNum, boolean orientation){
        numOfWords++;
        //orientation: across == true, down == false
        String[] wordArr = word.split("");
        int count = 0;

        if (orientation == true){
            board[rowNum][0] = "(" + numOfWords + ")";
            for(int i = 1; i < board[rowNum].length; i++) {
                if (wordArr.length >= i){
                    board[rowNum][i] = " " + wordArr[count] + " ";

                }
                else{
                    board[rowNum][i] += " ";
                }
                count++;
            }
        }
        else{
            board[0][colNum] = "(" + numOfWords + ")";
            for(int i = 1; i < board.length; i++) {
                if (wordArr.length >= i) {
                    board[i][colNum] = " " +wordArr[count]+ " ";
                }
                else{
                    board[i][colNum] += " ";
                }
                count++;
            }
        }

    }
    public void getBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }



}
