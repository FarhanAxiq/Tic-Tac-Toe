//
//  Computer.java
//  Farhan Haziq 
//  ©2020
//


//AI Stuff
package FarhanAxiq;

class Computer extends Player {

    public Computer() {}
    int boardsize = 3;

    public void takeTurn(String[][] board, Human human)
    {
        boolean madeMove = false;

        // check if you can take a win horizontally
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(board[1][i]) && board[0][i].equals(Marker)) {
                if (board[2][i] != human.getMarker() && board[2][i] != Marker) {
                    board[2][i] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            if (board[2][i].equals(board[1][i]) && board[2][i].equals(Marker)) {
                if (board[0][i] != human.getMarker() && board[0][i] != Marker) {
                    board[0][i] = Marker;
                    madeMove = true;
                    return;
                }

            }


        }


        // check if you can take a win horizontally
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(Marker)) {
                if (board[i][2] != human.getMarker() && board[i][2] != Marker) {
                    board[i][2] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            if (board[i][2].equals(board[i][1]) && board[i][2].equals(Marker)) {
              if (board[i][0] != human.getMarker() && board[i][0] != Marker) {
                    board[i][0] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }


        // check if you can take a win diagonally bottom
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(Marker)) {
            if (board[2][2] != human.getMarker() && board[2][2] != Marker) {
                board[2][2] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[2][2].equals(board[1][1]) && board[2][2].equals(Marker)) {
            if (board[0][0] != human.getMarker() && board[0][0] != Marker) {
                board[0][0] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[0][0].equals(board[1][1]) && board[0][0].equals(Marker)) {
            if (board[2][2] != human.getMarker() && board[2][2] != Marker) {
                board[2][2] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[0][2].equals(board[1][1]) && board[0][2].equals(Marker)) {
            if (board[2][0] != human.getMarker() && board[2][0] != Marker) {
                board[2][0] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[2][0].equals(board[1][1]) && board[2][0].equals(Marker)) {
            if (board[0][2] != human.getMarker() && board[0][2] != Marker) {
                board[0][2] = Marker;
                madeMove = true;
                return;
            }
        }


        /**  BLOCKS!!!!
        *
        *  THIS IS FOR BLOCKING
        *  THE HUMAN SO
        *  THE AI IS A LITTLE SMARTER
        *
        */
        // check if you can block a win horizontally
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(board[1][i]) && board[0][i].equals(human.getMarker())) {
                if (board[2][i] != Marker && board[2][i] != human.getMarker()) {
                    board[2][i] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            if (board[2][i].equals(board[1][i]) && board[0][i].equals(human.getMarker())) {
                if (board[0][i] != Marker && board[0][i] != human.getMarker()) {
                    board[0][i] = Marker;
                    madeMove = true;
                    return;
                }

            }


        }

        // check if you can block a win vertically
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(human.getMarker())) {
                if (board[i][2] != Marker && board[i][2] != human.getMarker()) {
                    board[i][2] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            if (board[i][2].equals(board[i][1]) && board[i][2].equals(human.getMarker())) {
                if (board[i][0] != Marker && board[i][0] != human.getMarker()) {
                    board[i][0] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            if (board[2][i].equals(board[1][i]) && board[2][i].equals(human.getMarker())) {
                if (board[0][i] != Marker && board[0][i] != human.getMarker()) {
                    board[0][i] = Marker;
                    madeMove = true;
                    return;
                }

            }

        }


        // check if you can block a win diagonally
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(human.getMarker())) {
            if (board[2][2] != Marker && board[2][2] != human.getMarker()) {
                board[2][2] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[2][2].equals(board[1][1]) && board[2][2].equals(human.getMarker())) {
            if (board[0][0] != Marker && board[0][0] != human.getMarker()) {
                board[0][0] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[0][0].equals(board[1][1]) && board[0][0].equals(human.getMarker())) {
            if (board[2][2] != Marker && board[2][2] != human.getMarker()) {
                board[2][2] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[0][2].equals(board[1][1]) && board[0][2].equals(human.getMarker())) {
            if (board[2][0] != Marker && board[2][0] != human.getMarker()) {
                board[2][0] = Marker;
                madeMove = true;
                return;
            }
        }

        if (board[2][0].equals(board[1][1]) && board[2][0].equals(human.getMarker())) {
            if (board[0][2] != Marker && board[0][2] != human.getMarker()) {
                board[0][2] = Marker;
                madeMove = true;
                return;
            }
        }


        // make random move if above rules dont apply
        int rand1 = 0;
        int rand2 = 0;

        while (!madeMove) {

            rand1 = (int) (Math.random() * 3);
            rand2 = (int) (Math.random() * 3);

            if (board[rand1][rand2] != "X" && board[rand1][rand2] != "O") {
                board[rand1][rand2] = Marker;
                madeMove = true;

            }

        }


    }
}