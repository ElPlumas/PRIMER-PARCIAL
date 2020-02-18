package Capitulo10;

public class TennisGame {
    
    private String player1, player2;
    private Integer score1, score2;
    private String fscore1, fscore2;

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getScore1() {
        return score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public String getFscore1() {
        return fscore1;
    }

    public String getFscore2() {
        return fscore2;
    }

    public void setPlayers(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setScores(Integer score1, Integer score2) {
        if ((score1>=0) && (score1<=4) && (score2>=0) && (score2<=4)) {
            this.score1 = score1;
            this.score2 = score2;
            switch (this.score1) {
                case 0:
                    this.fscore1 = "love";
                    break;
                case 1:
                    this.fscore1 = "15";
                    break;
                case 2:
                    this.fscore1 = "30";
                    break;
                case 3:
                    this.fscore1 = "40";
                    break;
                case 4:
                    this.fscore1 = "game";
                    break;
            }
            switch (this.score2) {
                case 0:
                    this.fscore2 = "love";
                    break;
                case 1:
                    this.fscore2 = "15";
                    break;
                case 2:
                    this.fscore2 = "30";
                    break;
                case 3:
                    this.fscore2 = "40";
                    break;
                case 4:
                    this.fscore2 = "game";
                    break;
            }
        }else {
            this.score1 = this.score2 = 0;
            this.fscore1 = this.fscore2 = "error";
        }
        if ((score1 == 4) && (score2 == 4)) {
            this.score1 = this.score2 = 0;
            this.fscore1 = this.fscore2 = "error";
        }
    }
    
    public void showData (TennisGame tennisGame) {
        System.out.println("TENNIS INDIVIDUAL\nJugador 1: " + tennisGame.getPlayer1() + "\tpuntaje: "+
                tennisGame.getScore1() + " = " + tennisGame.getFscore1());
        System.out.println("Jugador 2: " + tennisGame.getPlayer2() + "\tpuntaje: "+
                tennisGame.getScore2() + " = " + tennisGame.getFscore2() + "\n");
    }
    
    public static void main(String[] args) {

        TennisGame tennisGame = new TennisGame();
        TennisGame tennisGame2 = new TennisGame();
        TennisGame tennisGame3 = new TennisGame();
        TennisGame tennisGame4 = new TennisGame();
        TennisGame tennisGame5 = new TennisGame();
        DoublesTennisGame doublesTennisGame = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame2 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame3 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame4 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame5 = new DoublesTennisGame();
        
        tennisGame.setPlayers("Fernando", "Javier");
        tennisGame.setScores(4, 10);
        tennisGame2.setPlayers("Fernando", "Javier");
        tennisGame2.setScores(2, 3);
        tennisGame3.setPlayers("Fernando", "Javier");
        tennisGame3.setScores(4, 4);
        tennisGame4.setPlayers("Fernando", "Javier");
        tennisGame4.setScores(1, 1);
        tennisGame5.setPlayers("Fernando", "Javier");
        tennisGame5.setScores(0, 4);
        
        doublesTennisGame.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame.setScores(5, 4);
        doublesTennisGame2.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame2.setScores(2, 3);
        doublesTennisGame3.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame3.setScores(4, 4);
        doublesTennisGame4.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame4.setScores(1, 1);
        doublesTennisGame5.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame5.setScores(0, 4);
        
        tennisGame.showData(tennisGame);
        tennisGame2.showData(tennisGame2);
        tennisGame3.showData(tennisGame3);
        tennisGame4.showData(tennisGame4);
        tennisGame5.showData(tennisGame5);
        doublesTennisGame.showData(doublesTennisGame);
        doublesTennisGame2.showData(doublesTennisGame2);
        doublesTennisGame3.showData(doublesTennisGame3);
        doublesTennisGame4.showData(doublesTennisGame4);
        doublesTennisGame5.showData(doublesTennisGame5);
        
        
    }
    
}
