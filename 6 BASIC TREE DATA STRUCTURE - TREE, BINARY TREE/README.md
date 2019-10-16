06 Lab: Trees and Traversals
============================

This document defines the **in-class exercises** assignments the ["Data
Structures" course \@ Software
University](https://softuni.bg/opencourses/data-structures). You can submit your
code in the SoftUni Judge System -
<https://judge.softuni.bg/Contests/571/Basic-Tree-Data-Structures-CSharp-Lab>.

Part I – Implement a Tree
=========================

The first part of this lab aims to **implement a tree** (a node that holds a
value and multiple child nodes) and **traverse it** recursively.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376382-30260c00-0151-11ea-9d65-9ca16eb8fca2.png" alt="alt text" width="700" height=""></kbd>

In the figure above, the **tree nodes** hold a **value** and a **list of
descendent tree nodes**. It is recursive data structure.

Problem 1. Trees – Project Skeleton
-----------------------------------

You are given a **Visual Studio project skeleton** (unfinished project) holding
the unfinished **Tree\<T\>** and **BnaryTree\<T\>** classes and **unit tests**
for their functionality. The project holds the following assets:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376565-74191100-0151-11ea-8ad1-cb30db095269.png" alt="alt text" width="250" height=""></kbd>

The project skeleton opens correctly in **Visual Studio 2013** but can be open
in other Visual Studio versions as well and also can run in **SharpDevelop** and
**Xamarin Studio**.

The unfinished **Tree\<T\>** class stays in the file **Tree.cs**:

    Tree.cs
    ----------------------------------------------------------
    public class Tree<T>
    {
        public Tree(T value, params Tree<T>[] children) { … }
        public void Print(int indent = 0) { … }
        public void Each(Action<T> action) { … }
    }
    
The unfinished **BinaryTree\<T\>** class stays in the file **BinaryTree.cs**:

    BinaryTree.cs
    ------------------------------------------------------------
    public class BinaryTree<T>
    {
        public BinaryTree(T value, BinaryTree<T> leftChild = null,
            BinaryTree<T> rightChild = null) { … }
        public void PrintIndentedPreOrder(int indent = 0)  { … }
        public void EachInOrder(Action<T> action) { … }
        public void EachPostOrder(Action<T> action) { … }
    }

The project comes with **unit tests** covering the entire functionality of the
trees (see the files **UnitTestsTree.cs** and **UnitTestsBinaryTree.cs**):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376819-f3a6e000-0151-11ea-9571-b9f5d927a582.png" alt="alt text" width="800" height=""></kbd>

Problem 2. Run the Unit Tests to Ensure All of Them Initially Fail
------------------------------------------------------------------

**Run the unit tests** from the **Trees.Tests** project. Open the "**Test
Explorer**" window (Menu Test Windows Test Explorer) and run all tests. The
expected behavior is that all tests should fail:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376888-1507cc00-0152-11ea-9468-3d6a32469646.png" alt="alt text" width="500" height=""></kbd>

This is quite normal. We have unit tests, but the code covered by these tests is
missing. Let's write it.

Problem 3. Define the Tree\<T\> Data Structure
----------------------------------------------

The first step is to define the inner **data** hold **tree nodes**. It should
hold the node **value** and a list of **child nodes**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376927-29e45f80-0152-11ea-80b5-8ec1a43149c2.png" alt="alt text" width="500" height=""></kbd>

The source code might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68376948-38327b80-0152-11ea-98b5-d701f5a61555.png" alt="alt text" width="500" height=""></kbd>

Problem 4. Define the Tree\<T\> Constructor
-------------------------------------------

The next step is to define a **constructor** for the **Tree\<T\>** class to
ensure you can create:

-   **Leaf tree nodes** (holding a specified value) without child nodes, e.g.  
    
<kbd><img src="https://user-images.githubusercontent.com/32310938/68377035-59936780-0152-11ea-8821-0261e1420b2f.png" alt="alt text" width="300" height=""></kbd>

-   **Internal tree nodes** (holding a specified value) with child nodes, e.g.  
    
<kbd><img src="https://user-images.githubusercontent.com/32310938/68377078-716aeb80-0152-11ea-9a13-1943f350c7b6.png" alt="alt text" width="300" height=""></kbd>

You can use **optional parameters** for the child nodes to combine the above two
constructors. A sample source code is shown below:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68459352-cddf1100-020d-11ea-8aec-54db1d18b13d.png" alt="alt text" width="500" height=""></kbd>

The parameter **children** is optional, so it could be passed or skipped. The
goal is to allow creating trees by invoking **nested constructors** like these:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68459374-e2230e00-020d-11ea-9ea6-0f11394a86c0.png" alt="alt text" width="300" height=""></kbd>

Problem 5. Test the Tree\<T\> Constructor
-----------------------------------------

Now, test whether the **Tree\<T\>** and its constructor work as expected.

1.  Use the debugger to set a breakpoint in the file **PlayWithTrees.cs** just
    after the tree construction.

2.  Use the **[Locals]** debug window to browse the tree structure and the
    **child nodes** for each tree node.

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464019-77c39b00-0218-11ea-9e9c-5fd6643f405e.png" alt="alt text" width="500" height=""></kbd>

Problem 6. Define the Print() Method
------------------------------------

Now, we need to implement the **tree functionality**. First, implement the
**Print()** method. It works recursively:

-   Prints the current node **value** (indented a few spaces on the right).

-   Calls the **Print()** method recursively to **print all child nodes** of the
    current node.

The code might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464048-86aa4d80-0218-11ea-99b5-a5c09dbc89a0.png" alt="alt text" width="500" height=""></kbd>

Problem 7. Test the Print() Method
----------------------------------

To test the **Print()** method, **run the unit tests**. Some of them should pass
successfully:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464059-932ea600-0218-11ea-9e23-3809d76516ae.png" alt="alt text" width="500" height=""></kbd>

Problem 8. Implement "For Each" Traversal
-----------------------------------------

Now, implement the **Each(Action\<T\>)** method that **traverses the tree**
recursively from its root to its leaves and invokes the provided **action
function** for each visited tree node. It works as follows:

-   Process the current node **value** (invokes the action function on it).

-   Calls the **Each()** method recursively to **process all child nodes** of
    the current node.

The source code might look as follows:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464094-a80b3980-0218-11ea-85ff-e751330acda5.png" alt="alt text" width="500" height=""></kbd>

Problem 9. Test the Each(Action\<T\>) Method
--------------------------------------------

To test the **Each(Action\<T\>)** method, **run the unit tests**. All tests now
should pass successfully:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464119-b78a8280-0218-11ea-9483-1150f40f1170.png" alt="alt text" width="500" height=""></kbd>

The failed tests cover the **BinaryTree\<T\>** class, which is still not
implemented.

Congratulations! You have implemented your tree data structure.

Part II – DFS and BFS
=====================

### DFS

Start by locating you Tree\<T\>. Inside, define a method that will be visible
from the client

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464141-c4a77180-0218-11ea-91c3-71c22ed25764.png" alt="alt text" width="300" height=""></kbd>

The method should have a list in which it will gather the result, it will call a
private method that will traverse the tree and finally return the result

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464207-e0ab1300-0218-11ea-98f5-5739f3515fd8.png" alt="alt text" width="300" height=""></kbd>

Next, define the private method which will do the work and pass it the root of
the tree and a reference to the resulting list

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464224-ed2f6b80-0218-11ea-949e-d8dcdd272085.png" alt="alt text" width="400" height=""></kbd>

See if the tests pass

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464261-fddfe180-0218-11ea-8669-1d46f8654d04.png" alt="alt text" width="500" height=""></kbd>

### BFS

For BFS we will need only one method that will do all the work with two
collections, one for the algorithm and one for the result

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464284-0a643a00-0219-11ea-8e93-6333e3ebb707.png" alt="alt text" width="400" height=""></kbd>

Next, we need to enqueue the root node and then in a single loop, process the
next node in the queue and add all of its children to the end of the queue

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464328-1fd96400-0219-11ea-95c1-8e3e5dd218ea.png" alt="alt text" width="400" height=""></kbd>

See if the BFS tests pass

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464356-2ec01680-0219-11ea-97b2-bbf67daa0d9c.png" alt="alt text" width="500" height=""></kbd>

Part III – Implement a Binary Tree
==================================

The final part of this lab aims to implement a **binary tree** (a node that
holds a value + left and right child nodes).

Problem 10. Define the BinaryTree\<T\> Data Structure
-----------------------------------------------------

The first step is to define the inner **data** hold **binary tree nodes**. It
should hold the node **value** + **left** and **right child nodes** (both of
them are optional and can be **null**):

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464399-40092300-0219-11ea-9fec-97291f6c8a12.png" alt="alt text" width="400" height=""></kbd>

The source code might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464454-544d2000-0219-11ea-9441-203763ae7391.png" alt="alt text" width="400" height=""></kbd>

Problem 11. Define the BinaryTree\<T\> Constructor
--------------------------------------------------

The next step is to define a **constructor** for the **BinaryTree\<T\>** class
to ensure you can create:

-   **Leaf tree nodes** (holding a specified value) without child nodes, e.g.  
    

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464493-63cc6900-0219-11ea-8115-58a9c97e8b83.png" alt="alt text" width="400" height=""></kbd>


-   **Internal tree nodes** (holding a specified value) with left and right
    child nodes, e.g.  
    

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464642-9fffc980-0219-11ea-850a-0e34d94cc556.png" alt="alt text" width="400" height=""></kbd>


You can use **optional parameters** (holding **null** by default) for the child
nodes to combine the above two constructors. A sample source code is shown
below:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464674-b27a0300-0219-11ea-82ba-0c726f2d8c0f.png" alt="alt text" width="400" height=""></kbd>

The parameters **leftChild** and **rightChild** are optional and can be passed
or skipped. This will allow constructing binary tree like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464762-d63d4900-0219-11ea-9603-bdac4fb14477.png" alt="alt text" width="400" height=""></kbd>

Problem 12. Test the BinaryTree\<T\> Constructor
------------------------------------------------

Now, test whether the **BinaryTree\<T\>** and its constructor work as expected.

1.  Use the debugger to set a breakpoint in the file **PlayWithTrees.cs** just
    after the binary tree construction.

2.  Use the **[Locals]** debug window to browse the binary tree structure and
    the **child nodes** for each tree node (left and right child).

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464784-e5bc9200-0219-11ea-99c2-9d5ae071994a.png" alt="alt text" width="600" height=""></kbd>


Problem 13. Define the PrintIndentedPreOrder() Method
-----------------------------------------------------

Now, we need to implement the **binary tree functionality**. First, implement
the **PrintIndentedPreOrder()** method. It prints the tree in pre-order (root;
left; right), indented visually like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464825-fa008f00-0219-11ea-8711-895541e9a944.png" alt="alt text" width="80" height=""></kbd>

The **PrintIndentedPreOrder()** method works recursively:

-   Prints the current node **value** (indented a few spaces on the right).

-   Calls the **PrintIndentedPreOrder()** method recursively to **print the left
    child** of the current node (when exists).

-   Calls the **PrintIndentedPreOrder()** method recursively to **print the
    right child** of the current node (when exists).

The code might look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464862-0d135f00-021a-11ea-9a40-b29ecb2e4566.png" alt="alt text" width="500" height=""></kbd>

Problem 14. Test the PrintIndentedPreOrder() Method
---------------------------------------------------

To test the **PrintIndentedPreOrder()** method, **run the unit tests**. Some of
them should pass successfully:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464900-1e5c6b80-021a-11ea-936b-6c4e06ae7993.png" alt="alt text" width="500" height=""></kbd>

Problem 15. Implement the EachInOrder(Action\<T\>) Method
---------------------------------------------------------

Next, let's implement the **EachInOrder(Action\<T\>)** method that traverses the
binary tree in **in-order** (left; root; right). It is again recursive, very
similar to the previous method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464940-2b795a80-021a-11ea-8285-260e5911ce4c.png" alt="alt text" width="500" height=""></kbd>

Problem 16. Test the EachInOrder(Action\<T\>) Method
----------------------------------------------------

To test the **EachInOrder(Action\<T\>)** method, **run the unit tests**. One
more test now should pass successfully:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464966-38964980-021a-11ea-93ac-ba427a09cc69.png" alt="alt text" width="500" height=""></kbd>

Problem 17. Implement the EachPostOrder(Action\<T\>) Method
-----------------------------------------------------------

Next, let's implement the **EachPostOrder(Action\<T\>)** method that traverses
the binary tree in **post-order** (left; right; root). It is again recursive,
very, very similar to the previous method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68464992-42b84800-021a-11ea-95c3-ce452b93d258.png" alt="alt text" width="500" height=""></kbd>

Problem 18. Test the EachPostOrder(Action\<T\>) Method
------------------------------------------------------

To test the **EachPostOrder(Action\<T\>)** method, **run the unit tests**. All
tests should now pass successfully:

<kbd><img src="https://user-images.githubusercontent.com/32310938/68465014-4ea40a00-021a-11ea-8e5b-a2ce86514c9c.png" alt="alt text" width="500" height=""></kbd>

<br/>

### Solution: <a title="Trees and Traversals" href="">Trees and Traversals</a>

---