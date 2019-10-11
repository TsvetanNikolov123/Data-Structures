03 Homework: Algorithm Complexity and Linear Data Structures
============================================================

This document defines the **homework assignments** for the ["Data Structures"
course \@ Software
University](https://softuni.bg/trainings/1147/Data-Structures-June-2015).  
You can check your solutions here:
<https://judge.softuni.bg/Contests/Practice/Index/551#0>

03.01 Sum and Average
---------------------

Write a program that reads from the console a sequence of integer numbers (on a
single line, separated by a space). Calculate and print the **sum** and
**average** of the elements of the sequence. Keep the sequence in
**List\<int\>**. Round the average to second digit after the decimal separator.

| **Input** | **Output**            |
|-----------|-----------------------|
| 4 5 6     | Sum=15; Average=5.00  |
| 1 1       | Sum=2; Average=1.00   |
|           | Sum=0; Average=0.00   |
| 10        | Sum=10; Average=10.00 |
| 2 2 1     | Sum=5; Average=1.67   |

<br/>

### Solution: <a title="01 Sum and Average" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p01SumOfAverage/Main.java">01 Sum and Average</a>

---
03.02 Sort Words
----------------

Write a program that reads from the console a **sequence of words** (strings on
a single line, separated by a space). **Sort** them alphabetically. Keep the
sequence in **List\<string\>**.

| **Input**                      | **Output**                     |
|--------------------------------|--------------------------------|
| wow softuni alpha              | alpha softuni wow              |
| hi                             | hi                             |
| rakiya beer wine vodka whiskey | beer rakiya vodka whiskey wine |

<br/>

### Solution: <a title="02 Sort Words" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p02SortWords/Main.java">02 Sort Words</a>

---
03.03 Longest Subsequence
-------------------------

Write a method that finds the **longest subsequence of equal numbers** in given
**List\<int\>** and returns the result as new **List\<int\>**. If several
sequences has the same longest length, return the leftmost of them. Write a
program to test whether the method works correctly.

| **Input**          | **Output** |
|--------------------|------------|
| 12 2 7 4 **3 3** 8 | 3 3        |
| **2 2 2** 3 3 3    | 2 2 2      |
| 4 4 **5 5 5**      | 5 5 5      |
| **1** 2 3          | 1          |
| **0**              | 0          |
| 4 2 3 **4 4**      | 4 4        |

<br/>

### Solution: <a title="03 Longest Subsequence" href="https://github.com/TsvetanNikolov123/Data-Structures/tree/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p02SortWords">03 Longest Subsequence</a>

---
03.04 Remove Odd Occurrences
----------------------------

Write a program that **removes** from given sequence all numbers that occur
**odd number of times**.

| **Input**                                 | **Output** | **Comments**                                                    |
|-------------------------------------------|------------|-----------------------------------------------------------------|
| 1 **2 3 4** 1                             | 1 1        | 2, 3 and 4 occur odd number of times (once). 1 occurs 2 times   |
| **1 2** 3 **4 5** 3 **6** 7 **6** 7 **6** | 3 3 7 7    | 1, 2, 4, 5 and 6 occurs odd number of times removed             |
| 1 2 1 2 1 2                               |            | All numbers occur odd number of times removed                   |
| **3** 7 **3 3** 4 **3** 4 **3** 7         | 7 4 4 7    | 3 occurs odd number of times (5) removed                        |
| 1 1                                       | 1 1        | All numbers occur even number of times sequence stays unchanged |

<br/>

### Solution: <a title="04 Remove Odd Occurrences" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p04RemoveOddOccurrences/Main.java">04 Remove Odd Occurrences</a>

---
03.05 Count of Occurrences
--------------------------

Write a program that finds in given array of integers **how many times each of
them occurs**. The input sequence holds numbers in range [0…1000]. The output
should hold all numbers that occur at least once along with their number of
occurrences.

| **Input**         | **Output**                                            |
|-------------------|-------------------------------------------------------|
| 3 4 4 2 3 3 4 3 2 | 2 -\> 2 times <br/> 3 -\> 4 times <br/> 4 -\> 3 times |
| 1000              | 1000 -\> 1 times                                      |
| 0 0 0             | 0 -\> 3 times                                         |
| 7 6 5 5 6         | 5 -\> 2 times <br/> 6 -\> 2 times <br/> 7 -\> 1 times |

<br/>

### Solution: <a title="05 Count of Occurrences" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p05CountOfOccurrences/Main.java">05 Count of Occurrences</a>

---
03.06 Implement the Data Structure ReversedList\<T\>
----------------------------------------------------

Implement a data structure **ReversedList\<T\>** that holds a sequence of
elements of generic type **T**. It should hold a **sequence of items in reversed
order**. The structure should have some **capacity** that **grows twice** when
it is filled, **always starting at 2**. The reversed list should support the
following operations:

-   **Add(T item)** adds an element to the sequence (grow twice the underlying
    array to extend its capacity in case the capacity is full)

-   **Count** returns the number of elements in the structure

-   **Capacity** returns the capacity of the underlying array holding the
    elements of the structure

-   **this[index]** the indexer should access the elements by **index** (in
    range **0** … **Count-1**) in the reverse order of adding

-   **RemoveAt(index)** removes an element by **index** (in range **0** …
    **Count-1**) in the reverse order of adding

-   **IEnumerable\<T\>** implement an enumerator to allow iterating over the
    elements in a **foreach** loop in a reversed order of their addition

**Note:** For Java, instead of indexer, create methods **get(int index)** and
**set(int index, T element).** All methods should be with the same names but
lowercase.

**Hint:** you can keep the elements in the order of their adding, by access them
in reversed order (from end to start).

<br/>

### Solution: <a title="06.01 Implement the Data Structure ReversedList\<T\>" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p06ImplementDataStructureReversedListT/ReversedList.java">06.01 Implement the Data Structure ReversedList\<T\></a>
### Solution: <a title="06.02 Implement the Data Structure ReversedList\<T\>" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p06ImplementDataStructureReversedListT/ReversedList1.java">06.02 Implement the Data Structure ReversedList\<T\></a>
### Solution: <a title="06.03 Implement the Data Structure ReversedList\<T\>" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p06ImplementDataStructureReversedListT/ReversedList2.java">06.03 Implement the Data Structure ReversedList\<T\></a>

---
03.07 \* Distance in Labyrinth
------------------------------

We are given a labyrinth of size N x N. Some of its cells are empty (**0**) and
some are full (**x**). We can move from an empty cell to another empty cell if
they share common wall. Given a starting position (**\***) calculate and fill in
the array the minimal distance from this position to any other cell in the
array. Use "**u**" for all unreachable cells.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68010730-19ce0b00-fc8e-11e9-9fc6-b5f1fcf86f57.png" alt="alt text" width="500" height=""></kbd>

| **Input**                                                                        | **Output**                                                                 |
|----------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| 2 <br/> x0 <br/> \*x                                                             | xu <br/> \*x                                                               |
| 3 <br/> 000 <br/> 0\*0 <br/> 000                                                 | 212 <br/> 1\*1 <br/> 212                                                   |
| 6 <br/> 000x0x <br/> 0x0x0x <br/> 0\*x0x0 <br/> 0x0000 <br/> 000xx0 <br/> 000x0x | 345xux <br/> 2x6xux <br/> 1\*x8x10 <br/> 2x6789 <br/> 345xx10 <br/> 456xux |

<br/>

### Solution: <a title="07 \* Distance in Labyrinth" href="https://github.com/TsvetanNikolov123/Data-Structures/blob/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p07DistanceInLabyrinth/DistanceInLabyrinth.java">07 \* Distance in Labyrinth</a>

---
03.08 Implement a DoublyLinkedList\<T\> 
---------------------------------------

You are given a project skeleton that contains unit tests for a
**DoublyLinkedList\<T\>** data structure.

You have to implement a **doubly linked list** in C\# or Java – a data structure
that holds **nodes**, where each node knows its **next** and **previous** nodes:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68034873-33417800-fccb-11e9-9809-1e33185ebb95.png" alt="alt text" width="600" height=""></kbd>

Before starting, get familiar with the concept of doubly linked list:
<https://en.wikipedia.org/wiki/Doubly_linked_list>.

The typical operations over a doubly linked list are **add** / **remove**
element at **both ends** and **traverse**. By definition, the doubly linked list
has a **head** (list start) and a **tail** (list end). Let's start coding!

### Implement ListNode\<T\>

The first step when implementing a linked / doubly linked list is to understand
that we need **two classes**:

-   **ListNode\<T\>** class to hold a single list node (its value + next node +
    previous node)

-   **DoublyLinkedList\<T\>** to hold the entire list (its head + tail +
    operations)

Now, let's write the **list node class**. It should hold a **Value** and a
reference to its previous and next node. It can be inner class, because we will
need it only internally from the doubly linked list class:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035039-7ef42180-fccb-11e9-8c64-eef13f9694e9.png" alt="alt text" width="500" height=""></kbd>

The class **ListNode\<T\>** is called **recursive data structure**, because it
references itself recursively. It uses the **generic argument T** to avoid later
specialization for any data type, e.g. **int**, **string** or **DateTime**. The
**generic classes in C\#** work similarly to **templates in C++** and **generic
types in Java**.

### Implement Head, Tail and Count

Now, let's define the **head** and **tail** of the doubly linked list:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68034969-5ff58f80-fccb-11e9-90e5-a17111fe8778.png" alt="alt text" width="500" height=""></kbd>

### Implement AddFirst(T) Method

Next, implement the **AddFirst(T element)** method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035221-e0b48b80-fccb-11e9-973f-4c0e4bfa20f9.png" alt="alt text" width="600" height=""></kbd>

Adding an element at the start of the list (before its head) has **two
scenarios** (considered in the above code):

-   **Empty list** add the new element as **head** and **tail** in the same
    time.

-   **Non-empty list** add the new element as **new head** and redirect the
    **old head** as second element, just after the new head.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035268-f9bd3c80-fccb-11e9-8f59-e112da06f894.png" alt="alt text" width="600" height=""></kbd>

The above graphic visualizes the process of inserting a new node at the start
(**head**) of the list. The **red** arrows denote the removed pointers from the
old head. The **green** arrows denote the new pointers to the new head.

### Implement ForEach(Action) Method

We have a doubly linked list. We can add elements to it. But we cannot see
what's inside, because the list still does not have a method to traverse its
elements (pass through each of them, one by one). Now let's define the
**ForEach(Action\<T\>)** method. In programming such a method is known as
["visitor" pattern](https://en.wikipedia.org/wiki/Visitor_pattern). It takes as
an argument a function (action) to be invoked for each of the elements of the
list. The algorithm behind this method is simple: start from **head** and pass
to the next element until the last element is reached (its next element is
**null**). A sample implementation is given below:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035345-1a859200-fccc-11e9-9fcb-b91682179f41.png" alt="alt text" width="600" height=""></kbd>

Run the Unit Tests
------------------

Now we have the methods **AddFirst(T)** and **ForEach(Action\<T\>)**. We are
ready to run the unit tests to ensure they are correctly implemented. Most of
the **unit tests** create a doubly linked list, add / remove elements from it
and then check whether the elements in the list are as expected. For example,
let's examine this unit test:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035428-430d8c00-fccc-11e9-8ece-edf44ba2d504.png" alt="alt text" width="600" height=""></kbd>

If we **run the unit tests**, some of them will now pass:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035470-5ae51000-fccc-11e9-9cd9-c75dd62f61d5.png" alt="alt text" width="500" height=""></kbd>

### Implement AddLast(T) Method

Next, implement the **AddLast(T element)** method for appending a new element as
the list **tail**. It should be very similar to the **AddFirst(T element)**
method. The logic inside it exactly the same, but we append the new element at
the **tail** instead of at the **head**. The code below is intentionally
blurred. Write it yourself!

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035570-95e74380-fccc-11e9-81f1-14ed19c469e8.png" alt="alt text" width="600" height=""></kbd>

Now **run the unit tests** again. You should have several more passed (green)
tests:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035759-f70f1700-fccc-11e9-9dab-9a6abd327058.png" alt="alt text" width="500" height=""></kbd>

### Implement RemoveFirst() Method

Next, let's implement the method **RemoveFirst() T**. It should **remove the
first element** from the list and move its **head** to point to the second
element. The removed element should be returned as a result from the method. In
case of empty list, the method should throw an exception. We have to consider
the following three cases:

-   **Empty list** throw and exception.

-   **Single element in the list** make the list empty (**head** == **tail** ==
    **null**).

-   **Multiple elements in the list** remove the first element and redirect the
    head to point to the second element (**head = head.NextNode**).

A sample implementation of **RemoveFirst()** method is given below:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035849-27ef4c00-fccd-11e9-9394-20abb087b6cf.png" alt="alt text" width="600" height=""></kbd>

Run the **unit tests** to ensure the method is correctly implemented:

Implement RemoveLast() Method
-----------------------------

Next, let's implement the method **RemoveLast() T**. It should **remove the last
element** from the list and move its **tail** to point to the element before the
last. It is very similar to the method **RemoveFirst()**, so you are free to
implement it yourself. The code below is intentionally blurred:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68035945-5ec56200-fccd-11e9-9922-b2d4065fb36e.png" alt="alt text" width="600" height=""></kbd>

Implement ToArray() Method
--------------------------

Now, implement the next method: **ToArray() T[]**. It should copy all elements
of the linked list to an array of the same size. You could use the following
steps to implement this method:

-   Allocate an array **T[]** of size **this.Count**.

-   Pass through all elements of the list (from **head** to **tail**) and fill
    them to **T[0]**, **T[1]**, …, **T[Count-1]**.

-   Return the array as result.

Write yourself the blurred code in the method **ToArray()**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68036029-84eb0200-fccd-11e9-9b13-803034b09f80.png" alt="alt text" width="500" height=""></kbd>

### Implement IEnumerable\<T\>

Collection classes in C\# and .NET Framework (like arrays, lists and sets)
implement the system interface **IEnumerable\<T\>** to enable the **foreach**
iteration over their elements. The C\# keyword **foreach** calls internally the
following method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68036071-a21fd080-fccd-11e9-9f5a-c6ccd0a35bb2.png" alt="alt text" width="400" height=""></kbd>

This method returns **IEnumerator\<T\>**, which can move to the next element and
read the current element. In programming, this is known [as "iterator"
pattern](https://en.wikipedia.org/wiki/Iterator_pattern) (**enumerator**).

We will use [the "yield return" C\#
statement](https://msdn.microsoft.com/en-us/library/9k7k7cf0.aspx) to simplify
the implementation of the iterator:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68036122-c380bc80-fccd-11e9-885f-be3dd3edfd42.png" alt="alt text" width="500" height=""></kbd>

The above code will enable using the **DoublyLinkedList\<T\>** in **foreach**
loops.

The last unimplemented method is the **non-generic enumerator**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68036285-06429480-fcce-11e9-9aef-a3f28923c266.png" alt="alt text" width="400" height=""></kbd>

Finally, **run the unit tests** to ensure all of them pass correctly:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68036294-08a4ee80-fcce-11e9-9c6b-3a84417a0b19.png" alt="alt text" width="500" height=""></kbd>

Congratulations! You have implemented your doubly linked list.

<br/>

### Solution: <a title="08 Implement a DoublyLinkedList\<T\>" href="https://github.com/TsvetanNikolov123/Data-Structures/tree/master/3%20LINEAR%20DATA%20STRUCTURES%20-%20LIST%20AND%20DS%20COMPLEXITY/Exercise/p08DoublyLinkedList">08 Implement a DoublyLinkedList\<T\></a>

---