@echo off
if not exist lib\mysql-connector-j*.jar (
    echo MySQL Connector/J jar not found.
    echo Put mysql-connector-j jar inside the lib folder first.
    pause
    exit /b 1
)

java -cp "out;lib\*" Main
pause
