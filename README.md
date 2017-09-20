# For attendees

If you have the selenium browser bindings in you path use these for the system properties

Windows
System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");

Mac
System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

If you are not sure use these

Windows
System.setProperty("webdriver.chrome.driver", "../driver/chromedriver.exe");

Mac
System.setProperty("webdriver.chrome.driver", "../driver/chromedriver");


# Workshop Setup

from the 7 folder run this command

mvn dependency:copy-dependencies -Dmdep.useRepositoryLayout=true -DoutputDirectory=../lib
