@echo off

:
::Java编译器路径
set JAVA_COMPILER_PATH=.\protoc.exe
::Java文件生成路径, 最后不要跟“\”符号
set JAVA_TARGET_PATH=D:\code\Java\microIM\access\src\main\java
DIR *.*  /B >LIST.TXT
(for /r %%i in (*.proto) do (
echo.%%i ))>>"proto.txt"

echo "%SOURCE_FOLDER%"
::遍历所有文件
for /f "delims=" %%i in (proto.txt) do (
    ::生成 Java 代码
    echo   %JAVA_COMPILER_PATH%  --proto_path=D:\code\Java\microIM\access\src\main\java\im\micro\access\proto --java_out=%JAVA_TARGET_PATH% %%i
    
     %JAVA_COMPILER_PATH%  --proto_path=D:\code\Java\microIM\access\src\main\java\im\micro\access\proto --java_out=%JAVA_TARGET_PATH% %%i
    
)

echo 协议生成完毕。

pause