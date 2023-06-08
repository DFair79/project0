package com.revature.service;

import com.revature.daos.VillainDAO;
import com.revature.daos.VillainDAOInterface;
import com.revature.models.Villain;

public class VillainService {

    private final VillainDAOInterface villDao = new VillainDAO();

    public Villain getVillainById(int id){

        if(id > 0){
            return villDao.getVillainById(id);

            return null;
        }
        public boolean updateVillainName(String villain_name, String home_planet){

        }
    }
}
