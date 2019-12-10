#!/bin/bash

if [  -d "/harmonycloud/tmp" ]; then
    mkdir -p /harmonycloud/api-demo
    cp -r  /harmonycloud/bin /harmonycloud/api-demo/
    cp -r  /harmonycloud/tmp/* /harmonycloud/api-demo/
    rm -rf /harmonycloud/tmp
fi

cd /harmonycloud/api-demo
nohup java -jar api.logapi-1.0-SNAPSHOT.jar --spring.config.location=/harmonycloud/api-demo/config/application.properties
sleep 1