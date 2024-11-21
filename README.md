# kotest-intellij-plugin Android issue

There's a problem running a test from [Gutter Icons](https://kotest.io/docs/intellij/intellij-plugin.html#gutter-icons) on Android Studio.
Running all the tests of a test class works perfectly fine but, running a specific test throws the following exception:

<details>
  <summary>java.lang.NoClassDefFoundError: kotlin/reflect/full/KClasses</summary>

  ```
java.lang.NoClassDefFoundError: kotlin/reflect/full/KClasses
	at io.kotest.mpp.JvmReflection.annotations(reflection.kt:35)
	at io.kotest.mpp.JvmReflection.annotations(reflection.kt:26)
	at io.kotest.engine.concurrency.ConcurrencyKt.isIsolate(concurrency.kt:22)
	at io.kotest.engine.ConcurrentTestSuiteScheduler.schedule(ConcurrentTestSuiteScheduler.kt:41)
	at io.kotest.engine.TestEngine$execute$innerExecute$1.invokeSuspend(TestEngine.kt:65)
	at io.kotest.engine.TestEngine$execute$innerExecute$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$innerExecute$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.TestEngineInitializedInterceptor.intercept(TestEngineInitializedInterceptor.kt:16)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.DumpConfigInterceptor.intercept(DumpConfigInterceptor.kt:21)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.WriteFailuresInterceptor.intercept(WriteFailuresInterceptor.kt:34)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.EmptyTestSuiteInterceptor.intercept(EmptyTestSuiteInterceptor.kt:27)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.ProjectTimeoutEngineInterceptor.intercept(ProjectTimeoutEngineInterceptor.kt:15)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.ProjectListenerEngineInterceptor.intercept(ProjectListenerEngineInterceptor.kt:23)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.ProjectExtensionEngineInterceptor$intercept$initial$1.invokeSuspend(ProjectExtensionEngineInterceptor.kt:22)
	at io.kotest.engine.interceptors.ProjectExtensionEngineInterceptor$intercept$initial$1.invoke(ProjectExtensionEngineInterceptor.kt)
	at io.kotest.engine.interceptors.ProjectExtensionEngineInterceptor$intercept$initial$1.invoke(ProjectExtensionEngineInterceptor.kt)
	at io.kotest.engine.interceptors.ProjectExtensionEngineInterceptor.intercept(ProjectExtensionEngineInterceptor.kt:34)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.SpecSortEngineInterceptor.intercept(SpecSortEngineInterceptor.kt:29)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.TestDslStateInterceptor.intercept(TestDslStateInterceptor.kt:15)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.interceptors.TestEngineStartedFinishedInterceptor.intercept(TestEngineStartedFinishedInterceptor.kt:22)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invokeSuspend(TestEngine.kt:71)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine$execute$execute$1$1.invoke(TestEngine.kt)
	at io.kotest.engine.TestEngine.execute$kotest_framework_engine(TestEngine.kt:77)
	at io.kotest.engine.TestEngineLauncher.async(TestEngineLauncher.kt:244)
	at io.kotest.engine.launcher.MainKt$main$1.invokeSuspend(main.kt:36)
	at io.kotest.engine.launcher.MainKt$main$1.invoke(main.kt)
	at io.kotest.engine.launcher.MainKt$main$1.invoke(main.kt)
	at io.kotest.common.RunBlockingKt$runBlocking$1.invokeSuspend(runBlocking.kt:3)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
	at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:284)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking(Builders.kt:85)
	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(Builders.kt:59)
	at kotlinx.coroutines.BuildersKt.runBlocking(Unknown Source)
	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(Builders.kt:38)
	at kotlinx.coroutines.BuildersKt.runBlocking$default(Unknown Source)
	at io.kotest.common.RunBlockingKt.runBlocking(runBlocking.kt:3)
	at io.kotest.engine.launcher.MainKt.main(main.kt:34)
Caused by: java.lang.ClassNotFoundException: kotlin.reflect.full.KClasses
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(Unknown Source)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	... 66 more

kotlin/reflect/full/KClasses
```
</details>

However, adding this test dependency `testImplementation(kotlin("reflect"))` a new exception is thrown:

