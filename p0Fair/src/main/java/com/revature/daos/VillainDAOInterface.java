package com.revature.daos;

import com.revature.models.Villain;

import java.util.ArrayList;

public interface VillainDAOInterface {
    ArrayList<Villain>getAllVillains();


    Villain insertVillain(Villain villain);
   Villain getVillainById(int villain_id);

    Villain updateVillain(Villain villain);

    Villain retrieveVillain(Villain getOneVillain);

    Villain deleteVillain(Villain deleteVillain);

//    Villain deleteVillain(Villain villain);



}


