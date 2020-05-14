package technicalBlog.dao;

import technicalBlog.model.Post;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class postDAO {

    public ArrayList<Post> getAllPost(){
        ArrayList<Post> list=new ArrayList<>();
        try
        {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/technicalblog";
            String uname = "postgres";
            String pass = "singla70";
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement stmt = con.createStatement();
            String q = "select * from posts";
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next())
            {
                // System.out.println(rs.getInt(1) + " : " + rs.getString(2) + ":" + rs.getDate(3));
                Post post=new Post();
                post.setTitle(rs.getString(2));
                post.setBody(rs.getString(3));
                post.setDate(rs.getDate(4));
                list.add(post);
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return list;
    }
}
