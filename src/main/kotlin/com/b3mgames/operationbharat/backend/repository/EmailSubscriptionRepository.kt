package com.b3mgames.operationbharat.backend.repository
/*
 * The EmailSubscriptionRepository interface provides data access methods for the EmailSubscription entity.
 * It extends the JpaRepository interface, which provides basic CRUD operations for the entity.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import com.b3mgames.operationbharat.backend.model.EmailSubscription
import org.springframework.data.jpa.repository.JpaRepository

interface EmailSubscriptionRepository : JpaRepository<EmailSubscription, Long>
