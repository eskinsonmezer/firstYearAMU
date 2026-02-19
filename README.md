# Java Learning Journey & Projects

Welcome! I am a first-year student documenting my progress in Java.

## Project Index

| Project Name | Description | Source Code |
| :--- | :--- | :--- |
| **1. MultiCipher Tool** | A dual-algorithm tool using Caesar and XOR encryption. | [View Code](https://github.com/eskinsonmezer/firstYearAMU/blob/main/Personal-Exercises/MultiCipher.java) |
| **2. Interest Calculator** | A financial tool to calculate compound interest growth over time. | [View Code](https://github.com/eskinsonmezer/firstYearAMU/blob/main/Personal-Exercises/InterestCalculator.java) |
| **3. Caesar Cipher** | A standalone implementation of alphabet substitution logic. | [View Code](https://github.com/eskinsonmezer/firstYearAMU/blob/main/University_Assignments/CaesarCipher.java) |
| **4. Tic-Tac-Toe with AI** | A console-based game featuring a strategic computer opponent. | [View Code](https://github.com/eskinsonmezer/firstYearAMU/blob/main/University_Assignments/TicTacToe.java) |

---

## Project Details

### 1. MultiCipher Tool
This tool combines two different cryptographic approaches to secure text data.
* **Key Concepts:** Bitwise XOR, Modular Arithmetic, and Method Overloading.
* **Logic:** Employs a symmetric XOR operation to toggle bits, allowing the same logic to handle both encryption and decryption.

### 2. Interest Calculator
A professional tool designed to assist with financial literacy and investment planning.
* **Key Concepts:** `Math.pow()`, input validation, and `printf` formatting.
* **Logic:** Implements the compound interest formula `A = P(1 + r/n)^(nt)` to project long-term savings based on user input.

[Image of the compound interest formula components]

### 3. Caesar Cipher
A standalone implementation of the classic substitution cipher used in ancient cryptography.
* **Key Concepts:** `Character` class methods and ASCII manipulation.
* **Logic:** Safely handles character shifts using the formula `(key % 26 + 26) % 26` to ensure the program supports negative keys and wraps around the alphabet correctly.

### 4. Tic-Tac-Toe with AI
A classic console-based game where the player competes against an AI opponent using two distinct difficulty strategies.
* **Key Concepts:** 2D Arrays, nested loops, conditional logic, and algorithmic thinking.
* **Logic:** The AI utilizes a priority-based system. It first simulates the board to find immediate winning moves,
