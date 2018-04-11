@echo off
cls

REM --- BEG MACHINE-DEPENDENT ----
rem set HOME_JAVA=java
set HOME_JAVA=C:\Program Files\Java\jdk1.8.0_144\jre\bin\java
REM --- END MACHINE-DEPENDENT ----

set HOME_JAVA="%HOME_JAVA%"
set ARG_MEMORY=-Xms128m -Xmx256m
set JAR_REQUIRED=.\classes;.\lib\ojdbc6.jar;.\lib\poi-3.15.jar;.\lib\poi-ooxml-3.15.jar;.\lib\poi-ooxml-schemas-3.15.jar;.\lib\xmlbeans-2.6.0.jar;.\commons-collections4-4.1.jar
set MAIN_CLASS=co.gov.mads.sincronizar.SincronizarSIAC

set _CMD_=%HOME_JAVA% %ARG_MEMORY% -classpath %JAR_REQUIRED% %MAIN_CLASS%

@echo %_CMD_%
%_CMD_%
pause