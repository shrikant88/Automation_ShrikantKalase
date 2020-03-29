# Gymondo Automation -   Shrikant Kalase 

# Steup
1) Download and Install Android studio and android SDK 

2) Download and Install eclipse IDE - JAVA from https://www.eclipse.org/downloads/ >> 

3) You need to install TestNG in Eclipse IDE >> Open eclipse and click on "help" option >> click on "install new software" >> Add  "TestNG Eclipse - https://dl.bintray.com/testng-team/testng-eclipse-release/" link in work with site text field >> click on Add >> Click on next button >> install TestNG >> restart eclipse. 

4) Downlaod Install Node.JS and get Appium stable version by using "npm install -g appium@1.16" in command prompt. 

5) Download and install the appium desktop server from https://github.com/appium/appium-desktop/releases/tag/v1.15.1 

6) open that appium desktop client server app and just click "Start Server" button (Appium server will start) It is pre-requisite 
condition before any appium test cases run through IDE. 

7) Download and Install allure framework for report generation http://allure.qatools.ru/ from links section.
    Allure setup in your system
    Download allure latest version
    extract the binary file 
    in System PATH variable add allure->bin path -- OR -- 
    extract that folder any drive and during execution you just need to enter that 
    path before "Allure serve" command.

8) Fork the repository to local.

9) Import downloaded "gymondo_Android" maven project folder into the Eclipse IDE. 

# Project Details 

Project build and Manage in Maven.  
Automation tool - Appium (Open source) using Java language.
Test Framework - TestNG (TDD) using POM and Page factory design pattern.
Test Report - Allure Framework (Open source).

A) src/main/java >> 
appiumBase.java class -- This is appium configuration class where user needs to mention appium capabilities according to their device. 
NOTE - Currently, I used android Pixel 3A Emulator with android 10 OS due to common deviceName capability (DeviceID).    

B) src/main/java >>
pageElements.java class -- This is pagefactory element locators class which are inherit to testcase class. which really handy and easy to maintain.

C) src/test/java >>
appTestcases.java class -- This test cases class with testng annotiation in each test methods. 

D) Gymondo_APK folder -- This folder related to application apk which is install on emulator during test execution. folder location already provided in appiumBase.java class in app location capability. 

E) POM.xml -- Maven dependacy xml - I have added appium, seleniium, allure framework(Report) & testNG required dependacies. 

F) testNG.xml -- This testNG test suite xml where you can maintane your test cases and test suite classes and execute it. 


 # Project Execution
 
 1) Make sure appium server should be run in background before executing test cases from IDE. 
 
 2) Open the android emulator device and keep it active before executing the test cases.  
 
 3) Open IDE > open the existing imported "gymondo_Android" maven project. 
 
 4) Please refer the "Project details" section to understand each classes and xml files. 
 
 5) Execution test cases -- 1) You can execute testcase class from testNG.xml >> open testNG.xml >> Right click run as "TestNG suite" 
                           2) You can run test cases from appTestcases.java class as well >> open class >> Right click & run as "TestNG test" 
 
 6) After completing test cases refresh project folder > Allure Report folder will create with containing files.
 
 7) To see the results in allure reports -- 
 
    Step to generated allure report
    run you test cases, allure-report folder with json files and screenshots is created
    open cmd prompt
    run following cmd in 
    cmd prompt "allure serve (path of allure-report folder in project)  

    E.g -- In my case - I have just downloaded zip folder extract it keep it in C drive - after my execution - in cmd >> 
       C:\allure-commandline-2.13.2\allure-2.13.2\bin>allure serve C:\Users\XXXX\eclipse-workspace\gymondo_Android\allure-results


# Reference Links 

1) Appium documentation http://appium.io/docs/en/about-appium/getting-started/index.html 
2) TestNG documentation https://testng.org/doc/documentation-main.html
3) Appium installation video windows OS https://www.youtube.com/watch?v=x-hBpgM5je8&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=3 
4) Appium installation video Mac OS https://www.youtube.com/watch?v=7APcLr-cBM8&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=4
5) Allure Report Generate video https://www.youtube.com/watch?v=5b4ZMAjHitw&t=1401s

