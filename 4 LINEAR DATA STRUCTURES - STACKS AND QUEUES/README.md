03 Lab: Linear Data Structures
==============================

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures). You can submit your
code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/574/Linear-Data-Structures-Stacks-and-Queues-Lab>.

03.01 LinkedList\<T\>
---------------------

Implement a data structure **LinekdList\<T\>** that holds a sequence of elements
of generic type **T**. It should hold a **sequence of items in a sequence of
linked nodes**. The list should support the following operations:

-   **int Count** returns the number of elements in the structure

-   **void AddFirst(T item)** adds an element to the start of the sequence

-   **void AddLast(T item)** adds an element to the end of the sequence

-   **T RemoveFirst()** removes an element from the start of the sequence and
    returns the element

-   **T RemoveLast()** removes an element from the end of the sequence and
    returns the element

-   **IEnumerable\<T\>** implement interface

**RemoveFirst()** and **RemoveLast()** methods should throw
**InvalidOperationException** if the list is empty

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213230-d227e600-ffe3-11e9-87a6-330c62243ef6.png" alt="alt text" width="500" height=""></kbd>

### Solution

Start by defining the class **LinkedList\<T\>**, you can define the Node class
inside (in which case it doesn't need to be generic, as you will use **T** from
the **LinkedList**)

Also, note that we are going to keep a reference to both the head and the tail
of the list

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213261-e5d34c80-ffe3-11e9-98de-c20f3a085e3d.png" alt="alt text" width="400" height=""></kbd>

First, implement **AddFirst()**. The utility method **IsEmpty()** checks if the
Count is 0

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213304-f7b4ef80-ffe3-11e9-8d29-d29672bbb0b2.png" alt="alt text" width="300" height=""></kbd>

**AddLast()** is almost the same

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213623-96415080-ffe4-11e9-8d9c-63d5f6d1a8e8.png" alt="alt text" width="300" height=""></kbd>

Remove methods are a little bit more complicated. Start with **RemoveFirst()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213754-d0aaed80-ffe4-11e9-9e40-c0b77358a452.png" alt="alt text" width="400" height=""></kbd>

Method **RemoveLast()** uses a utility method **GetSecondToLast()** which gets
the second to last element. Try to implement it yourself

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213827-f7692400-ffe4-11e9-87aa-aedd4efc3bdf.png" alt="alt text" width="400" height=""></kbd>

The last thing to do is to implement **IEnumerable\<T\>**

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213902-15cf1f80-ffe5-11e9-8551-a943a8d8467a.png" alt="alt text" width="400" height=""></kbd>

You need to implement two methods. The first is the actual that will do the
work. The second one calls the first and you need it only for compatibility
reasons

<kbd><img src="https://user-images.githubusercontent.com/32310938/68213939-254e6880-ffe5-11e9-8c19-67ddc2882cd6.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="01 LinkedList\<T\>" href="https://github.com/TsvetanNikolov123/Data-Structures/tree/master/4%20LINEAR%20DATA%20STRUCTURES%20-%20STACKS%20AND%20QUEUES/p01LinkedList">01 LinkedList\<T\></a>

---

03.02 Implement Circular Queue
------------------------------

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures). You can submit your
code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/574/Linear-Data-Structures-Stacks-and-Queues-Lab>.  
  
You have to implement an **array-based circular queue** in C\# – a data
structure that holds **elements** and follows FIFO (**F**irst **I**n, **F**irst
**O**ut) behavior, with fixed internal **capacity** that doubles its size when
filled:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68214593-6a26cf00-ffe6-11e9-8ea4-6524189fe676.png" alt="alt text" width="300" height=""></kbd>

In the figure above, the queue elements {12, 5, -2, 3, 4} stay in an array with
fixed capacity of 8. The queue **capacity** is 8, the elements **count** is 5
and 3 cells stay empty. The **startIndex** points the **first** non-empty
element in the queue. The **endIndex** points just after the last non-empty
element in the queue – the place where the next coming element will be enqueued.
Note that the queue is **circular**: after the element at the last position 7
comes the element at the first position 0.

