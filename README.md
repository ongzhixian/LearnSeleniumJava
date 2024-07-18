# LearnSeleniumJava

Learn Selenium Java on Raspberry Pi 4

## Install
sudo apt-get install openjdk-17-jdk maven chromium-chromedriver


## Running

Install dependencies:

mvn test-compile

Run:

mvn test


mvn exec:java -D"exec.mainClass"="dev.selenium.getting_started.FirstScript" -D"exec.classpathScope"=test
