# Java Basics — Object-Oriented Programming (OOP)

Hands-on Java repo for learning **OOP**. Each `.java` file is a small, runnable example — compile and study on its own.

## Prerequisites & How to Run

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8+ · terminal · verify: `java -version` · `javac -version`

```bash
javac Trail.java && java Trail
# Multi-class: javac inheritance_parent.java inheritance_child.java inheritance_single.java && java inheritance_single
```

Compiled `.class` files are ignored by Git (`.gitignore`).

## What Is OOP?

**OOP** organizes code around **objects** — data (fields) + behavior (methods). Define **classes** (blueprints), create **objects** (instances) with `new`.

| Pillar | Idea | Files |
|--------|------|-------|
| **Encapsulation** | Hide internal data; expose via controlled methods | `classname.java`, `CLASS.java`, `keyword_sample.java` |
| **Inheritance** | Child class reuses and extends parent | `inheritance_*.java`, `A.java` + `B.java`, `superMain.java` |
| **Polymorphism** | One name, many forms | `polymorphism.java`, `polyOverloading.java`, `OrCar.java` + `Target.java`, `interPayment.java` |
| **Abstraction** | Show only essentials; hide implementation | `Abstrclass.java`, `AbstrSample.java`, `interPayment.java` |

**Path:** Classes & Objects → Constructors → Encapsulation & Keywords → Inheritance → Polymorphism → Abstraction → Supporting Topics

---

## 1. Classes & Objects

**Class** = blueprint · **Object** = instance (`new`). Fields store data; methods define behavior; each object has its own fields; `main` is the entry point.

| File | Description |
|------|-------------|
| `Trail.java` | Hello World |
| `CLASS.java` | Multiple objects from one class |
| `classname.java` | Fields, methods, per-object state |
| `Sample.java` | Minimal class with constructor |
| `OOPsum.java` + `SUM.java` | Two objects of same class, different data |

```java
classname s1 = new classname(); s1.a = 20;
classname s2 = new classname(); s2.a = 50;  // each object has its own value
```

## 2. Constructors

Runs on object creation — same name as class, no return type. Overloadable; in inheritance child calls parent via `super()`.

| File | Description |
|------|-------------|
| `Constructor.java` | Default constructor and object creation |
| `Sample.java` | Constructor runs on `new Sample()` |
| `Acons.java` + `Bcons.java` | Overloading + `super()` chaining |
| `inherWithcostr.java` + `inherWithcostrC.java` | Parent constructor before child |
| `keyword_sample.java` | Parameterized constructor with `this` |

## 3. Encapsulation & Keywords

**Encapsulation** — keep data controlled; expose through methods to protect state.

| Keyword | Purpose | File |
|---------|---------|------|
| `this` | Current object; field vs parameter | `keyword_sample.java` |
| `static` | Belongs to class, shared by all objects | `Static.java` |
| `final` | No change / override / extend | `Finalclass.java`, `First.java`, `Second.java` |
| `super` | Parent field, method, or constructor | `B.java`, `Bcons.java`, `superMain.java` |

| File | Description |
|------|-------------|
| `Static.java` | Instance vs static variables |
| `keyword_sample.java` | `this` in parameterized constructor |
| `keyword_test.java` | Keyword practice |
| `B.java` | `super.a` when child hides parent field |
| `superMain.java` | Overridden methods through inheritance |

## 4. Inheritance

Child **extends** parent — reuses fields/methods. Java: **single inheritance** (one parent). Use `extends`; child gets non-private members; `super` for parent access; "is-a" relationship (`Target` is an `OrCar`).

| File | Description |
|------|-------------|
| `inheritance_parent.java` | Parent with fields and methods |
| `inheritance_child.java` | Child extending parent |
| `inheritance_single.java` | Inherited + child-specific methods |
| `A.java` + `B.java` | Base/derived with `super` |
| `inherWithcostr.java` + `inherWithcostrC.java` | Constructor order in inheritance |
| `Acons.java` + `Bcons.java` | `super()` in child constructors |

## 5. Polymorphism

Use one interface for different types.

| Type | File | Description |
|------|------|-------------|
| **Overloading** (compile-time) | `polymorphism.java` | `display()` and `display(int a)` |
| | `polyOverloading.java` | Calling overloaded methods from `main` |
| | `polySum.java` | Overloading example |
| **Overriding** (runtime) | `OrCar.java` | Parent `display()` |
| | `Target.java` | Child overrides `display()` |
| | `interPayment.java` + `interMethod.java` | Interface → UPI / Card implementations |

## 6. Abstraction

Hides complexity; exposes essential behavior only.

