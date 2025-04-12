package oop

fun main() {
// Car1 instance
    val car1 = Car1()
    car1.move()
    car1.study()
    println("Car1 speed: ${car1.speed}")
    car1.speed = 80
    println("Car1 new speed: ${car1.speed}")
    println()

    // Aircraft instance
    val aircraft = Aircraft()
    aircraft.move()
    aircraft.study()
    println("Aircraft speed: ${aircraft.speed}")
    aircraft.speed = 750
    println("Aircraft new speed: ${aircraft.speed}")
    println()

    // Car2 instance with Movable1 interface
    val car2 = Car2(speed = 100, model = "Tesla Model S", number = "123-XYZ")
    car2.move()
    println("Car2 speed: ${car2.speed}")
    car2.speed = 120
    println("Car2 new speed: ${car2.speed}")
    println("Car2 model: ${car2.model}")
    println("Car2 number: ${car2.number}")
    println()

    // MediaPlayer instance
    val mediaPlayer = MediaPlayer()
    mediaPlayer.play()
}

private interface Movable {
    var speed: Int

    fun move()
}

private interface Student {
    fun study()
}

private interface Movable1 {
    var speed: Int
    val model: String
    val number: String

    fun move()
}

private class Car2(
    override var speed: Int,
    override val model: String,
    override val number: String
) : Movable1 {

    override fun move() {
        println("$model, $number")
    }

}

interface VideoPlayable {
    //default method
    fun play() = println("Play video")
}

interface AudioPlayable {
    //default method
    fun play() = println("Play audio")
}

class MediaPlayer : VideoPlayable, AudioPlayable {

    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play() // вызываем VideoPlayable.play()
        super<AudioPlayable>.play() // вызываем AudioPlayable.play()
    }
}

class Car1 : Movable, Student {
    override var speed = 60

    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }

    override fun study() = println("study")
}

private class Aircraft : Movable, Student {
    override var speed = 600

    override fun move() {
        println("Летим на самолете со скоростью $speed км/ч")
    }

    override fun study() = println("study")
}
