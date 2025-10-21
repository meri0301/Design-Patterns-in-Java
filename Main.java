public class Main {

    public static void createUsers() {
        IDGenerator gen1 = IDGenerator.getInstance();

        System.out.println("Users Id1 === " + gen1.getNextId());
        System.out.println("Users Id2 === " + gen1.getNextId());
        System.out.println("Current Id === " + gen1.getCurrentId());
    }

    public static void createProducts() {
        IDGenerator gen2 = IDGenerator.getInstance();

        System.out.println("Products Id1 === " + gen2.getNextId());
        System.out.println("Products Id2 === " + gen2.getNextId());
        System.out.println("Current Id === " + gen2.getCurrentId());
    }

    public static void checkReferences() {
        IDGenerator class1 = IDGenerator.getInstance();
        IDGenerator class2 = IDGenerator.getInstance();

        System.out.println(class1.hashCode());
        System.out.println(class2.hashCode());
    }

    public static void main(String[] args) {

        createUsers();
        createProducts();
        checkReferences();

    }
}