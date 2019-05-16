package com.listview.myapplication;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class FabricaConexao extends AsyncTask {

    Connection con = null;

    @Override

    protected  Object doInBackground(Object[] objects){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcliente","root","1234567");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  con;
    }


}
