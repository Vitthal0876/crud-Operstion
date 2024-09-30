package com.Dao;

import com.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public int insertStudent(Student s){
        int check=0;
        Connection con=null;
        PreparedStatement pst=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vitthal","root","Vitthal@123");
                String sql="insert into student(name,city,percentage)values(?,?,?)";
                pst=con.prepareCall(sql);
                pst.setString(1,s.getName("hahhh habh"));
                pst.setString(2,s.getCity());
                pst.setDouble(3,s.getPercentage(70.88));
                check= pst.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return check;
    }

}
