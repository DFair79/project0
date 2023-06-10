package com.revature.service;

import com.revature.daos.SuperCharacterDAO;
import com.revature.daos.SuperCharacterDAOInterface;
import com.revature.models.SuperCharacter;

import java.util.ArrayList;

public class SuperCharacterService {

    private static final SuperCharacterDAOInterface superDAO = new SuperCharacterDAO();

    public static SuperCharacter updateSuperCharacter(SuperCharacter supercharUP) {
        return superDAO.updateSuperCharacter(supercharUP);
    }

    public ArrayList<SuperCharacter>getAllSuperCharacters(){
        return superDAO.getAllSuperCharacters();
    }
    public SuperCharacter insertSuperCharacter(SuperCharacter supercharacter){
        return superDAO.insertSuperCharacter(supercharacter);
    }
//    public SuperCharacter retrieveSuperCharacter(SuperCharacter superChar){
//        return superDAO.retrieveSuperCharacter(superChar);
//    }
    public static SuperCharacter deleteSuperCharacter(SuperCharacter supercharacter){
        return superDAO.deleteSuperCharacter(supercharacter);
    }
}
