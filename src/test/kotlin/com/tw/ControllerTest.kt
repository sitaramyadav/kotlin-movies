package com.tw

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import org.jboss.logging.Field
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class WelcomeControllerTest {

    @Inject
    @field:Client("/")
    lateinit var client: HttpClient
    @Test
    fun `hello greeting test`() {
       val result: String = client.toBlocking().retrieve("/hello")
    }
}