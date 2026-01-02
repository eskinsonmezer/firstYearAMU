# Java Learning Journey & Projects

Welcome! I am a first-year student documenting my progress in Java. 

## Project Index

| Project Name | Description | Source Code |
| :--- | :--- | :--- |
| 1. MultiCipher Tool | A dual-algorithm tool using Caesar and XOR encryption. | [View Code](./Personal-Exercises/MultiCipher.java) |
| 2. Interest Calculator | A financial tool to calculate compound interest growth over time. | [View Code](./Personal-Exercises/InterestCalculator.java) |
| 3. Caesar Cipher | A standalone implementation of alphabet substitution logic. | [View Code](./University_Assignments/CaesarCipher.java) |

## Project Details

### 1. MultiCipher Tool
This tool combines two different cryptographic approaches.
* **Key Concepts**: Bitwise XOR, Modular Arithmetic, and Method Overloading.
* **Logic**: Uses a symmetric XOR operation to toggle bits for encryption and decryption.

### 2. Interest Calculator
A professional tool designed to help with financial literacy and investment planning.
* **Key Concepts**: `Math.pow()`, input validation, and `printf` formatting.
* **Logic**: Implements the compound interest formula $A = P(1 + r/n)^{nt}$ to project long-term savings.

### 3. Caesar Cipher
My original implementation of the classic substitution cipher.
* **Key Concepts**: `Character` class methods and ASCII manipulation.
* **Logic**: Safely handles shifts by using `(key % 26 + 26) % 26` to support negative keys.
