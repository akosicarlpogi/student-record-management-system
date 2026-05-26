# Student Record Management System

A basic JavaFX + JDBC + PostgreSQL CRUD application for managing student records.

## Features

- Add new student records
- Display all student records in a TableView
- Select a row to populate the input fields
- Update selected student records
- Delete selected student records
- Clear input fields
- Basic input validation for empty fields

## Technologies Used

- Java 17
- JavaFX
- SceneBuilder/FXML
- JDBC
- PostgreSQL
- Maven

## Database Setup

Open pgAdmin or psql and run the SQL in `database/schema.sql`.

Important note: the activity handout first shows `year_level INT`, but the provided JavaFX `ChoiceBox`/`YearLevel` enum stores values such as `1st Year`, `2nd Year`, etc. Because of that, this project uses:

```sql
year_level VARCHAR(20) NOT NULL
```

## Database Connection Setup

For local testing, copy:

```text
src/main/resources/db.properties.example
```

Then rename the copy to:

```text
src/main/resources/db.properties
```

Edit it with your PostgreSQL password:

```properties
db.url=jdbc:postgresql://localhost:5432/studentdb
db.user=postgres
db.password=your_password
```

Do not upload your real `db.properties` file to GitHub. It is already included in `.gitignore`.

## How to Run

In the project folder, run:

```bash
mvn clean javafx:run
```

## GitHub Submission Steps

```bash
git init
git add .
git commit -m "Complete JavaFX JDBC PostgreSQL CRUD activity"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/student-record-management-system.git
git push -u origin main
```

Submit the GitHub repository URL, for example:

```text
https://github.com/YOUR_USERNAME/student-record-management-system
```
