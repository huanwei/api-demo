#!/bin/bash

docker run --privileged -d -v /sys/fs/cgroup:/sys/fs/cgroup:ro  -p 8082:8082  huanwei/api-demo-systemd:v1

