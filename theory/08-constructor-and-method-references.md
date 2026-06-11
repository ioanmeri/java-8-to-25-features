# Section 8: Constructor and Functional Interfaces

## Method Reference

- Introduced as part of Java 8 and its purpose is to simplify the implementation of Functional Interfaces
- Shortcut for writing the **Lambda Expressions**
- Refer a method in a class

---

## Syntax of Method Reference

```
ClassName::instance-methodName

ClassName::static-methodName

Instance::methodName
```

---

## Where to use Method Reference?

- Lambda expressions referring to a method directly

**Using Lambda**

```
Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase();
```

**Using Method Reference**
```
Function<String,String> toUpperCaseMethodReference = String::toUpperCase;
```
---

## Where Method Reference is not Applicable?

**Example**

```
Predicate<Student> predicateUsingLambda = (s)->s.getGradeLevel()>=3;
```

---


## Constructor Reference

- Introduced as part of Java 1.8


**Syntax**

```
Classname::new
```

**Example**

```
Supplier<Student> studentSupplier = Student::new;
```

**Invalid**

```
Student student = Student::new; // compilation issue
```

---




