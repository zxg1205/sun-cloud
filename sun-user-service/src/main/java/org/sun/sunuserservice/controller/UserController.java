package org.sun.sunuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sun.sunmercurycommon.jpa.api.model.APIResult;
import org.sun.sunuserservice.service.UserService;
import org.sun.sunvenusdata.user.dto.UserInfoDTO;
import org.sun.sunvenusdata.user.entity.UserInfo;

import java.util.List;

/**
 * @Description: the controller of user
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

    /**
     * Find the result
     * @param dto
     * @return
     */
    @RequestMapping(value = "/find")
    public APIResult<List<UserInfo>> find(@RequestBody UserInfoDTO dto)
    {
        List<UserInfo> list = userService.findAll();
        return APIResult.ok(list);
    }

    @RequestMapping(value = "/add")
    public APIResult<UserInfo> add(@RequestBody UserInfo userInfo)
    {
        userInfo = userService.add(userInfo);
        return APIResult.ok(userInfo);
    }

    @RequestMapping(value = "/update")
    public APIResult<UserInfo> update(@RequestBody UserInfo userInfo)
    {
        userInfo = userService.add(userInfo);
        return APIResult.ok(userInfo);
    }

    @RequestMapping(value = "/delete")
    public APIResult<Integer> delete(@RequestBody UserInfo userInfo)
    {
        int delRet = userService.delete(userInfo);
        return APIResult.ok(delRet);
    }
}
