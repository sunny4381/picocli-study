package io.github.sunny4381

import picocli.CommandLine

private fun doMain(option: MainOption) = println("main")
private fun doStatus(option: StatusOption) = println("status")
private fun doCommit(option: CommitOption) = println("commit")

fun main(args: Array<String>) {
    val commandLine = CommandLine(MainOption())
    val result = commandLine.parseArgs(*args)
    val command = if (result.hasSubcommand()) {
        result.subcommand().commandSpec().userObject()
    } else {
        result.commandSpec().userObject()
    }

    println("command = ${command.javaClass}")
    when (command) {
        is MainOption -> doMain(command)
        is StatusOption -> doStatus(command)
        is CommitOption -> doCommit(command)
        else -> throw IllegalArgumentException("unknown command: ${command}")
    }
}
