trivial picocli study
====

# What is picocli

[picocli](http://picocli.info/) is a command line parser which is actively maintained.
See also blow links:

- [picocli vs JCommander](https://github.com/remkop/picocli/wiki/picocli-vs-JCommander)
- [Java Command Line Parsers Comparison](https://github.com/remkop/picocli/wiki/CLI-Comparison)

# About this study

- use [sub command feature](http://picocli.info/#_subcommands).
- use [@ParentCommand annotation](http://picocli.info/#__code_parentcommand_code_annotation) to hold common options defined in parent class.
- use kotlin type safe cast to determin which commands is specified.
