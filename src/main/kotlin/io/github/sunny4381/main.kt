package io.github.sunny4381

import picocli.CommandLine

fun main(args: Array<String>) {
    val option = MainOption()
    CommandLine(option).parse(*args)
    println("verbose=${option.verbose}")
}
