class Football extends Sport {
    private String league;

    Football() {
        super();
        this.league = "Unknown";
    }

    String getLeague() {
        return league;
    }

    void setLeague(String league) {
        this.league = league;
    }

    // Додатковий метод для класу Football
    void performSpecificFootballLogic() {
        System.out.println("Performing specific football logic...");
    }
}
