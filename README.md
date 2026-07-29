# Ecommerce

An ecommerce web app made with Spring Boot, Microservice architecture, Docker, Kafka, MongoDB, PostgreSQL, Keycloak.

- When working with existing projects, the architecture, infra, utility functions, folder structure and custom scripts were already laid out. In just a few weeks, I need to understand the existing codebase and adapt to my team's working style. This is usually done by reading documentation, ask relevant questions and trial-and-error. Most of the time I just refer to existing code to figure out how to complete my tasks. Everything clicks after some time. It was part of _"learn on the job"_ thing. There's really not much time to explore how the system was built in the first place. I'm curious how everything works under the hood. So I decided to learn it from scratch. Let's dive in.

## Dev Logs

- Each microservice starts with its own config. But managing config for different service can be a hassle. So, spring provides Spring Config dependency to manage multiple services configuration in one service, we can name it `config-server` service. This serive will store all services' config in their own config file, in either `.properties` or `.yaml`. If any config need to change, we only need to change and deploy config service. This change will be immediately picked up by it's respecting service without needing to re-deploy that service. This helps to reduce downtime. Pretty cool.

- We can do HTTP call to other microservice using either `RestTemplate` or `OpenFeign`. OpenFeign provide a simple abstraction to do API call. After the initial configuration, provide the endpoint and create a function to receive the response. Very similar to when making a new API in a Controller. Compared to using RestTemplate, the configuration was verbose. Need to create HttpHeaders, set payload request, set response body, similar to configuring axios client. In my previous company, we used RestTemplate. I always used the existing helper function but never knows how it was actually implemented, and today I learnt it. I also recalled that the helper function used generic type `<T>` for its parameters and return type, making it very reusable. Might try to implement it myself later.

## Reference

[🚀🔥 Mastering Microservices: Spring boot, Spring Cloud and Keycloak In 7 Hours](https://www.youtube.com/watch?v=jdeSV0GRvwI)
