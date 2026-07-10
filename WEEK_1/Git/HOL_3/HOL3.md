# 📦 Git Hands-On Lab 3: Branching and Merging

## 📖 Scenario

In a collaborative software development environment, multiple developers work on different features simultaneously. Git branching allows developers to work independently without affecting the main codebase, while merging combines completed work back into the main branch.

---

# 🎯 Objective

Perform branching and merging operations in Git by:

- Creating a new branch.
- Listing available branches.
- Switching between branches.
- Adding and committing changes in a branch.
- Comparing branches.
- Merging a branch into the main branch.
- Viewing commit history.
- Deleting the merged branch.

---

# 📂 Project Structure

```text
Git/
└── HOL_3/
    ├── HOL3.md
    └── branch.txt
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

Created a new branch named **GitNewBranch** from the main branch.

---

### 2. Listing Branches

Displayed all available local branches and identified the current branch using the `*` symbol.

---

### 3. Switching Branches

Switched from the `main` branch to `GitNewBranch` to work independently.

---

### 4. Adding Files

Created a new file named **branch.txt** inside the `HOL_3` directory.

---

### 5. Committing Changes

Added the new file to the staging area and committed the changes in the `GitNewBranch`.

---

### 6. Comparing Branches

Compared the differences between the `main` branch and `GitNewBranch` using the `git diff` command.

---

### 7. Merging Branches

Merged `GitNewBranch` into the `main` branch using the Git merge command.

---

### 8. Viewing Commit History

Displayed the commit history in graphical format using the Git log command.

---

### 9. Deleting the Branch

Deleted the merged branch after confirming that the merge was successful.

---

### 10. Synchronizing Repository

Pushed the merged changes from the local repository to the remote GitHub repository.

---

# ❓ Question 1: What is a Git Branch?

A Git branch is an independent line of development that allows developers to work on new features or bug fixes without affecting the main branch. Once the work is completed, it can be merged back into the main branch.

---

# ❓ Question 2: Why is Branching used?

Branching allows developers to:

- Develop new features independently.
- Fix bugs without disturbing the main code.
- Collaborate with multiple developers simultaneously.
- Safely experiment with changes.

---

# ❓ Question 3: What is Merging?

Merging is the process of combining changes from one branch into another. After verifying the work on a feature branch, it is merged into the main branch so that the changes become part of the project.

---

# 📋 Git Commands Used

| Command | Description |
|----------|-------------|
| `git branch GitNewBranch` | Creates a new branch. |
| `git branch` | Lists all local branches. |
| `git checkout GitNewBranch` | Switches to the new branch. |
| `git status` | Displays repository status. |
| `git add` | Adds files to the staging area. |
| `git commit` | Saves changes to the branch. |
| `git diff main GitNewBranch` | Shows differences between branches. |
| `git checkout main` | Switches back to the main branch. |
| `git merge GitNewBranch` | Merges the feature branch into the main branch. |
| `git log --oneline --graph --decorate` | Displays commit history graphically. |
| `git branch -d GitNewBranch` | Deletes the merged branch. |
| `git push` | Uploads merged changes to GitHub. |

---

# 📊 Branching Workflow

```text
main
 │
 ├───────────────┐
 │               │
 │         GitNewBranch
 │               │
 │     Add Files & Commit
 │               │
 └────── Merge ──┘
         │
       main
```

---

# 📸 Sample Output

```text
PS> git branch
  GitNewBranch
* main

PS> git checkout GitNewBranch
Switched to branch 'GitNewBranch'

PS> git merge GitNewBranch
Updating ...
Fast-forward

PS> git branch -d GitNewBranch
Deleted branch GitNewBranch
```

---

# 📚 Concepts Learned

- Git Branch
- Git Merge
- Branch Switching
- Commit History
- Git Diff
- Git Log
- Fast-Forward Merge
- Branch Deletion
- Version Control
- GitHub Synchronization

---

# ✅ Conclusion

This hands-on lab demonstrated how to create and manage Git branches, make independent changes, compare branches, merge completed work into the main branch, and remove unnecessary branches after merging. These operations are fundamental for collaborative software development and efficient version control using Git.