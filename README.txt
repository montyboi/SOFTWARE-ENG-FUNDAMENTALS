Overview
This project simulates an online learning portal where instructors can register courses and managers can address general inquiries. 
The code is structured into classes, each representing a distinct entity or functionality within the system.

Classes:

Main.java

This is the entry point of our application.
It simulates the instructor registering a course and a general inquiry being addressed by the manager.

Course.java-
Represents a course in the learning portal.
Contains the course name and the instructor who registered it.

Instructor.java-
Represents an instructor in the learning portal.
Provides a method to register a course on the learning portal.

LearningPortal.java-
Simulates the online learning portal.
Contains a list of courses registered on the portal.
Provides methods to add courses to the portal.

Enquiry.java-
Represents a general inquiry about the portal.
Contains the query made and the response provided by the manager.

Manager.java-
Represents a manager in the learning portal.
Provides a method to address general inquiries about the portal.

Flow:
An instructor initiates the process of course registration.
The learning portal receives the course details and adds the course to its list.
A general inquiry is made about the portal.
The manager addresses the inquiry and provides a response.

Notes:
The code is kept simple for demonstration purposes. For instance, methods print messages instead of implementing full-fledged functionalities.
The main focus is on object-oriented principles, representing entities as classes, and showcasing interactions using methods.