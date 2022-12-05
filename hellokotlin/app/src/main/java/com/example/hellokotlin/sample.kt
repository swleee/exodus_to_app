package com.example.hellokotlin

fun main() {
    helloWorld()
    println(add( 4, 5))
    hi()

    // 3. String Template
    val name = "Sangwon"
    println("my name is ${name}! I made 2000\$ this month")

    checkNum(1)
}

// 함수
fun helloWorld() { // Unit은 void와 같음
    println("Hello World!")
}

// parameter type을 나중에 적기, 블럭 직전에 return type 지정
fun add(a : Int, b : Int) : Int {
    return a + b
}

// 2. val vs var
// val = value
fun hi() {
    val a : Int = 10
    var b : Int = 9
    b = 100
    println(add(a, b))

    var name = "var_sangwon "
    val name2 = "val_name"

    println(name + " " +name2)
}

// 4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if (a > b)
        return a
    else
        return b
}

// kotlin은 삼항연산자가 없고 대신 이렇게 쓸 수 있다
fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int)
{
    when (score) // when은 switch와 비슷한 역할
    {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        // else -> println("I don't know")
    }

    var b : Int = when (score) {
        1 -> 1
        2 -> 2
        else -> 3 // when 이 리턴과 같이 사용될 때에는 else 필수
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 70..90 -> println("You are still good")
        in 10..70 -> println("not good, do better")
        else -> println("badass")
    }
}

// Expression vs Statement

// Expression : Unit 포함 어떤 것을 리턴하는 경우
// Statement : 리턴하지 않는 경우
// 자바와 차이점은, 자바는 void(Unit)를 Statement로 본다는 점, if(when)을 Expression이나 Statement
// 모두로 사용할 수 있다는 점이다.

// 5. Array vs List
// Array : 처음에 크기 지정 (기본적으로 수정 가능)
// List : 1. list : 수정 불가능 / 2. MutableList : 수정 가능

fun array() {
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listof(1,2,3)
    val array2 : Array<Any> = listof(1,2,"m", 11L)

    array[0] = 4 // 수정가능
    // list[0] = 2
    var result : Int = list.get(0)

    // mutableList
    val arrayList : ArrayList<Int> = arrayListof<Int>(1, 2)
    arrayList.add(10)
    arrayList.add(2)





}
