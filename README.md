# Library Management System

A simple console-based Library Management System built in Java using OOP principles and Gradle build tool.  
The system allows you to add books, borrow them, return them, and view all books.

---

## 📂 Project Structure

LibraryManagement/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/
│ │ │ │ ├── librarymanagement/
│ │ │ │ │ ├── App.java # Main class with menu
│ │ │ │ │ ├── Entity/
│ │ │ │ │ │ └── Book.java # Book entity class
│ │ │ │ │ └── Service/
│ │ │ │ │ └── LibraryService.java# Business logic
│ │ └── test/
│ │ └── java/
│ │ └── librarymanagement/
│ │ └── AppTest.java # Unit tests (optional)
│ └── build.gradle # Gradle build file
└── README.md # Project documentation



---

## 🚀 Features

- Add a book with title and author  
- Borrow a book (mark unavailable)  
- Return a book (mark available)  
- View all books with availability status  

---

## ⚙️ Requirements

- Java 17 or higher  
- Gradle 8 or higher (wrapper included)  

---

## 🛠️ Setup & Build

1. Clone or download the project  
2. Navigate to project root in terminal  

```bash
cd LibraryManagement/app
```

3. Build the project with Gradle:
```bash
./gradlew clean build

```

4.Run Application

4.1 Run via Gradle
```bash
./gradlew run
```

4.2 Run the built JAR

```bash
java -jar build/libs/app.jar
```

