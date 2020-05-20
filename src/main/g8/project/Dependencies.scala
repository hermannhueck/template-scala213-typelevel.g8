import sbt._

object Dependencies {

  lazy val collectionCompatVersion = "2.1.6"
  lazy val shapelessVersion        = "2.3.3"
  lazy val fs2Version              = "2.3.0"
  lazy val monixVersion            = "3.2.1"
  lazy val circeVersion            = "0.13.0"
  lazy val http4sVersion           = "0.21.4"
  lazy val doobieVersion           = "0.9.0"
  lazy val quillVersion            = "3.5.1"
  lazy val zioVersion              = "1.0.0-RC19-2"
  lazy val munitVersion            = "0.7.7"
  lazy val scalaCheckVersion       = "1.14.3"

  lazy val collectionCompat   = "org.scala-lang.modules" %% "scala-collection-compat" % collectionCompatVersion
  lazy val shapeless          = "com.chuusai"            %% "shapeless"               % shapelessVersion
  lazy val fs2Core            = "co.fs2"                 %% "fs2-core"                % fs2Version
  lazy val fs2Io              = "co.fs2"                 %% "fs2-io"                  % fs2Version
  lazy val fs2ReactiveStreams = "co.fs2"                 %% "fs2-reactive-streams"    % fs2Version
  lazy val monixEval          = "io.monix"               %% "monix-eval"              % monixVersion
  lazy val circeCore          = "io.circe"               %% "circe-core"              % circeVersion
  lazy val circeParser        = "io.circe"               %% "circe-parser"            % circeVersion
  lazy val circeGeneric       = "io.circe"               %% "circe-generic"           % circeVersion
  lazy val circeGenericExtras = "io.circe"               %% "circe-generic-extras"    % circeVersion
  lazy val circeShapes        = "io.circe"               %% "circe-shapes"            % circeVersion
  lazy val circeOptics        = "io.circe"               %% "circe-optics"            % circeVersion
  lazy val http4sCore         = "org.http4s"             %% "http4s-core"             % http4sVersion
  lazy val http4sDsl          = "org.http4s"             %% "http4s-dsl"              % http4sVersion
  lazy val http4sClient       = "org.http4s"             %% "http4s-client"           % http4sVersion
  lazy val http4sServer       = "org.http4s"             %% "http4s-server"           % http4sVersion
  lazy val http4sCirce        = "org.http4s"             %% "http4s-circe"            % http4sVersion
  lazy val http4sTesting      = "org.http4s"             %% "http4s-testing"          % http4sVersion
  lazy val http4sBlazeServer  = "org.http4s"             %% "http4s-blaze-client"     % http4sVersion
  lazy val http4sBlazeClient  = "org.http4s"             %% "https-blaze-server"      % http4sVersion
  lazy val doobieCore         = "org.tpolecat"           %% "doobie-core"             % doobieVersion
  lazy val doobiePostgres     = "org.tpolecat"           %% "doobie-postgres"         % doobieVersion
  lazy val doobieH2           = "org.tpolecat"           %% "doobie-h2"               % doobieVersion
  lazy val doobieFree         = "org.tpolecat"           %% "doobie-free"             % doobieVersion
  lazy val doobieQuill        = "org.tpolecat"           %% "doobie-quill"            % doobieVersion
  lazy val quillCore          = "io.getquill"            %% "quill-core"              % quillVersion
  lazy val quillSql           = "io.getquill"            %% "quill-sql"               % quillVersion
  lazy val quillJdbc          = "io.getquill"            %% "quill-jdbc"              % quillVersion
  lazy val zio                = "dev.zio"                %% "zio"                     % zioVersion
  lazy val munit              = "org.scalameta"          %% "munit"                   % munitVersion
  lazy val scalaCheck         = "org.scalacheck"         %% "scalacheck"              % scalaCheckVersion

  lazy val kindProjectorVersion    = "0.11.0"
  lazy val betterMonadicForVersion = "0.3.1"

  // https://github.com/typelevel/kind-projector
  lazy val kindProjectorPlugin = compilerPlugin(
    compilerPlugin("org.typelevel" % "kind-projector" % kindProjectorVersion cross CrossVersion.full)
  )
  // https://github.com/oleg-py/better-monadic-for
  lazy val betterMonadicForPlugin = compilerPlugin(
    compilerPlugin("com.olegpy" %% "better-monadic-for" % betterMonadicForVersion)
  )
}
