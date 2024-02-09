package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm1 {
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
}
