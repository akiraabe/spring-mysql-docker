#!/bin/bash

DIR="/root/.m2"
if [ ! -d $DIR ];then
  cd /root
  mkdir .m2
fi

cp /workspace/src/demo/.m2/settings.xml /root/.m2/settings.xml