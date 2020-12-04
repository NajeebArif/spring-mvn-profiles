# spring-mvn-profiles
A Sample project to active/set spring profiles at maven build phase

Steps 

* First step is to set <profiles> in the pom.xml
* Second enable the content filtering in pom.xml: <resources> tag
* Third is to modify the mvn command with a -P attribute
  * like ``` mvn clean package -Pdev ```
