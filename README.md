#WinDevs Server Application

This project aims to expose the Database using Object Relational Mapping Entities with their repositories using Controllers fed by Services.

ORM Entities are the POJO representations of the database structure.

The Controllers expose RESTlike Endpoints for HTTP Requests.

This project's Services work with several Entities to feed the Controllers with high level data.

This project structure was given by the [Spring Initializr](https://start.spring.io) platform.

The project's database was built using IntelliJ's Datasource tools, hasting it's development.

The database uses PostgreSQL due to it's intuitive syntax.

This architecture was chosen because it can sustain both of our planned Client Apps for Mobile and 
still guarantees future development for Desktop (Linux, Windows, MacOS) using the Electron Framework or Browser.

Common security measures was disabled in this MVP, but is easily inserted to build real-life applications. 