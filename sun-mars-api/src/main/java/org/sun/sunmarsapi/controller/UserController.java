package org.sun.sunmarsapi.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.sun.sunmarsapi.service.UserService;
import org.sun.sunmercurycommon.jpa.api.model.APIResult;
import org.sun.sunvenusdata.user.dto.UserInfoDTO;
import org.sun.sunvenusdata.user.entity.UserInfo;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:34
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "user")
@Slf4j
public class UserController
{
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/find")
    public APIResult<List<UserInfoDTO>> find(HttpServletResponse res)
    {
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");
            res.addHeader("Access-Control-Allow-Methods", "GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE, PATCH");
        res.addHeader("Access-Control-Allow-Headers", "Origin, X-Token, Authentication, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization, Cache-control ");
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");

        return userService.findAll();
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public APIResult<UserInfoDTO> add(HttpServletResponse res, String userName,String cellphone)
    {
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE, PATCH");
        res.addHeader("Access-Control-Allow-Headers", "Origin, X-Token, Authentication, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization, Cache-control ");
        res.addHeader("Access-Control-Allow-Credentials", "true");

        UserInfoDTO dto = new UserInfoDTO();
        dto.setUserName(userName);
        dto.setCellphone(cellphone);
        dto.setId(UUID.randomUUID()+"");

        log.info(JSONObject.toJSONString(dto));
        return userService.add(dto);
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public APIResult<Integer> delete(HttpServletResponse res, String id)
    {
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE, PATCH");
        res.addHeader("Access-Control-Allow-Headers", "Origin, X-Token, Authentication, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization, Cache-control ");
        res.addHeader("Access-Control-Allow-Credentials", "true");
        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(id);

        return userService.delete(dto);
    }

    /**
     *
     * @param res
     * @return
     */
    @RequestMapping(value = "/login")
    public APIResult<UserInfoDTO> login(HttpServletResponse res)
    {
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE, PATCH");
        res.addHeader("Access-Control-Allow-Headers", "Origin, X-Token, Authentication, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization, Cache-control ");
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Origin", "http://192.168.1.139:8000");

        UserInfoDTO dto = new UserInfoDTO();

        return APIResult.ok(dto);
    }
}
