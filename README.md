# Implement-Trie

## trie
A Trie is a tree-like data structure used to efficiently store and search for strings. The key feature of a Trie is that it allows for fast prefix matching. Trie implementation problem typically involves building and searching a Trie data structure.

##example 
Given a list of words, implement a Trie data structure that allows for fast searching of words by their prefix.
to solve this problem, you would start by defining a TrieNode class, which represents a node in the Trie. Each node contains a boolean flag to indicate whether it represents the end of a word, a HashMap that maps characters to child nodes, and a count variable to keep track of the number of times a particular word appears in the list.

Then, you would create a Trie class that contains a root node and methods to insert words into the Trie and search for words by prefix. The insert method would take a word, split it into individual characters, and traverse the Trie, adding new nodes as needed. When it reaches the end of the word, it sets the endOfWord flag for the final node. The search method would take a prefix, traverse the Trie, and return a list of words that start with the given prefix.

Input
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
Output
[null, null, true, false, true, null, true]

Explanation
Trie trie = new Trie();

trie.insert("apple");

trie.search("apple");   // return True

trie.search("app");     // return False

trie.startsWith("app"); // return True

trie.insert("app");

trie.search("app");     // return True
