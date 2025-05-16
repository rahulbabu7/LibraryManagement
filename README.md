# Library Management System

A simple console-based Library Management System built in Java using Object-Oriented Programming principles and the Gradle build tool. This system allows users to manage a collection of books with features for adding new books, borrowing, returning, and viewing the entire collection.

## 📋 Features

* Add books to the library with title and author information
* Borrow books (marks them as unavailable)
* Return books (marks them as available again)
* Search for books by title
* View all books with their availability status
* User-friendly console menu interface

## 📂 Project Structure

```
LibraryManagement/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── librarymanagement/
│   │   │   │   │   ├── App.java                # Main class with user menu
│   │   │   │   │   ├── Entity/
│   │   │   │   │   │   └── Book.java           # Book entity class
│   │   │   │   │   └── Service/
│   │   │   │   │       └── LibraryService.java # Business logic
│   │   └── test/
│   │       └── java/
│   │           └── librarymanagement/
│   │               └── AppTest.java            # Unit tests (optional)
│   └── build.gradle                            # Gradle build file
└── README.md                                   # Project documentation
```

## ⚙️ Requirements

* Java 17 or higher
* Gradle 8 or higher (wrapper included)

## 🚀 Installation & Setup

1. Clone or download the project repository
   ```bash
   git clone https://github.com/rahulbabu7/LibraryManagement.git
   ```

2. Navigate to the project root directory
   ```bash
   cd LibraryManagement/app
   ```

3. Build the project using Gradle
   ```bash
   ./gradlew clean build
   ```

## 🏃‍♂️ Running the Application

### Option 1: Run via Gradle
```bash
./gradlew run
```

### Option 2: Run the built JAR file
```bash
java -jar build/libs/app.jar
```

## 📖 How to Use

After starting the application, you'll be presented with a menu:

```
===== Library Menu =====
1. Add Book
2. Borrow Book
3. Return Book
4. View All Books
5. Exit
Enter your choice:
```

### Add a Book
- Select option `1`
- Enter the book title when prompted
- Enter the book author when prompted
- The system will confirm the book has been added

### Borrow a Book
- Select option `2`
- Enter the title of the book you want to borrow
- If available, the system will mark it as borrowed
- If not available or not found, you'll receive a notification

### Return a Book
- Select option `3`
- Enter the title of the book you're returning
- The system will mark the book as available again
- If the book isn't borrowed or doesn't exist, you'll be notified

### View All Books
- Select option `4`
- The system will display all books with their titles, authors, and availability status
- If the library is empty, a notification will be displayed

### Exit
- Select option `5` to exit the application

## 💻 Development

### Adding New Features

To extend the functionality:
1. Modify the appropriate classes in `src/main/java/librarymanagement/`
2. Rebuild the application using Gradle
3. Test the new features

### Running Tests
```bash
./gradlew test
```

## 📄 License

[MIT License](LICENSE)

## 👨‍💻 Contributors

- Rahul Babu



---

Feel free to contribute to this project by submitting issues or pull requests!