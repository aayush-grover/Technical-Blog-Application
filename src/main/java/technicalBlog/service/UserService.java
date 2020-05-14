package technicalBlog.service;

import technicalBlog.dao.userDAO;
import technicalBlog.model.User;

public class UserService {
    private userDAO userD=new userDAO();
    public boolean isValidUser(User user)
    {
        return userD.isValidUser(user);
    }
}

