package io.kidbank.user.services;

import com.google.inject.AbstractModule;

public class UserServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(DefaultUserService.class);
    }
}
