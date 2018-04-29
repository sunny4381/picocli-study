package io.github.sunny4381

import picocli.CommandLine

class MainOption {
//    @CommandLine.Option(names = "-c", description = "create a new archive")
    @CommandLine.Option(names = ["-v", "--verbose"])
    var verbose: Boolean = false
}
