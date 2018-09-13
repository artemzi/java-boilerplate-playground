PROJECT_NAME=Playground

create:
	docker build -t helloworld .

start:
	docker run --name Hello helloworld
