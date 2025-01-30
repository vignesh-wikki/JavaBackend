# 🏫 **Student Management System**

A **simple and efficient** Student Management System built using **Java 8**, featuring **JSON-based data storage** and **multithreading** for optimized performance.  
The system enables users to **add, search, update, delete, and sort student records**, along with **fetching failed student details**.

---

## 🚀 **Features**

✅ **Student Operations**

- 📌 Add a new student
- 📌 View all students
- 📌 Search a student by:
  - 🔹 **ID**
  - 🔹 **Name**
  - 🔹 **Grade**
- 📌 Update student details
- 📌 Delete student record

✅ **Sorting & Filtering**

- 📌 Sort students **by Name (A-Z)**
- 📌 Sort students **by Age (Ascending)**
- 📌 Fetch **failed students** (Grade below 'C')

✅ **Exit System**

- 📌 **Exit** and safely terminate execution

---

## 🛠️ **Technologies Used**

- 🔹 **Java 8**
- 🔹 **Java Executors** (Multithreading)
- 🔹 **Optional API** (Null safety)
- 🔹 **JSON** (Data Storage)
- 🔹 **File Handling**
- 🔹 **Collections API** (Sorting & Filtering)

---

## 📂 **Project Structure**

MiniProject/
│── src/
│ ├── com.sms.controller/
│ │ ├── Controller.java
│ ├── com.sms.model/
│ │ ├── Student.java
│ ├── com.sms.dao/
│ │ ├── StudentData.json
│── README.md

---

## ⚙️ **Setup & Run Instructions**

### **🔹 Prerequisites**

- **Java 8 or later**
- **IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)**

### **🔹 How to Run**

1. Clone or download the project.
2. Open it in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the `Main` class to start the Student Management System.

---

## 📖 **Usage Guide**

### **1️⃣ Add New Student**

**_Enter Student Details:_**

- Name: **John Doe**
- Age: **20**
- Grade: **A**
- Email: **john.doe@email.com**

✅ Student added successfully!

---

### **2️⃣ View All Students**

**_Display all student records:_**

---

### **3️⃣ Search Student by ID**

**_Enter Student ID:_**

- ID: **101**

✅ **Student Found**:

---

### **4️⃣ Search Student by Name**

**_Enter Student Name:_**

- Name: **John Doe**

✅ **Student Found**:

---

### **5️⃣ Search Student by Grade**

**_Enter Grade:_**

- Grade: **A**

✅ **Students with Grade A**:

1. **John Doe | Age: 20 | Email: john.doe@email.com**

---

### **6️⃣ Update Student Data**

**_Enter Student ID to Update:_**

- ID: **101**

**_Enter New Name:_**

- Name: **Johnny Doe**

✅ **Student data updated successfully!**

---

### **7️⃣ Delete Student Record**

**_Enter Student ID to Delete:_**

- ID: **101**

✅ **Student deleted successfully!**

---

### **8️⃣ Get Student Details Ordered by Name**

✅ **Students Sorted by Name (A-Z)**:

1. **Alice Smith**
2. **John Doe**
3. **Mark Johnson**

---

### **9️⃣ Get Student Details Ordered by Age**

✅ **Students Sorted by Age (Youngest to Oldest)**:

1. **John Doe | Age: 18**
2. **Mark Johnson | Age: 20**
3. **Alice Smith | Age: 21**

---

### **🔟 Get Failed Student Details** (Grade below 'C')

✅ **Failed Students**:

1. **Jake Taylor | Grade: D | Age: 22**
2. **Laura Kim | Grade: F | Age: 19**

---

### **1️⃣1️⃣ Exit**

**_❌ Exiting the system. Thank you!_**

---

## 📩 **Contact**

For any issues, reach out to:  
📧 Email: [vignesh@email.com](mailto:vignesha445@email.com)  
🔗 LinkedIn: [linkedin.com/in/vignesh](https://www.linkedin.com/in/vignesh-a-772810224/)
