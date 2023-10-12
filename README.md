# Exercism's Clojure Track

## Project Structure

Clojure exercises in exercism support the two most common tools for dependency management and testing, [leiningen](http://leiningen.org/) and the [Clojure CLI](https://clojure.org/guides/deps_and_cli).

### Running tests using the Clojure CLI

```
$ clj -X:test
```

### Running tests using Leiningen

```
$ lein test

lein test hello-world-test

Ran 3 tests containing 3 assertions.
0 failures, 0 errors.
```

Then submit the exercise using:

```
$ exercism submit src/hello_world.clj
```

For more detailed instructions and learning resources refer [exercism's clojure language page](http://exercism.org/languages/clojure).
