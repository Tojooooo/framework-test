@echo off

if exist build-terminal (
    rmdir /s /q build
)

javac -cp lib/framework.jar -d build-terminal src/main/java/mg/tojooooo/frameworktest/Main.java

echo .
echo Compilation finished.
echo .
echo .
echo Running...
echo .

java -cp build-terminal;lib/framework.jar mg.tojooooo.frameworktest.Main

echo .
echo Execution finished.
echo .