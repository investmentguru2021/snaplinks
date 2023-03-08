@echo %date% %time%

xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\asset-manifest.json C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\index.html C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\favicon.ico C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\logo192.png C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\logo512.png C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\manifest.json C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\robots.txt C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\static C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static /E
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\videos C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static\videos /E
xcopy /b/v/y  C:\hackathon\ws_ui\snaplink\build\images C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static\images /E


echo 'starting replace'
powershell -Command "(gc C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static\index.html) -replace '/static/', '' | Out-File -encoding ASCII C:\hackathon\ws_java\snaplink\snaplink\src\main\resources\static\index.html"

@echo %date% %time%

