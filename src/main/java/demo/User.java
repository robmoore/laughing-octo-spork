package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    private @Id String username;
    private String firstname, lastname, email, nationality;
    private String password;

}