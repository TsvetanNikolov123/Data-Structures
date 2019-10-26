Lab: AVL Tree Insertion
=======================

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures). Submit your code in
the SoftUni Judge -
<https://judge.softuni.bg/Contests/632/AVL-Trees-and-AA-Trees-Java-Lab>.

AVL Tree Insertion 
-------------------

You are given a skeleton that supports the following operations:

-   **Node\<T\> Root** returns the root of the AVL tree

-   **bool Contains(T item)** checks if an element exists

-   **void EachInOrder(Action\<T\> action)** performs an action in order on each
    element

-   **void Insert(T item)** inserts an item into the tree

        public class AVL<T> where T : IComparable<T>
        {
            private Node<T> root;
            public Node<T> Root { get { return this.root; } }
            public bool Contains(T item) { … }
            public void Insert(T item) { … }
            public void EachInOrder(Action<T> action) { … }
        }


And a node class:

        public class Node<T> where T : IComparable<T>
        {
            public T Value;
            public Node<T> Left;
            public Node<T> Right;
            public int Height;
        
            public Node(T value)
            {
                this.Value = value;
                this.Height = 1;
            }
        }


Your task is to balance the tree after each insertion.

### Height

First, you should update the height of all nodes along an insertion path

You will need a method to find a node's height

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478697-3099d200-0239-11ea-9daf-a1ea619e176c.png" alt="alt text" width="400" height=""></kbd>

And a method to update a node's height

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478735-4f986400-0239-11ea-9a9f-bb3b6898dbe9.png" alt="alt text" width="600" height=""></kbd>

Consider when it is appropriate to update the height of a node

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478764-5fb04380-0239-11ea-93f7-08377a5fb492.png" alt="alt text" width="250" height=""></kbd>

Check if Height tests pass

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478793-7060b980-0239-11ea-96ef-ff1e9fa41650.png" alt="alt text" width="500" height=""></kbd>

### Rotations

If you find it difficult to imagine the links that need to be updated in a
rotation, refer to the presentation

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478813-7a82b800-0239-11ea-82e9-37e015915a7a.png" alt="alt text" width="400" height=""></kbd>

The right rotation is analogous.

### Balancing

Start by creating the method

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478833-88383d80-0239-11ea-845a-8357dcf5cdbb.png" alt="alt text" width="500" height=""></kbd>

The first case (first if statement)

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478852-9423ff80-0239-11ea-9c83-d54e59e4b369.png" alt="alt text" width="600" height=""></kbd>

Right rotation is analogous to the left. Make sure that all tests pass:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68478882-a140ee80-0239-11ea-9da1-5f80f61efd8c.png" alt="alt text" width="500" height=""></kbd>

Congratulations, you have completed the lab for AVL Trees.
