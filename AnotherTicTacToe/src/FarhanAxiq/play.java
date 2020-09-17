//
//  play.java
//  Farhan Haziq 
//  ©2020
//


package FarhanAxiq;

import javax.swing.*;

public class play {
    public static void main(String[] args) {
        JFrame inp = new JFrame();
        String ino;
        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe\nYou will have X and the computer will have O");
        boolean playAgain = true;


        //create player objects
        Human human = new Human();
        Computer computer = new Computer();

        while(playAgain){
            //run board setup
            set Setup = new set();

            Setup.createBoard();
            Setup.printBoard();


            human.setMarker("X");
            computer.setMarker("O");


            // determine who goes first
            int first = (int) (Math.random() * 2);
            boolean won = false;
            int turns = 0;

            if(first == 0){
                while(!won){
                    human.takeTurn(Setup.getBoard());
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        JOptionPane.showMessageDialog(null, "Congratz, you won!");
                    }
                    if(turns == 9){
                        won = true;
                        JOptionPane.showMessageDialog(null, "Its a draw");
                        break;
                    }
                    if(!won){
                        computer.takeTurn(Setup.getBoard(), human);
                        turns++;
                        Setup.printBoard();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            JOptionPane.showMessageDialog(null, "AI > Human, Better luck next time");
                        }
                        if(turns == 9){
                            won = true;
                            JOptionPane.showMessageDialog(null, "Its a draw");
                            break;
                        }
                    }

                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Computer goes first!");
                while(!won){
                    computer.takeTurn(Setup.getBoard(), human);
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        JOptionPane.showMessageDialog(null, "AI > Human, Better luck next time");
                    }
                    if(turns == 9){
                        won = true;
                        JOptionPane.showMessageDialog(null, "Its a draw");
                        break;
                    }
                    if(!won){
                        human.takeTurn(Setup.getBoard());
                        turns++;
                        Setup.printBoard();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            JOptionPane.showMessageDialog(null, "Congratz, you won!");
                        }
                        if(turns == 9){
                            won = true;
                            JOptionPane.showMessageDialog(null, "Its a draw");
                            break;
                        }
                    }



                }

            }




            ino = JOptionPane.showInputDialog(inp , "Would you like to play again? Type 1 for yes or 2 to quit");
            int exit = Integer.parseInt(ino);
            if(exit == 2){
                playAgain = false;
                System.exit(1);
            }
        }

    }
}