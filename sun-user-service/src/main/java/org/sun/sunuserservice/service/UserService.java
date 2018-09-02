package org.sun.sunuserservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sun.sunuserservice.repository.UserRepository;
import org.sun.sunvenusdata.user.entity.UserInfo;

import java.util.List;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<UserInfo> find()
    {
        UserInfo info =  new UserInfo();
        info.setCellphone("18612983759");
        info.setUserName("11");
        info.setId("1111111111111");
        userRepository.save(info);
        return null;
    }
}
