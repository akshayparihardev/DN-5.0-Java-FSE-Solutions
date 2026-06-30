# 📦 Git Hands-On Lab 1: Git Configuration & Basic Git Commands

## 📖 Scenario

A software development team requires a version control system to efficiently track source code changes, collaborate with multiple developers, and maintain project history. Git is a distributed version control system that enables developers to manage code revisions, collaborate seamlessly, and synchronize local repositories with remote repositories.

---

# 🎯 Objective

Perform the basic Git setup and learn the fundamental Git workflow by:

- Configuring Git with user information
- Verifying Git installation and configuration
- Initializing and managing a Git repository
- Creating and tracking files
- Checking repository status
- Committing changes to the local repository
- Synchronizing the local repository with a remote GitHub repository

---

# 📂 Project Structure

```text
Git/
└── HOL_1/
    ├── HOL1.md
    └── welcome.txt
```

---

# 🛠️ Technologies Used

- Git
- Git Bash
- Visual Studio Code
- GitHub

---

# 💻 Implementation Overview

### Git Configuration

Configured Git with:

- User Name
- Email Address

Verified the configuration using Git commands.

---

### Repository Management

Performed the following Git operations:

- Checked repository status
- Added files to the staging area
- Created commits
- Pushed changes to the remote repository
- Pulled the latest changes from the remote repository

---

### File Creation

Created a file named:

```
welcome.txt
```

with the following content:

```
Welcome to the version control
```

---

# ❓ Question 1: Why is Git used in software development?

Git is a distributed version control system that helps developers track changes in source code, maintain project history, collaborate with team members, and restore previous versions whenever required.

It enables multiple developers to work on the same project simultaneously without overwriting each other's changes.

---

# ❓ Question 2: What is the purpose of configuring Git?

Git configuration stores the developer's identity, including:

- User Name
- Email Address

These details are attached to every commit, allowing Git to identify the author of each change.

---

# ❓ Question 3: Explain the basic Git workflow.

The basic Git workflow consists of the following stages:

```
Working Directory
        │
        ▼
    git add
        │
        ▼
  Staging Area
        │
        ▼
   git commit
        │
        ▼
 Local Repository
        │
        ▼
    git push
        │
        ▼
Remote Repository (GitHub)
```

---

# 📋 Git Commands Used

| Command | Description |
|----------|-------------|
| `git --version` | Displays the installed Git version. |
| `git config --global user.name` | Configures the Git username. |
| `git config --global user.email` | Configures the Git email address. |
| `git config --global --list` | Displays the current Git configuration. |
| `git status` | Displays the current repository status. |
| `git add` | Stages files for the next commit. |
| `git commit` | Saves staged changes to the local repository. |
| `git push` | Uploads commits to the remote repository. |
| `git pull` | Downloads the latest changes from the remote repository. |

---

# 📸 Sample Output

```text
git version 2.54.0.windows.1

user.name=Akshay Parihar
user.email=akshayparihar9310@gmail.com

On branch main

Changes to be committed:
    new file: Git/HOL_1/welcome.txt

[main abc1234] Completed Git HOL 1
```

---

# 📚 Concepts Learned

- Version Control System
- Git Configuration
- Local Repository
- Remote Repository
- Working Directory
- Staging Area
- Git Commit
- Git Push
- Git Pull
- Repository Synchronization

---

# ✅ Conclusion

This hands-on lab introduced the fundamentals of Git and its workflow. It demonstrated how to configure Git, create and track files, monitor repository status, commit changes, and synchronize a local repository with a remote GitHub repository. These concepts form the foundation of version control and collaborative software development.