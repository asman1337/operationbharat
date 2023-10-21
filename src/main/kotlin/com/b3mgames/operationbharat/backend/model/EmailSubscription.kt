package com.b3mgames.operationbharat.backend.model

/*
 * The EmailSubscription class represents an entity for email subscriptions.
 * It is mapped to a database table named "email_subscriptions" and contains information
 * about the subscription ID, email address, and the date of subscription.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import java.sql.Timestamp
import jakarta.persistence.*

@Entity
@Table(name = "email_subscriptions")
data class EmailSubscription(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val subscriptionId: Long? = null,

    @Column(name = "email_address", nullable = false)
    val emailAddress: String,

    @Column(name = "subscription_date", nullable = false)
    val subscriptionDate: Timestamp
) {
    /*
     * Default constructor to create an EmailSubscription instance with default values.
     */
    constructor() : this(null, "", Timestamp(System.currentTimeMillis()))
}
