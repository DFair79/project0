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
                    vDAO.getVillainById(rs.getInt("villain_id"))
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
}
