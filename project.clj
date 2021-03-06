(defproject sprint-poker "0.1.3"
  :description "Simple planning poker app."
  :url "https://github.com/tokenshift/sprint-poker"
  :license {:url "https://github.com/tokenshift/sprint-poker/blob/master/LICENSE"}
  :dependencies [[compojure "1.3.2"]
                 [environ "1.0.0"]
                 [org.clojure/algo.generic "0.1.2"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [ring/ring-core "1.3.2"]
                 [ring-server "0.4.0"]]
  :min-lein-version "2.0.0"
  :main sprint-poker.core
  :uberjar-name "sprint-poker-standalone.jar"
  :aot [sprint-poker.core])
