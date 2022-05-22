package com.anma

import java.nio.file.Files
import java.nio.file.Path
import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val homeDir = "/home/andrii/docs/"

    val now = LocalDateTime.now()
    for (a in 1..200) {
        val lines = Files.readAllLines(Path.of("${homeDir}file${a}.txt"))
        println("====")
        println(lines)
    }
    println("Time taken -> ${Duration.between(now, LocalDateTime.now()).toMillis()} mls")
}