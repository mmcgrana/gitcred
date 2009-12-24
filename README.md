GitCred measures the 'cred' of GitHub users by applying the classic PageRank algorithm to the GitHub users/follows graph.

You can find the results of a recent GitCred computation [here](http://cloud.github.com/downloads/mmcgrana/gitcred/results.txt). These values are logarithmically scaled and normalized so that they correspond to the familiar Google PageRank measure.

Implementation Notes
--------------------

GitCred itself is implemented in Clojure. It uses the clojure.contrib.http.agent library to fetch data from the GitHub users API, the FleetDB database to manage and persist this data, and the Jung graph library for PageRank computations.

Building GitCred
----------------

To run the GitCred calculations yourself, you will need Clojure, Clojure Contrib, FleetDB and its dependencies, and Jung2 and its dependencies. The easiest way to get these is with Leiningen:

    $ lein deps

Then to start populating the user/follows FleetDB database, run:

    $ clj bin/fetch.clj /path/to/data.fdb

If the data file does not exist it will be created for you. If it does exist the database will be loaded from it and fetching will continue from there.

Once you have some data in the database, you can generate results with:

    $ clj bin/calc.clj /path/to/data.fdb /path/to/results.txt

