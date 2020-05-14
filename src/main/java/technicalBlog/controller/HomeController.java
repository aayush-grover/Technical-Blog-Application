package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;
import technicalBlog.service.PostService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PostService postservice;
   // @RequestBody  we use this when we have to show string not used to open html pages
   @RequestMapping("/posts")
    public String getAllPosts(Model model)//it acts as a reference , it is used to send data to html page
    {

       //3rd step
        //layout

      //2nd step      //IMPORTANT //what is dependency injection?
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




//        List<Post> list = new ArrayList<>();
//
//        Post p1=new Post();
//        p1.setId(1);
//        p1.setTitle("html");
//        p1.setBody("Java is a programming language");
//        p1.setDate(new Date());
//
//        Post p2=new Post();
//        p2.setId(2);
//        p2.setTitle("html");
//        p2.setBody("Java is a programming language");
//        p2.setDate(new Date());
//
//        Post p3=new Post();
//        p3.setId(3);
//        p3.setTitle("html");
//        p3.setBody("Java is a programming language");
//        p3.setDate(new Date());
//
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//
//        model.addAttribute("posts",list);
//
//        return "index";
    }
}
