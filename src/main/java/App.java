import com.google.inject.Guice;
import io.alzuma.EntrypointType;

public class App {
    public static void main(String[] args) {
        var injector = Guice.createInjector(new AppModule());
        injector.getInstance(Startup.class).boot(EntrypointType.REST, args);
    }
}
