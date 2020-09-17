//
//  set.java
//  Farhan Haziq 
//  ©2020
//

package FarhanAxiq;
import javax.swing.*;
import java.util.*;

public class set {

    // setup variables default board size and board
    private int N = 3;
    StringBuilder a = new StringBuilder();
    JFrame in = new JFrame();
    public String[][] board = new String [N][N];


    /**
     *
     *  Keep track the winner
     *  INPUT: The board
     *  OUTPUT:If won, true, if lose false in boolean
     *
     */
    public boolean hasWon (String [][]board)
    {
        //horizontal
        for(int i = 0; i<3; i++){
            if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])){
                return true;
            }
        }
        //vertical
        for(int i = 0; i<3; i++){
            if(board [0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])){
                return true;
            }
        }
        //diagonal
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) || board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
            return true;
        return false;
    }


    int x = 1;

    /**
     *
     *  Create the board
     *  INPUI: NaN
     *  OUTPUT:Generate a Board
     *
     */
    public void createBoard()
    {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = "" + (x);
                x++;
            }
        }
    }

    /**
     *
     *  Print the board
     *  INPUI: NaN
     *  OUTPUT:Print a Board
     *
     */
    public void printBoard()
    {
        String output = " ";

        for(int i = 0; i < board.length; i++){
            output += Arrays.toString(board[i]) + "\n";
            for(int j = 0; j < board.length; j++){
            }
        }
       JOptionPane.showMessageDialog(null, output);

    }

    public String[][] getBoard() { return board; }



}
