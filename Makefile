PROJECT_NAME=Playground

jar:
	gradle jar

create: jar
	docker build -t app .

run: create
	docker run --name App app

rm-container:
	docker rm App