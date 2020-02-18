package Capitulo10;

public class DoublesTennisGame extends TennisGame {
    
    private String partner1, partner2;

    public String getPartner1() {
        return partner1;
    }

    public String getPartner2() {
        return partner2;
    }
    
    public void setPlayers (String player1, String partner1, String player2, String partner2) {
        this.partner1 = partner1;
        this.partner2 = partner2;
        super.setPlayers(player1, player2);
    }
    
    public void showData (DoublesTennisGame doublesTennisGame) {
        System.out.println("TENNIS EN PAREJAS\nJugador 1: " + doublesTennisGame.getPlayer1() +
                "\tpuntaje: " + doublesTennisGame.getScore1() + " = " + doublesTennisGame.getFscore1() +
                "\nCompañero: " + doublesTennisGame.getPartner1());
        System.out.println("Jugador 2: " + doublesTennisGame.getPlayer2() + "\tpuntaje: " +
                doublesTennisGame.getScore2() + " = " + doublesTennisGame.getFscore2() +
                "\nCompañero: " + doublesTennisGame.getPartner2() + "\n");
    }
    
}
