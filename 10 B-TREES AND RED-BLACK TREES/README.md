10 Exercises: Implement Binary Search Tree
==========================================

This document defines the **in-class exercises** assignments for the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures).  
Your submissions can check in judge:
<https://judge.softuni.bg/Contests/624/B-Trees-and-Red-Black-Tree-CSharp-Lab>

This lab aims to implement the insertion functionality of a **red-black binary
search tree**. You are given the skeleton of a fully implemented **BST**.

Problem 1. Change the Node Data Structure
-----------------------------------------

First, you will need to add a **color bit** to our node class:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476858-93d53580-0234-11ea-8e0a-cd436b0808aa.png" alt="alt text" width="300" height=""></kbd>

Problem 2. Check Red Node
-------------------------

Add the following constants to your **RedBlackTree** class:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68476872-a0f22480-0234-11ea-8d56-af335ea339f6.png" alt="alt text" width="300" height=""></kbd>

Now create a helper method that will check if a node is red:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68477621-959ff880-0236-11ea-83a8-d3a2646c708e.png" alt="alt text" width="300" height=""></kbd>

Problem 3. Left Rotation
------------------------

Create a method that will accomplish the left rotation for a given node.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68477645-a51f4180-0236-11ea-8cfc-a9fb2e091686.png" alt="alt text" width="600" height=""></kbd>

Problem 4. Right Rotation
-------------------------

Create a method that will perform right rotation on a given node. The code is
similar to the left rotation.

Problem 5. Flip Colours
-----------------------

Implement a method that will make a node "**black**" and its children "**red**".

Problem 6. Insert
-----------------

Modify the existing **insert()** method. It should create new **red** node for
every insert, **balance** the tree and **recolour** the nodes if needed.

Problem 7. Run Unit Tests
-------------------------

<kbd><img src="https://user-images.githubusercontent.com/32310938/68477669-b6684e00-0236-11ea-8af2-22f5aa391d82.png" alt="alt text" width="400" height=""></kbd>

That's it, you're ready to start implementing delete. :)