<details>
  <summary>java.lang.NoClassDefFoundError: mo/example/kotest/Calculator</summary>

  ```
mo/example/kotest/Calculator
java.lang.NoClassDefFoundError: mo/example/kotest/Calculator
	at mo.example.kotest.CalculatorTest$1$1.invokeSuspend(CalculatorTest.kt:11)
	at mo.example.kotest.CalculatorTest$1$1.invoke(CalculatorTest.kt)
	at mo.example.kotest.CalculatorTest$1$1.invoke(CalculatorTest.kt)
	at io.kotest.core.spec.Spec$beforeTest$2.beforeTest(Spec.kt:365)
	at io.kotest.engine.test.TestExtensions.beforeTestBeforeAnyBeforeContainer-gIAlu-s(TestExtensions.kt:85)
	at io.kotest.engine.test.interceptors.LifecycleInterceptor.intercept(LifecycleInterceptor.kt:47)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invokeSuspend(TestCaseExecutor.kt:100)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.interceptors.TestCaseExtensionInterceptor$intercept$2.invokeSuspend(TestCaseExtensionInterceptor.kt:24)
	at io.kotest.engine.test.interceptors.TestCaseExtensionInterceptor$intercept$2.invoke(TestCaseExtensionInterceptor.kt)
	at io.kotest.engine.test.interceptors.TestCaseExtensionInterceptor$intercept$2.invoke(TestCaseExtensionInterceptor.kt)
	at io.kotest.engine.test.TestExtensions.intercept(TestExtensions.kt:148)
	at io.kotest.engine.test.interceptors.TestCaseExtensionInterceptor.intercept(TestCaseExtensionInterceptor.kt:24)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invokeSuspend(TestCaseExecutor.kt:100)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.interceptors.BeforeSpecListenerInterceptor$intercept$runTest$1$4$1.invokeSuspend(BeforeSpecListenerInterceptor.kt:50)
	at io.kotest.engine.test.interceptors.BeforeSpecListenerInterceptor$intercept$runTest$1$4$1.invoke(BeforeSpecListenerInterceptor.kt)
	at io.kotest.engine.test.interceptors.BeforeSpecListenerInterceptor$intercept$runTest$1$4$1.invoke(BeforeSpecListenerInterceptor.kt)
	at io.kotest.engine.test.interceptors.BeforeSpecListenerInterceptor.intercept(BeforeSpecListenerInterceptor.kt:60)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invokeSuspend(TestCaseExecutor.kt:100)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.interceptors.TestEnabledCheckInterceptor.intercept(TestEnabledCheckInterceptor.kt:31)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invokeSuspend(TestCaseExecutor.kt:100)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.interceptors.CoroutineErrorCollectorInterceptor$intercept$3.invokeSuspend(CoroutineErrorCollectorInterceptor.kt:34)
	at io.kotest.engine.test.interceptors.CoroutineErrorCollectorInterceptor$intercept$3.invoke(CoroutineErrorCollectorInterceptor.kt)
	at io.kotest.engine.test.interceptors.CoroutineErrorCollectorInterceptor$intercept$3.invoke(CoroutineErrorCollectorInterceptor.kt)
	at kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(Undispatched.kt:89)
	at kotlinx.coroutines.BuildersKt__Builders_commonKt.withContext(Builders.common.kt:169)
	at kotlinx.coroutines.BuildersKt.withContext(Unknown Source)
	at io.kotest.engine.test.interceptors.CoroutineErrorCollectorInterceptor.intercept(CoroutineErrorCollectorInterceptor.kt:33)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invokeSuspend(TestCaseExecutor.kt:100)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.TestCaseExecutor$execute$3$1.invoke(TestCaseExecutor.kt)
	at io.kotest.engine.test.interceptors.CoroutineDispatcherFactoryInterceptor$intercept$4.invokeSuspend(coroutineDispatcherFactoryInterceptor.kt:57)
	at io.kotest.engine.test.interceptors.CoroutineDispatcherFactoryInterceptor$intercept$4.invoke(coroutineDispatcherFactoryInterceptor.kt)
	at io.kotest.engine.test.interceptors.CoroutineDispatcherFactoryInterceptor$intercept$4.invoke(coroutineDispatcherFactoryInterceptor.kt)
	at io.kotest.engine.concurrency.FixedThreadCoroutineDispatcherFactory$withDispatcher$4.invokeSuspend(FixedThreadCoroutineDispatcherFactory.kt:59)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)
Caused by: java.lang.ClassNotFoundException: mo.example.kotest.Calculator
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(Unknown Source)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	... 47 more
```
</details>

## Steps to reproduce the error
1. Download Android Studio
2. Clone this repository
3. Open the project with Android Studio
4. Run ExampleTest for all the tests and then use the gutter icon. Everything works fine.
5. Run CalculatorTest for all the tests and then use the gutter icon. Running all the tests works fine. Running from the gutter icon throws the exception.
