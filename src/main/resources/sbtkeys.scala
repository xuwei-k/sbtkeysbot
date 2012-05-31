SettingKey[Level.Value]("log-level", "The amount of logging sent to the screen.")
SettingKey[Level.Value]("persist-log-level", "The amount of logging sent to a file for persistence.")
SettingKey[Int]("trace-level", "The amount of a stack trace displayed. -1 to disable, 0 for up to the first sbt frame, or a positive number to set the maximum number of frames shown.")
SettingKey[Int]("persist-trace-level", "The amount of stack trace persisted.")
SettingKey[Boolean]("show-success", "If true, displays a success message after running a command successfully.")
SettingKey[Boolean]("show-timing", "If true, the command success message includes the completion time.")
SettingKey[java.text.DateFormat]("timing-format", "The format used for displaying the completion time.")
SettingKey[ScopedKey[_]> Seq[AbstractLogger]]("extra-loggers", "A function that provides additional loggers for a givenSetting.")
SettingKey[LogManager]("log-manager", "The log manager, which creates Loggers for different contexts.")
SettingKey[Boolean]("log-buffered", "True if logging should be buffered until work completes.")
TaskKey[Load.BuildStructure]("build-structure", "Provides access to the build structure,Settings, and streams manager.")
SettingKey[Load.LoadedBuild]("loaded-build", "Provides access to the loaded project structure.This is the information available beforeSettings are evaluated.")
SettingKey[BuildDependencies]("build-dependencies", "Definitive source of inter-project dependencies for compilation and dependency management.\n\tThis is populated by default by the dependencies declared on Project instances, but may be modified.\n\tThe main restriction is that new builds may not be introduced.")
SettingKey[xsbti.AppConfiguration]("app-configuration", "Provides access to the launched sbt configuration, including the ScalaProvider, Launcher, and GlobalLock.")
SettingKey[ResolvedProject]("this-project", "Provides the current project for the referencing scope.")
SettingKey[ProjectRef]("this-project-ref", "Provides a fully-resolved reference to the current project for the referencing scope.")
SettingKey[Configuration]("configuration", "Provides the current configuration of the referencing scope.")
SettingKey[Seq[Command]]("commands", "Defines commands to be registered when this project or build is the current selected one.")
SettingKey[Unit]("initialize", "A convenienceSetting for performing side-effects during initialization.")
SettingKey[State> State]("on-load", "Transformation to apply to the build state when the build is loaded.")
SettingKey[State> State]("on-unload", "Transformation to apply to the build state when the build is unloaded.")
SettingKey[String]("on-load-message", "Message to display when the project is loaded.")
SettingKey[()> Unit]("on-complete", "Hook to run when task evaluation completes.The type of thisSetting is subject to change, pending the resolution of SI-2915.")
SettingKey[RMap[Task,Result]> RMap[Task,Result]]("on-complete", "Transformation to apply to the final task result map.This may also be used to register hooks to run when task evaluation completes.")
SettingKey[Option[File]]("history", "The location where command line history is persisted.")
SettingKey[State> String]("shell-prompt", "The function that constructs the command prompt from the current build state.")
SettingKey[Watched]("watch", "Continuous execution configuration.")
SettingKey[Int]("poll-interval", "Interval between checks for modified sources by the continuous execution command.")
TaskKey[Seq[File]]("watch-sources", "Defines the sources in this project for continuous execution to watch for changes.")
TaskKey[Seq[File]]("watch-transitive-sources", "Defines the sources in all projects for continuous execution to watch.")
SettingKey[WatchState> String]("watching-message", "The message to show when triggered execution waits for sources to change.")
SettingKey[WatchState> String]("triggered-message", "The message to show before triggered execution executes an action after sources change.")
SettingKey[File]("base-directory", "The base directory.Depending on the scope, this is the base directory for the build, project, configuration, or task.")
SettingKey[File]("target", "Main directory for files generated by the build.")
SettingKey[File]("cross-target", "Main directory for files generated by the build that are cross-built.")
SettingKey[File]("source-directory", "Default directory containing sources.")
SettingKey[File]("source-managed", "Default directory for sources generated by the build.")
SettingKey[File]("scala-source", "Default Scala source directory.")
SettingKey[File]("java-source", "Default Java source directory.")
SettingKey[Seq[File]]("source-directories", "List of all source directories, both managed and unmanaged.")
SettingKey[Seq[File]]("unmanaged-source-directories", "Unmanaged source directories, which contain manually created sources.")
TaskKey[Seq[File]]("unmanaged-sources", "Unmanaged sources, which are manually created.")
SettingKey[Seq[File]]("managed-source-directories", "Managed source directories, which contain sources generated by the build.")
TaskKey[Seq[File]]("managed-sources", "Sources generated by the build.")
TaskKey[Seq[File]]("sources", "All sources, both managed and unmanaged.")
SettingKey[FileFilter]("include-filter", "Filter for including sources and resources files from default directories.")
SettingKey[FileFilter]("exclude-filter", "Filter for excluding sources and resources files from default directories.")
SettingKey[File]("resource-directory", "Default unmanaged resource directory, used for user-defined resources.")
SettingKey[File]("resource-managed", "Default managed resource directory, used when generating resources.")
SettingKey[Seq[File]]("unmanaged-resource-directories", "Unmanaged resource directories, containing resources manually created by the user.")
TaskKey[Seq[File]]("unmanaged-resources", "Unmanaged resources, which are manually created.")
SettingKey[Seq[File]]("managed-resource-directories", "List of managed resource directories.")
TaskKey[Seq[File]]("managed-resources", "Resources generated by the build.")
SettingKey[Seq[File]]("resource-directories", "List of all resource directories, both managed and unmanaged.")
TaskKey[Seq[File]]("resources", "All resource files, both managed and unmanaged.")
SettingKey[File]("cache-directory", "Directory used for caching task data.")
SettingKey[Seq[File]]("clean-files", "The files to recursively delete during a clean.")
SettingKey[Seq[File]]("clean-keep-files", "Files to keep during a clean.")
SettingKey[Boolean]("cross-paths", "If true, enables cross paths, which distinguish output directories for cross-building.")
SettingKey[File]("task-temporary-directory", "Directory used for temporary files for tasks that is deleted after each task execution.")
SettingKey[Seq[Task[Seq[File]]]]("source-generators", "List of tasks that generate sources.")
SettingKey[Seq[Task[Seq[File]]]]("resource-generators", "List of tasks that generate resources.")
SettingKey[Boolean]("auto-compiler-plugins", "If true, enables automatically generating -Xplugin arguments to the compiler based on the classpath for the " + CompilerPlugin.name + " configuration.")
SettingKey[Int]("max-errors", "The maximum number of errors, such as compile errors, to list.")
TaskKey[Seq[String]]("scalac-options", "Options for the Scala compiler.")
SettingKey[Seq[String]]("javac-options", "Options for the Java compiler.")
SettingKey[CompileOrder.Value]("compile-order", "Configures the order in which Java and sources within a single compilation are compiled.Valid values are: JavaThenScala, ScalaThenJava, or Mixed.")
SettingKey[String]("initial-commands", "Initial commands to execute when starting up the Scala interpreter.")
SettingKey[String]("cleanup-commands", "Commands to execute before the Scala interpreter exits.")
TaskKey[Compiler.Inputs]("compile-inputs", "Collects all inputs needed for compilation.")
SettingKey[Option[File]]("scala-home", "If Some, defines the local Scala installation to use for compilation, running, and testing.")
TaskKey[ScalaInstance]("scala-instance", "Defines the Scala instance to use for compilation, running, and testing.")
SettingKey[String]("scala-version", "The version of Scala used for building.")
SettingKey[Seq[String]]("cross-scala-versions", "The versions of Scala used when cross-building.")
SettingKey[ClasspathOptions]("classpath-options", "Configures handling of Scala classpaths.")
TaskKey[Set[String]]("defined-sbt-plugins", "The set of names of Plugin implementations defined by this project.")
SettingKey[Boolean]("sbt-plugin", "If true, enables adding sbt as a dependency and auto-generation of the plugin descriptor file.")
TaskKey[Unit]("clean", "Deletes files produced by the build, such as generated sources, compiled classes, and task caches.")
TaskKey[Unit]("console", "Starts the Scala interpreter with the project classes on the classpath.")
TaskKey[Unit]("console-quick", "Starts the Scala interpreter with the project dependencies on the classpath.", console)
TaskKey[Unit]("console-project", "Starts the Scala interpreter with the sbt and the build definition on the classpath and useful imports.")
TaskKey[Analysis]("compile", "Compiles sources.")
TaskKey[Compiler.Compilers]("compilers", "Defines the Scala and Java compilers to use for compilation.")
TaskKey[Compiler.IncSetup]("inc-compile-setup", "Configurations aspects of incremental compilation.")
TaskKey[DefinesClass]("defines-class", "Internal use: provides a function that determines whether the provided file contains a given class.")
TaskKey[File]("doc", "Generates API documentation.")
TaskKey[Seq[(File,File)]]("copy-resources", "Copies resources to the output directory.")
SettingKey[Aggregation]("aggregate", "Configures task aggregation.")
TaskKey[File]("package-bin", "Produces a main artifact, such as a binary jar.")
TaskKey[File]("package", "Produces the main artifact, such as a binary jar.This is typically an alias for the task that actually does the packaging.")
TaskKey[File]("package-doc", "Produces a documentation artifact, such as a jar containing API documentation.")
TaskKey[File]("package-src", "Produces a source artifact, such as a jar containing sources and resources.")
TaskKey[Seq[PackageOption]]("package-options", "Options for packaging.")
TaskKey[Package.Configuration]("package-configuration", "Collects all inputs needed for packaging.")
SettingKey[File]("artifact-path", "The location of a generated artifact.")
SettingKey[Artifact]("artifact", "Describes an artifact.")
SettingKey[Option[String]]("artifact-classifier", "Sets the classifier used by the default artifact definition.")
SettingKey[(String, ModuleID, Artifact)> String]("artifact-name", "Function that produces the artifact name from its definition.")
TaskKey[Seq[(File,String)]]("mappings", "Defines the mappings from a file to a path, used by packaging, for example.")
TaskKey[Seq[(File,File)]]("file-mappings", "Defines the mappings from a file to a file, used for copying files, for example.")
TaskKey[Option[String]]("select-main-class", "Selects the main class to run.")
TaskKey[Option[String]]("main-class", "Defines the main class for packaging or running.")
InputKey[Unit]("run", "Runs a main class, passing along arguments provided on the command line.")
InputKey[Unit]("run-main", "Runs the main class selected by the first argument, passing the remaining arguments to the main method.")
TaskKey[Seq[String]]("discovered-main-classes", "Auto-detects main classes.")
TaskKey[ScalaRun]("runner", "Implementation used to run a main class.")
SettingKey[Boolean]("trap-exit", "If true, enables exit trapping and thread management for 'run'-like tasks.This is currently only suitable for serially-executed 'run'-like tasks.")
SettingKey[Boolean]("fork", "If true, forks a new JVM when running.If false, runs in the same JVM as the build.")
SettingKey[Option[sbt.OutputStrategy]]("output-strategy", "Selects how to log output when running a main class.")
SettingKey[Boolean]("connect-input", "If true, connects standard input when running a main class forked.")
SettingKey[Option[File]]("java-home", "Selects the Java installation used for compiling and forking.If None, uses the Java installation running the build.")
SettingKey[Seq[String]]("java-options", "Options passed to a new JVM when forking.")
TaskKey[ClassLoader]("test-loader", "Provides the class loader used for testing.")
TaskKey[Map[TestFramework,Framework]]("loaded-test-frameworks", "Loads Framework definitions from the test loader.")
TaskKey[Seq[TestDefinition]]("defined-tests", "Provides the list of defined tests.")
TaskKey[Seq[String]]("defined-test-names", "Provides the set of defined test names.")
TaskKey[Tests.Output]("execute-tests", "Executes all tests, producing a report.")
TaskKey[Unit]("test", "Executes all tests.")
InputKey[Unit]("test-only", "Executes the tests provided as arguments or all tests if no arguments are provided.")
TaskKey[Seq[TestOption]]("test-options", "Options for running tests.")
SettingKey[Seq[TestFramework]]("test-frameworks", "Registered, although not necessarily present, test frameworks.")
TaskKey[Seq[TestReportListener]]("test-listeners", "Defines test listeners.")
SettingKey[String]("name", "Project name.")
SettingKey[String]("normalized-name", "Project name transformed from mixed case and spaces to lowercase and dash-separated.")
SettingKey[String]("description", "Project description.")
SettingKey[Option[URL]]("homepage", "Project homepage.")
SettingKey[Option[Int]]("start-year", "Year in which the project started.")
SettingKey[Seq[(String, URL)]]("licenses", "Project licenses as (name, url) pairs.")
SettingKey[String]("organization", "Organization/group ID.")
SettingKey[String]("organization-name", "Organization full/formal name.")
SettingKey[Option[URL]]("organization-homepage", "Organization homepage.")
SettingKey[ModuleInfo]("project-info", "Addition project information like formal name, homepage, licenses etc.")
SettingKey[Option[Configuration]]("default-configuration", "Defines the configuration used when none is specified for a dependency.")
SettingKey[String]("default-configuration-mapping", "Defines the mapping used for a simple, unmapped configuration definition.")
TaskKey[Seq[File]]("products", "Build products that get packaged.")
TaskKey[Seq[File]]("product-directories", "Base directories of build products.")
SettingKey[Boolean]("export-jars", "Determines whether the exported classpath for this project contains classes (false) or a packaged jar (true).")
TaskKey[Classpath]("exported-products", "Build products that go on the exported classpath.")
TaskKey[Classpath]("unmanaged-classpath", "Classpath entries (deep) that are manually managed.")
TaskKey[Classpath]("unmanaged-jars", "Classpath entries for the current project (shallow) that are manually managed.")
TaskKey[Classpath]("managed-classpath", "The classpath consisting of external, managed library dependencies.")
TaskKey[Classpath]("internal-dependency-classpath", "The internal (inter-project) classpath.")
TaskKey[Classpath]("external-dependency-classpath", "The classpath consisting of library dependencies, both managed and unmanaged.")
TaskKey[Classpath]("dependency-classpath", "The classpath consisting of internal and external, managed and unmanaged dependencies.")
TaskKey[Classpath]("full-classpath", "The exported classpath, consisting of build products and unmanaged and managed, internal and external dependencies.")
SettingKey[Configuration> Configuration]("internal-configuration-map", "Maps configurations to the actual configuration used to define the classpath.")
TaskKey[Configuration]("classpath-configuration", "The configuration used to define the classpath.")
TaskKey[IvyConfiguration]("ivy-configuration", "General dependency management (Ivy)Settings, such as the resolvers and paths to use.")
SettingKey[Seq[Configuration]]("ivy-configurations", "The defined configurations for dependency management.This may be different from the configurations for ProjectSettings.")
TaskKey[ModuleSettings]("module-settings", "ModuleSettings, which configure a specific module, such as a project.")
SettingKey[File]("unmanaged-base", "The default directory for manually managed libraries.")
SettingKey[UpdateConfiguration]("update-configuration", "Configuration for resolving and retrieving managed dependencies.")
TaskKey[IvySbt]("ivy-sbt", "Provides the sbt interface to Ivy.")
TaskKey[IvySbt#Module]("ivy-module", "Provides the sbt interface to a configured Ivy module.")
TaskKey[UpdateReport]("update", "Resolves and optionally retrieves dependencies, producing a report.")
TaskKey[Seq[UpdateReport]]("transitive-update", "UpdateReports for the internal dependencies of this project.")
TaskKey[UpdateReport]("update-classifiers", "Resolves and optionally retrieves classified artifacts, such as javadocs and sources, for dependency definitions, transitively.", update)
SettingKey[Seq[String]]("transitive-classifiers", "List of classifiers used for transitively obtaining extra artifacts for sbt or declared dependencies.")
TaskKey[UpdateReport]("update-sbt-classifiers", "Resolves and optionally retrieves classifiers, such as javadocs and sources, for sbt, transitively.", updateClassifiers)
TaskKey[PublishConfiguration]("publish-configuration", "Configuration for publishing to a repository.")
TaskKey[PublishConfiguration]("publish-local-configuration", "Configuration for publishing to the local repository.")
TaskKey[DeliverConfiguration]("deliver-configuration", "Configuration for generating the finished Ivy file for publishing.")
TaskKey[DeliverConfiguration]("deliver-local-configuration", "Configuration for generating the finished Ivy file for local publishing.")
SettingKey[MakePomConfiguration]("make-pom-configuration", "Configuration for generating a pom.")
TaskKey[Map[Artifact,File]]("packaged-artifacts", "Packages all artifacts for publishing and maps the Artifact definition to the generated file.")
SettingKey[Boolean]("publish-maven-style", "Configures whether to generate and publish a pom (true) or Ivy file (false).")
TaskKey[Seq[Credentials]]("credentials", "The credentials to use for updating and publishing.")
TaskKey[File]("make-pom", "Generates a pom for publishing when publishing Maven-style.")
TaskKey[File]("deliver", "Generates the Ivy file for publishing to a repository.")
TaskKey[File]("deliver-local", "Generates the Ivy file for publishing to the local repository.")
TaskKey[Unit]("publish", "Publishes artifacts to a repository.")
TaskKey[Unit]("publish-local", "Publishes artifacts to the local repository.")
SettingKey[NodeSeq]("pom-extra", "Extra XML to insert into the generated POM.")
SettingKey[XNode> XNode]("pom-post-process", "Transforms the generated POM.")
SettingKey[MavenRepository> Boolean]("pom-include-repository", "Selects repositories to include in the generated POM.")
SettingKey[Boolean]("pom-all-repositories", "If true, includes repositories used in module configurations in the pom repositories section.If false, only the common repositories are included.")
SettingKey[String]("module-name", "The name of the current module, used for dependency management.")
SettingKey[String]("version", "The version/revision of the current module.")
SettingKey[Boolean]("is-snapshot", "True if the the version of the project is a snapshot version.")
SettingKey[ModuleID]("module-id", "A dependency management descriptor.This is currently used for associating a ModuleID with a classpath entry.")
SettingKey[ModuleID]("project-id", "The dependency management descriptor for the current module.")
TaskKey[Seq[Resolver]]("external-resolvers", "The external resolvers for automatically managed dependencies.")
SettingKey[Seq[Resolver]]("resolvers", "The user-defined additional resolvers for automatically managed dependencies.")
TaskKey[Resolver]("project-resolver", "Resolver that handles inter-project dependencies.")
TaskKey[Seq[Resolver]]("full-resolvers", "Combines the project resolver, default resolvers, and user-defined resolvers.")
SettingKey[Seq[Resolver]]("other-resolvers", "Resolvers not included in the main resolver chain, such as those in module configurations.")
SettingKey[Seq[ModuleConfiguration]]("module-configurations", "Defines module configurations, which override resolvers on a per-module basis.")
SettingKey[String]("retrieve-pattern", "Pattern used to retrieve managed dependencies to the current build.")
SettingKey[Option[RetrieveConfiguration]]("retrieve-configuration", "Configures retrieving dependencies to the current build.")
SettingKey[Boolean]("offline", "Configures sbt to work without a network connection where possible.")
SettingKey[IvyPaths]("ivy-paths", "Configures paths used by Ivy for dependency management.")
SettingKey[Seq[ModuleID]]("library-dependencies", "Declares managed dependencies.")
TaskKey[Seq[ModuleID]]("all-dependencies", "Inter-project and library dependencies.")
TaskKey[Seq[ModuleID]]("project-dependencies", "Inter-project dependencies.")
SettingKey[NodeSeq]("ivy-xml", "Defines inline Ivy XML for configuring dependency management.")
SettingKey[Option[IvyScala]]("ivy-scala", "Configures how Scala dependencies are checked, filtered, and injected.")
SettingKey[Boolean]("ivy-validate", "Enables/disables Ivy validation of module metadata.")
SettingKey[UpdateLogging.Value]("ivy-logging-level", "The logging level for updating.")
SettingKey[Option[Resolver]]("publish-to", "The resolver to publish to.")
SettingKey[Seq[Artifact]]("artifacts", "The artifact definitions for the current module.Must be consistent with " + packagedArtifacts.key.label + ".")
TaskKey[Map[ModuleRevisionId,ModuleDescriptor]]("project-descriptors", "Project dependency map for the inter-project resolver.")
SettingKey[Boolean]("auto-update", "<unimplemented>")
SettingKey[Boolean]("retrieve-managed", "If true, enables retrieving dependencies to the current build.Otherwise, dependencies are used directly from the cache.")
SettingKey[File]("managed-directory", "Directory to which managed dependencies are retrieved.")
SettingKey[Set[String]]("classpath-types", "Artifact types that are included on the classpath.")
SettingKey[Boolean]("publish-artifact", "Enables (true) or disables (false) publishing an artifact.")
TaskKey[(Artifact, File)]("packaged-artifact", "Generates a packaged artifact, returning the Artifact and the produced File.")
SettingKey[Seq[String]]("checksums", "The list of checksums to generate and to verify for dependencies.")
TaskKey[GetClassifiersModule]("classifiers-module")
SettingKey[ConflictWarning]("conflict-warning", "Configures warnings for conflicts in dependency management.")
SettingKey[Boolean]("auto-scala-library", "Adds a dependency on scala-library if true.")
SettingKey[Resolver]("sbt-resolver", "Provides a resolver for obtaining sbt as a dependency.")
SettingKey[ModuleID]("sbt-dependency", "Provides a definition for declaring the current version of sbt.")
SettingKey[String]("sbt-version", "Provides the version of sbt.ThisSetting should be not be modified.")
TaskKey[Boolean]("skip", "For tasks that support it (currently only 'compile'),Setting skip to true will force the task to not to do its work.This exact semantics may vary by task.")
SettingKey[Boolean]("parallel-execution", "Enables (true) or disables (false) parallel execution of tasks.")
SettingKey[Boolean]("cancelable", "Enables (true) or disables (false) the ability to interrupt task execution with CTRL+C.")
TaskKey[Settings[Scope]]("settings", "Provides access to the project data for the build.")
TaskKey[TaskStreams]("streams", "Provides streams for logging and persisting data.")
SettingKey[ScopedKey[_]]("resolved-scoped", "The ScopedKey for the referencingSetting or task.")
