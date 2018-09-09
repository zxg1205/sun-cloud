package org.sun.sunvenusdata.user.dto;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: the table of user
 * @Author: JOHN
 * @CreateDate: 2018/8/11 下午10:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/11 下午10:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
@ToString
public class UserInfoDTO
{
    private String id;

    private String userName;

    private String cellphone;

    private String email;

    private String birthday;

    private Date gmtCreated;

    private Date gmtModified;
}