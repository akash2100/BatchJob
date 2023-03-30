package com.example.batchprocessingcsvtodatabase.config;


import com.example.batchprocessingcsvtodatabase.model.User;
import com.example.batchprocessingcsvtodatabase.model.UserInput;
import org.springframework.batch.item.ItemProcessor;

import java.util.UUID;

public class UserProcessor implements ItemProcessor<UserInput, User> {
	
	//Autowired 
	//DynamoDbMapper mapper


    @Override
    public User process(UserInput userInput) throws Exception {

        User user = User.builder()
                .firstName(userInput.getFirstName())
                .lastName(userInput.getLastName())
                .email(userInput.getEmail())
                .country(userInput.getCountry())
                .build();

        //mapper.save(user)
        
        return user;
    }

  
    
}
