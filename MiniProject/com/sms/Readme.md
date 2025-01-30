# 🏫 Student Management System

A simple **Student Management System** built using **Java 8**, featuring JSON-based data storage and multithreading
support. The system allows users to **add, search, update, and delete student records**, as well as perform **sorted
queries** and fetch failed students' details.

---

## 🚀 Features

- 📌 **Add a new student**
- 📌 **View all students**
- 📌 **Search a student** by:
    - 🔹 ID
    - 🔹 Name
    - 🔹 Grade
- 📌 **Update student details**
- 📌 **Delete student record**
- 📌 **Sort students** by:
    - 🔹 Name (A-Z)
    - 🔹 Age (Ascending)
- 📌 **Get failed students** (Grade below 'C')
- 📌 **Exit the system**

---

## 🛠️ Technologies Used

- **Java 8**
- **Java Executors** (Multithreading)
- **Optional API** (Null safety)
- **JSON** (Data Storage)
- **File Handling**
- **Collections API** (Sorting & Filtering)

---

## 📂 Project Structure

MiniProject/
│── src/
│ ├── com.sms.controller/
│ │ ├── Controller.java
│ ├── com.sms.model/
│ │ ├── Student.java
│ ├── com.sms.DAO/
│ │ ├── StudentData.json
│── README.md

## 📝 Usage Guide

_**Enter Student Details:
Name: John Doe
Age: 20
Grade: A
Email: john.doe@email.com**_

✅ Student added successfully!

## 2️⃣ View All Students

--------------------------------
ID: 101
Name: John Doe
Age: 20
Grade: A
Email: john.doe@email.com
--------------------------------

## 3️⃣ Search Student by ID

**_Enter Student ID: 101_**
✅ Student Found:
**_ID: 101 | Name: John Doe | Grade: A_**

## 4️⃣ Search Student by Name

**_Enter Student Name: John Doe**_
✅ Student Found:
**_ID: 101 | Age: 20 | Grade: A**_

## 5️⃣ Search Student by Grade

**_Enter Grade: A**_
✅ Students with Grade A:
**_1. John Doe | Age: 20 | Email: john.doe@email.com**_

## 6️⃣ Update Student Data

**_Enter Student ID to Update: 101**_
**_Enter New Name: Johnny Doe**_
✅ Student data updated successfully!

## 7️⃣ Delete Student Record

**_Enter Student ID to Delete: 101**_
✅ Student deleted successfully!

## 8️⃣ Get Student Details Ordered by Name

✅ Students Sorted by Name (A-Z):
**_1. Alice Smith**_
**_2. John Doe**_
**_3. Mark Johnson**_

## 9️⃣ Get Student Details Ordered by Age

✅ Students Sorted by Age (Youngest to Oldest):
**_1. John Doe | Age: 18**_
**_2. Mark Johnson | Age: 20**_
**_3. Alice Smith | Age: 21**_

## 🔟 Get Failed Student Details (Grade < 'C')

✅ Failed Students:
**_1. Jake Taylor | Grade: D | Age: 22**_
**_2. Laura Kim | Grade: F | Age: 19**_

## 1️⃣1️⃣ Exit

**_❌ Exiting the system. Thank you!**_

📩 Contact
For any issues, reach out to: 📧 Email: vignesh@email.com
🔗 LinkedIn: [linkedin.com/in/vignesh](https://www.linkedin.com/in/vignesh-a-772810224/)