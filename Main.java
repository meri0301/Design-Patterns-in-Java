
import com.factory.client.Application;
import com.factory.factories.GUIFactory;
import com.factory.factories.MacFactory;
import com.factory.factories.WindowsFactory;

void main() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        // Որոշում, թե որ կոնկրետ ֆաբրիկան օգտագործել
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        System.out.println("Current OS: " + osName);

        Application app = new Application(factory);

        app.paint();

}
