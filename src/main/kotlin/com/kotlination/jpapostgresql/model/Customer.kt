package com.kotlination.jpapostgresql.model

import javax.persistence.*

@Entity
class Customer(
		@EmbeddedId val customerId: CustomerId? = null) {

	@OneToOne
	val sales : Sale? = null

}