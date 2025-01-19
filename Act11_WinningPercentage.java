public class Act11_WinningPercentage {
    public static void main(String[] args) {
        int TgamesWon = 19;
        int TlostGames = 6;
        int TgamesPlayed = 25;

        System.out.println("Printing the Data from the last tournament...");
        System.out.println("Won Games:\t\t" + TgamesWon);
        System.out.println("Lost Games:\t\t" + TlostGames);
        System.out.println("Total Played Games:\t" + TgamesPlayed);

        System.out.println("Computing winning precentage...");
        double perc = ((double) TgamesWon / TgamesPlayed)*100;
        System.out.println("Result: = " + perc + "%");
    }
   
}
