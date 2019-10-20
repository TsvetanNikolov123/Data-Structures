09 Lab: Heaps and Priority Queues
=================================

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures). You can submit your
code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/590/Heaps-and-Priority-Queues-CSharp-Lab>.

Problem 1. Max Binary Heap 
--------------------------

You are given a skeleton. You should implement the following operations:

-   **int Count** returns the number of elements in the structure

-   **void Insert(T item)** adds an element

-   **T Peek()** returns the maximum element without removing it

-   **T Pull()** removes and returns the maximum element

        public class BinaryHeap<T> where T : IComparable<T>
        {
            public BinaryHeap() { … }
        
            public int Count { … }
            public void Insert(T item) { … }
            public T Peek() { … }
            public T Pull() { … }
        }


### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/68475976-32ac6280-0232-11ea-8195-6d3b9c07febd.png" alt="alt text" width="500" height=""></kbd>

### Insert and Peek

First, you will need a container for all the elements. You can implement a
**resizing array** yourself or even better, use the default implementation of
your language:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68475997-3fc95180-0232-11ea-8de9-906be43dea33.png" alt="alt text" width="200" height=""></kbd>

The **count** property should return the **size** of the underlying data
structure

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476016-4ce64080-0232-11ea-81d4-9c39c8666988.png" alt="alt text" width="300" height=""></kbd>

In a **max heap**, the max element should always stay at index 0. Peek should
return that element, without removing it

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476038-596a9900-0232-11ea-92c9-1f0335fbca9b.png" alt="alt text" width="300" height=""></kbd>

Inserting an element should put it at the end and then bubble it up to its
correct position. **HeapifyUp** receives as a parameter the index of the element
that will bubble up towards the top of the pile.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476060-67201e80-0232-11ea-999a-1af8cfc0b9c9.png" alt="alt text" width="400" height=""></kbd>

Time to implement **HeapifyUp**. While the index is greater than 0 (the element
has a parent) and is greater than its parent, swap child with parent. Implement
the helper methods (**Parent()**, **IsLess()** and **Swap()**) by yourself.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476144-a2bae880-0232-11ea-980d-94feb6247376.png" alt="alt text" width="500" height=""></kbd>

Check if the tests for **Insert()** and **peek()** are passing

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476164-b1090480-0232-11ea-9902-b88954321f2f.png" alt="alt text" width="300" height=""></kbd>

### Pull

First, check if there are elements in the heap

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476199-bfefb700-0232-11ea-97bd-7e46b3e16db4.png" alt="alt text" width="400" height=""></kbd>

Next, we need to save the element on the top of the heap (index 0), swap the
first and last elements, exclude the last element and demote the one at the top
until it has correct position

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476264-edd4fb80-0232-11ea-9464-473f19e24cb3.png" alt="alt text" width="400" height=""></kbd>

The **HeapifyDown()** function will demote the element at a given index until it
has no children or it is greater than its both children. The first check will be
our loop condition

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476298-034a2580-0233-11ea-8d39-5e6659add7f4.png" alt="alt text" width="500" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476327-0e9d5100-0233-11ea-8a20-a61f9bcaede4.png" alt="alt text" width="300" height=""></kbd>

Problem 2. Heap Sort
--------------------

You are given a skeleton. Find the static class Heap and implement the following
operation:

-   **void Sort(T[] array)** performs an in-place sort of the given array in
    **O(NlogN)** time complexity

Elements should be sorted from smallest to largest.

### Example

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476355-1e1c9a00-0233-11ea-9f9e-06cb755b9331.png" alt="alt text" width="400" height=""></kbd>

### Solution

The **Sort()** function first builds the heap (first loop) and then finds
correct position for each element (second loop)

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476378-3096d380-0233-11ea-85f4-e1121d082ba3.png" alt="alt text" width="400" height=""></kbd>

You will need a modified version of the **HeapifyDown()** operation that
receives the array and the border of unsorted/sorted elements

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476407-47d5c100-0233-11ea-9c8a-b33bae5a5178.png" alt="alt text" width="500" height=""></kbd>

Check if all tests pass

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476436-57550a00-0233-11ea-8d9a-5388199516c9.png" alt="alt text" width="300" height=""></kbd>

Congratulations, you have completed the lab for Heaps and Priority Queues!
