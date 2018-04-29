package io.kidbank;

import com.google.inject.AbstractModule;
import io.kidbank.user.UserModule;

public class KidBankModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new UserModule());
        install(WebModule.create());
    }
}
