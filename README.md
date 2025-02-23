# Scala Mutable State in Immutable-like Class

This repository demonstrates a potential pitfall in Scala: using mutable state within a class that's designed to appear immutable from the outside.  The example showcases how this can lead to unexpected behavior and potential bugs.

## The Bug
The `MyClass` example, while appearing immutable from its interface, internally uses a mutable `privateVar`. This violates the principle of immutability and can lead to surprising side effects.   Solutions are provided to handle this appropriately.