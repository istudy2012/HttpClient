package httpclient.socket

import java.net.Socket

class HttpSocket(urlParams: URLParams) {

    private val socket = Socket(urlParams.ip, urlParams.port)

    fun sendData(data: String?) : String? {
        return ""
    }

}