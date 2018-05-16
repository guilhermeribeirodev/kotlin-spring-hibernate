package com.kotlination.jpapostgresql.model

import javax.persistence.*

@Entity
class Customer(
		@EmbeddedId val customerId: CustomerId? = null) {
	
	private constructor() : this(CustomerId("",""))

	@OneToOne
	val sales : Sale? = null

}