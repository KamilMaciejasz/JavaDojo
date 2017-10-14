package footballTeam;

public class Main {

    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam();
        footballTeam.addJLabel(new Player("Neuer", Position.GK));
        footballTeam.addJLabel(new Player("Marcelo", Position.LB));
        footballTeam.addJLabel(new Player("Ramos", Position.SP));
        footballTeam.addJLabel(new Player("Glik", Position.ST));
        footballTeam.addJLabel(new Player("Piszczek", Position.RB));
        footballTeam.addJLabel(new Player("Ronaldo", Position.LMD));
        footballTeam.addJLabel(new Player("De Bruyne", Position.DMD));
        footballTeam.addJLabel(new Player("Neymar", Position.DMD));
        footballTeam.addJLabel(new Player("Messi", Position.RMD));
        footballTeam.addJLabel(new Player("Lewandowski", Position.FW));
        footballTeam.addJLabel(new Player("Mbeppe", Position.FW));
        footballTeam.finish();
    }

}
