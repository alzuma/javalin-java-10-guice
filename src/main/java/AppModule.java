import com.google.inject.AbstractModule;
import io.kidbank.KidBankModule;

public class AppModule extends AbstractModule {
    protected void configure() {
        bind(Startup.class);
        install(new KidBankModule());
    }
}