### Learn about Circular Queue in Wikipedia

Before starting, get familiar with the concept of circular queue:
<https://en.wikipedia.org/wiki/circular_buffer>.

The typical **operations** over a circular queue are **enqueue** / **dequeue**
and **get count**. Let's start coding!

### CircularQueue\<T\> – Project Skeleton

You are given a **Visual Studio project skeleton** (unfinished project) holding
the unfinished **CircularQueue\<T\>** class and **unit tests** for its
functionality. The project holds the following assets:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68214772-bc67f000-ffe6-11e9-8014-a9759446c988.png" alt="alt text" width="300" height=""></kbd>

The project skeleton opens correctly in **Visual Studio 2017** but can be open
in other Visual Studio versions as well and also can run in **SharpDevelop** and
**Xamarin Studio**.

The main class stays in the file **CircularQueue.cs**:

    public class CircularQueue<T>
    {
        private const int DefaultCapacity = 4;
        public int Count { get; private set; }
        public CircularQueue(int capacity = DefaultCapacity) { … }
        public void Enqueue(T element) { … }
        public T Dequeue() { … }
        public T[] ToArray() { … }
    }


The project comes with **unit tests** covering the entire functionality of the
circular queue (see the class **UnitTestsCircularQueue**):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68214842-defa0900-ffe6-11e9-8553-58ea816cd137.png" alt="alt text" width="600" height=""></kbd>

### Run the Unit Tests to Ensure All of Them Initially Fail

**Run the unit tests** from the **CircularQueue.Tests** project. Right click on
the file "**UnitTestsCircularQueue.cs**" in Solution Explorer and select **[Run
Unit Tests]**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68214916-fdf89b00-ffe6-11e9-9b06-0c84ed7eea3e.png" alt="alt text" width="500" height=""></kbd>

The results is like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68214977-149ef200-ffe7-11e9-9b65-bd088a2349a1.png" alt="alt text" width="500" height=""></kbd>

This is quite normal. We have unit tests, but the code covered by these tests is
missing. Let's write it.

### Define the Queue Internal Data

The first step is to define the inner **data** that holds the queue elements and
the start + end indexes:

-   **T[] elements** – an array that holds the queue elements

    -   Non-empty cells hold elements

    -   Empty cells are free for adding new elements

    -   The array **Length** holds the queue **capacity**

-   **int startIndex** – holds the queue start index (the index of the first
    entered element in the queue)

-   **int endIndex** – holds the queue end index (the index in the array that
    follows the last queue element)

-   **int Count** – holds the number of elements in the queue

The code might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68215013-2bdddf80-ffe7-11e9-899a-7d6c2acd8fe7.png" alt="alt text" width="400" height=""></kbd>

### Implement the Queue Constructor

Now, let's implement the queue constructor. Its purpose is to allocate the
specified capacity of elements in the underlying array in the
**CircularQueue\<T\>** class. The queue constructor has two forms:

-   Parameterless constructor – should allocate 16 elements (16 is the default
    initial queue capacity)

-   Constructor with parameter **capacity** – allocates the specified capacity
    in the underlying array

The code might look like the sample below (note that we have combined the above
described two constructors in a single constructor through default parameter
value). We also introduced the constant **InitialCapacity** to hold the initial
queue capacity (16 elements):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216322-647eb880-ffe9-11e9-9bf0-f834f406b054.png" alt="alt text" width="500" height=""></kbd>

### Implement the Enqueue(…) Method

Now, we are ready to implement the **Enqueue(element)** method that appends a
new element at the queue end:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216346-6ea0b700-ffe9-11e9-986e-f8e0bc921e11.png" alt="alt text" width="500" height=""></kbd>

