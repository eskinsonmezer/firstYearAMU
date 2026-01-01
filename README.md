# Java Learning Journey & Projects

Welcome! I am a first-year student documenting my progress in Java. 

## Project Index

| Project Name | Description | Source Code |
| :--- | :--- | :--- |
| 1. MultiCipher Tool | A dual-algorithm tool using Caesar and XOR encryption. | [View Code](./Personal-Exercises/MultiCipher.java) |
| 2. Caesar Cipher | A standalone implementation of alphabet substitution logic. | [View Code](./University_Assignments/CaesarCipher.java) |

## Project Details

### 1. MultiCipher Tool
This tool combines two different cryptographic approaches.
* **Key Concepts**: Bitwise XOR, Modular Arithmetic, Method Overloading.
* **Logic**: Uses a symmetric XOR operation to toggle bits for encryption and decryption.

### 2. Caesar Cipher
My original implementation of the classic substitution cipher.
* **Key Concepts**: `Character` class methods, ASCII manipulation.
* **Logic**: Safely handles shifts by using `(key % 26 + 26) % 26` to support negative keys.
