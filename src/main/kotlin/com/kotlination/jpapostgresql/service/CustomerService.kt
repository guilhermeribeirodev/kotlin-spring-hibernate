package com.kotlination.jpapostgresql.service

import com.kotlination.jpapostgresql.model.Customer
import com.kotlination.jpapostgresql.model.CustomerId
import com.kotlination.jpapostgresql.repo.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var repository: CustomerRepository

    fun save(customer: Customer): Customer {
        return repository.save(customer)
    }

    fun findAll(): Any {
        return repository.findAll()
    }

    fun findOne(id: Long): Any {
        return repository.findOne(id)
    }

}