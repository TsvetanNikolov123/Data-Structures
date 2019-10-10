03 Lab: Linear Data Structures
==============================

Problems for exercises and homework for the ["Data Structures" course \@
SoftUni](https://softuni.bg/courses/data-structures).

You can check your solutions here:
<https://judge.softuni.bg/Contests/Compete/Index/550#0>.

03.01 ArrayList\<T\>
--------------------

Implement a data structure **ArrayList\<T\>** that holds a sequence of elements
of generic type **T**. It should hold a **sequence of items in an array**. The
structure should have **capacity** that **grows twice** when it is filled,
**always starting at 2**. The list should support the following operations:

-   **int Count** returns the number of elements in the structure

-   **T this[int index]** the indexer should access the elements by **index**
    (in range **0** … **Count-1**) in the reverse order of adding

-   **void Add(T item)** adds an element to the sequence (grow twice the
    underlying array to extend its capacity in case the capacity is full)

-   **T RemoveAt(int index)** removes an element by **index** (in range **0** …
    **Count-1**) and returns the element

Be sure to **test implemented operations** whenever possible before moving to
the next

<br/>

### Solution: <a title="01 ArrayList" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Lab/ArrayList.java">01 ArrayList</a>

