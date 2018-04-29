package io.github.sunny4381

import picocli.CommandLine

fun main(args: Array<String>) {
    val commandLine = CommandLine(MainOption())
    val result = commandLine.parseArgs(*args)
    if (result.hasSubcommand()) {
        val command = result.subcommand().commandSpec().userObject()
        println("command = ${command.javaClass}")
    } else {
        val command = result.commandSpec().userObject()
        println("command = ${command.javaClass}")
    }
}
