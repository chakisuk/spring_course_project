package kr.bit.mapper;


import kr.bit.beans.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select user_idx from user_table2 where user_id=#{user_id} and user_pw=#{user_pw}")
    User getLoginUser(User loginProBean);


}