| Type | File | Description |
|------|------|-------------|
| **Abstract class** | `Abstrclass.java` | `abstract void onText(String text)` |
| | `AbstrSample.java` | Subclass implements abstract method |
| | `abstrTextScanner.java` | Helper passing behavior through abstraction |
| **Interface** | `interPayment.java` | `UPIPayment`, `CardPayment` implement contract |
| | `interMethod.java` | Polymorphism via interface references |

| | Abstract Class | Interface |
|---|----------------|-----------|
| Keyword | `abstract class` | `interface` |
| Relation | `extends` (one parent) | `implements` (multiple allowed) |
| Fields | Instance fields allowed | Constants; modern Java allows more |
| Use when | Shared code + partial implementation | Pure contract / capability |

## 7. Supporting Topics

| Topic | Files | Notes |
|-------|-------|-------|
| **Basics** | `Sum_of_two_number.java`, `Condition.java`, `For_loop.java`, `fuction.java` | Input, conditions, loops, methods |
| **Strings** | `StringBasic.java`, `StringReverse.java` | Fundamentals, reverse |
| **Enums** | `Enumeration.java`, `EnumWithInput.java` | Fixed named constants; with user input |
| **Exceptions** | `Exeption.java` | `try`, `catch`, `finally` |
| **Threads** | `SampleThread.java`, `Threadmain.java`, `SampleThreadInter.java`, `ThreadmainInter.java`, `MultiTask.java` | `Thread`, `Runnable`, multi-task |
| **Packages** | `src/test1/SamplePackage1.java`, `src/test2/SamplePackage2.java`, `src/test2/SampleTest2.java` | Package + import |
| **Calculators** | `calculam.java`, `calculaminput.java` | OOP in practice |

---

## Run Examples

```bash
javac classname.java CLASS.java && java CLASS
javac Acons.java Bcons.java && java Bcons
javac inherWithcostr.java inherWithcostrC.java && java inherWithcostrC
javac Static.java && java Static
javac A.java B.java superMain.java && java superMain
javac inheritance_parent.java inheritance_child.java inheritance_single.java && java inheritance_single
javac polymorphism.java polyOverloading.java && java polyOverloading
javac OrCar.java Target.java && java Target
javac interPayment.java interMethod.java && java interMethod
javac Abstrclass.java abstrTextScanner.java AbstrSample.java && java AbstrSample
```

## Complete File Index

| Topic | Files |
|-------|-------|
| Classes & Objects | `Trail.java` · `CLASS.java` · `classname.java` · `Sample.java` · `OOPsum.java` · `SUM.java` |
| Constructors | `Constructor.java` · `Sample.java` · `Acons.java` · `Bcons.java` · `inherWithcostr.java` · `inherWithcostrC.java` · `keyword_sample.java` |
| Encapsulation & Keywords | `keyword_sample.java` · `keyword_test.java` · `Static.java` · `Finalclass.java` · `First.java` · `Second.java` |
| Inheritance | `inheritance_parent.java` · `inheritance_child.java` · `inheritance_single.java` · `A.java` · `B.java` · `superMain.java` · `inherWithcostr.java` · `inherWithcostrC.java` · `Acons.java` · `Bcons.java` |
| Polymorphism | `polymorphism.java` · `polyOverloading.java` · `polySum.java` · `OrCar.java` · `Target.java` · `interPayment.java` · `interMethod.java` |
| Abstraction | `Abstrclass.java` · `AbstrSample.java` · `abstrTextScanner.java` · `interPayment.java` · `interMethod.java` |
| Other | `StringBasic.java` · `StringReverse.java` · `Enumeration.java` · `EnumWithInput.java` · `Exeption.java` · `SampleThread.java` · `Threadmain.java` · `SampleThreadInter.java` · `ThreadmainInter.java` · `MultiTask.java` · `calculam.java` · `calculaminput.java` · `src/test1/SamplePackage1.java` · `src/test2/SamplePackage2.java` · `src/test2/SampleTest2.java` |

## Quick Reference

| Concept | Meaning | File |
|---------|---------|------|
| Class | Blueprint for objects | `classname.java` |
| Object | Instance of a class | `CLASS.java` |
| Constructor | Initializes new objects | `Constructor.java` |
| Encapsulation | Data + methods together | `keyword_sample.java` |
| Inheritance | `extends` parent class | `inheritance_single.java` |
| Overloading | Same method, different params | `polyOverloading.java` |
| Overriding | Child replaces parent method | `Target.java` |
| Abstract | Partial / hidden implementation | `Abstrclass.java` |
| Interface | Contract to implement | `interPayment.java` |

## Notes & License

- Public class name must match file name (Java rule).
- Study together: `A.java` + `B.java`, all `inheritance_*.java`, `Abstrclass.java` + `AbstrSample.java`.
- Learning repo — not for production. **License:** open for personal learning and practice.
