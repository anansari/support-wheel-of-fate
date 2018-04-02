# support-wheel-of-fate
This is the java implementation of rota or roster. Well, it's just about scheduling half day shift for 10 employee and make sure no engineer works more than a day in two weeks.

## Setup
- Please make sure java and maven are already installed. Run `java -version` to make sure java is installed. Run `mvn --version` to make sure maven is installed.

> This application was built using `Apache Maven 3.5.2`

- Get the code and go under the directory
```sh
$ git clone https://github.com/anansari/support-wheel-of-fate.git
$ cd support-wheel-of-fate
$ cd api
```
- Install all the dependencies, run the app.
```sh
$ mvn clean install
$ mvn exec:java
```

You should see that that Spark has fired up embedded jetty sever and listening to the following address and port
`Listening on 0.0.0.0:4567`

- Fire up the browser and hit the below URL
`http://127.0.0.1:4567/schedule`

## Running the UI
Please refer to [README.md](swof-ui/README.md)
