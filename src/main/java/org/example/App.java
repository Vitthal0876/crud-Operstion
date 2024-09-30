package org.example;

import com.Dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        StudentDao sd=new StudentDao();
        Student s1=new Student();
        s1.getName("hahhh habh");
        s1.setCity("pune");
        s1.getPercentage(70.88);
        System.out.println(sd.insertStudent(s1));
;    }
}
