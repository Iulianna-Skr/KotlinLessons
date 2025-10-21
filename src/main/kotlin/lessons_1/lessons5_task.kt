package org.example.lessons_1

fun main() {
    val secondsMinute  = 60;

    val totalSeconds = 108 * secondsMinute;
    val hours = totalSeconds / (secondsMinute * secondsMinute)
    val remainingSeconds = totalSeconds % (secondsMinute * secondsMinute);
    val minutes = remainingSeconds / secondsMinute;
    val seconds = remainingSeconds % secondsMinute;

    println(String.format("Время, проведеное в космосе: %02d:%02d:%02d", hours, minutes, seconds))
}