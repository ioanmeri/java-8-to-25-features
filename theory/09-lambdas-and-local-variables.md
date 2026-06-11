# Section 9: Lambdas and Local variables (Effectively Final)

## Lambdas and Local Variables

What is a **Local variable**?
- Any variable that is declared inside a method is called a local variable

Lambdas have some restrictions on using local variables
- Not allowed to use the same local variable name as **lambda parameters** or inside the **lambda body**
- Not allowed to **re-assign** a value to a local variable


There are no restrictions on **instance** variables

---

## Effectively Final

Lambda's are allowed to use local variables but not allowed to modify it even through they are not declared final.

This concept is called **Effectively Final**
- Not allowed to modify the value inside the lambda


```
int value = 4;
Consumer<Integer> c1 = (a) -> {
    //value =6; // reassigning not allowed
    // System.out.println(i+ value);
};
```

- Prior to Java 8, any variable that's used inside the anonymous class should be declared **final**

---

## Advantages of Effectively Final

- Easy to perform concurrency operations
- Promotes Functional Programming and demotes the Imperative style programming

---