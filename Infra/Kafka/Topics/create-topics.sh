#!/bin/bash

BROKER=broker:9092

echo "Creando Kafka Topics"

/opt/kafka/bin/kafka-topics.sh \
--create \
--if-not-exists \
--topic orders-topic \
--bootstrap-server $BROKER \
--partitions 3 \
--replication-factor 1

/opt/kafka/bin/kafka-topics.sh \
--create \
--if-not-exists \
--topic payment-topic \
--bootstrap-server $BROKER \
--partitions 3 \
--replication-factor 1


echo "Topics Creados."