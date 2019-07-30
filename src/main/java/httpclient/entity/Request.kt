package httpclient.entity

import java.util.HashMap

class Request {
    var url: String? = null
    var method: HttpMethod = HttpMethod.GET
    private val headerMap = HashMap<String, String>()

    fun addHeader(key: String, value: String) {
        headerMap[key] = value
    }

    fun getHeader(key: String): String? {
        return headerMap[key]
    }

}
