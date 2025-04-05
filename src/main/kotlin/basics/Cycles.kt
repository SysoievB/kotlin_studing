package basics

fun main() {
    //for
    for (i in 1..10) {
        print(i.toString() + " ")
    }

    //while
    println("\nwhile")
    var i = 10
    while(i > 0){
        println(i*i)
        i--;
    }

    //do-while
    println("do-while")
    var p = -1
    do{
        println(p*p)
        p--;
    }
    while(p > 0)

    //continue && break
    println("continue")
    for (i in 1..6) {
        if (i == 3) continue;
        println(i * i)
    }

    println("break")
    for (i in 1..6) {
        if (i == 3) break;
        println(i * i)
    }
}