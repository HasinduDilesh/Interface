public interface Gawesh {
    abstract void sound();
    abstract void sleep();
}
class Human implements Gawesh{
    public void sound() {
        System.out.println("grrr... grrr...");
    }
    public void sleep() {
        System.out.println("Suus... Suus...");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.sound();
        h.sleep();
    }
}
