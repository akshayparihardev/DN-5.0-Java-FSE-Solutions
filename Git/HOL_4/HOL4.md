# 📦 Git Hands-On Lab 4: Merge Conflict Resolution

## 📖 Scenario

In collaborative software development, multiple developers may modify the same file simultaneously. When changes conflict during merging, Git detects the conflict and requires manual resolution before completing the merge.

---

# 🎯 Objective

Learn how to resolve merge conflicts in Git by:

- Creating a feature branch.
- Making different changes in the same file.
- Creating a merge conflict.
- Resolving the conflict manually.
- Completing the merge successfully.
- Viewing the commit history.
- Deleting the merged branch.

---

# 📂 Project Structure

```text
Git/
└── HOL_4/
    ├── HOL4.md
    └── hello.xml
```

---

# 🛠️ Technologies Used

- Git
- Git Bash
- Visual Studio Code
- GitHub

---

# 💻 Implementation Overview

### 1. Creating a Branch

Created a new branch named **GitWork**.

---

### 2. Creating a File

Created a file named **hello.xml** inside the `HOL_4` directory and added sample XML content.

---

### 3. Committing Branch Changes

Added and committed the file in the `GitWork` branch.

---

### 4. Modifying the Main Branch

Switched back to the `main` branch and created the same file with different content.

---

### 5. Comparing Branches

Compared the differences between `main` and `GitWork` using the `git diff` command.

---

### 6. Merge Conflict

Merged the `GitWork` branch into `main`, resulting in a merge conflict because both branches modified the same file differently.

---

### 7. Conflict Resolution

Resolved the conflict manually by editing the conflicted file and committed the resolved version.

---

### 8. Viewing Commit History

Displayed the commit history using Git's graphical log.

---

### 9. Deleting the Branch

Deleted the `GitWork` branch after successfully merging it.

---

### 10. Synchronizing Repository

Pushed the resolved merge to the remote GitHub repository.

---

# ❓ Question 1: What is a Merge Conflict?

A merge conflict occurs when Git cannot automatically merge changes because the same file or the same lines have been modified differently in two branches.

---

# ❓ Question 2: How are Merge Conflicts resolved?

Merge conflicts are resolved by:

- Identifying the conflicted file.
- Editing the file manually.
- Choosing or combining the required changes.
- Saving the file.
- Adding the resolved file using `git add`.
- Creating a merge commit.

---

# ❓ Question 3: Why is Conflict Resolution important?

Conflict resolution ensures that the correct version of the code is preserved while combining work from multiple developers. It prevents accidental loss of changes and maintains project consistency.

---

# 📋 Git Commands Used

| Command | Description |
|----------|-------------|
| `git branch GitWork` | Creates a new branch. |
| `git checkout GitWork` | Switches to the new branch. |
| `git status` | Displays repository status. |
| `git add` | Adds files to the staging area. |
| `git commit` | Saves changes to the repository. |
| `git checkout main` | Switches to the main branch. |
| `git diff main GitWork` | Compares two branches. |
| `git merge GitWork` | Merges the feature branch into main. |
| `git log --oneline --graph --decorate --all` | Displays commit history graphically. |
| `git branch -d GitWork` | Deletes the merged branch. |
| `git push` | Uploads changes to GitHub. |

---

# 📊 Merge Conflict Workflow

```text
             GitWork
               │
        Modify hello.xml
               │
               ▼
main ─── Modify hello.xml
               │
               ▼
        Merge Conflict
               │
               ▼
      Manual Resolution
               │
               ▼
        Merge Commit
```

---

# 📸 Sample Output

```text
Auto-merging Git/HOL_4/hello.xml
CONFLICT (add/add): Merge conflict in Git/HOL_4/hello.xml
Automatic merge failed; fix conflicts and then commit the result.

[main] Resolved merge conflict
Deleted branch GitWork
```

---

# 📚 Concepts Learned

- Git Branching
- Git Merge
- Merge Conflict
- Conflict Resolution
- Git Diff
- Git Log
- Merge Commit
- Branch Deletion
- Version Control
- GitHub Synchronization

---

# ✅ Conclusion

This hands-on lab demonstrated how Git detects merge conflicts when different branches modify the same file. The conflict was resolved manually, committed successfully, and merged into the main branch. Understanding merge conflicts and their resolution is an essential skill for collaborative software development using Git.