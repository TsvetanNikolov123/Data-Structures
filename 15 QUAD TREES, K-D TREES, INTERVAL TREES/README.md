15 Lab: Interval Trees, K-d Trees
=================================

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures).  
Submit your code in the SoftUni Judge -
<https://judge.softuni.bg/Contests/Practice/Index/644#0>

Problem 1. Interval Tree
------------------------

You are given a skeleton. Implement the following operations:

-   **Interval SearchAny(int, int)** returns any interval that intersects with a
    given lower and upper bound

-   **IEnumerable\<Interval\> SearchAll(int, int)** returns all intervals that
    intersect the given lower and upper bound

        public class IntervalTree
        {
            private Node root;
        
            public void Insert(double start, double end) { … }
        
            public Interval SearchAny(double start, double end) { … }
        
            public IEnumerable<Interval> SearchAll(double start, double end) { … }
        }


### Solution

You will need to update the max endpoint whenever you insert (or delete/balance)
a node

<kbd><img src="https://user-images.githubusercontent.com/32310938/68480798-4fe72e00-023e-11ea-9f34-33be21bfb53a.png" alt="alt text" width="500" height=""></kbd>

**GetMax()** returns the node that has greater max endpoint, while guarding
against null values

<kbd><img src="https://user-images.githubusercontent.com/32310938/68480844-6f7e5680-023e-11ea-9bfe-1a060f05eb4a.png" alt="alt text" width="300" height=""></kbd>

Search for any interval that intersects given bounds

<kbd><img src="https://user-images.githubusercontent.com/32310938/68526913-9e053b80-02e9-11ea-899a-4eb8d1b49f12.png" alt="alt text" width="500" height=""></kbd>

Searching for all intervals will do a recursive DFS, so you will need one method
to call the recursion

<kbd><img src="https://user-images.githubusercontent.com/32310938/68526916-aa899400-02e9-11ea-9161-a33950a34376.png" alt="alt text" width="500" height=""></kbd>

And the actual DFS

<kbd><img src="https://user-images.githubusercontent.com/32310938/68526925-b70dec80-02e9-11ea-9a93-6e93e45e6719.png" alt="alt text" width="600" height=""></kbd>

Problem 2. K-d Tree
-------------------

You are given a skeleton. Implement the following operations:

-   **void Insert(Point2D)** inserts a point into the tree

-   **bool Contains(Point2D)** shows if the tree contains a given point

        public class KdTree
        {
            private Node root;
        
            public void Insert(Point2D point) { … }
        
            public bool Contains(Point2D point) { … }
        
            public void EachInOrder(Action<Point2D> action) { … }
        }


### Solution

The only thing different than a regular BST is the comparison. Create a method
that will compare the point in a node and a second point, depending on the node
depth

<kbd><img src="https://user-images.githubusercontent.com/32310938/68526937-d9a00580-02e9-11ea-8e04-669d976b34fb.png" alt="alt text" width="500" height=""></kbd>

The other thing to consider is to pass the depth of a node when attemting to
insert or search for a point

<kbd><img src="https://user-images.githubusercontent.com/32310938/68526942-e886b800-02e9-11ea-85a4-3e26b06c1ac1.png" alt="alt text" width="500" height=""></kbd>
