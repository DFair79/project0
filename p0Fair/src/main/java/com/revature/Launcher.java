package com.revature;

import com.revature.daos.VillainDAO;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Launcher {
    public static void main(String[] args) {
        try(Connection conn = ConnectionUtil.getConnection()){
            System.out.println("Connection Successful");
        }
        catch (SQLException e){
            System.out.println("Connection Failed");
        }

    }
}
