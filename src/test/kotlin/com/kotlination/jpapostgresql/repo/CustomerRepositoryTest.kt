package com.kotlination.jpapostgresql.repo

import com.kotlination.jpapostgresql.model.Customer
import com.kotlination.jpapostgresql.model.CustomerId
import com.kotlination.jpapostgresql.service.CustomerService
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Matchers.notNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.function.Consumer

@RunWith(SpringRunner::class)
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    lateinit var service: CustomerService

    @Autowired
    lateinit var repository: CustomerRepository

    @Test
    fun saveCustomerTest() {
        repository.save(Customer(CustomerId( firstName = "asd", lastName = "asd")))
        repository.save(Customer(CustomerId( firstName = "asd2", lastName = "asd2")))
        repository.save(Customer(CustomerId( firstName = "asd3", lastName = "asd3")))
        val it: Iterable<Customer> = repository.findAll()
        it.forEach( Consumer { x -> print(x)  })
        assertThat(it.count(), `is`(3))
    }

    @Test
    fun findCustomerAndLast5Sales() {
        val it: Iterable<Customer> = repository.findAll()
        it.forEach( Consumer { x -> print(x);  assertThat(x.sales, `is`(notNull())) })
    }

}