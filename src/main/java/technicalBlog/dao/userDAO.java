package technicalBlog.dao;

import technicalBlog.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class userDAO {
    public boolean isValidUser(User user)
    {
        Connection con = DriverManager.getConnection(user);

        Statement stmt = con.createStatement();

        String q = "select * from student";

        ResultSet rs = stmt.executeQuery(q);
    }

}
