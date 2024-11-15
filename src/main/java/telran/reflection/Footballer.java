package telran.reflection;

public class Footballer extends Sportsman{
    private String team;
    
    public Footballer(String team, String name) {
        super(name);
        this.team = team;
    }
    @Override
    public void action() {
        System.out.printf("I'm footballer %s, playing in the team %s",
        getName(), team);
    }

}
