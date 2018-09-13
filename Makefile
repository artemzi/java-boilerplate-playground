PROJECT_NAME=Playground

jar:
	gradle jar

create: jar
	docker build -t helloworld .

run: create
	docker run --name Hello helloworld

rm-container:
	docker rm Hello