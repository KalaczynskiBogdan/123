package team;

public class BasketballTeam implements Team{
    private int numberOfPlayers = 0;
    @Override
    public void addPlayer(String player) {
        numberOfPlayers++;
    }

    @Override
    public int getNumberOfPlayer() {
        return numberOfPlayers;
    }
}
