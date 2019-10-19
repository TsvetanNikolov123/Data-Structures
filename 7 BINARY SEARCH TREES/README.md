07 Exercises: Implement Binary Search Tree
==========================================

This document defines the **in-class exercises** assignments for the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures).  
You can submit your code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/603/Binary-Search-Trees-CSharp-Lab>

Part I: Implement Insert, Contains and Search
=============================================

The third part of this lab aims to implement a **binary search tree** (ordered
binary tree).

Problem 1. Define the Node Data Structure
-----------------------------------------

First, you will need a node to store the data of each tree and a pointer to the
root of the tree.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68465635-7c3d8300-021b-11ea-8f9b-218635c5d14e.png" alt="alt text" width="700" height=""></kbd>

Problem 2. Iteration
--------------------

Implement the **EachInOrder** method, so you have a way to iterate over tree
nodes

<kbd><img src="https://user-images.githubusercontent.com/32310938/68465728-b1e26c00-021b-11ea-8a6c-14e12048ae7a.png" alt="alt text" width="500" height=""></kbd>

Problem 3. Implement Contains
-----------------------------

We will consider the non-recursive implementation. Start at the root and compare
the searched value with the roots value. If the searched value is less it could
be in the left subtree, if it is greater it could be in the right subtree:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468451-bd846180-0220-11ea-8c43-3939c84985bf.png" alt="alt text" width="500" height=""></kbd>

Problem 4. Implement Insert
---------------------------

Insert is very similar to Contains. Before traversing however, you should check
if there are any elements in the tree. If not, set the root:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468483-c9702380-0220-11ea-8a6d-439c3bcf7372.png" alt="alt text" width="400" height=""></kbd>

Next, traverse the tree, but hold reference to both current node and its parent

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468504-d55be580-0220-11ea-9e0f-b478bc854a46.png" alt="alt text" width="400" height=""></kbd>

Finally, insert the new node:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468547-e9074c00-0220-11ea-8b47-c62e444a72b2.png" alt="alt text" width="400" height=""></kbd>

Problem 5. Implement Search
---------------------------

Search is very similar to Contains. First of all, it should return
**BinarySearchTree\<T\>**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468572-f6243b00-0220-11ea-9f54-188581f14436.png" alt="alt text" width="400" height=""></kbd>

You will start by finding the element:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468606-089e7480-0221-11ea-880b-c919633e6fe1.png" alt="alt text" width="400" height=""></kbd>

Now you only need to return the element you found:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468667-28359d00-0221-11ea-95fb-f799f40a4168.png" alt="alt text" width="400" height=""></kbd>

In order for that to work, we need to implement a new private **constructor**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468739-47ccc580-0221-11ea-83bd-eb685d9dffe1.png" alt="alt text" width="300" height=""></kbd>

Finally, you need to implement the **Copy()** method that will copy the elements
in exactly the same way in which they exist in the parent tree (Pre-Order
traversal):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68468773-5b782c00-0221-11ea-9ea0-a04563a778b2.png" alt="alt text" width="300" height=""></kbd>

Problem 6. Run Unit Tests
-------------------------

Run the unit tests and ensure that some of them work correctly:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469089-1e606980-0222-11ea-94f1-ab493a5dbff6.png" alt="alt text" width="500" height=""></kbd>

In the next parts, we will implement the rest of the methods.

Part II: Implement DeleteMin and Range
======================================

Problem 7. Implement Delete Min
-------------------------------

**DeleteMin** consists of three steps. Check if the root is null. If not, find
the parent of the min element and set its left child to be the min's right
child.

Check if root is not null

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469106-27e9d180-0222-11ea-925f-f3175d9136e9.png" alt="alt text" width="300" height=""></kbd>

Find the min element's parent

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469126-3637ed80-0222-11ea-998d-b2c5d8a98ec7.png" alt="alt text" width="300" height=""></kbd>

If you found such a parent set its left child to be the min's right

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469152-464fcd00-0222-11ea-8fa6-ca06ea98043c.png" alt="alt text" width="300" height=""></kbd>

Problem 8. Implement Range
--------------------------

**Range** will be implemented using a queue of **T**. First, let's implement the
public **Range(T, T)** method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469777-7fd50800-0223-11ea-9fba-57a8c90bc515.png" alt="alt text" width="500" height=""></kbd>

Now create a new method, that will take the **Node** and our queue as
parameters:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469794-88c5d980-0223-11ea-8e11-4ff0b8fa1aa8.png" alt="alt text" width="500" height=""></kbd>

We need to verify that our node is not **null** and this will be the bottom of
our recursion. Now, we need to find if our node is in the lower and higher range
borders:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469808-92e7d800-0223-11ea-9d59-8ec444da0433.png" alt="alt text" width="500" height=""></kbd>

Finally, we have to implement **in-order** traversal for the items that are in
the range. Recursively **go to the left** if our node value is **bigger** than
the lower range, and **go to the right** if our node value is **smaller** than
the higher range border. If we found the element between the recursive calls, we
need to add it to the queue:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469822-9da26d00-0223-11ea-842e-a3a7a911d627.png" alt="alt text" width="500" height=""></kbd>

Problem 9. Run Unit Tests
-------------------------

Run the unit tests and ensure that all of them pass successfully.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68469850-a98e2f00-0223-11ea-9b5e-cbaf94be1282.png" alt="alt text" width="500" height=""></kbd>

That's it. You're ready to begin the exercise!
