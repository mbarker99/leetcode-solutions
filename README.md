# 📘 LeetCode Solutions (Kotlin)

**Start Date:** 2026-01-29  
**Language:** Kotlin  
**IDE:** IntelliJ IDEA

---

## 🎯 Purpose

This repository documents my structured approach to strengthening my **data structures and algorithms** fundamentals while preparing for a **career pivot from Android development to backend engineering**.

As a native Android engineer, my day-to-day work historically emphasized UI architecture, state management, and platform-specific concerns rather than classical DSA-heavy problem solving. This repository represents a deliberate effort to close that gap and build strong algorithmic intuition expected in backend and systems-oriented roles.

This is not a dump of solved problems — it is a **learning log**. Which means, of course, that it is subject to structural changes over time; I will do my best to document these changes when they arise.

---

## 🧠 Learning Philosophy

For each problem, I focus on:

- Writing **clear, idiomatic Kotlin**
- Understanding **time and space complexity**
- Favoring **single-pass, optimal solutions**
- Maintaining **readable and explainable code**
- Separating **core logic** from **execution/testing code**

Problems are solved locally rather than directly on LeetCode to better simulate real-world development workflows.

---

## 🧩 Tech Stack & Tooling

### Language: Kotlin
- Kotlin is my primary language due to my Android background
- I plan to pursue **backend development with Spring**, making Kotlin a strategic choice
- Emphasis on:
    - Null-safety
    - Immutability where appropriate
    - Idiomatic constructs (`?.`, `?:`, scope functions)

### IDE: IntelliJ IDEA
- Used instead of the LeetCode editor for:
    - Better debugging
    - Static analysis
    - Refactoring tools
- Project is structured as a proper Kotlin application, not scripts

---

## 🗂️ Repository Structure

```text
src/
 └── leetcode/
     ├── utils/                # Shared data structures (ListNode, TreeNode, etc.)
     │
     ├── problems/
     │   ├── p0001_twosum/
     │   │   └── Solution.kt
     │   │
     │   ├── p0002_addtwonumbers/
     │   │   └── Solution.kt
     │
     └── runner/               # Runnable entry points for local testing
         └── Main.kt
