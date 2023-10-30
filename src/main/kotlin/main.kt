import java.awt.Color
import java.io.IOException
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.StringBuilder
import kotlin.jvm.JvmStatic
import kotlin.jvm.Throws

//Extensions to Child & Parent
open class Parent
class Child : Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"


class main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val parent: Parent = Child()
            val child: Child = Child()

            println(parent.foo())
            println(child.foo())

            println(StringUtilKt.Pair("Faiz", "Rehman"))

            val kotlin_object = Kotlin_Object("testing", "kotlin", 10)
            println("User Fname: " + kotlin_object.fname)
            println("User Lname: " + kotlin_object.lname)
            println("User Age: " + kotlin_object.age)

            kotlin_object.age = 23;
            println("new age: " + kotlin_object.age)


            val name = if (args.size > 0) args[0] else "Kotlin"
            println("Hello,$name!")

            println("First ${foo()},Second ${foo()}")

            val mutableList = mutableListOf<String>()
            mutableList.add("faiz")
            mutableList.add("sami")
            mutableList.add("wajid")

            for (s in mutableList) {
                println("name is : $s")
            }

            //   for (s in mutableList.indices){
            //       mutableList.indices.
            //   }

            //  println("max: ${max(12,5)}")
            displayMax(12, 5)

            //    val  ab = mainJava()

            //   println("Ab: $ab")

            println(
                listOf('a', 'b', 'c').joinToString(
                    separator = "", prefix = "(", postfix = ")"
                )
            )

            println(
                listOf(1, 2, 3).joinToString(
                    separator = ".", prefix = "", postfix = ""
                )
            )

            displaySeparator('5', 3)

            println("sum ${sum(1, 2, 4)}")

            val c = getDiscription(Color.ORANGE)
            println(c)


            val mList = mapOf(1 to "one", 2 to "two", 3 to "three")

            val a = "asds";
            val b = "wefwf"
            val c = "jsdygfadjbf"
            println("value of a : $a")

            for (s in mList) {
                println("mlist with key value: $s")
            }

            for ((key, value) in mList) {
                println("key: $key + value $value")
            }

            val lisfoff = listOf("a", "b", "c")

            for ((index, element) in lisfoff.withIndex()) {
                println("Index: $index Value: $element")
            }

            for (i in 1..9) {
                print(i)
            }

            println()

            for (i in 1 until 9) {
                print(i)
            }

            println()

            //iteration with a step
            for (i in 9 downTo 1 step 2) {
                print(i)
            }

            println()

            for (ch in "abc") {
                print(ch + 1)
            }

            println()

            println("${isLetter('q')}")
            println("${isLetter('*')}")

            // c in 'a'..'z'
            // 'a' <==c && c<='z'

            println("${recognize('$')}")

            println("Kotlin" in "Java".."Scala")
            println("Kotlin" in setOf("Java", "Scala"))

            // comparing Strings

            // "ball" in "a".."k"
            // "a" <= "ball" && "ball" <= "k"
            // "a".compareTo("ball") <= 0 && "ball".compareTo("k") <=0

            // throw is an expression
//            val number = 500
//            val percentage =
//                if (number in 0..100)
//                    number
//                else
//                    throw IllegalArgumentException("A percentage value must be" + " between 0 and 100: $number")
//
//
//            println("$percentage")

            //Extension Function
            val str = ""
            fun String.lastChar() = this.get(this.length - 1)
            // this can be omitted
//            fun String.lastChar() = this.get(this.length - 1)
            val ch: Char = "abc".lastChar()

            println(ch)

            val String = String().repeat(1)


            fun String.repeat(n: Int): String {
                val sb = StringBuilder(n * length)
                for (i in 1..n) {
                    sb.append(this)
                }
                return sb.toString()
            }


            val list = listOf("a", "b", "c")


            // Extension Function with joinToString
            println(listOf("a", "b", "c").joinToString("", "", ""))
//        fun <T> Iterable<T>.joinToString():String


            println('a'.isLetter())
            println('%'.isLetterOrDigit())

            //Formatting Multiline String
            val q = """To code,
                #or not to code?..""".trimMargin(marginPrefix = "#")

            println(q)

            val reges = """\d{2}\.d{2}\.\d{4}""".toRegex()
            reges.matches("15.02.2016")
            reges.matches("15.02.16")



            println(mix(Color.YELLOW, Color.RED))

            val s: String?
            //   val length: Int = if (s != null) s.length else 0

            //  val length: Int = s?.length ?: 0

            val a1: Int? = null
            val b1: Int? = 1
            val c1: Int = 2

            val s1 = (a1 ?: 0) + c1 //2
            val s2 = (b1 ?: 0) + c1 //3
            print("$s1$s2")

//            isFoo1(null)
//            isFoo2(null)
//            isFoo3(null)
//            isFoo4(null)

            val x: Int? = 1
            val y: Int = 2
            val sum = x ?: 0 + y
            println(sum)

        }

//        fun isFoo1(n: Name) = n.value == "foo"
//        fun isFoo2(n: Name?) = n.value == "foo"
//        fun isFoo3(n: Name?) = n != null && n.value == "foo"
//        fun isFoo4(n: Name?) = n?.value == "foo"


        fun ss(asd: String): String {
            return ""
        }


        @Throws(IOException::class)
        fun foo1() {
            throw IOException()
        }

        @Throws(IOException::class)
        fun foo2() {
            throw IOException()
        }

        @Throws(IOException::class)
        fun recognize(c: Char) = when (c) {
            in '0'..'9' -> "It's a digit"
            in 'a'..'Z', in 'A'..'Z' -> "It's a letter!"
            else -> "I don't know..."
            // throw IOException
        }

        fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

        @JvmOverloads
        fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

        fun respondToInput(input: String) = when (input) {
            "y", "yes" -> "I am glad you agree"
            "n", "No" -> "Sorry to hear that"
            else -> "I don't understand you"
        }


        fun displaySeparator(character: Char = '*', size: Int = 10) {
            repeat(size) {
                print(character)
            }
        }

        //   fun max(a:Int,b:Int): Int{
        //       return if(a>b) a else b
        //   }

        fun displayMax(a: Int, b: Int) {
            println("max: ${max(a, b)}")
        }

        fun max(a: Int, b: Int): Int = if (a > b) a else b

        fun updateWeather(degree: Int) {

            val description: String
            val color: Color
            val title: String

            //    val a = if ()
            //  val (description:String, color:Color,title:String) =
            //  val up(description:String,color:Color) =
            when {
                degree > 10 -> {
                    "cold" to Color.BLUE to ""
                }
                degree < 25 -> {
                    description = "mild"
                    color = Color.ORANGE
                    title = ""
                }
                else -> {
                    description = "hot"
                    color = Color.RED
                }
            }
        }

        fun foo(): String {
            println("Calculating foo...")
            return "foo"
        }

        enum class Color {
            BLUE, ORANGE, RED, YELLOW
        }

        fun getDiscription(color: Color): String =
            when (color) {
                Color.BLUE -> "cold"
                Color.ORANGE -> "mild"
                Color.RED -> "hot"
                else -> {
                    ""
                }
            }
            println(parent.foo())
            println(child.foo())
        fun mix(c1: Color, c2: Color) =
            when (setOf(c1, c2)) {
                setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
                setOf(Color.YELLOW, Color.RED) -> Color.BLUE

                else -> throw Exception("Dirty Color")
            }

    }
}