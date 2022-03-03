/*
Design a class 'Cricketer' having data member 'name' and 'numberOfMatches' and appropriate member function to set the values. Derived two classes 'Batsman' and 'Bowler' from 'Cricketer' class with data member 'totalNumberOfRuns' and 'wickets' respectively. 'Batsman' should have the method to calculate average wicket. Write a program to create two objects and display information of one batsman and bowler along with average run and wicket.
*/ 

class Cricketer {
    private String name;
    private int numberOfMatches;

    Cricketer() {
        this.name = "Not Set";
        this.numberOfMatches = 0;
    }

    Cricketer(String name, int numberOfMatches) {
        this.name = name;
        this.numberOfMatches = numberOfMatches;
    }

    public void initVal(String name, int numberOfMatches) {
        this.name = name;
        this.numberOfMatches = numberOfMatches;
    }

    public void getData() {
        System.out.println("The name of the cricketer is: " + name);
        System.out.println("Number of matches this cricketer has played: " + numberOfMatches);
    }
}

class Batsman extends Cricketer {
    private int totalNoOfRuns;
    private int wicket[] = new int[10];

    Batsman() {
        totalNoOfRuns = 0;
        for(int i = 0; i < 10; i++) {
            wicket[i] = 0;
        }
    }

    Batsman(String name, int numberOfMatches, int totalNoOfRuns, int wicket[]) {
        super(name, numberOfMatches);

        this.totalNoOfRuns = totalNoOfRuns;
        this.wicket = wicket;
    }

    public int averageWicket() {
        int avg = 0;

        for (int i = 0; i < 10; i++) {
            avg += wicket[i];
        }

        return avg / 10;
    }

    public void getData() {
        super.getData();

        System.out.println("Total no of runs of this cricketer is: " + totalNoOfRuns);
        System.out.println("Average wicket taken by this cricketer is: " + averageWicket());
    }
}

class Bowler extends Cricketer {
    private int totalNoOfRuns;
    private int wicket[] = new int[10];

    Bowler() {
        totalNoOfRuns = 0;
        for(int i = 0; i < 10; i++) {
            wicket[i] = 0;
        }
    }

    Bowler(String name, int numberOfMatches, int totalNoOfRuns, int wicket[]) {
        super(name, numberOfMatches);

        this.totalNoOfRuns = totalNoOfRuns;
        this.wicket = wicket;
    }

    public int averageWicket() {
        int avg = 0;

        for (int i = 0; i < 10; i++) {
            avg += wicket[i];
        }

        return avg / 10;
    }

    public void getData() {
        super.getData();

        System.out.println("Total no of runs of this cricketer is: " + totalNoOfRuns);
        System.out.println("Average wicket taken by this cricketer is: " + averageWicket());
    }
}

public class Program3 {
    public static void main(String[] args) {
        int btsWickets[] = {0, 2, 1, 1, 0, 0, 1, 4, 3, 2};
        int blwWickets[] = {1, 2, 1, 1, 4, 3, 4, 6, 4, 2};

        Batsman bts = new Batsman("Virat Kohli", 50, 1000, btsWickets);
        Bowler blw = new Bowler("Harbajan Singh", 200, 50650, blwWickets);

        bts.averageWicket();
        blw.averageWicket();

        bts.getData();

        System.out.println("\n");

        blw.getData();
    }
}
