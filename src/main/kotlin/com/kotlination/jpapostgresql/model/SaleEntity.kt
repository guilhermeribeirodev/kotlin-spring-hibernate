package com.kotlination.jpapostgresql.model

import org.springframework.stereotype.Service
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Service
class SaleEntity{

    @PersistenceContext
    protected var entityManager: EntityManager? = null

    fun find(param: Any): Any? {
        return entityManager!!.
                createNamedQuery("Sale.saleByCostumerLastName").
                setParameter("a",param).
                resultList[0]
    }


}