package com.revature.daos;


import com.revature.models.SuperCharacter;
import com.revature.models.Villain;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class VillainDAO implements VillainDAOInterface {
    @Override
    public ArrayList<Villain> getAllVillains() {

        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "SELECT * FROM villains";

            Statement s = conn.createStatement();

            ResultSet rs = s.executeQuery(sql);

            ArrayList<Villain> vilist = new ArrayList<>();

            SuperCharacterDAO superDAO = new SuperCharacterDAO();

            while (rs.next()) {

                Villain vc = new Villain(
                        rs.getInt("villain_id"),
                        rs.getString("villain_name"),
                        rs.getString("home_planet")
                );
                vilist.add(vc);
            }
            return vilist;
        } catch (SQLException e){
        System.out.println("Failed to get all villains");
        e.printStackTrace();


        }
        return null;
    }

    @Override
    public Villain insertVillain(Villain villain) {
        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "INSERT INTO villains (villain_name, home_planet, villain_id) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, villain.getVillain_name());
            ps.setString(2, villain.getHome_planet());
            ps.setInt(3, villain.getVillain_id());

            ps.executeUpdate();

            return villain;
        } catch (SQLException e) {
            System.out.println("Insert into villain failed!");
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Villain getVillainById(int villain_id) {
        return null;
    }

    @Override
    public Villain updateVillain(Villain villain) {
        try (Connection conn = ConnectionUtil.getConnection()) {

            String updateSuper = "Update  villains Set character_name=?, home_planet=?,Where villain_id=?";

            PreparedStatement us = conn.prepareStatement(updateSuper);

            us.setString(1, villain.getVillain_name());
            us.setString(2, villain.getHome_planet());

            us.executeUpdate();
            return villain;
        } catch (SQLException e) {
            System.out.println("Update into villain failed!");
            e.printStackTrace();

        }

        return null;

    }
        }





