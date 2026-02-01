# LeetCode 70 — Technical Interview Prep

My personal journey through 70 carefully curated LeetCode problems designed to master fundamental concepts, build consistency, and systematically prepare for technical interviews.

## 🎯 Purpose

This repository is my structured approach to interview preparation, focusing on:

- **Concept Mastery**: Understanding core algorithmic patterns (arrays, hashmaps, two pointers, sliding window, recursion, DFS/BFS, dynamic programming, greedy algorithms) rather than memorizing solutions
- **Build Consistency**: Daily practice to develop problem-solving intuition and strengthen pattern recognition
- **Track Progress**: Visual feedback on completed problems to maintain momentum and identify areas needing improvement

## 📁 Repository Structure

Each problem lives in its own numbered folder:

```
1. contains-duplicate/
   ├── README.md       # Problem statement, difficulty, tags, and LeetCode link
   └── Solution.java     # LeetCode starter code + my implementation

2. missing-number/
   ├── README.md
   └── Solution.java
...
```

## 🚀 Workflow

### 1. Add a New Problem
```bash
python3 question.py 
# Paste LeetCode URL when prompted (e.g., https://leetcode.com/problems/two-sum/)
```
> **Note**: The file `question.py` has been intentionally added to gitignore

This automatically:
- Creates a numbered folder (e.g., `1. two-sum/`)
- Fetches and saves `README.md` with problem details
- Downloads the Java method signature to `Solution.java`

### 2. Solve the Problem
- Read `README.md` to understand requirements
- Identify the underlying pattern (hashmap? two pointers? dynamic programming?)
- Implement in `Solution.java`
- Focus on optimal time/space complexity
- Add comments explaining the approach for future review

## 🎓 Learning Goals

1. **Pattern Recognition**: Identify the correct approach within 2-3 minutes
2. **Optimal Solutions**: Always strive for best time/space complexity
3. **Clear Communication**: Write explanatory comments (crucial for interviews)
4. **Consistency**: Solve 1+ problem daily, review 2-3 previous solutions weekly
5. **Identify Weaknesses**: Track which patterns take longest and revisit those

## 📝 Study Strategy

- **First Pass**: Attempt the problem independently for 20-30 minutes
- **Stuck?**: Review hints/approach patterns, then re-attempt
- **After Solving**: Analyze time/space complexity and explore alternative approaches
- **Spaced Repetition**: Revisit problems after 1 week, then 1 month for retention

## 💡 Key Concepts Covered

The 70 problems span essential interview topics:
- Arrays & Strings
- Hash Tables
- Two Pointers & Sliding Window
- Stacks & Queues
- Linked Lists
- Trees & Graphs (DFS/BFS)
- Binary Search
- Recursion & Backtracking
- Dynamic Programming
- Greedy Algorithms
- Heaps & Priority Queues

## ⚠️ Notes

- LeetCode starter code fetching may fail for premium problems or require authentication (fallback template used)
- Focus on understanding **why** solutions work, not just coding them
- Quality over quantity — deeply understanding 70 problems beats superficially solving 300

---

**Consistency is key.** Small daily progress compounds into interview confidence and mastery of fundamental concepts.
