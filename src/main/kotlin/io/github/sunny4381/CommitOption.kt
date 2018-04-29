package io.github.sunny4381

import picocli.CommandLine

@CommandLine.Command(name = "commit")
class CommitOption {
    @CommandLine.ParentCommand
    var main: MainOption? = null

    @CommandLine.Option(names = ["-a"])
    var all: Boolean = false

    @CommandLine.Option(names = ["-m"])
    var message: String? = null

    @CommandLine.Option(names = ["--allow-empty-message"])
    var allowEmptyMessage: Boolean = false
}
