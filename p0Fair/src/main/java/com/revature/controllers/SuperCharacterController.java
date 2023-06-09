package com.revature.controllers;

import com.revature.models.SuperCharacter;
import com.revature.service.SuperCharacterService;
import io.javalin.http.Context;


import java.util.ArrayList;

public class SuperCharacterController {

    public final SuperCharacterService superCharacterService = new SuperCharacterService();

    public void handleGetAll(Context ctx){

        ArrayList<SuperCharacter> superCharacters = superCharacterService.getAllSuperCharacters();

        ctx.json(superCharacters);

    }

    public void handleCreate(Context ctx){
        SuperCharacter superCharacterToBeAdded = ctx.bodyAsClass(SuperCharacter.class);

        SuperCharacter registeredSuperCharacter = superCharacterService.insertSuperCharacter(superCharacterToBeAdded);

        if (registeredSuperCharacter != null){
            ctx.status(201);
            ctx.json(registeredSuperCharacter);
        }else {
            ctx.status(400);
        }
    }

    public void handleGetOne(Context ctx){
        ctx.status(405);
    }
    public void handleUpdate(Context ctx){
        ctx.status(405);
    }
    public void handleDelete(Context ctx){
        ctx.status(405);
    }
}
