# play-api-url-versioned
Dummy project with the starting point for an API with versioned end-points through the URL

Important bits reside in the "conf" folder and the extra options added in the "sbt" file.

In this dummy project the following end-points are made available when the Play App is run:

//When no versioned is specified, v2 end-points are hit:

1 GET /                      controllers.v2.Controller.index

2 GET /dummy/$id<[^/]+>      controllers.v2.Controller.dummy(id:String)

//When /v1 is added to the end-point, v1 end-points are hit:

3 GET /v1/dummy/$id<[^/]+>   controllers.v1.Controller.dummy(id:String)

//When /v2 is explicitly specified, v2 end-points are hit:

4 GET /v2/                   controllers.v2.Controller.index

5 GET /v2/dummy/$id<[^/]+>   controllers.v2.Controller.dummy(id:String)
