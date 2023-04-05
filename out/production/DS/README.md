# Tree

## A tree is a Non-linear ds and a hirerarchy containing collection of nodes such that each node of the tree stores a value and a list of references to other nodes.

![Alt text](https://static.javatpoint.com/ds/images/ds-introduction9.png)

## 1. Binary tree - - - A tree ds where each parent node can have at most two children.

## 2. Binary Search Tree - - - Is a ds where we can easily maintain a sorted list of numbers.

## 3. AVL Tree - - - An AVL Tree is a self balancing Binary search tree where each nodes maintain a extra info known as a Balance factor whose value is either 0,-1,+1.

## 4. B-tree - - - It is a special type of self- balancing Binary Search Tree where each node consists of multiple keys and can have more than two children.

# Properties of Tree data structure

## Recursive data structure: The tree is also known as a recursive data structure. A tree can be defined as recursively because the distinguished node in a tree data structure is known as a root node.

## Number of edges: If there are n nodes, then there would n-1 edges.

## Depth of node x: The depth of node x can be defined as the length of the path from the root to the node x.

## Height of node x: The height of node x can be defined as the longest path from the node x to the leaf node.

# Tree Traversal -- It is a visiting every node in the tree.

## 1. inorder

### First visit all the node in left subtree

### Then the root node

### visit all right

![Alt text](https://cdn.programiz.com/sites/tutorial2program/files/tree_traversal_inorder-traversal.png)

![Alt text](https://cdn.programiz.com/sites/tutorial2program/files/tree_traversal_inorder-stack_0.png)

![Alt text](https://cdn.programiz.com/sites/tutorial2program/files/tree_traversal_inorder-stack_1.png)

## 2. preorder

### Visit root

### all left subtree node

### all right subtree

## 3. postorder

### visit all left subtree

### visit all right subtree

### visit root node
