package com.Dao;

import com.model.Student;
import com.util.MyDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public int insertStudent(Student s){
        int check=0;
        Connection con= MyDatabase.myConnection();
        String sql="insert into student(name,city,percentage)values(?,?,?)";
        PreparedStatement pst=null;
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,s.getName());
            pst.setString(2,s.getCity());
            pst.setDouble(3,s.getPercentage());
            check= pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            MyDatabase.closeConnection(pst,con);
        }
        return check;

    }
}




