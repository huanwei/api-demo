#huanwei/dumb-init:test
FROM centos:7
MAINTAINER Huan Wei<huan@harmonycloud.cn>

RUN echo "nameserver 114.114.114.114" > /etc/resolv.conf

# timezone
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' > /etc/timezone

ADD jdk-8u231-linux-x64.tar.gz /usr/local/

ENV JAVA_HOME /usr/local/jdk1.8.0_231
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV PATH $PATH:$JAVA_HOME/bin

# Add dumb-init
# wget -O /usr/local/bin/dumb-init https://github.com/Yelp/dumb-init/releases/download/v1.2.2/dumb-init_1.2.2_amd64
COPY dumb-init /usr/local/bin/dumb-init
RUN chmod +x /usr/local/bin/dumb-init
ENTRYPOINT ["/usr/local/bin/dumb-init", "--"]


# Add your program
ADD api.logapi-1.0-SNAPSHOT.jar /api.logapi-1.0-SNAPSHOT.jar
ADD start.sh /start.sh
RUN chmod +x /start.sh

# Run your program under Tini
CMD ["java", "-jar", "/api.logapi-1.0-SNAPSHOT.jar"]
#CMD ["/start.sh"]