package kr.bit.service;

import kr.bit.beans.User;
import kr.bit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Resource(name = "loginBean") //RootAppContext - 세션영역에 설정한 빈 이름과 같기 때문에 주소값 자동주입 됨!!!!!!!!!!!
    private User loginBean;
    // user_idx = 1
    public void getLoginUser(User loginProBean){
        User loginProBean2 = userDao.getLoginUser(loginProBean);

        if(loginProBean2 != null) {
            loginBean.setUser_idx(loginProBean2.getUser_idx());
            loginBean.setUserLogin(true);

        }
    }
}