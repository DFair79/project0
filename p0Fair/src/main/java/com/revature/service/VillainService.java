package com.revature.service;

import com.revature.daos.VillainDAO;
import com.revature.daos.VillainDAOInterface;
import com.revature.models.Villain;

public class VillainService {

    private static final VillainDAOInterface villDao = new VillainDAO();

    public static Villain getVillainById(int villain_id){

        if(villain_id > 0){
            return villDao.getVillainById(villain_id);


        }
        return null;
    }
    public boolean updateVillainName(String villain_name, String home_planet){
        if (home_planet==null ){
            if(villain_name==null){
                return villDao.updateVillainName(null, null);
            }
        }
        return false;

    }


}
