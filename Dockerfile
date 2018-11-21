FROM java:8
ARG version
ARG artifact_id
ENV artifact=${artifact_id}-${version}.jar
COPY target/${artifact} /opt/${artifact}

