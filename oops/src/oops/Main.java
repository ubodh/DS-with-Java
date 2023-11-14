package oops;
class Carr {
    private int seats;
    private int speed;

    public Carr(int seats, int speed) {
    this.seats = seats;
    this.speed = speed;
    System.out.print("This Is Car ");
    }
}

class Audi extends Carr {
    Audi(int x, int y) {
    super(x,y); 
    System.out.print("This Is Para Audi ");
    }
    void Audi() {
    System.out.print("This Is Def Audi");
    }
} 

class Main {
    public static void main(String args[]) {
    Audi a = new Audi(5,7);
    a.Audi();
    }         
}
