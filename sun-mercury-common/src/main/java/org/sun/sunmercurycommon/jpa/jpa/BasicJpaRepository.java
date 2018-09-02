package org.sun.sunmercurycommon.jpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 类名：AfwJpaRepository  <br />
 * <p>
 * 功能：
 *
 * @author xtwin <br />
 * 创建时间：2016年7月26日 下午3:20:36  <br />
 * @version 2016年7月26日
 */
public interface BasicJpaRepository<E, ID extends Serializable> extends JpaRepository<E, ID>
{

}