How it works? First, if the queue is full, **grow** it (resize its capacity to 2
times bigger capacity). Next, put the new element at position **endIndex** (the
index, just after the last queue element) + move the end index to point the
position on the right of it + increase the internal elements counter **Count**.

Note that the queue is circular, so the element after the last element
(**this.elements.Length-1**) is **0**.

Thus, we have a **formula**: the next element after **p** comes at position 
**(p + 1) % capacity**. In the code we have:

**(this.endIndex + 1) % this.elements.Length**

### Implement the Grow() Method

The **Grow()** method is called when the queue has filled its capacity
(**capacity == Count**) and we are trying to add a new element. The **Grow()**
method should allocate a new underlying array with **doubled capacity** and move
all elements from the old array to the new array:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216616-d1924e00-ffe9-11e9-9edd-a4df11eff3df.png" alt="alt text" width="800" height=""></kbd>

The code to grow the queue capacity might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216660-e5d64b00-ffe9-11e9-9133-3efec91630a4.png" alt="alt text" width="500" height=""></kbd>

An important part of the "**grow**" process is to **copy the old array elements
to the new array**. This might be implemented as follows:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216673-f090e000-ffe9-11e9-9d7c-20e6b33f3d4b.png" alt="alt text" width="700" height=""></kbd>

We use the already mentioned formula for the **next element after sourceIndex**:

**nextIndex = (sourceIndex + 1) % capacity**.

### Implement Dequeue() Method

Next comes the **Dequeue()** method. Its purpose is to return and remove from
the queue its first added element (the element at position **startIndex**). The
code might look as follows:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216711-030b1980-ffea-11e9-858f-e8cf0a0ae776.png" alt="alt text" width="600" height=""></kbd>

How it works? If the queue is empty, an exception is thrown. Otherwise, the
first queue element is taken (the element at position **startIndex**); the
**startIndex** is moved to its next position; the **Count** is decreased.

Again, we use the same formula for the next element after **startIndex**:

**nextIndex = (startIndex + 1) % capacity**.

### Run the Unit Tests

Now we have implemented the queue **constructor**, **Enqueue(element)** and
**Dequeue()** methods. We are ready to **run the unit tests** to ensure they are
correctly implemented. Most of the **unit tests** create a queue, enqueue /
dequeue elements and then check whether the elements in the queue are as
expected. For example, let's examine the following unit test:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216745-13bb8f80-ffea-11e9-85b5-1cc1abde80f5.png" alt="alt text" width="500" height=""></kbd>

This unit test creates a queue of strings, add an element to the queue
(enqueue), removes an element from the queue (dequeue) and checks whether the
queue is empty at the end and the element from the queue is the same like the
element added to the queue earlier.

If we **run the unit tests**, some of them will now pass and some of them will
still fail:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216771-1e762480-ffea-11e9-9a08-add29ce0c74f.png" alt="alt text" width="500" height=""></kbd>

All tests, except the test for the unimplemented **ToArray()** method, pass
successfully. We are almost done.

### Implement ToArray() Method

Next, implement the **ToArray()** method. It should allocate an array with
capacity of **this.Count** and **copy all queue elements** to it. We already
have a method to copy the queue element to an array, so the code will be very
short and easy to write. The code below is intentionally blurred. Try to write
it alone.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216802-2afa7d00-ffea-11e9-9743-f697dc043b3a.png" alt="alt text" width="400" height=""></kbd>

Now **run the unit tests** again. You should have all the tests passed (green):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68216824-377ed580-ffea-11e9-824c-b12f4b6d153c.png" alt="alt text" width="500" height=""></kbd>

<br/>

### Solution: <a title="02 Implement Circular Queue" href="https://github.com/TsvetanNikolov123/Data-Structures/tree/master/4%20LINEAR%20DATA%20STRUCTURES%20-%20STACKS%20AND%20QUEUES/p02CircularQueue">02 Implement Circular Queue</a>

---
