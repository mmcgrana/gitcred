(defproject gitcred "0.1.0-SNAPSHOT"
  :description "Measures the 'cred' of GitHub users by applying the classic PageRank algorithm to the GitHub users/follows graph."
  :url "http://github.com/mmcgrana/gitcred"
  :source-path "src/clj"
  :dependencies [[org.clojure/clojure "1.1.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.0-SNAPSHOT"]
                 [fleetdb "0.1.0-SNAPSHOT"]
                 [net.sf.jung/jung-api "2.0"]
                 [net.sf.jung/jung-graph-impl "2.0"]
                 [net.sf.jung/jung-algorithms "2.0"]])
