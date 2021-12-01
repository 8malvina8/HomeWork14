package com.example.home14

import kotlin.random.Random

open class Person(val age: Int, val height: Int) {
    val id: Int = 0
    val name: String="Dana"
    var marriage: Boolean=false
    var countChild: Int=0
    var work: Boolean = false

   val person1 = Person(randomAgePerson(), randomHeightPerson())
}

fun randomAgePerson():Int{
    return rand(0,85)
    }
fun randomHeightPerson():Int{
    return rand(40,210)
}

fun rand(s: Int, e: Int) = Random.nextInt(s, e + 1)

class Student(pAge:Int ,pHeight:Int):Person(pAge,pHeight){

}