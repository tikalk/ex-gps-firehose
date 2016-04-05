
FROM java:8




EXPOSE 6080

# Copy your fat jar to the container
ADD build/distributions/as-gps-firehose-1.0.0.tar.gz /as-gps-firehose

# Launch the verticle
ENV WORKDIR /as-gps-firehose
ENTRYPOINT ["sh", "-c"]
CMD ["cd $WORKDIR ; ./run-bin/gps-firehose.sh"]
