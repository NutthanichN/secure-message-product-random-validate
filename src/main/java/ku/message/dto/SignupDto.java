package ku.message.dto;

import lombok.Data;

@Data
public class SignupDto {

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String role;
}
