# Loan Calculator (test assignment)

As part of a test assignment we would like you to clone this project and 
enhance it based on the requirements below. Once the assignment is completed,
send us a single patch file for review (see instructions in the "To create a patch" 
section below). Once we review the changes we will arrange another interview to go 
over and discuss your implementation.

1. Implement the Rule of 78 algorithm on the backend and provide a RESTful 
   end-point that returns the result to the front-end. The suggested 
   location of the endpoint is in the CalculatorController class that might
   also delegate the calculation to the service, but feel free to re-arrange
   the structure of the backend classes the way you feel makes more sense.
2. Create a mechanism that captures any backend exceptions and returns an 
   error wrapped into a JSON object to the front-end. This mechanism should
   potentially be able to capture errors from other RESTful end-points in a
   similar and generic manner.
3. Enhance the frontend Angular-based application (./src/main/frontend) 
   to make a call to the back-end,
   and render the result of the calculation on the page. The user should be
   able to enter all the pieces of information necessary for the calculation
   right on the page. Once the parameters have been entered the user should
   be able to press the Calculate button and the results should be rendered
   in a nice table below the input form.
4. Create a reasonable number of unit tests for both front/back-end code. 
   Feel free to add unit-test libraries of your choice to the project.
5. Ideally, tweak the frontend configuration to allow for separate deployment
   of the frontend (e.g. ng serve) and backend.

Please make sure your coding style is consistent and mimics the style of 
the existing code. Both front-end and back-end code should be easy to read
by other developers, while the UI layout and data presentation is user-friendly.
Any improvements to the project are welcome. 

To clone the project to your local environment:

1. `git clone git@github.com:smartsolutioninc/loan-calculator.git`

To build the project, run:

1. `mvn package`
2. `java -jar target/loan-calc-0.0.1-SNAPSHOT.jar`
3. Go to http://localhost:8080 in the browser

To create a patch:

1. Create and switch to your own branch: `git checkout -b my-implementation`
2. Make and commit your changes (multiple commits are OK)
3. Create a patch file: `git format-patch origin/master --stdout > ../my-implementation.patch`
4. Email us the my-implementation.patch file


Thanks,
Smart Solution dev team

