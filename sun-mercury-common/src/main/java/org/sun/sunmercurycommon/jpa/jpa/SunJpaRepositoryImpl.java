package org.sun.sunmercurycommon.jpa.jpa;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class SunJpaRepositoryImpl<E, ID extends Serializable> extends SimpleJpaRepository<E, ID> implements SunJpaRepository<E, ID>
{
    public SunJpaRepositoryImpl(JpaEntityInformation<E, ?> entityInformation, EntityManager entityManager)
    {
        super(entityInformation, entityManager);
    }
}