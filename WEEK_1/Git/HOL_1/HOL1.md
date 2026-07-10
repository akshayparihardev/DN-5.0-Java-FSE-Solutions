# 📦 Git Hands-On Lab 1: Git Configuration & Basic Git Commands

## 📖 Scenario

A software development team requires a version control system to efficiently track source code changes, collaborate with multiple developers, and maintain project history. Git is a distributed version control system that enables developers to manage code revisions, maintain project history, and synchronize local repositories with a remote repository.

---

# 🎯 Objective

Perform the basic Git setup and understand the fundamental Git workflow by:

- Configuring Git with user information.
- Verifying Git installation and configuration.
- Creating and managing a Git repository.
- Creating and tracking files.
- Checking repository status.
- Staging and committing changes.
- Synchronizing the local repository with a remote GitHub repository.

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

### 1. Git Installation

Verified that Git was successfully installed on the system using the version command.

---

### 2. Git Configuration

Configured the global Git username and email address to associate future commits with the correct author.

Configuration performed:

- Git Username
- Git Email

The configuration was verified using the Git configuration list command.

---

### 3. Repository Status

Checked the current status of the repository to identify tracked and untracked files before and after making changes.

---

### 4. File Creation

Created a file named **welcome.txt** with the following content:

```text
Welcome to the version control
```

---

### 5. Staging Changes

Added the newly created file and documentation to the Git staging area using the `git add` command.

---

### 6. Commiting Changes

Created a local commit with an appropriate commit message to permanently save the staged changes.

---

### 7. Synchronizing Repository

Uploaded the local commit to the remote GitHub repository using the Git push command.

---

# ❓ Question 1: What is Git?

Git is a distributed version control system used to track changes in source code during software development. It allows developers to maintain project history, collaborate efficiently, and restore previous versions whenever required.

---

# ❓ Question 2: Why is Git Configuration required?

Git configuration stores the developer's identity, including:

- User Name
- Email Address

Every commit made using Git contains this information, allowing the repository to identify the author of each change.

---

# ❓ Question 3: Explain the Git Workflow.

The basic Git workflow consists of the following stages:

```text
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
| `git add` | Adds files to the staging area. |
| `git commit` | Saves staged changes to the local repository. |
| `git push` | Uploads local commits to the remote GitHub repository. |
| `git pull` | Downloads the latest changes from the remote repository. |

---

# 📊 Git Workflow Summary

| Stage | Purpose |
|--------|---------|
| Working Directory | Contains all project files. |
| Staging Area | Holds selected changes before committing. |
| Local Repository | Stores committed changes locally. |
| Remote Repository | Stores the project online for backup and collaboration. |

---

# 📸 Sample Output

```text
git version 2.54.0.windows.1

user.name=Akshay Parihar
user.email=akshayparihar9310@gmail.com

On branch main

Changes to be committed:
    new file: Git/HOL_1/HOL1.md
    new file: Git/HOL_1/welcome.txt

[main 1a75f3a] Complete HOL1: Git
```

---

# 📚 Concepts Learned

- Version Control System
- Git Installation
- Git Configuration
- Working Directory
- Staging Area
- Local Repository
- Remote Repository
- Git Status
- Git Add
- Git Commit
- Git Push
- Git Pull

---

# ✅ Conclusion

This hands-on lab introduced the fundamental concepts of Git and its workflow. The exercise demonstrated how to configure Git, create and track files, manage repository status, stage and commit changes, and synchronize a local repository with a remote GitHub repository. These concepts provide the foundation for effective version control and collaborative software development.