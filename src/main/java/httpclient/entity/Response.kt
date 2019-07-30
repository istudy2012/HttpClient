package httpclient.entity

import java.util.HashMap

class Response {
    var url: String? = null
    private val method: HttpMethod = HttpMethod.GET
    private var headerMap: Map<String, String> = HashMap()

    var statusCode: Int = -1

    var content: String? = ""

    fun getHeader(key: String): String? {
        return headerMap[key]
    }

    fun isSuccess() = statusCode in 200..299

}
