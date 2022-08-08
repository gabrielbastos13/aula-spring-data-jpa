package com.aula;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aula.model.User;
import com.aula.repository.UserRepository;
import com.aula.service.QuotesConsumer;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    
    @Autowired
    private QuotesConsumer quotesConsumer;
    @Override
    public void run(String... args) throws Exception {
    	 JSONObject jason = new JSONObject(this.quotesConsumer.getQuote());
    			 
    	User user = new User();
        user.setName("GABRIEL G. B.");
        user.setUsername("gabrielgb");
        user.setPassword("gab123");
        user.setQuote(jason.getString("quote"));
        
        repository.save(user);
        
        List<User> users = repository.findByNameContaining("GABRIEL");
        for(User u: users){
            System.out.println(u);
        }
    }
}