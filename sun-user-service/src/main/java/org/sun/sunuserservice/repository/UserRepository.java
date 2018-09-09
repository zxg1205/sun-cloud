package org.sun.sunuserservice.repository;

import org.sun.sunmercurycommon.jpa.jpa.SunJpaRepository;
import org.sun.sunvenusdata.user.entity.UserInfo;

/**
 * @Description:
 * @Author: JOHN
 * @CreateDate: 2018/9/2 下午2:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/2 下午2:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface UserRepository extends SunJpaRepository<UserInfo, String>
{
}
