public class Main {
    public static void main(String[] args) {
        Sport sport1 = new Sport();
        Sport sport2 = new Sport();

        sport1.setSportName("Football");
        sport1.setNumberOfPlayers(11);
        sport1.setTeamSport(true);

        sport2.setSportName("Basketball");
        sport2.setNumberOfPlayers(5);
        sport2.setTeamSport(true);

        // Виклик методів для перевірки функціональності
        sport1.doubleNumberOfPlayers();
        sport1.performLogic(sport1, sport2);

        Football football = new Football();
        football.setLeague("Premier League");
        football.performSpecificFootballLogic();

        Basketball basketball = new Basketball();
        basketball.setBasketHeight(305);
        basketball.performSpecificBasketballLogic();
    }
}