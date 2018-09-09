package org.sun.sunmercurycommon.jpa.jpa;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * 类名：AfwJpaRepository  <br />
 *
 * 功能：
 *
 * @author xtwin <br />
 * 创建时间：2016年7月26日 下午3:20:36  <br />
 * @version 2016年7月26日
 */
public interface SunJpaRepository<E, ID extends Serializable> extends JpaRepository<E, ID>
{

}
