FROM java:8
ARG version
ARG artifact_id
ARG java_opts
ENV artifact=${artifact_id}-${version}.jar
COPY target/${artifact} /opt/${artifact}
ENTRYPOINT java $java_opts -jar /opt/${artifact}

