# Stream API


## Stream API: map()

- **map**: Convert(transform) one type to another
- Don't get confused this with **Map** Collection


---

## Stream API: flatMap()

- **flatMap**: Converts (Transforms) one type to another as like `map()` method
- Used in the context of Stream where each element in the stream represents multiple elements


**Example**
- Each Stream element represents multiple elements
    - Stream<List>
    - Stream<Arrays>

---

## Stream API: distinct(), count() and sorted()

- **distinct** - Returns a stream with unique elements
- **count** - Returns a long with the total no of elements in the Stream
- **sorted** - Sort the elements in the stream

---

## Stream API: filter()

- **filter** - filters the elements in the stream

Input to the filter is a **Predicate** Functional Interface.

---

## Stream API: reduce()

- **reduce** - This is a terminal operation. Used to reduce the contents of a stream to a single value
- It takes two parameters as an input
  - **First parameters** - default or initial value
  - **Second Parameter** - BinaryOperator<T>














