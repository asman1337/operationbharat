package com.b3mgames.operationbharat.backend.service

/*
 * The EmailSubscriptionService class provides business logic for managing email subscriptions.
 * It interacts with the EmailSubscriptionRepository to perform CRUD operations on email subscriptions.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import com.b3mgames.operationbharat.backend.model.EmailSubscription
import com.b3mgames.operationbharat.backend.repository.EmailSubscriptionRepository
import org.springframework.stereotype.Service

@Service
class EmailSubscriptionService(private val repository: EmailSubscriptionRepository) {
    /*
     * Retrieve all email subscriptions.
     */
    fun getAllSubscriptions(): List<EmailSubscription> = repository.findAll()

    /*
     * Create a new email subscription.
     */
    fun createSubscription(subscription: EmailSubscription): EmailSubscription =
        repository.save(subscription)

    /*
     * Retrieve an email subscription by its ID.
     */
    fun getSubscriptionById(subscriptionId: Long): EmailSubscription? =
        repository.findById(subscriptionId).orElse(null)

    /*
     * Delete an email subscription by its ID.
     */
    fun deleteSubscription(subscriptionId: Long) {
        repository.deleteById(subscriptionId)
    }
}
