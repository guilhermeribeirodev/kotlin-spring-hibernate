package com.kotlination.jpapostgresql.model

import java.io.Serializable
import javax.persistence.*

@NamedQuery(name = "Sale.saleByCostumerLastName", query = "select s from Sale s where s.customer.lastName = :a")
@Entity
class Sale(val product: String,
           @EmbeddedId val customer: CustomerId) : Serializable
{ private constructor() : this("", CustomerId("",""))

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Sale

        if (product != other.product) return false
        if (customer != other.customer) return false

        return true
    }

    override fun hashCode(): Int {
        var result = product.hashCode()
        result = 31 * result + customer.hashCode()
        return result
    }
}