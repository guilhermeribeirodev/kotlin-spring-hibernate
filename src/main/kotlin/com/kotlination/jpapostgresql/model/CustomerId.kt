package com.kotlination.jpapostgresql.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class CustomerId (@Column(unique=true) val firstName: String = "",
                  @Column(unique=true) val lastName: String)  : Serializable
{private constructor() : this("", "")}
