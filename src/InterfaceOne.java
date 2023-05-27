interface InterfaceOne {
    abstract void methodOne();
}
interface InterfaceTwo{
    abstract void methodTwo();
}
class Inheritance implements InterfaceOne, InterfaceTwo{
    public void methodOne(){
        System.out.println("1");
    }
    public void methodTwo(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.methodOne();
        i.methodTwo();
    }
}