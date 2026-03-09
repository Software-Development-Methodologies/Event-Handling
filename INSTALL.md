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

# INSTALL

## Event Handling

This guide explains how to set up, build, and run the project on your local machine.

---

## 1. Prerequisites
Before you begin, ensure you have the following installed:

**Java Development Kit (JDK):** Version 8 or higher is required for Swing components.

**NetBeans IDE:** It is highly recommended to use NetBeans for the development of the code.

### 1.1 Clone the Repository

Open your terminal or command prompt and run:

```bash
git clone https://github.com/Software-Development-Methodologies/Event-Handling.git
cd Event-Handling/src
```

## 2. Setup and Execution
1. **Open Project:** Launch NetBeans and open the project directory containing the Exercise 4 source files.
2. **External Documentation:** For additional information on how specific classes work, refer to the official Oracle documentation.
3. **Build:** Right-click the project and select **Build**.
4. **Run:** Press `F6` or click the **Run Project** button.

## 3. Core Functionality
The application focuses on the following cognitive subjects:
- **Event Management:** Handling user interactions.
- **Listener Interfaces:** Using `ActionListener` for buttons and `WindowListener` for frame control.
- **Adapter Classes:** Implementing window closing events efficiently.

## 4. Key Implementation Steps
- **Conversion:** Use `Integer.parseInt(String)` to convert input from TextFields into integers.
- **Validation:** Before executing operations, check that fields are filled and contain valid integers.
- **Error Handling:** If validation fails, display an appropriate error message in the application's Label.

---

## 5. Implementation Details

- **Recommended IDE:** NetBeans.
- **Window Management:** Handle the window **close (x)** event appropriately depending on the specific frame used.
- **User Input:** Text fields return `String`; convert to integers using `Integer.parseInt()` for arithmetic operations.