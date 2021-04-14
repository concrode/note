import com.au.onemodule.JsonDisplay

/**
 * Variable
 * Function
 * Collection (mutable/immutable)
 *
 */

var number : String? = "yt" // Assign null value


fun getGreeting(): String {
    return "hello kotlin"
}

fun getGreetingSingleExpressionFunction(): String = "hello single"
fun getGreetingSingleExpressionFunctionSimple() = "hello single"


fun getGreetingNull(): String? {
    return null
}

// Nothing return
fun sayHello() {
    println(getGreeting())
}

// String Template
fun say(item:String) {
    val msg = "hello $item"
    println(msg)
}

// String Template
fun say2(item:String) = println("hello $item")

// List<String> as an argument in function
// vararg is multiple arguments
fun say3(greeting:String = "default greeting", vararg item:String = arrayOf("default item")) {
    item.forEach {
        println("$greeting $it")
    }
}


fun main() {
    val name : String = "hello" // val can not be reassigned (immutable)
    println(name)

    // Reassign null
    println(number)
    number = null
    println(number)

    var greeting : String? = null
    println(greeting)

    // When expression
   val value =  when (greeting) {
        null -> println("hi")
        else -> println(greeting)
    }
    println(value)

    // if expression
    val value2 = if (greeting != null) greeting else "oo"
    println(value2)

    // Call function
    sayHello()

    // Call function
    say("wo")

    // array
    val interesting = arrayOf("h", "f", "k")
    println(interesting.size)
    println(interesting[0])
    println(interesting.get(1))

    for (i in interesting) {
        println(i)
    }

    // array iterable
    interesting.forEach { interestingThing ->
        println(interestingThing)
    }

    // array iterable2
    interesting.forEach {
        println(it)
    }

    // array
    interesting.forEachIndexed {index, i ->
        println("$i is at index $index")
    }

    // list
    val listTest = listOf("ph", "fl", "ek")
    listTest.forEach {
        println(it)
    }

    // map
    val map = mapOf(1 to "a", 2 to "b")
    map.forEach { key, value -> println("$key -> $value")}

    // Mutable map
    val mapM = mutableMapOf(1 to "tR", 2 to "fW")
    mapM.put(3, "eS")
    mapM.forEach { key, value -> println("$key -> $value")}

    // Call say3
    say3("hell0")
    say3(greeting = "hi", item = arrayOf("eeee"))
    say3("hello", *interesting) // pass array<> to vararg
    say3("hi", "sfs", "fsfs", "fsfs")
    say3()

    // Import module as dependency
    println("Module")
    JsonDisplay.showJson("hello world")



}

