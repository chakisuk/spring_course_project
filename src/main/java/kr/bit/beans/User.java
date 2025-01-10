package kr.bit.beans;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class User {

    private int user_idx;

    @Size(min = 4, max = 10)
    @Pattern(regexp = "[a-zA-Z0-9]*")
    private String user_id;

    @Size(min = 4, max = 10)
    @Pattern(regexp = "[a-zA-Z0-9]*")
    private String user_pw;

}
