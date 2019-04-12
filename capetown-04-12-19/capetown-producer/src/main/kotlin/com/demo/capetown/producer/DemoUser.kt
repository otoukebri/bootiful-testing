package com.demo.capetown.producer

import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.*

@Document
class DemoUser(val randomUUID: UUID, val name: String, val now: Instant)