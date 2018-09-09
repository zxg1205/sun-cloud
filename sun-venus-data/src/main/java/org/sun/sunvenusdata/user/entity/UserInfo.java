package org.sun.sunvenusdata.user.entity;

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
@Entity
@Table(name = "u_user_info")
@DynamicInsert
@DynamicUpdate
@ToString
public class UserInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column
    private String cellphone;

    @Column
    private String email;

    @Column
    private String birthday;

    @Column(name = "gmt_created", updatable = false, insertable = false, columnDefinition = "timestamp NULL DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gmtCreated;

    @Column(name = "gmt_modified", updatable = false, insertable = false, columnDefinition = "timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gmtModified;
}