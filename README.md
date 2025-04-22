# 🔢 Fibonacci Sequence Generator (Java Console App)

This is a simple Java program that generates the **Fibonacci sequence** up to a user-defined number of terms.

The **Fibonacci sequence** is a series of numbers where each number is the sum of the two preceding ones:
0, 1, 1, 2, 3, 5, 8, 13, ...

---

## 💡 What This Program Does

- Accepts the number of terms from the user
- Generates and prints the Fibonacci sequence up to that term
- Uses a loop and basic variable swapping to build the series

---

## 📌 Sample Input and Output

Please Enter term to generate 5 Fibonacci sequence for 5 is : 0 1 1 2 3

---

## 🧠 Logic Breakdown

### ➤ Starting Values
```java
int a = 0, b = 1;
➤ Generating the Series

for (int i = 1; i <= term; i++) {
    System.out.println(a);
    int next = a + b;
    a = b;
    b = next;
}
Each loop:

Prints current value of a

Calculates the next term as a + b

Updates a and b for the next iteration

🛠 Requirements
Java 8 or higher

A Java IDE like Eclipse, IntelliJ, or the command line

🚀 How to Run (In Eclipse)
Create a Java project and a class named Fibonacci inside package day6

Paste the code into your class file

Save and Run the program

Enter how many Fibonacci terms you'd like to generate when prompted

📂 Project Structure

src/
└── day6/
    └── Fibonacci.java
💡 Possible Enhancements
Display Fibonacci numbers as a single line (instead of one per line)

Generate Fibonacci up to a maximum value, not just number of terms

Add input validation (e.g. prevent negative numbers)

👤 Author
This Java console app was written as a beginner-friendly exercise to explore:

Loops and variable manipulation

Series generation

Input handling with Scanner

Happy learning! 🚀
