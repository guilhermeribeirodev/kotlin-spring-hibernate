package com.kotlination.jpapostgresql.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface SaleRepository : CrudRepository<Sale, Long>
