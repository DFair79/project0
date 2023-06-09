package com.revature.controllers;


import com.revature.models.Villain;
import com.revature.service.VillainService;
import io.javalin.http.Context;


public class VillainController {

    private final VillainService villainService = new VillainService();

    public void handleGetOne(Context ctx){
        int villain_id;

        try {
            villain_id = Integer.parseInt(ctx.pathParam("villain_id"));
        }catch (NumberFormatException e){
            ctx.status(400);
            return;
        }

        Villain villain = VillainService.getVillainById(villain_id);

        if (villain != null){
            ctx.status(200);
            ctx.json(villain);
        }else{
            ctx.status(404);
        }
    }

    public void handleUpdate(Context ctx){

        Villain submittedVillain = ctx.bodyAsClass(Villain.class);

        boolean updateSuccess = villainService.updateVillainName(submittedVillain.getVillain_name(),
                                                 submittedVillain.getHome_planet());

        if (updateSuccess){
            ctx.status(200);
        }else {
            ctx.status(400);
        }
    }

    public void handleGetAll(Context ctx){
        ctx.status(405);
    }
    public void handleCreate(Context ctx){
        ctx.status(405);
    }
    public void handleDelete(Context ctx){
        ctx.status(405);
    }
}
