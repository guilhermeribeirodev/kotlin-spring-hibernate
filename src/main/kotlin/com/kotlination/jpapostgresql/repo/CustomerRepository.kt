package com.kotlination.jpapostgresql.repo

import com.kotlination.jpapostgresql.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {

}