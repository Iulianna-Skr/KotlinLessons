package org.example.lessons_1

fun main() {
    val secondsInMinute  = 60;

    val totalSeconds = 108 * secondsInMinute;
    val hours = totalSeconds / (secondsInMinute * secondsInMinute)
    val remainingSeconds = totalSeconds % (secondsInMinute * secondsInMinute);
    val minutes = remainingSeconds / secondsInMinute;
    val seconds = remainingSeconds % secondsInMinute;

    println(String.format("Время, проведеное в космосе: %02d:%02d:%02d", hours, minutes, seconds))
}