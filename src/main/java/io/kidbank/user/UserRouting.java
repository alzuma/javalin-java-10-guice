package io.kidbank.user;

import io.alzuma.Routing;
import io.javalin.Javalin;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.javalin.ApiBuilder.get;
import static io.javalin.ApiBuilder.path;

@Singleton
class UserRouting extends Routing<UserController> {
    private Javalin javalin;
    @Inject
    public UserRouting(Javalin javalin) {
        this.javalin = javalin;
    }

    @Override
    public void bindRoutes() {
        javalin.routes(() -> {
            path("api/kidbank/users", () -> {
                get(ctx -> getController().index(ctx));
            });
        });
    }
}
