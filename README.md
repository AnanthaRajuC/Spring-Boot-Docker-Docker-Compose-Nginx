# DevOps Homework #

## Context ##
We have a car rental website that randomly displays multiple kinds of cars based on category 
We have 2 microservices and each one corresponds to a category:
	- Sedan
	- Minivan
In services folder we have 2 Spring Boot projects that expose:
	- /cars (list of cars)
	- /actuator/health (health check endpoint)

## Assignment ##

1. Dockerize Sedan and Minivan applications
2. Introduce a (dockerized) load balancer component that will route requests to Sedan and Minivan applications in a round robin fashion only if they are healthy
3. Everything should run on docker-compose and will be tested by calling API on load balancer, shutting down running instances

## Project delivery ##

All configuration files & code should be pushed in your public Git repository(Bitbucket, Github, etc), since you can't push branches on this repository. These are the steps:

You create a public fork of this project on your Bitbucket account [clicking here](https://bitbucket.org/voxloud/devops-hw/fork)
  or you clone it and push to your account if you use other Git platforms (Github, Gitlab, etc)
You commit and push to your fork master branch
You share the (public) repository link with the reviewer when development is completed