@echo off
if not exist lib\mysql-connector-j*.jar (
    echo MySQL Connector/J jar not found.
    echo Put mysql-connector-j jar inside the lib folder first.
    pause
    exit /b 1
)

if not exist out mkdir out
javac -cp "lib\*" -d out src\*.java
if errorlevel 1 (
    echo Compile failed.
    pause
    exit /b 1
)

echo Compile successful.
pause
