import java.lang.StringBuilder

class StringUtilKt {

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n){
            sb.append(i)
        }
        return sb.toString()
    }

    companion object {
        @JvmStatic
        fun repeat() {

        }
    }


}