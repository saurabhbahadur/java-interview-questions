<h1 align="center" > Binary Search Tree </h1>
<p align="center" > DS </p>

### Binary Search Tree (BST)

+ The left subtree of a node contains nodes with keys less than the node's key.
+ The right subtree of a node contains nodes with keys greater than the node's key.
+ Both left and right subtrees must also be BSTs.

#### BST Properties

+ Unique Elements: No duplicate nodes.
+ `In-order` Traversal: Produces a sorted list of elements in ascending order.
+ Time Complexity:
    + `Average Case`: 𝑂(log𝑛) for insertion, deletion, and search.
    + `Worst Case`: 𝑂(𝑛), especially in cases where the tree is skewed (resembles a linked list).


#### Structure

```java
    class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}


```


### Basic Operation

+ Insertion 

```java


```

+ Search 

```java


```

+ Deletion


```java


```



### Traversals

+ `In-order` (Left, Root, Right) – for sorted output.
+ `Pre-order` (Root, Left, Right) – often used to copy the tree.
+ `Post-order` (Left, Right, Root) – useful for deleting nodes.

#### Balanced vs. Unbalanced BST
+ Balanced BST has 𝑂(log𝑛) height.
+ Unbalanced BST (like a skewed tree) has a height of 𝑂(𝑛), impacting performance.
+ Self-balancing BSTs like AVL Tree or Red-Black Tree maintain balance to ensure 𝑂(log𝑛) height.

#### Key Interview Tips
+ Edge Cases: Handle null nodes, duplicate values, and skewed trees.
+ Complexity Analysis: Be prepared to explain time complexity and situations that lead to worst-case scenarios.
+ Practical Applications: Searching, sorting, and maintaining sorted data are common use cases of BSTs.
