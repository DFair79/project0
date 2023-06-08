package com.revature.daos;

import com.revature.models.SuperCharacter;

import java.util.ArrayList;

public interface SuperCharacterDAOInterface {

    ArrayList<SuperCharacter>getAllSuperCharacters();


    SuperCharacter insertSuperCharacter(SuperCharacter sch);
}
