package com.revature.service;

import com.revature.daos.VillainDAO;
import com.revature.daos.VillainDAOInterface;
import com.revature.models.Villain;

import java.util.ArrayList;

public class VillainService {
    private static final VillainDAOInterface villainDAO = new VillainDAO();

    public static ArrayList<Villain>getAllVillains(){
        return villainDAO.getAllVillains();
    }
    public static Villain insertVillain(Villain villain){
        return villainDAO.insertVillain(villain);
    }
    public static Villain updateVillain(Villain villain){
        return villainDAO.updateVillain(villain);
    }

    public static Villain retrieveVillain(Villain getOneVillain) {
        return villainDAO.retrieveVillain(getOneVillain);
    }

    public static Villain deleteVillain(Villain deleteVillain) {
        return villainDAO.deleteVillain(deleteVillain);
    }
}
