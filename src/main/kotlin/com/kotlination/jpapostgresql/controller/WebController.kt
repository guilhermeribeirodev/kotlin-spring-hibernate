package com.kotlination.jpapostgresql.controller

import com.kotlination.jpapostgresql.model.Customer
import com.kotlination.jpapostgresql.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class WebController {

	@Autowired
	lateinit var repository: CustomerService

	@RequestMapping(method = arrayOf(RequestMethod.POST), name = "/save")
	fun save(@RequestBody customer: Customer): String {
		repository.save(customer)
		return "Done"
	}

	@RequestMapping("/findall")
	fun findAll() = repository.findAll()

	@RequestMapping("/findbyid/{id}")
	fun findById(@PathVariable id: Long)
			= repository.findOne(id)

//	@RequestMapping("findbylastname/{lastName}")
//	fun findByLastName(@PathVariable lastName: String)
//			= repository.findByLastName(lastName)
	
}