08 Homework: Basic Tree Data Structures
=======================================

This document defines the **homework assignments** for the ["Data Structures"
course \@ Software
University](https://softuni.bg/trainings/1147/Data-Structures-June-2015).

Problem 0. Introduction
-----------------------

You are given a **tree of N nodes** represented as a set of N-1 pairs of nodes
(parent node, child node). Below are the operations that you are going
implement.

<img src="https://user-images.githubusercontent.com/32310938/68470461-cd05a980-0224-11ea-93b5-73af3f99bb7c.png" alt="alt text" width="900" height="">

Problem 1. Root Node
--------------------

Write a program to read the tree and find its **root** node:

<img src="https://user-images.githubusercontent.com/32310938/68470560-f9212a80-0224-11ea-9a04-df7509167755.png" alt="alt text" width="600" height="">

**Hints**

Use the recursive **Tree\<T\>** definition. Keep the **value**, **parent** and
**children** for each tree node:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470697-42717a00-0225-11ea-8744-d1a2ab5a73e4.png" alt="alt text" width="500" height=""></kbd>

Modify the **Tree\<T\> constructor** to **assign a parent** for each child node:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470719-4f8e6900-0225-11ea-9592-23a5c22b4803.png" alt="alt text" width="400" height=""></kbd>

Use a **dictionary** to map nodes by their value. This will allow you to find
the tree nodes during the tree construction (when you read the input data, you
get the node values):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470756-65039300-0225-11ea-8332-329bfb7625aa.png" alt="alt text" width="700" height=""></kbd>

Write a method to **find the tree node by its value or create a new node** if it
does not exist:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470801-777dcc80-0225-11ea-8dc3-56e745123236.png" alt="alt text" width="500" height=""></kbd>

Create a method for adding an edge to the tree

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470843-8ebcba00-0225-11ea-9bed-f699801001a9.png" alt="alt text" width="500" height=""></kbd>

Now you are ready to **create the tree**. You are given the **tree edges**
(parent + child). Use the dictionary to lookup the parent and child nodes by
their values:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470875-a136f380-0225-11ea-8df5-5deaaf569bbc.png" alt="alt text" width="500" height=""></kbd>

Finally, you can find the root (the node that has no parent)

<kbd><img src="https://user-images.githubusercontent.com/32310938/68470898-aac05b80-0225-11ea-92cc-f762defd79f6.png" alt="alt text" width="500" height=""></kbd>

Problem 2. Print Tree
---------------------

Write a program to read the tree from the console and print it in the following
format (each level indented +2 spaces):

<img src="https://user-images.githubusercontent.com/32310938/68470940-c0ce1c00-0225-11ea-9633-45e14e7f76db.png" alt="alt text" width="600" height="">

**Hints**

Find the root and recursively print the tree

Problem 3. Leaf Nodes
---------------------

Write a program to read the tree and find all **leaf** nodes (in increasing
order):

<img src="https://user-images.githubusercontent.com/32310938/68471048-0a1e6b80-0226-11ea-87f1-44998312eb91.png" alt="alt text" width="800" height="">

**Hints**

Find the all nodes that have no children

Problem 4. Middle Nodes
-----------------------

Write a program to read the tree and find all **middle** nodes (in increasing
order):

<img src="https://user-images.githubusercontent.com/32310938/68471120-2de1b180-0226-11ea-9ebb-585e4a1c406c.png" alt="alt text" width="900" height="">

**Hints**

<kbd><img src="https://user-images.githubusercontent.com/32310938/68471172-4fdb3400-0226-11ea-80a7-09b15982d64a.png" alt="alt text" width="700" height=""></kbd>

Problem 5. \* Deepest Node
--------------------------

Write a program to read the tree and find its deepest node (leftmost):

<img src="https://user-images.githubusercontent.com/32310938/68471210-66818b00-0226-11ea-9e70-74be594d49e7.png" alt="alt text" width="600" height="">

Problem 6. Longest Path
-----------------------

Find the **longest path** in the tree (the leftmost if several paths have the
same longest length)

<img src="https://user-images.githubusercontent.com/32310938/68473607-1e656700-022c-11ea-8e72-99d3878b6544.png" alt="alt text" width="600" height="">

Problem 7. All Paths With a Given Sum
-------------------------------------

Find all paths in the tree with **given sum** of their nodes (from the leftmost
to the rightmost)

<img src="https://user-images.githubusercontent.com/32310938/68473637-2fae7380-022c-11ea-9d4b-48dfc6133dbf.png" alt="alt text" width="600" height="">

Problem 8. \* All Subtrees With a Given Sum
-------------------------------------------

Find all **subtrees with given sum** of their nodes (from the leftmost to the
rightmost). Print subtrees in **pre-order** sequence

<img src="https://user-images.githubusercontent.com/32310938/68473665-41901680-022c-11ea-8fc1-c6c7c015d545.png" alt="alt text" width="600" height="">

Exercises: Binary Search Trees
==============================

This document defines the **exercise assignments** for the ["Data Structures"
course \@ Software
University](https://softuni.bg/trainings/1857/data-structures-january-2018). You
can submit your **C\#** code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/604/Binary-Search-Trees-CSharp-Exercise>. You
can submit your **Java** code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/607/Binary-Search-Trees-Java-Exercise>.

Implement BST Operations
========================

You are given a skeleton, in which you will find implemented the following
operations:

-   **void Insert(T)** – Recursive implementation

-   **void EachInOrder(Action\<T\>)** – In-Order traversal

-   **bool Contains(T)** – Iterative implementation

-   **BST\<T\> Search(T)** – Returns copy of the BST

-   **IEnumerable\<T\> Range(T, T)** – Returns collection with the elements
    found in the BST. Both borders are **inclusive**.

-   **DeleteMin()** – Deletes the smallest element in the tree. Throws exception
    if the tree is empty.

You will need to implement the rest of the operations, that are defined below:

<img src="https://user-images.githubusercontent.com/32310938/68473716-5e2c4e80-022c-11ea-9fb0-c7d04c91f94f.png" alt="alt text" width="900" height="">

Problem 1. Delete Max
---------------------

Implement a **method** which **deletes** the **max element** in a BST (Binary
Search Tree). If the tree is empty it should throw exception. The logic is
similar to the **DeleteMin()** method, but you need to traverse the tree to the
right.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473735-6f755b00-022c-11ea-84ef-8ccb7884f4d2.png" alt="alt text" width="600" height=""></kbd>

Problem 2. Count
----------------

Implement a **method** which returns the count of elements in the BST.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473763-8156fe00-022c-11ea-9029-7df0b51711a8.png" alt="alt text" width="600" height=""></kbd>

### Hints

In order to implement the count, we will create a new field in our **Node**
class:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473801-9895eb80-022c-11ea-9fc2-338bbbf9888d.png" alt="alt text" width="300" height=""></kbd>

Now we can create new method **Count(Node)**, which will recursively find the
count of elements:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473832-aa778e80-022c-11ea-83cd-787b905e6b0f.png" alt="alt text" width="300" height=""></kbd>

If our current node is **null**, we will return 0. Otherwise, we will return the
count of our current node:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473869-bcf1c800-022c-11ea-8696-97c8dc91a781.png" alt="alt text" width="300" height=""></kbd>

Now we only have to modify our **Insert()** method. It will set the count of
elements of our new node to the count of its children nodes plus itself:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473893-caa74d80-022c-11ea-98ce-de60172c6901.png" alt="alt text" width="600" height=""></kbd>

Next, we need to find a way to update the recalculate the count for each node
when **DeleteMin()** is invoked. One way would be to change the **DeleteMin()**
implementation to be recursive:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473927-e14da480-022c-11ea-9367-35e7af87814c.png" alt="alt text" width="400" height=""></kbd>

What will happen if our tree is empty and we call **DeleteMin()**? **Fix** it.
Our count is ready.

Problem 3. Rank
---------------

Implement a **method** which **returns** the **count** of elements **smaller
than** a given **value**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68473941-ef032a00-022c-11ea-97dc-7ff9c3d9600f.png" alt="alt text" width="600" height=""></kbd>

### Hints

Create a new recursive method that will **return 0** if the node is null:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474078-312c6b80-022d-11ea-998b-74d473b85549.png" alt="alt text" width="500" height=""></kbd>

Then, we need to **compare the element** with the value of the node we are
currently looking at. If the element is **smaller**, we can **go to the left**.
If its **larger**, we need to **get the count of the left** elements and **go to
the right**. If we **find the element**, we will return the **count of
elements**, **smaller** than it.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474095-3be70080-022d-11ea-8e11-b6b4916454ce.png" alt="alt text" width="600" height=""></kbd>

You can try it out, it should work as expected.

Problem 4. Select
-----------------

Implement a **method** which accepts a number (**n**) and **returns** the first
**element** which has exactly **n** elements **smaller** than it. Use the logic
from **Count()** and **Rank()** to implement it.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474124-4d300d00-022d-11ea-9e50-93b9033a6e3f.png" alt="alt text" width="700" height=""></kbd>

Problem 5. Floor
----------------

Implement a **method** which **finds** (returns) the **nearest smaller value**
than given in the BST. This operation is similar to **DeleteMin()**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474152-5de08300-022d-11ea-8a46-f4971e31dec4.png" alt="alt text" width="700" height=""></kbd>

Problem 6. Ceiling
------------------

Implement a **method** which **finds** (returns) the **nearest larger value**
than given in the BST. This operation is similar to **Floor()** and
**DeleteMax()**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474249-94b69900-022d-11ea-9971-d0169f90c9c2.png" alt="alt text" width="700" height=""></kbd>

Problem 7. Delete\*
-------------------

Implement a **method** which deletes a node with given value.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474282-a5ffa580-022d-11ea-8fe4-6f52b41829bc.png" alt="alt text" width="700" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/68474301-af890d80-022d-11ea-9944-d2d872fb607f.png" alt="alt text" width="700" height=""></kbd>
