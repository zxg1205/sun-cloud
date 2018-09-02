package org.sun.sunvenusdata.user.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

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
    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;
}
