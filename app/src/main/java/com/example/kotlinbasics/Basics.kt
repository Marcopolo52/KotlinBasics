package com.example.kotlinbasics

import java.lang.IllegalArgumentException
import kotlin.properties.Delegates

class Basics {
    fun test1(){

        // constant
        val a: Int
        val e = 127
        // variable
        var boool: Boolean = true
        var d = "sdfss"
        var g = d[0] // string can act as an array
        //every 1000 can be divided by _ for better readability
        //F stands for float, other floating numbers without F
        var c: Float = 12_543_745_364.123_324F
        var s = "\t – tab" + "\n" + /*escape characters*/
                "\b – backspace" + "\n" +
                "\n – new line (LF)" + "\n" +
                "\r – carriage return (CR)" + "\n" +
                "\' – single quotation mark" + "\n" +
                "\" – double quotation mark" + "\n" +
                "\\ – backslash" + "\n" +
                "\$ – dollar sign"

        // TODO: example of "TODO" comment. Can be navigated thru TODO window
        /* multi
        line
        comment */
        /** documentation comment
         * :)
         * XD
         */

        println("variable $d statement ${d.length}") // string interpolation

        if(boool){
            println("if")
        }else if(boool){
            println("else if")
        }else{ println("else") }

        var x: Any = 13.58 // an Object type
        when(x){
            !in 3..7 -> {
                println()
                println()
            }
            3,5,7 -> println()
            in 9 downTo 2 -> println()
            1 until 8 -> println()
            is Double -> println("Int") // IS - to check variable type
            !is Int -> println("Double")
            else -> println()
        }

        while(!true){ } // while loop

        do { } while (!true) // do while loop

        for(i in 1..5){ }
        for(i in 8 downTo 1 step 2 ){ //downTo - backwards, step - delta
            break // exit loop
            continue /* skip iteration */ }


        var nnn : String? = "ffcssdf"
        nnn = null /**!!!!!!!!!!!!!!!!!!!!!!!!nullables!!!!!!!!!!!!!!!!!!!!!!!!!*/
        var len = nnn?.length;
        if(nnn != null){ len = nnn.length }else{ len=228 }
        /**************Elvis operator***************/
        val nnn2 = nnn ?: "default" //assigns if not null, otherwise assigns default value
        /********************/
        nnn?.let { println() /*code block executes if not null*/}


        fun fun1(x: Int, y: Int): Int { return 1 } //function

        class Jumba constructor(hs: Int = 322/*default value*/){
            init { /*initializer, runs when object is created*/ }
            var hs: Int = 0
            constructor(hs: Int, sh: String): this(hs){
                this.hs = hs
            }
        }
        var jumba = Jumba()
        jumba = Jumba(228)
        jumba = Jumba(hs = 1984)
        println("${jumba.hs}")
    }
}

class car(){
    lateinit var owner : String //not recommended uninitialized property
    init { owner = "2432" }

    val BRAND: String = "BMW"
        get(){ return field.lowercase() }

    var SPEED: Int = 111
        get() = field
        private set(valu){ if (valu > 0) field = valu else throw IllegalArgumentException("<0") }
}

/** Data classes */

data class User(
    var id: Int = 228,
    var name: String = "bober"
)

fun zlp() {
    var user1 = User(3222, "etetetre")
    var nam = user1.name
    var ps1 = user1.component1()
    var ps2 = user1.component2()
    /**?the rest expressions works in functions but not in classes?*/
    user1.name = "sfd"
    var user2 = user1.copy(name = "bobra")
    var (id, name) = user2
}

/** Inheritance */

open class Vehicle(val name: String){
    var fg = 2313
    open var RANGE: Double = 0.0
    fun fill(amount: Double){RANGE+=amount}
    open fun fill(amount: Int){RANGE+=amount}
}

open class Car (name: String, val brand: String): Vehicle(name){
    override var RANGE: Double
        get() = super.RANGE
        set(value) {super.RANGE += value}
    override fun fill(amount: Int) {
        super.fill(amount); println()
    }
}
class sdggsdsdfsd(name: String, brand: String) : Car(name, brand){}

/** Interface */
/** Can't be instantiated, can only be inherited
 * no constructors
 * multiple interfaces can be inherited by one class
 * can't hold values in variables */

interface Drive{
    val ms: Double
    fun dr(): String{
        TODO("suck")
    }
}

class EV(name: String, brand: String) : Drive, Car(name, brand){
    override val ms: Double
        get() = super.RANGE/2

    override fun dr(): String {

        TODO("Not yet implemented")
    }
}

/** Abstract
 * Can't be instantiated, can only be inherited
 * has a constructor
 * only one abstract_class/class can be inherited by a class  */

abstract class Mamal(private val name: String){
    abstract var SPEED: Int
    abstract fun run()
    var gdfgd: Int = 0
    fun dfsdf(){ println() }
}

class Bobar(val name:String): Mamal(name){
    override var SPEED: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun run() {
        TODO("Not yet implemented")
    }
}


/** Smart cast */

/** Safe cast */
val abc: Any = 123
// val dfgd:String = abc as String  // will crush
/** Unsafe cast */
val dc: Any = 123
val fgd:String? = dc as? String // will work


/** List */

val stringList: List<String> = listOf("dfssf", "sdfgsdf", "sdfs")
val mixedTypeList1: List<Any> = listOf<Any>("dfssf", 228, 'F', 3,22f)

fun dfg(){
    for(value in mixedTypeList1){
        if(value is String){ println(value) }
    }
}