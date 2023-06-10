package com.revature.controllers;


import com.revature.models.SuperCharacter;
import com.revature.models.Villain;
import com.revature.service.SuperCharacterService;
import com.revature.service.VillainService;
import io.javalin.http.Context;

import java.util.ArrayList;


public class VillainController {

        public final VillainService villainservice = new VillainService();

        public void handleGetAll(Context ctx){

            ArrayList<Villain> villains = VillainService.getAllVillains();

            ctx.json(villains);

        }

        public void handleCreate(Context ctx){
            Villain VillainToBeAdded = ctx.bodyAsClass(Villain.class);

            Villain registeredVillain = VillainService.insertVillain(VillainToBeAdded);

            if (registeredVillain != null){
                ctx.status(201);
                ctx.json(registeredVillain);
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
