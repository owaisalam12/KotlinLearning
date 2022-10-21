import java.lang.StringBuilder

class StringUtilKt {

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n){
            sb.append(i)
        }
        return sb.toString()
    }

    infix fun <A,B>A.to(that:B) = Pair(this,that)

    fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'

    fun Char.isLetterOrDigit() = isLetter() || this in '0'..'9'

//    infix fun<A,B>.to(that:B):Pair<A,B> = Pair<A,B> = Pair(this,that)

    data class Pair<A,B>(val first:A,val second:B){
        override fun toString(): String = "($first,$second)"
    }

    val pair:Pair<Char,Double> = 'a' to 1.0

    companion object {
        @JvmStatic
        fun repeat() {

        }
    }
     companionData object {
        @JvmStaticData
        fun repeat() {
        print('toString')
        }
    }


}