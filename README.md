# For attendees

Run either the `windows_insall.bat` by double-clicking or the `mac_install.sh` by opening up the folder in a terminal window and typeing `./mac_install.sh`.

### Windows

`System.setProperty("webdriver.chrome.driver", "../driver/chromedriver.exe");`

### Mac

`System.setProperty("webdriver.chrome.driver", "../driver/chromedriver");`

## IF THE INSTALL SCRIPT WORKED

`This is the java code that will need to be in the top of files for the workshop.
### Windows

`System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");`

### Mac

`System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");`

---

# Instructor Workshop Setup

from the 07 folder run this command

`mvn dependency:copy-dependencies -Dmdep.useRepositoryLayout=true -DoutputDirectory=../lib`
