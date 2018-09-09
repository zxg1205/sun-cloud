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

    public UserInfo find(UserInfo info)
    {
        if(info == null)
        {
            return null;
        }

        userRepository.findAll();
       return null;
    }

    /**
     * Find user info
     * @return
     */
    public List<UserInfo> findAll()
    {
        return userRepository.findAll();
    }

    public UserInfo add(UserInfo info)
    {
        return userRepository.save(info);
    }

    public UserInfo update(UserInfo info)
    {
        ///return userRepository.;
        return null;
    }

    public int delete(UserInfo info)
    {
         userRepository.delete(info);

         return 1;
    }
}
