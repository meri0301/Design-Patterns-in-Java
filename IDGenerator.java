public class IDGenerator {
    private static IDGenerator instance =  new IDGenerator();

    private int counter = 100;

    private IDGenerator() {

    }

    public static IDGenerator getInstance() {
        return instance;
    }

    public int getNextId() {
        return counter++;
    }

    public int getCurrentId() {
        return counter;
    }
}
