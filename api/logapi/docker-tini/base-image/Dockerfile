#huanwei/tini:test
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

# Add Tini
#ENV TINI_VERSION v0.18.0
#Download from https://github.com/krallin/tini/releases/download/${TINI_VERSION}/tini-amd64
COPY tini-amd64 /tini
RUN chmod +x /tini
ENTRYPOINT ["/tini", "-s", "--"]

# Add your program
ADD api.logapi-1.0-SNAPSHOT.jar /api.logapi-1.0-SNAPSHOT.jar
ADD start.sh /start.sh
RUN chmod +x /start.sh

# Run your program under Tini
CMD ["java", "-jar", "/api.logapi-1.0-SNAPSHOT.jar"]
#CMD ["/start.sh"]