package com.kotlination.jpapostgresql.repo

import com.kotlination.jpapostgresql.model.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.function.Consumer

@RunWith(SpringRunner::class)
@SpringBootTest
class SaleRepositoryTest {

    @Autowired
    lateinit var repository: SaleRepository

    @Autowired
    lateinit var saleEntity: SaleEntity

    @Test
    fun saveSaleTest() {

        for (i in 1..400){
            val customer = CustomerId("name "+i, "surname "+i)
            repository.save(Sale(product = "prod "+i, customer = customer))
        }


//        val it: Iterable<Sale> = repository.findAll()
//        it.forEach(Consumer<Sale> { x -> print(x) })
//        assertThat(it.count(), `is`(1))

        var sale = saleEntity.find("surname 66") as Sale
        try{
            sale = repository.save(Sale(product = "prod 66", customer = sale.customer))
        }catch (exception: Exception){
            println(exception)
        }

        assertThat(sale.customer.lastName, `is`("surname 66"))

    }



}