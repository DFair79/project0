package com.revature.daos;

import com.revature.models.Villain;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VillainDAO implements VillainDAOInterface{


    @Override
    public Villain getVillainById(int id) {

        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM villains WHERE villain_id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                Villain villain = new Villain(
                        rs.getInt("villain_id"),
                        rs.getString("villain_name"),
                        rs.getString("home_planet")

                );
                return villain;
            }
        }catch(SQLException e){
            System.out.println("error getting Villain");
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public boolean updateVillainName(String villain_name, String villain_home) {

        try(Connection conn = ConnectionUtil.getConnection()){


            String sql = "UPDATE villains SET villain_name = ? where villain_home = ?";


            PreparedStatement ps = conn.prepareStatement(sql);

            //using ps.set___() we can fill the wildcard values in
            ps.setString(1,villain_name);
            ps.setString(2, villain_home);


            ps.executeUpdate();

            return true;

        } catch(SQLException e){
            System.out.println("Update failed!!");
            e.printStackTrace();
        }

        return false;
    }


}


