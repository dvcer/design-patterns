public class App {
    public static void main(String[] args) {
        Worker w1 = new Worker("Anton");
        Worker w2 = new Worker("Sergey");
        Worker w3 = new Worker("Gosha");
        Worker w4 = new Worker("Alesha");
        Worker w5 = new Worker("Piter");
        Manager m1 = new Manager("Sebastian");
        Manager m2 = new Manager("Anatoliy");
        m1.add(w1).add(w2).add(w3);
        m2.add(w4).add(w5);
        Director d1 = new Director("Akakiy");
        d1.add(m1).add(m2);
        d1.print("");

            }
}
