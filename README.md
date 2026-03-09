<p align="center">
  <img src="https://www.especial.gr/wp-content/uploads/2019/03/panepisthmio-dut-attikhs.png" alt="University of West Attica" width="150"/>
</p>

<p align="center">
  <strong>UNIVERSITY OF WEST ATTICA</strong><br/>
  SCHOOL OF ENGINEERING<br/>
  DEPARTMENT OF COMPUTER ENGINEERING AND INFORMATICS
</p>

<p align="center">
  <a href="https://www.uniwa.gr" target="_blank">University of West Attica</a> ·
  <a href="https://ice.uniwa.gr" target="_blank">Department of Computer Engineering and Informatics</a>
</p>

<hr/>

<p align="center">
  <strong>Software Development Methodologies</strong>
</p>

<h1 align="center" style="letter-spacing: 1px;">
  Event Handling
</h1>

<p align="center">
  <strong>Vasileios Evangelos Athanasiou</strong><br/>
  Student ID: 19390005
</p>

<p align="center">
  <a href="https://github.com/Ath21" target="_blank">GitHub</a> ·
  <a href="https://www.linkedin.com/in/vasilis-athanasiou-7036b53a4/" target="_blank">LinkedIn</a>
</p>

<hr/>

<p align="center">
  <strong>Supervision</strong>
</p>

<p align="center">
  Supervisor: Georgios Prezerakos, Professor
</p>
<p align="center">
  <a href="https://ice.uniwa.gr/en/emd_person/george-prezerakos/" target="_blank">UNIWA Profile</a> ·
  <a href="https://www.linkedin.com/in/georgenprezerakos/" target="_blank">LinkedIn</a>
</p>

<p align="center">
  Co-supervisor: Angelos Georgoulas, Assistant Professor<br>
</p>

<p align="center">
  <a href=https://scholar.google.com/citations?user=Djium2IAAAAJ&hl=en" target="_blank">Scholar</a> ·
  <a href="https://www.linkedin.com/in/aggelos-georgoulas/?originalSubdomain=uk" target="_blank">LinkedIn</a>
</p>

</hr>

---

<p align="center">
  Athens, June 2023
</p>

---

<p align="center">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsBxQBalgD6YLNbmQHhc0e0M_Y6afqhrYueg&s" width="250"/>
</p>

---

# README

## Event Handling

This README provides an overview of **Exercise 4: Event Handling**, part of the **Application Development Methodologies** laboratory for the **2022-2023 Spring Semester**.  
The exercises focus on implementing **functional logic** and **event management** for GUIs developed in previous sessions.

---

## Table of Contents

| Section | Folder/File | Description |
|------:|-------------|-------------|
| 1 | `INSTALL.md` | Installation and execution instructions |
| 2 | `README.md` | Project overview and usage guide |
| 3 | `assign/` | Assignment description documents |
| 3.1 | `assign/SDM Exercise 4 (Events).pdf` | Assignment description (English) |
| 3.2 | `assign/ΜΑΕ Ασκήση 4 (Events).pdf` | Assignment description (Greek) |
| 4 | `src/` | Java GUI projects demonstrating event handling |
| 4.1 | `src/Ex4_1/` | First event-handling exercise project |
| 4.1.1 | `src/Ex4_1/build/` | Compiled build output |
| 4.1.2 | `src/Ex4_1/build.xml` | Apache Ant build configuration |
| 4.1.3 | `src/Ex4_1/manifest.mf` | Application manifest file |
| 4.1.4 | `src/Ex4_1/nbproject/` | NetBeans project configuration files |
| 4.1.5 | `src/Ex4_1/src/ex4_1/` | Java source code package |
| 4.2 | `src/Ex4_2/` | Second event-handling exercise project |
| 4.2.1 | `src/Ex4_2/build/` | Compiled build output |
| 4.2.2 | `src/Ex4_2/build.xml` | Apache Ant build configuration |
| 4.2.3 | `src/Ex4_2/manifest.mf` | Application manifest file |
| 4.2.4 | `src/Ex4_2/nbproject/` | NetBeans project configuration files |
| 4.2.5 | `src/Ex4_2/src/ex4_2/` | Java source code package |

---

## 1. Project Overview

**Goal:** Practice Java event management using standard classes and interfaces.

**Key Topics:**

- Event management  
- Event classes and listener interfaces (`ActionListener`, `WindowListener`)  
- Adapter classes  
- String-to-integer conversion (`Integer.parseInt()`)

---

## 2. Exercises Summary

### 2.1 Simple Calculator (Exercise 4.1)

Develop functional logic for a basic arithmetic application.

- **Add/Subtract:** Performs the operation on two input integers and displays the result in a `JLabel` (e.g., `50+101=151`).  
- **Clear:** Resets both text fields.  
- **Extended Operations:** Implement `Multiply` and `Divide` buttons.  
- **Validation:** Ensure fields are filled and contain valid integers before processing. Display error messages in the `JLabel` if inputs are missing or invalid.

---

## 3. Integrated Calculator (Exercise 4.2)

Implement a full calculator interface based on a **grid of buttons** (0–9, arithmetic operators, and equals).

- Handles **standard calculation logic**.  
- Properly manages **window closing events**.

---

## 4. Ordering Application (Exercise 4.3)

Develop backend logic for a pizza-style ordering form.

- **"Complete Order" Button:** Consolidates user selections into a single string.  
- **Order Summary:** Displays **Size**, **Toppings**, and **Delivery Method** in a bottom `JLabel`.  
- **Validation:** If any required option (Size, Toppings, Delivery) is missing, prompt the user to complete the selection.