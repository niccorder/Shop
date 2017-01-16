# Shop - A Case Study of the Flow of Data
**Note -- This used to be one project, but I split it into two modules since intelliJ was having mad-beef when importing an android + scala + thrift + gradle project... even when using the `Idea` plugin. You can check them out both in this repo, as they are linked as submodules.**

This project takes a look at how data travels from a button press on an android device to a REST-ful micro-service, and then back to the user. It is a simple way for students, or new engineers who sometimes know how each piece of the puzzle functions, but has had trouble placing them together.

Overall, this is an **Android application** where users can buy goods, and the **REST-ful microservice's** intended to scale, and handle ACID manipulation/storage of the produced data.

Helpful Git aliases for working with submodules
    1. Update all submodules to point to their respective origin/head -- `git submodule foreach git pull origin master`
    2. If you havent yet initialized it and its a clean checkout -> `cd Shop && git submodule init --recursive && git submodule update --recursive`

_Please note this is still a WIP, and will constantly be iterated on to implement more functionality on both the 'client', and 'services' spectrum._
