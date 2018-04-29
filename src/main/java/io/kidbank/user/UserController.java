package io.kidbank.user;

import io.javalin.Context;
import io.kidbank.user.services.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class UserController {
    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void index (Context ctx) {
        ctx.json(userService.getAllUsersUppercase());
    }
}
