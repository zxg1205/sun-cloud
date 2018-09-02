package org.sun.sunmarsapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.sun.sunmercurycommon.jpa.api.model.APIResult;
import org.sun.sunvenusdata.user.entity.UserInfo;

import java.util.List;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@FeignClient(name = "${service.user.name}")
public interface IUserClient
{
    @RequestMapping(value = "/user/find", method = RequestMethod.GET)
    APIResult<List<UserInfo>> find();
}
