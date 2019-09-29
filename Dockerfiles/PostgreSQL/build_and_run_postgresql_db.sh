docker build -t postgres-suma .
docker run --env-file env_list -p 5432:5432 -d postgres-suma
