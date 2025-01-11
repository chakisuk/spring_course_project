package kr.bit.beans;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class User {

    private int user_idx;

    @Pattern(regexp = "[a-zA-Z0-9]*", message = "아이디는 영문자와 숫자만 입력 가능합니다")
    @Size(min = 4, max = 10, message = "아이디는 4자 이상, 10자 이하로 입력해주세요")
    private String user_id;

    @Pattern(regexp = "[a-zA-Z0-9]*", message = "비밀번호는 영문자와 숫자만 입력 가능합니다")
    @Size(min = 4, max = 10, message = "비밀번호는 4자 이상, 10자 이하로 입력해주세요")
    private String user_pw;

    private boolean userLogin;

    public User() {
        this.userLogin=false;  //로그인 여부 -> 로그인 안되어있는 걸로 초기화
    }
}