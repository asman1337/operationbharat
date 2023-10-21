package com.b3mgames.operationbharat.backend.controller

/*
 * The EmailSubscriptionController class is a RESTful API controller for managing email subscriptions.
 * It handles various endpoints for listing, creating, retrieving, and deleting email subscriptions.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import com.b3mgames.operationbharat.backend.model.EmailSubscription
import com.b3mgames.operationbharat.backend.service.EmailSubscriptionService
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/subscriptions")
class EmailSubscriptionController(private val service: EmailSubscriptionService) {
    /*
     * Endpoint to list all email subscriptions.
     * Only authenticated users can access this endpoint.
     */
    @GetMapping
    @PreAuthorize("isAuthenticated()")
    fun getAllSubscriptions(): List<EmailSubscription> = service.getAllSubscriptions()

    /*
     * Endpoint to create a new email subscription.
     */
    @PostMapping
    fun createSubscription(@RequestBody subscription: EmailSubscription): EmailSubscription = service.createSubscription(subscription)

    /*
     * Endpoint to retrieve an email subscription by its ID.
     * Only authenticated users can access this endpoint.
     */
    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    fun getSubscriptionById(@PathVariable id: Long): EmailSubscription? = service.getSubscriptionById(id)

    /*
     * Endpoint to delete an email subscription by its ID.
     * Only authenticated users can access this endpoint.
     */
    @DeleteMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    fun deleteSubscription(@PathVariable id: Long) {
        service.deleteSubscription(id)
    }
}
