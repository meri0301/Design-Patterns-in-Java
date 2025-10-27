public class AnimalFactory {

    public Animal createAnimal(String type) {
        SoundStrategy strategy;
        Animal animal;

        switch (type.toLowerCase()) {
            case "cat":
                strategy = new MeowStrategy();
                animal = new Cat(strategy); // Strategy injected into the product
                return animal;

            case "dog":
                strategy = new WoofStrategy();
                animal = new Dog(strategy); // Strategy injected into the product
                return animal;

            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}
