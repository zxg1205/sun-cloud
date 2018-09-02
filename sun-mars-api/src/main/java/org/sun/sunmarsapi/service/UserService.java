package org.sun.sunmarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sun.sunmercurycommon.jpa.api.model.APIResult;
import org.sun.sunvenusdata.user.entity.UserInfo;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:34
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class UserService
{
    @Autowired
    private  IUserClient userClient;

    public APIResult<List<UserInfo>> findAll()
    {
        return userClient.find();
    }
}
