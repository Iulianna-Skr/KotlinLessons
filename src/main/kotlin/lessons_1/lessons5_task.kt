package org.example.lessons_1

fun main() {
    val totalSeconds: Int = 5409;

    val hours = totalSeconds / 3600;
    val remainingSeconds = totalSeconds % 3600;
    val minutes = remainingSeconds / 60;
    val seconds = remainingSeconds % 60;

    println(String.format("Время, проведеное в космосе: %02d:%02d:%02d", hours, minutes, seconds))
}