package com.revature.service;

import com.revature.daos.SuperCharacterDAO;
import com.revature.daos.SuperCharacterDAOInterface;
import com.revature.daos.VillainDAO;
import com.revature.daos.VillainDAOInterface;
import com.revature.models.SuperCharacter;
import com.revature.models.Villain;
import io.javalin.http.Context;

import java.util.ArrayList;

public class VillainService {
    private static final VillainDAOInterface villainDAO = new VillainDAO();

    public static ArrayList<Villain>getAllVillains(){
        return villainDAO.getAllVillains();
    }
    public static Villain insertVillain(Villain villain){
        return villainDAO.insertVillain(villain);
    }

}
