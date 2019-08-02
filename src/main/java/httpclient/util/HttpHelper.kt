package httpclient.util

import httpclient.entity.HttpMethod
import httpclient.entity.Request
import java.lang.StringBuilder

object HttpHelper {

    fun generateRequestData(request: Request): String {
        val sb = StringBuilder()

        when(request.method) {
            HttpMethod.GET -> {

            }
        }

        return ""

    }

}