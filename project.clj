(defproject com.palletops/hadoop-crate "0.1.0-SNAPSHOT"
  :description "Crate for hadoop installation"
  :url "http://github.com/palletops/hadoop-crate"
  :license {:name "All rights reserved"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.xml "0.0.6"]
                 [org.cloudhoist/pallet "0.8.0-SNAPSHOT"]
                 [org.cloudhoist/java "0.8.0-SNAPSHOT"]]
  :profiles {:dev
             {:dependencies [[org.cloudhoist/pallet-vmfest "0.2.1-SNAPSHOT"]
                             [org.cloudhoist/pallet "0.8.0-SNAPSHOT"
                              :classifier "tests"]
                             [ch.qos.logback/logback-classic "1.0.0"]]}}
  :test-selectors {:default (complement :live-test)
                   :live-test :live-test
                   :all (constantly true)}
  :repositories
  {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
   "sonatype" "https://oss.sonatype.org/content/repositories/releases/"})