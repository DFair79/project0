package com.revature.service;

import com.revature.daos.SuperCharacterDAO;
import com.revature.daos.SuperCharacterDAOInterface;
import com.revature.models.SuperCharacter;

import java.util.ArrayList;

public class SuperCharacterService {

    private final SuperCharacterDAOInterface superDAO = new SuperCharacterDAO();

    public ArrayList<SuperCharacter>getAllSuperCharacters(){
        return superDAO.getAllSuperCharacters();
    }
    public SuperCharacter insertSuperCharacter(SuperCharacter supechar){
        return superDAO.insertSuperCharacter(supechar);
    }
}
