
# phone-crawler

## About
This project is a simple endpoint that given a page url, returns all matches of phone numbers with the following formats:

1. (11) 1111-1111
2. (11) 11111-1111
3. (11)1111-1111
4. (11)11111-1111
5. 11 1111-1111
6. 11 11111-1111
7. 11-1111-1111
8. 11-11111-1111
9. 1111-1111
10. 11111-1111


## API

| Endpoint        | Name          | Request Type | Return | Return Code |
|-----------------|---------------|--------------|--------|-------------|
| "/"             | Hello World   | GET          | str    | 200         |
| "/health-check" | Health Check  | GET          | str    | 200         |
| "/page"         | Phone numbers | GET          | json   | 200         |

### Params for /page

| Param name | Param type | is required |
|------------|------------|-------------|
| page-url   | str        | yes         |

### Example

```sh
$  curl http://localhost:2840/page?page-url=www.some.page.com
```

will return if numbers are matched:
```json
{
    phones: [
    "(00) 1234-5678",
    "(00) 12345-6789",
    ]
}
```
 else
 
 ```json
{
    phones: null
}
```
 
### note that
1. Passing no page-url id will get you a 500


## run

You must have [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html ) installed on your machine. To run dev mode you must have [Leiningen](https://leiningen.org/#install ) too.

### With Leiningen
```sh
$ lein deps
$ lein run
```

### With java
```sh
$ java -jar ./executable/phone-crawler-standalone.jar
```


### With Clojure Repl
#### dev mode
```sh
$ lein repl
user=> (require 'phone-crawler.web)
user=>(def server (phone-crawler.web/run-dev))
```

#### run 
```sh
$ lein repl
user=> (require 'phone-crawler.web)
user=>(def server (phone-crawler.web/-main))
```

#### stop server
```sh
user=>(.stop server)
```

Your app should now be running on [localhost:2840](http://localhost:2840/).


