# Discussions

## 2018-15-03

1. Seq abstraction
   1. first
   2. rest
   3. cons
2. Examples of seqs
    1. lists
    2. vectors
    3. sets
       - (?) Does this mean sets are ordered?
    4. map
       - as a list of vectors `([k v] [k v] ...)`
    5. What about a tree?
3. What is so great about seqs?
   - map
   - reduce
     - you can use reduce to implement map; how?
   - mapcat
     - map then concat `(concat (map f seq))`
   - why not use a for-loop?
   - take, drop, take-while, drop-while, filter, some
     - predicate function
4. Recursion?!?
   - tail-call optimization
5. _**Focus on what we can do, not how we do it!**_
