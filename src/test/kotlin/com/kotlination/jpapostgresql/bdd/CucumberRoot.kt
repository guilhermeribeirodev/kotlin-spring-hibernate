package com.kotlination.jpapostgresql.bdd

import com.kotlination.jpapostgresql.KotlinSpringJpaPostgresqlApplication
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.beans.factory.annotation.Autowired
import java.util.*
import javax.swing.Spring


@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = arrayOf(KotlinSpringJpaPostgresqlApplication::class))
@ActiveProfiles("INTEGRATION_TEST")
@ContextConfiguration
class CucumberRoot {

    //@Autowired
    var template: TestRestTemplate? = null

    @Before
    fun before() {
        // demo to show how to add custom header Globally for the http request in spring test template , like  user header
//        template!!.restTemplate.interceptors = Collections.singletonList({ request, body, execution ->
//            request.getHeaders()
//                    .add("userHeader", "user")
//            execution.execute(request, body)
//        })
    }

}
