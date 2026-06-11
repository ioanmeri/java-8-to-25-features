# Introduction to Lambda

## What is Lambda Expression?

- **Lambda** is equivalent to a function (method) without a name
- Lambda's are also referred as **Anonymous** functions
  - Method parameters
  - Method Body
  - Return Type
- Lambdas are not tied to any class like a regular method
- Lambda can also be assigned to variable and passed around

---

## Syntax of the Lambda Expression

**Lambda Expression**

`() -> { }`

- Lambda input Parameters
- Arrow
- Lambda Body

---

## Usages of Lambda

- **Lambda** is mainly used to implement Functional Interfaces (SAM, Simple Abstract Method Interfaces)

```
@FunctionalInterface
public interface Comparator<T>{
    int compare (T o1, T o2);
}


@FunctionalInterface
public interface Runnable {
    public abstract void run();
}
```

## Lambda in Practice (Things to keep in Mind)

`() -> Single Statement or Expression;` // curly braces are not needed

`() -> {<Multiple Statements>};` // curly braces are needed fro multiple statements

---
