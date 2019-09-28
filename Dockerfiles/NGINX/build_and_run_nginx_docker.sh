docker --tls build -t nginx-image .
docker --tls run -d -p 80:80 --name nginx nginx-image