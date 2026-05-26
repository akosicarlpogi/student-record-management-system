# Student Record Management System

Topic 7 activity for JavaFX, JDBC, and PostgreSQL.

The program is a simple student record management system where users can add, view, update, delete, and clear student records using a JavaFX interface. The records are saved in a PostgreSQL database.

## What the app can do

- Add new student records
- Show all student records in a table
- Select a record from the table
- Update the selected record
- Delete the selected record
- Clear the input fields
- Check if the input fields are empty before saving

## Tools used

- Java
- JavaFX
- SceneBuilder/FXML
- JDBC
- PostgreSQL
- Maven

## Database

Database name:

`studentdb`

Table name:

`students`

The SQL file is included in the `database` folder.

## How to run

1. Create the PostgreSQL database.
2. Run the SQL file inside the `database` folder.
3. Copy `db.properties.example`.
4. Rename the copy to `db.properties`.
5. Put your own PostgreSQL username and password inside `db.properties` (replace ung all caps na your password).
6. Run `MainApp.java`.

## Note

The real `db.properties` file is not included in this repository dahil andun ung database password.
