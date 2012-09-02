(defproject calabash-jvm-example "0.1.0-SNAPSHOT"
  :description "A demo of Calabash JVM with Cucumber JVM"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [calabash-jvm "0.0.3"]]


  :plugins [[lein-cucumber "1.0.0"]
            [lein-swank "1.4.4"]]
  :cucumber-feature-paths ["test/features/"])
