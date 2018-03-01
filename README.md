# swagger-jaxrs-angular

* JavaEE8
* Glassfish ver4.1.2

## swagger-codegen template
[templatates](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen/src/main/resources)

## swagger-codegen help

```
java -jar swagger-codegen-cli.jar help generate
java -jar swagger-codegen-cli-3.0.0.jar config-help -l jaxrs-spec
java -jar swagger-codegen-cli-3.0.0.jar config-help -l typescript-angular
```

## Create API

```
java -jar ./swagger/swagger-codegen-cli-3.0.0.jar generate -i ./swagger/swagger.yaml -o ./ -l jaxrs-spec -c ./swagger/api.config.json --model-name-suffix DTO

```

## Create Client

```
java -jar ./swagger/swagger-codegen-cli-3.0.0.jar generate -i ./swagger/swagger.yaml -o ./client/src/app/shared/api-clients -l typescript-angular

```

# Create API Document

```
java -jar ./swagger/swagger2markup-cli-1.3.1.jar convert -c ./swagger/swagger2markup-config.properties -i ./swagger/swagger.yaml -f swagger-jaxrs-angular

asciidoctor -a toc=left swagger-jaxrs-angular.adoc -D ./
```
