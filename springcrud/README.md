This is a project that CREATES READS UPDATES AND DELETES DATA
Connected to Postgres database locally

And this is the structure for all my springboot projects
Controller ---> handles HTTP requests and responses
DTO ----> Only expose what is needed to APIs
Entity ----> domain models, also called JPA entities
Repository ----> interfaces to talk to the database
service -----> interface, and implementations clean code
mapper ----> converts between entity and DTO (using mapstruct)
exceptions ----> custom exceptions and handlers
config -----> configuration classes, security, CORS
util ------> utility/helper classes