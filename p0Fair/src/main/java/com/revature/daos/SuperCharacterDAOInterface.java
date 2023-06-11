package com.revature.daos;

import com.revature.models.SuperCharacter;

import java.util.ArrayList;

public interface SuperCharacterDAOInterface {

    ArrayList<SuperCharacter>getAllSuperCharacters();


    SuperCharacter insertSuperCharacter(SuperCharacter sch);

    SuperCharacter updateSuperCharacter(SuperCharacter superCharacter);

    SuperCharacter deleteSuperCharacter(SuperCharacter delSuper);

    SuperCharacter retrieveSuperCharacter(SuperCharacter superChar);


//    SuperCharacter retrieveSuperCharacter(SuperCharacter superChar);
}
