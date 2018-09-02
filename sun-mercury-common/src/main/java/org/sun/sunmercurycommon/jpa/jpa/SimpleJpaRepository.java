package org.sun.sunmercurycommon.jpa.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;


public class SimpleJpaRepository<E, ID extends Serializable> extends org.springframework.data.jpa.repository.support.SimpleJpaRepository<E, ID> implements BasicJpaRepository<E, ID>
{
    // 日志记录器
    private static final Logger logger = LoggerFactory.getLogger(SimpleJpaRepository.class);

    // jpa管理器对象
    @PersistenceContext
    private EntityManager entityManager;

    // 实体信息
    private JpaEntityInformation<E, ID> entityInformation;

    public SimpleJpaRepository(JpaEntityInformation<E, ID> entityInformation, EntityManager entityManager)
    {
        super(entityInformation, entityManager);

        this.entityInformation = entityInformation;
        this.entityManager = entityManager;
    }
}