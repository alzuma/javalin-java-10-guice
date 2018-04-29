package io.kidbank.user;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import io.alzuma.Routing;
import io.kidbank.user.repositories.UserRepositoryModule;
import io.kidbank.user.services.UserServiceModule;

public class UserModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserController.class);
        install(new UserServiceModule());
        install(new UserRepositoryModule());
        Multibinder.newSetBinder(binder(), Routing.class).addBinding().to(UserRouting.class);
    }
}
