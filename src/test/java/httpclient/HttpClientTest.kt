package httpclient

import httpclient.entity.HttpMethod
import httpclient.entity.Request
import org.junit.Assert.assertEquals
import org.junit.Test

class HttpClientTest {

    @Test
    fun call_test() {
        val request = Request()

        request.url = "127.0.0.1"
        request.method = HttpMethod.GET

        val httpClient = HttpClient()
        val response = httpClient.call(request)

        assertEquals(200, !response.isSuccess())
    }

}
