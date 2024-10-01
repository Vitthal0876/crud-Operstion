package org.example;

import com.Dao.StudentDao;
import com.model.Student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        StudentDao sd=new StudentDao();
        Student s2=new Student();

        s2.setName("don");
        s2.setCity("vita");
        s2.setPercentage(50.50);
        Student s3=new Student();
        System.out.println(sd.insertStudent(s2));

        s3.setName("mi");
        s3.setCity("vita");
        s3.setPercentage(50.50);
        System.out.println(sd.insertStudent(s3));

  }
}
