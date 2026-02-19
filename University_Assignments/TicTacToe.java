// Name Surname Erkin Sonmezer
// ID 240019
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int strategy = (int)(Math.random()*2)+1; // should be 1 or 2
        System.out.println("TicTacToe with strategy " + strategy);
        char[][] board=createBoard();
        
        printBoard(board);
        
        while(true){
            System.out.println("Enter row and column to make move(like 1,1)");
            String userinput=input.next();
            String[] parts= userinput.split(",");
            
            int row = Integer.parseInt(parts[0]) - 1;
            int column = Integer.parseInt(parts[1]) - 1;
            
            if(isValid(row,column,board)){
                makePlayerMove(row,column,board);
                printBoard(board);
            }else{System.out.println("Invalid input Try again.");continue;}
            
            if(isWin(board)=='X'){
                System.out.println("You win!!");
                break;
            }
            
            if(isFull(board)){
                System.out.println("Nobody wins, Draw!!");
                break;
            }
            
            makeProgramMove(board,strategy);
            printBoard(board);
            
            if(isWin(board)=='O'){
                System.out.println("You lose :(");
                break;
            }
            
            if(isFull(board)){
                System.out.println("Nobody wisn, Draw!!");
                break;
            }
        
        }
        input.close();
    }

    public static char[][] createBoard(){
        char[][]board =new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j]= '_';
            }
        }
        return board;
    }

    public static boolean isFull(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ('_' == board[i][j]){return false;}
            }
        }
        return true;
    }

    public static void printBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" ");
            }System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static char isWin(char[][] board){
        for (int i = 0; i <3 ; i++) {
            if((board[i][0]=='X' || board[i][0]=='O')&& (board[i][0]== board[i][1])&&(board[i][0]== board[i][2])){return  board[i][0];}
        }
        for (int i = 0; i <3 ; i++) {
            if((board[0][i]=='X' || board[0][i]=='O')&& (board[0][i]== board[1][i])&&(board[2][i]== board[0][i])){return  board[0][i];}
        }
        
        if ((board[0][0] == 'X' || board[0][0]== 'O') && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if ((board[2][0] == 'X' || board[2][0]== 'O') && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return board[2][0];
        }
        
        return '_';
    }
    
    public static boolean isValid(int rowIndex, int columnIndex, char[][] board){
        if ((rowIndex<3 && rowIndex>=0)&&(columnIndex<3 && columnIndex>=0)&&(board[rowIndex][columnIndex]=='_')) {
            return true;
        }
        return false;
    }

    public static void makePlayerMove(int rowIndex, int columnIndex, char[][] board){
        board[rowIndex][columnIndex]='X';
    }

    public static void makeProgramMove(char[][] board, int strategy){
        System.out.println("Programs turn: ");
        if(strategy==1){
        makeRandomMove(board);
        }else if(strategy ==2){
            if(makeWinMove(board)==1){
                return;}
            if(makeBlockMove(board)==1){
            return;}
            makeRandomMove(board);
        }
    }

    public static int makeRandomMove(char[][] board){
        if(isFull(board)){return -1;}
        while(true){
            byte row =(byte)(Math.random()*3);
            byte column=(byte)(Math.random()*3);
            
            if(isValid(row,column,board)){
            board[row][column]='O';
            return 1;
            }
        }
    }

    public static int makeWinMove(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]=='_'){
                    board[i][j]='O';
                    if(isWin(board)=='O'){
                    return 1;
                    }
                 board[i][j]='_';
                }
            }
        }
        return -1;
    }

    public static int makeBlockMove(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]=='_'){
                board[i][j] = 'X';
                if(isWin(board)=='X'){
                    board[i][j]='O';
                    return 1;
                    }
                board[i][j]='_';
                }
            }
        }
        return -1;
    }
    
    
    
    
    
    
}
