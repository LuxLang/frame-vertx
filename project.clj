(defproject com.github.luxlang/frame-vertx "0.1.0-SNAPSHOT"
  :description "A Vert.x driver for Frame."
  :url "https://github.com/LuxLang/frame-vertx"
  :license {:name "Mozilla Public License (Version 2.0)"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :plugins [[com.github.luxlang/lein-luxc "0.3.0"]]
  :dependencies [[com.github.luxlang/lux-stdlib "0.4.0"]
                 [com.github.luxlang/frame "0.1.0-SNAPSHOT"]
                 [io.vertx/vertx-web "3.2.0"]]
  :source-paths ["source"]
  :repositories [["snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]
                 ["releases" "https://oss.sonatype.org/service/local/staging/deploy/maven2/"]]
  :deploy-repositories [["releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
                                     :creds :gpg}]
                        ["snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/"
                                      :creds :gpg}]]
  :pom-addition [:developers [:developer {:id "eduardoejp"}
                              [:name "Eduardo Julian"]
                              [:url "https://github.com/eduardoejp"]]]
  )
