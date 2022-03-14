public class crossword {
    private grid board = new grid(10, 10);

    public crossword(){
        //ALL LOWERCASE
        board.enterWord("hello", 3, 2, true); //
        board.enterWord("tree", 6, 7, false); // star wars
        //board.enterWord("jurassic", 6, 1, true);
        //board.enterWord("rings", 9, 3, true); //lord of the

    }


    public void start(){
        System.out.println("----MOVIE CROSSWORD----");
        board.getBoard();

    }




}
