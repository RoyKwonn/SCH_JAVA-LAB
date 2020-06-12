package ten;
//
//  File: TicTacToe.java
//  Auth: 20184646 권석환
//  Date: 1 June 2020
//

public class TicTacToe
{
    public static void main( String[] args )
    {
        TicTacToeView view = new TicTacToeView();
        TicTacToeModel model = new TicTacToeModel();
        @SuppressWarnings("unused")
        TicTacToeController controller = new TicTacToeController( view, model );
        view.setVisible( true );
    }

} // end class TicTacToe
