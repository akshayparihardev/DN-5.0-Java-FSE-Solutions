# 📦 Git Hands-On Lab 2: Using .gitignore

## 📖 Scenario

In a software development project, certain files such as log files, temporary files, cache files, and build artifacts should not be tracked by Git. Git provides the `.gitignore` file to specify which files and folders should be ignored during version control.

---

# 🎯 Objective

Learn how to ignore unwanted files and folders using the `.gitignore` file by:

- Creating a `.gitignore` file.
- Ignoring all `.log` files.
- Ignoring the `log` folder.
- Verifying ignored files using Git.

---

# 📂 Project Structure

```text
Git/
└── HOL_2/
    ├── .gitignore
    ├── app.log
    ├── log/
    │   └── sample.txt
    └── HOL2.md
```

---

# 🛠️ Technologies Used

- Git
- Git Bash
- Visual Studio Code
- GitHub

---

# 💻 Implementation Overview

### 1. Creating Ignored Files

Created the following items inside the project:

- `app.log`
- `log` directory

---

### 2. Creating .gitignore

Created a `.gitignore` file to specify files and folders that Git should ignore.

Contents of `.gitignore`:

```gitignore
*.log
log/
```

---

### 3. Verifying Ignored Files

Executed the `git status` command to verify that:

- `.log` files are ignored.
- `log` directory is ignored.
- Only the `.gitignore` file is tracked.

---

### 4. Staging Changes

Added the `.gitignore` file to the staging area.

---

### 5. Committing Changes

Committed the changes with an appropriate commit message.

---

### 6. Synchronizing Repository

Pushed the committed changes to the remote GitHub repository.

---

# ❓ Question 1: What is a .gitignore file?

A `.gitignore` file is a special Git configuration file that specifies which files and directories Git should ignore. Ignored files are not tracked or included in commits.

---

# ❓ Question 2: Why is .gitignore used?

`.gitignore` helps keep repositories clean by preventing unnecessary or temporary files from being committed, such as:

- Log files
- Temporary files
- Cache files
- Build outputs
- IDE-specific files

---

# ❓ Question 3: Explain the patterns used in this lab.

```text
*.log   → Ignores all files with the .log extension.

log/    → Ignores the entire log directory and all its contents.
```

---

# 📋 Git Commands Used

| Command | Description |
|----------|-------------|
| `git status` | Displays the repository status. |
| `git add` | Adds `.gitignore` to the staging area. |
| `git commit` | Creates a local commit. |
| `git push` | Uploads the commit to GitHub. |

---

# 📊 .gitignore Summary

| Pattern | Purpose |
|---------|---------|
| `*.log` | Ignore all log files. |
| `log/` | Ignore the log directory. |

---

# 📸 Sample Output

```text
On branch main

Untracked files:
    Git/HOL_2/.gitignore

Ignored files:
    Git/HOL_2/app.log
    Git/HOL_2/log/

nothing added to commit but untracked files present
```

---

# 📚 Concepts Learned

- .gitignore
- Ignoring files
- Ignoring directories
- Wildcard patterns
- Repository cleanliness
- Git Status
- Git Commit
- Git Push

---

# ✅ Conclusion

This hands-on lab demonstrated how to use the `.gitignore` file to prevent unwanted files and directories from being tracked by Git. By ignoring log files and directories, the repository remains clean, organized, and free from unnecessary files, making collaboration and version control more efficient.