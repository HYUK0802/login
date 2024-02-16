package hello.login.domain.member.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member2 {

    private Long id;

    @NotEmpty // 비어있으면 안됨
    private String loginId; //로그인 ID
    @NotEmpty
    private String name; //사용자이름
    @NotEmpty
    private String password;
}
