package io.github.sunny4381

import picocli.CommandLine

@CommandLine.Command(name = "status")
class StatusOption {
    @CommandLine.ParentCommand
    var main: MainOption? = null

    @CommandLine.Option(names = ["-s", "--short"])
    var short: Boolean = false

    @CommandLine.Option(names = ["--long"])
    var long: Boolean = false

    @CommandLine.Option(names = ["-b", "--branch"])
    var branch: Boolean = false
}
