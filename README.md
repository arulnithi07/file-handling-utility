# file-handling-utility


🎯 **Objective:
To develop a Java console application that performs basic file operations—write, append, and read—using FileWriter, BufferedReader, and Scanner classes. This project helps users understand file manipulation in Java.**

📘 Project Overview:
This application allows users to interact with a text file (sample.txt) through a simple terminal menu. It supports three core functionalities:

Write to File (Overwrite)

Replaces all existing content in sample.txt with new input from the user.

Append to File

Adds user input to the end of the file without removing existing content.

Read File

Reads and displays the file’s content line-by-line.

On startup, the program checks whether sample.txt exists. If not, it creates the file and writes default content into it. The program continues by prompting the user to select one of the operations.

💻 Sample Output:


▶ First Run (File not yet created):
vbnet
Copy
Edit
📄 sample.txt created with default content.
📁 File Handling Operations
1. Write to file
2. Append to file
3. Read file
Choose an option (1/2/3): 3
📄 File Content:
→ Welcome to File Handling in Java!
→ This file is for testing.
▶ Append Operation:
pgsql
Copy
Edit
📁 File Handling Operations
1. Write to file
2. Append to file
3. Read file
Choose an option (1/2/3): 2
Enter text to append: Hello from user!
✅ Content appended successfully.
▶ Read File After Append:
vbnet
Copy
Edit
📁 File Handling Operations
1. Write to file
2. Append to file
3. Read file
Choose an option (1/2/3): 3
📄 File Content:
→ Welcome to File Handling in Java!
→ This file is for testing.
→ Hello from user!
▶ Write Operation (Overwrites All):
pgsql
Copy
Edit
📁 File Handling Operations
1. Write to file
2. Append to file
3. Read file
Choose an option (1/2/3): 1
Enter text to write (overwrite): This is a fresh file.
✅ File written successfully (overwritten).
   
