package technicalBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalBlog.model.Post;
import technicalBlog.repository.PostRepository;

import java.util.List;

/*------
import org.springframework.stereotype.Service;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts()  //here we are using arraylist as return type bcoz we have stored our posts(post objects) in arraylist
    {
        PostService postservice = new PostService();----*/
       //IMPORTANT //what is dependency injection?
    /*
      //dependency injection are of two types
      suppose class food
    pizza p=new pizza();

    void setPizza(pizza p) //setter injection
    {
    this.p=p;
    }
    void eat()
    {
    p.eat();
    }

    Food f=new Food(new pizza); //constructor injection
    f.setPizza( new cheezepiza());
    f.eat();
     */
    /*------
        ArrayList<Post> list = new ArrayList<>();

        Post p1=new Post();
        p1.setId(1);
        p1.setTitle("html");
        p1.setBody("Java is a programming language");
        p1.setDate(new Date());

        Post p2=new Post();
        p2.setId(2);
        p2.setTitle("html");
        p2.setBody("Java is a programming language");
        p2.setDate(new Date());

        Post p3=new Post();
        p3.setId(3);
        p3.setTitle("html");
        p3.setBody("Java is a programming language");
        p3.setDate(new Date());

        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;


    }
}
-----*/

@Service
public class PostService {

    @Autowired
    private  PostRepository repository;
    public List<Post> getAllPost()
    {
        return repository.getAllPost();
    }
    public  Post getOnePost()
    {
        return repository.getLatestPost();
    }
}
