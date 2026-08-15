# Java Basics

A collection of small Java programs used to learn and practice core language features, from your first `main` method through object-oriented programming concepts like inheritance and polymorphism.

Each file is a standalone example you can compile and run on its own.

## Prerequisites

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) (JDK 8 or later)
- A terminal or command prompt

Verify your installation:

```bash
java -version
javac -version
```

## How to Run

From this folder, compile and run any program that contains a `main` method:

```bash
javac Trail.java
java Trail
```

For programs that use multiple classes (for example, inheritance examples), compile all related files together:

```bash
javac inheritance_parent.java inheritance_child.java inheritance_single.java
java inheritance_single
```

Compiled `.class` files are ignored by Git (see `.gitignore`).

## Project Structure

All source files live in the root directory. They are grouped below by topic.

### Getting Started

| File | Description |
|------|-------------|
| `Trail.java` | Hello World — your first Java program |
| `Sum_of_two_number.java` | Read two numbers from input and print their sum |
| `Condition.java` | Conditional statements (`if` / `else`) |
| `For_loop.java` | Looping with `for` |
| `fuction.java` | Methods / functions |

### Classes & Objects

| File | Description |
|------|-------------|
| `CLASS.java` | Basic class structure |
| `classname.java` | Class naming and usage |
| `Sample.java` | Sample class example |
| `Constructor.java` | Constructors |
| `Acons.java`, `Bcons.java` | Constructor chaining with inheritance |
| `Static.java` | Static vs instance variables |
| `Finalclass.java`, `First.java`, `Second.java` | `final` keyword usage |
| `keyword_sample.java`, `keyword_test.java` | Java keyword examples |

### Strings

| File | Description |
|------|-------------|
| `StringBasic.java` | String fundamentals |
| `StringReverse.java` | Reverse a string |

### Enums

| File | Description |
|------|-------------|
| `Enumeration.java` | Enum basics with severity levels |
| `EnumWithInput.java` | Enum with user input |

### Inheritance

| File | Description |
|------|-------------|
| `inheritance_parent.java`, `inheritance_child.java` | Parent–child class relationship |
| `inheritance_single.java` | Single inheritance demo |
| `inherWithcostr.java`, `inherWithcostrC.java` | Inheritance with constructors |
| `A.java`, `B.java` | Base and derived class example |
| `superMain.java` | `super` keyword usage |

### Polymorphism

| File | Description |
|------|-------------|
| `polymorphism.java` | Method overloading |
| `polyOverloading.java` | Overloading examples |
| `polySum.java` | Polymorphism summary |
| `OrCar.java`, `Target.java` | Runtime polymorphism (method overriding) |

### Calculators & Summaries

| File | Description |
|------|-------------|
| `calculam.java` | Calculator logic |
| `calculaminput.java` | Calculator with user input |
| `OOPsum.java` | OOP concepts summary |
| `SUM.java` | General summary example |

## Topics Covered

- Variables, data types, and operators
- Input/output with `Scanner`
- Control flow (conditions and loops)
- Methods and constructors
- Classes, objects, and encapsulation
- `static`, `final`, and `super` keywords
- Strings and enums
- Inheritance (single inheritance)
- Polymorphism (overloading and overriding)

## Notes

- File names follow the public class name inside each file (Java requirement).
- Some examples are meant to be studied together (e.g. `A.java` + `B.java`, `inheritance_parent.java` + `inheritance_child.java`).
- This repo is for learning and practice — not a production application.

## License

This project is open for personal learning and practice.
