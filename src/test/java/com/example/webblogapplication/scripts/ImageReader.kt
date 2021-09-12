package com.example.webblogapplication.scripts

import java.io.File
import java.io.InputStream
import java.nio.file.Path

fun main(args: Array<String>) {
            var path: Path = Path.of("C:\\Users\\maxim\\Documents\\javatest")
            val inputStream: InputStream = File(path.toString() + "\\bereza.jpg").inputStream()
            val lineList = mutableListOf<String>()
            inputStream.bufferedReader().forEachLine { lineList.add(it) }
            lineList.forEach{println(">  " + it)}
        }
