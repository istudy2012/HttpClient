import java.net.URL

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val urlStr = "https://www.baidu.com/?a=1&b=2"
        val url = URL(urlStr)
        println(url)
        println()
        println(url.path)
        println(url.host)

    }

}
