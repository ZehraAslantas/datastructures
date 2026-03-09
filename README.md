# Double Hashing Hash Table Project
This project is a Hash Table implementation developed as part of a Data Structures course. It utilizes the Double Hashing method to resolve collisions and is written in Java, adhering to Object-Oriented Programming (OOP) principles.

## About the Project
- A Hash Table is a structure used to optimize data access speed.
- In this project:Primary Hash Function: Takes the modulus of the key according to the table size.
- Secondary Hash Function: Determines the step size in case of a collision. ($stepSize = 5 - (key \pmod 5)$)
- Deletion Process: Deleted items are replaced with a nonItem marker (-1) to ensure the search chain remains unbroken.

### Technologies Used
- Language: Java
- Platform: İntellij İDEA
- Concepts: Data Structures, Double Hashing, OOP
