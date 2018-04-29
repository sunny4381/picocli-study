package io.github.sunny4381

import picocli.CommandLine

@CommandLine.Command(subcommands = arrayOf(StatusOption::class, CommitOption::class))
class MainOption {
    @CommandLine.Option(names = ["-v", "--verbose"])
    var verbose: Boolean = false
}
