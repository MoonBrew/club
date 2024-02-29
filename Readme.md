# Alacrity Problem

The purpose of this test is to assess programming competence. Where possible, implement your solution in your chosen language. If this is not possible, describe your approach to creating the solution.

- You are free to choose which programming language you use to complete the challenge
- You are free to implement your solution in whatever format best showcases your strengths - console apps, mobile apps, GUI apps, web apps etc., are all acceptable
- You may use the internet to look up documentation
- You may not use the internet to get coaching or copy an existing solution

## Part A

Write code that models (in other words, represents) a collection of people (E.g., a club, class, or company). The code you write should be clean, simple, and reusable.

Each person in the set of people has 2 properties:

- A name
- An age

You may initialise the collection with 4 hard coded users:

- Alice, age 20
- Bob, age 25
- Carol, age 30
- Dave, age 35

Your code should calculate and output:

1. The average age
2. The oldest person in the collection
3. The youngest person in the collection

## Part B

Create a user interface - console based or GUI - that presents the data modeled above. If implementing a graphical user interface (such as a mobile app, web application or desktop GUI), you may want to consider an appropriate layout that presents the data in a sensible way. Your solution should include any relevant source files - such as layout XML files, HTML or CSS.

Your application will need to store the data in memory. However, If you choose to use a database to write the data out to permanent storage, remember to include any files necessary to initialise the database (migrations / seeders etc).

Your user interface should consist of 2 types of page:

Page 1 - Details the collection as a whole (I.e., lists all users, and the data listed above in 1 - 3).

Page 2 - Detail page for an individual user.

Extension:

Implement a form to enable a new user - Eve, age 40 to be added to the group. Once added, your code will automatically recalculate & re-generate the output (1-3).

## Feedback

- Can use command pattern. <https://refactoring.guru/design-patterns/command>
- Should avoid using single letters as variable names for more clarity
- Would move more of the printing responsibility to `Printer` class
	- Such as a `printLine()` or `printWelcome()` method?
- Minor Bugs such as 1-indexed array and lack of null checks.