package com.mpkiller.mpback.user;

import com.mpkiller.mpback.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    private UserRepo repo;

    @Autowired
    public UserService(UserRepo userRepo){
        repo = userRepo;
    }

    /**
     * Register for regular user
     * @param email
     * @param password
     * @throws Exception
     */
    public void registerRegularUser(String email, String password) throws Exception{

    }
    /**
     * Throw exception if user existed.
     * @param email
     * @param password
     * @return JWT token
     * @throws Exception if user existed.
     */
    public void registerAdminUser(String email, String password) throws Exception{

    }

    /**
     * Throw exception if password or email is wrong.
     * @param email
     * @param password
     * @return JWT token
     * @throws Exception
     */
    public String authenticate(String email,String password) throws Exception{
        return null;
    }





}
