package com.revature.daos;

import com.revature.models.SuperCharacter;
import com.revature.utils.ConnectionUtil;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

public class SuperCharacterDAO implements SuperCharacterDAOInterface{

    @Override
    public ArrayList<SuperCharacter> getAllSuperCharacters() {


        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM supercharacters";

            Statement s = conn.createStatement();

            ResultSet rs = s.executeQuery(sql);

            ArrayList<SuperCharacter> sclist = new ArrayList<>();

            VillainDAO vDAO = new VillainDAO();

        while (rs.next()){

            SuperCharacter supcharacter = new SuperCharacter(
                    rs.getInt("character_id"),
                    rs.getString("character_name"),
                    rs.getString("home_planet"),
                    vDAO.getVillainById(rs.getInt("villain_id_fk"))
            );
            sclist.add(supcharacter);
        }
        return sclist;
        }catch (SQLException e){
            System.out.println("Failed to get all supercharacters");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SuperCharacter insertSuperCharacter(SuperCharacter sch) {
        try(Connection conn = ConnectionUtil.getConnection()) {

            String sql = "INSERT INTO supercharacters (character_name, home_planet, villain_id_fk) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sch.getCharacter_name());
            ps.setString(2, sch.getHome_planet());
            ps.setInt(3, sch.getVillain_id_fk());

            ps.executeUpdate();

            return sch;
        }catch (SQLException e){
            System.out.println("Insert into supercharacter failed!");
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public SuperCharacter updateSuperCharacter(SuperCharacter superCharacter) {
        try (Connection conn = ConnectionUtil.getConnection()) {

            String updateSuper = "Update  supercharacters Set character_name=?, home_planet=?, villain_id_fk=? Where character_id=?";

            PreparedStatement us = conn.prepareStatement(updateSuper);

            us.setString(1, superCharacter.getCharacter_name());
            us.setString(2, superCharacter.getHome_planet());
            us.setInt(3, superCharacter.getVillain_id_fk());
            us.setInt(4, superCharacter.getCharacter_id());

            us.executeUpdate();
            return superCharacter;
        } catch (SQLException e) {
            System.out.println("Update into supercharacter failed!");
            e.printStackTrace();

        }

        return null;

    }

    @Override
    public SuperCharacter deleteSuperCharacter(SuperCharacter delSuper) {
        try (Connection conn = ConnectionUtil.getConnection()) {

            String del = "Delete From supercharacters Where character_id=?";

            PreparedStatement delSup = conn.prepareStatement(del);


            delSup.setInt(1,delSuper.getCharacter_id());
            delSup.executeUpdate();
            return delSuper;
        }catch (SQLException e) {
            System.out.println("Delete from supercharacter failed!");
            e.printStackTrace();
        }
            return null;
        }

    @Override
    public SuperCharacter retrieveSuperCharacter(SuperCharacter getOnesuperChar) {
        try (Connection conn = ConnectionUtil.getConnection()){
            String retrSupe = "Select From supercharacters Where character_name=?,home_planet=?";
            PreparedStatement retSup = conn.prepareStatement(retrSupe);

            retSup.setString(1,getOnesuperChar.getCharacter_name());
            retSup.setString(2,getOnesuperChar.getHome_planet());

            retSup.executeUpdate();
            return getOnesuperChar;
        }catch (SQLException e){
            System.out.println("Get one supercharacter failed!");
            e.printStackTrace();
        }
        return null;
    }
}


