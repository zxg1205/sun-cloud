package org.sun.sunuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sun.sunmercurycommon.jpa.api.model.APIResult;
import org.sun.sunuserservice.service.UserService;
import org.sun.sunvenusdata.user.entity.UserInfo;

import java.util.List;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@RestController
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find")
    public APIResult<List<UserInfo>> find()
    {
        List<UserInfo> list = userService.find();
        return APIResult.ok(list);
    }
}
