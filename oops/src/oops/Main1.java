package oops;

class Vehicles{
    void print(){
    System.out.print("Vehicle class");
    }
}
class Carrr extends Vehicles{
    void print(){
    System.out.print("Car class ");
    }
}

public class Main1 {
    public static void main(String[] args){   
    Vehicles obj1 = new Carrr();
    obj1.print();

    Vehicles obj2 = new Vehicles();
    obj2.print();  
    }
}
