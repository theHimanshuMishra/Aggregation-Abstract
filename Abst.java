abstract class Vehicle{
    abstract void start();
}
class Scoter extends Vehicle{
    void start(){
        System.out.println("Scoter start with key");
    }
}
class Bus extends Vehicle{
    void start() {
        System.out.println("BUs start with key");
    }
}
class Abst{
public static void main(String args[]){
    Scoter s=new Scoter();
    s.start();
    Bus b=new Bus();
    b.start();
}
}