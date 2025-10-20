package org.example.lessons_1

fun main() {
    val yearFlight: Int = 1961;
    var numberHour: Int = 9;
    var numberMinute: Int = 7;

    println("Год взлета: " + yearFlight);
    println("Взлет: " + numberHour + ":" + numberMinute);

    numberHour = 10;
    numberMinute = 55;

    println("Посадка: " + numberHour + ":" + numberMinute)
}