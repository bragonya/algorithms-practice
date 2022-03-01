package main.adventofcode

import java.io.File

inline fun <reified T> MutableList<T>.fillWithFile(path: String): List<T> {
    val file = File(path)
    when(T::class) {
        String::class -> file.forEachLine { lines ->
            this.add(lines as T)
        }
        Int::class  ->  file.forEachLine { lines ->
            this.add(lines.toInt() as T)
        }
        Float::class  ->  file.forEachLine { lines ->
            this.add(lines.toFloat() as T)
        }
        Double::class  ->  file.forEachLine { lines ->
            this.add(lines.toDouble() as T)
        }
    }

    return this
}