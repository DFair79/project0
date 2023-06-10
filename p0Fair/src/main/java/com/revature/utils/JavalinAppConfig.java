package com.revature.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.revature.controllers.SuperCharacterController;
import com.revature.controllers.VillainController;
import io.javalin.Javalin;

import io.javalin.json.JsonMapper;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

import static io.javalin.apibuilder.ApiBuilder.*;

public class JavalinAppConfig {

    Gson gson = new GsonBuilder().create();

    JsonMapper gsonMapper = new JsonMapper(){



        @Override
        public String toJsonString(@NotNull Object obj, @NotNull Type targetType){

            return gson.toJson(obj, targetType);
        }

        @Override
        public <T> T fromJsonString(@NotNull String json, @NotNull Type targetType){
            return gson.fromJson(json, targetType);
        }
    };

    private final SuperCharacterController superCharacterController = new SuperCharacterController();

    private final VillainController villainController = new VillainController();

    private static final Logger logger = LoggerFactory.getLogger(JavalinAppConfig.class);


    private Javalin app = Javalin.create(config-> config.jsonMapper(gsonMapper))
            .before("/*",ctx -> {
                logger.info("{} request has been sent to {}", ctx.method(), ctx.fullUrl());
            })
            .routes(()->{
                path("supercharacters", () -> {
                   get(superCharacterController::handleGetAll);
                    post(superCharacterController::handleCreate);
                    put(superCharacterController::handleUpdate);
                    delete(superCharacterController::handleDelete);
                    path("{character_id}", ()->{
                        get(superCharacterController::handleGetOne);
            });
        });
                path("villains",()->{
                    get(villainController::handleGetAll);
                    post(villainController::handleCreate);
                    put(villainController::handleUpdate);
                    delete(villainController::handleDelete);
                    path("{villain_id}",()->{
                        get(villainController::handleGetOne);
            });
        });

    });


    public void start(int port) {
        app.start(port);
    }
}
