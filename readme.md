# Online Bookstore

Welcome to the Online Bookstore project! This web application allows users to browse, search, and purchase books online.

## Features

- **Browse Books**: Explore a wide range of books across various genres.
- **Search Functionality**: Find books by title, author, or ISBN.
- **User Authentication**: Register and log in to manage your account and orders.
- **Shopping Cart**: Add books to your cart and proceed to checkout.
- **Order History**: View your past purchases.

## Technologies Used

- **Backend**: Java
- **Server**: Apache Tomcat
- **Database**: MySQL
- **Frontend**: HTML, CSS, JavaScript

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Apache Tomcat
- MySQL

## Setup Instructions

1. **Clone the repository**:

   ```bash
   git clone https://github.com/000-ghost-000/onlinebookstore.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd onlinebookstore
   ```

3. **Build the project using Maven**:

   ```bash
   mvn clean install
   ```

4. **Set up the database**:

   - Create a MySQL database named `onlinebookstore`.
   - Import the provided dummy database file `Dummy_Database.md` into your MySQL server.
   - Update the database connection details in `src/main/resources/application.properties`.

5. **Deploy the application on Tomcat**:

   - Place the generated WAR file (`target/onlinebookstore.war`) into the `webapps` directory of your Tomcat server.
   - Start the Tomcat server.

6. **Access the application**:

   Open your web browser and navigate to `http://localhost:8080/onlinebookstore`.

## Running the Application Locally

To run the application locally without deploying to a Tomcat server, you can use the following command:

```bash
java -jar target/dependency/webapp-runner.jar target/onlinebookstore.war
```

Ensure that the `webapp-runner.jar` file is present in the `target/dependency` directory. If it's not available, you can download it from the [webapp-runner GitHub repository](https://github.com/heroku/webapp-runner).

## Contributing

We welcome contributions to enhance the functionality of this project. To contribute:

1. **Fork the repository**.
2. **Create a new branch**:

   ```bash
   git checkout -b feature-name
   ```

3. **Make your changes**.
4. **Commit your changes**:

   ```bash
   git commit -m "Description of changes"
   ```

5. **Push to your fork**:

   ```bash
   git push origin feature-name
   ```

6. **Create a pull request**.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or support, please contact [000-ghost-000](https://github.com/000-ghost-000).

---

*Note: This project is for educational purposes and may not be suitable for production use without further enhancements and security improvements.*
