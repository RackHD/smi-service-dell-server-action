### smi-service-dell-server-action

#### Purpose

A Java Spring Boot Microservice that provides a REST API used to initiate server actions such as power control and blink LED.

A docker container for this service is available at: https://hub.docker.com/r/rackhd/dell-server-action/

Copyright © 2017 Dell Inc. or its subsidiaries.  All Rights Reserved. 

#### Startup

~~~
sudo docker run -p 0.0.0.0:46007:46007 --name dell-server-action -d rackhd/dell-server-action:latest
~~~

#### API Definitions
A Swagger UI is provided by the microservice at http://<<ip>>:46007/swagger-ui.html


#### Licensing
This docker microservice is available under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0.txt). 

Source code for this microservice is available in repositories at https://github.com/RackHD.  

The microservice makes use of dependent Jar libraries that may be covered by other licenses. In order to comply with the requirements of applicable licenses, the source for dependent libraries used by this microservice is available for download at:  https://bintray.com/rackhd/binary/download_file?file_path=smi-service-dell-server-configuration-profile-dependency-sources-devel.zip    

Additionally the binary and source jars for all dependent libraries are available for download on Maven Central.

---
#### Support
Slack Channel: codecommunity.slack.com

