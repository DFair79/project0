package com.revature.daos;

import com.revature.models.Villain;

public interface VillainDAOInterface {
    Villain getVillainById(int id);

    boolean updateVillainName(String villain_name, String villain_home );

}
