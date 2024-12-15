# Kotlin Practice Exercises

This repository contains a collection of Kotlin practice exercises designed to improve understanding and proficiency in various Kotlin concepts, including basic syntax, control flow, functional programming, object-oriented programming, coroutines, and more.

## Table of Contents
1. [Basic Syntax and Data Types](#basic-syntax-and-data-types)
2. [Control Flow](#control-flow)
3. [Functions and Lambdas](#functions-and-lambdas)
4. [Collections](#collections)
5. [Null Safety](#null-safety)
6. [Object-Oriented Programming](#object-oriented-programming)
7. [Generics](#generics)
8. [Coroutines](#coroutines)
9. [Delegation](#delegation)
10. [Advanced Features](#advanced-features)
11. [Functional Programming](#functional-programming)
12. [Kotlin DSL](#kotlin-dsl)
13. [Concurrency with Coroutines](#concurrency-with-coroutines)
14. [Annotations and Reflection](#annotations-and-reflection)

## Prerequisites

- Kotlin installed on your machine (you can download it from [here](https://kotlinlang.org/)).
- An IDE such as IntelliJ IDEA or Android Studio (both support Kotlin natively).
- Familiarity with basic programming concepts (variables, loops, functions, classes, etc.).

## 1. Basic Syntax and Data Types
- **Prime Number Check:** A function that checks if a number is prime using the `when` expression.
- **Nullable String Handling:** A function that returns the length of a nullable string or `-1` if it is null using Kotlin’s safe call operator.
- **String Interpolation:** A `Person` class that demonstrates string interpolation with properties `name` and `age`.

## 2. Control Flow
- **Factorial Calculation (Recursion):** A recursive function to calculate the factorial of a number.
- **Fibonacci Sequence:** Generates the first 10 Fibonacci numbers using a `for` loop.
- **Even/Odd Check:** Uses `when` to check whether a number is even or odd.

## 3. Functions and Lambdas
- **Apply Discount:** A higher-order function that applies a discount using a lambda.
- **Palindrome Check:** An extension function that checks if a string is a palindrome.
- **Infix Function:** Defines an infix function for adding two `Int` values.

## 4. Collections
- **Find Max and Min:** Uses Kotlin’s standard library functions to find the maximum and minimum values in a list.
- **String Lengths:** Maps a list of strings to a list of their lengths.
- **Filter and Sort Odd Numbers:** Filters and sorts odd numbers from a list in descending order.

## 5. Null Safety
- **Sum of Nullable List:** A function that safely sums the elements of a nullable list without using `!!`.
- **Nullable String Handling:** A function that prints "Empty" if a string is null or blank.

## 6. Object-Oriented Programming
- **Abstract Class and Inheritance:** Creates an abstract class `Shape` and its subclasses `Circle` and `Rectangle` to implement area calculation.
- **Data Class and Filtering:** A `Book` data class with filtering based on price.
- **Interface and Polymorphism:** Defines a `Drawable` interface and implements it in `Circle` and `Square`.

## 7. Generics
- **Generic Print List:** A function that prints the items of a list of any type.
- **Generic Box Class:** A generic class `Box` to hold any type of item and retrieve it.

## 8. Coroutines
- **Parallel API Fetch:** Uses `async` and `await` to fetch mock API responses in parallel.
- **Launch Multiple Tasks:** Launches three tasks using `launch` and `delay`.
- **Task Cancellation:** Implements a long-running task with cancellation logic using a `Job`.

## 9. Delegation
- **Class Delegation:** Implements class delegation with the `by` keyword for delegating a `drive` method from `Car` to `Driver`.
- **Lazy Property Initialization:** Uses `by lazy` to initialize a property only when it’s accessed.

## 10. Advanced Features
- **Sealed Class for Network Response:** A sealed class `NetworkResponse` with subclasses `Success`, `Error`, and `Loading`.
- **Inline Function:** Defines an inline higher-order function to measure execution time.
- **Vararg Sum:** Implements a function to sum a variable number of integer arguments.

## 11. Functional Programming
- **Fold Product:** Uses `fold` to compute the product of all elements in a list.
- **FlatMap for Words:** Flattens a list of sentences into a list of words using `flatMap`.
- **Custom Filter Function:** Implements a custom `filter` function that returns a list of elements matching a predicate.

## 12. Kotlin DSL (Domain-Specific Language)
- **HTML Builder DSL:** A simple DSL for building HTML using Kotlin classes like `HTML`, `Body`, and `Paragraph`.

## 13. Concurrency with Coroutines
- **Retry Logic with Coroutines:** A suspend function that fetches data with retry logic in case of failure (up to 3 retries).
- **Run Multiple Coroutines Simultaneously:** Uses `coroutineScope` to run and collect results from multiple coroutines.

## 14. Annotations and Reflection
- **Custom Annotation:** Creates a custom annotation `@Serializable` and lists all properties with this annotation using reflection.
- **Print Object Properties:** Uses reflection to print all property names and values of an object.

## How to Run

1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/FarDay87/KotlinBasics.git
    ```

2. Open the project in IntelliJ IDEA or Android Studio.

3. Run the individual Kotlin files to test each concept.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
