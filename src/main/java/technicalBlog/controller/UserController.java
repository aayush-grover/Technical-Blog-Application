package technicalBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalBlog.model.User;
//mvc means
//view is for that which is to be shown to the user
// model is that object which contains data of entities
//controler is for routing
@Controller
public class UserController {

    @RequestMapping("users/login")//this is entered by user
    public String login()
    {
        return "users/login";
    }//then login function will be called and users/login html page will be called
    @RequestMapping("users/registeration")
    public String registeration()
    {
        return "users/registeration";
    }
    @RequestMapping(value="users/login", method = RequestMethod.POST)//if we only get request of post method only then we will call this  //  post request is used when we login in our page
    public String loginUser(User user)//we have made user object //this function deals with the data of page
    {
//        boolean name=user.getUsername().equals("abc");
//        boolean pwd=user.getPassword().equals("123");

        boolean flag = postService.isValidUser(user);

        if(flag)
        {
            return "redirect:/posts";
        }
        else
        {
            return "users/login";
        }
    }
}
