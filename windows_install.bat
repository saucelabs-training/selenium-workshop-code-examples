@echo off
title Setting up your machine for Selenium Testing!

@powershell -NoProfile -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"

choco install firefox -y
choco install googlechrome -y
choco install phantomjs -y
choco install selenium-all-drivers -y
choco install jdk8 -y
choco install maven -y
SETX PATH "%PATH%;C:\tools\selenium"