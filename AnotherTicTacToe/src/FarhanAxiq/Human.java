//
//  Human.java
//  Farhan Haziq 
//  ©2020
//



package FarhanAxiq;
import javax.swing.*;

class Human extends Player {

    public Human(){}

    /**
     *
     *  Keep track of the turn
     *  INPUT:The board
     *  OUTPUT:NaN
     *
     */
    public void takeTurn(String[][] board)
    {
        JFrame in = new JFrame();
        String ina;
        boolean turn = true;

        while(turn){

            ina = JOptionPane.showInputDialog(in , "Please enter row");
            int row = Integer.parseInt(ina);
            ina = JOptionPane.showInputDialog(in , "Please enter row");
            int col = Integer.parseInt(ina);


            JOptionPane.showMessageDialog(null, "You entered " + row + " " + col);


            if(board[row - 1][col - 1] != "X" && board[row - 1][col - 1] != "O"){
                board[row - 1][col - 1] = Marker;
                turn = false;
            }

            else {
                JOptionPane.showMessageDialog(null, "Already Marked here! please input again!");
            }
        }
    }

}