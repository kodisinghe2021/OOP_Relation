package packone;

interface inteA {

    int x = 98;

    abstract void parkA();
}

interface inteB {

    int y = 108;

    abstract void parkB();
}

class ClA {

    void printA() {
        System.out.println("Class ClA PrintA");
    }
}

class ClB extends ClA {

    void printB() {
        System.out.println("Class ClB printB");
    }
}

public class InterFace_Tester extends ClB implements inteA, inteB {

    @Override
    public void parkA() {
        System.out.println("ParkA");
    }

    @Override
    public void parkB() {
        System.out.println("ParkB");
    }

    public static void main(String[] args) {
        InterFace_Tester objMain = new InterFace_Tester();

        objMain.printA();
        objMain.printB();
        objMain.parkA();
        objMain.parkB();
    }

}
