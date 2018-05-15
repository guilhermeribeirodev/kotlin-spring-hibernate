package com.kotlination.jpapostgresql.bdd

import com.kotlination.jpapostgresql.model.Customer
import com.kotlination.jpapostgresql.model.CustomerId
import com.kotlination.jpapostgresql.service.CustomerService
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest

class CustomerSteps {

    private lateinit var customer: Customer
    @Autowired
    lateinit var repository: CustomerService

    @Given("^a customer with name (.*) and surname (.*) and e-mail (.*)$")
    fun aCustomerWithNameGuiAndSurnameRibAndEMailGuiRibCom(name: String, surname: String, email: String) {
        customer = Customer(CustomerId("gui", lastName = "asd"))
    }

    @When("^user requests to quickly create customer$")
    fun userRequestsToQuicklyCreateCustomer() {
        repository.save(customer)
    }

    @Then("^a customer is created with id = (\\d+)$")
    fun aCustomerIsCreatedWithId(id: Long) {
        assertThat(0, `is`(repository.findOne(id)))
    }

}
