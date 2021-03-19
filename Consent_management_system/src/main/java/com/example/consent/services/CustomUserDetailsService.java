package com.example.consent.services;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if(userName.equals("Shruti")){
            return new User("Shruti","1234",new ArrayList<>());
        }
        else{
            throw new UsernameNotFoundException("No User Found with this name");
        }

//        return null;
    }
}
