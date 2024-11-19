<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hotel Booking System</title>
</head>
<body>

<h1>Hotel Booking System</h1>
<p>A simple Spring Boot application for managing hotel bookings, built with REST APIs and integrated with an H2 database.</p>

<h2>Features</h2>
<ul>
    <li>Create, Read, Update, and Delete (CRUD) hotel bookings.</li>
    <li>Database integration with H2 for testing purposes.</li>
    <li>RESTful API architecture.</li>
    <li>Swagger UI for API documentation.</li>
</ul>

<h2>Tech Stack</h2>
<ul>
    <li>Java 17</li>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>H2 Database</li>
    <li>Springdoc OpenAPI (Swagger UI)</li>
</ul>

<h2>Getting Started</h2>
<ol>
    <li>Clone the repository: <code>git clone https://github.com/chisa-sifiso/hotel-booking-system.git</code></li>
    <li>Navigate to the project directory: <code>cd hotel-booking-system</code></li>
    <li>Build the project: <code>mvn clean install</code></li>
    <li>Run the application: <code>mvn spring-boot:run</code></li>
</ol>

<h2>API Endpoints</h2>
<table>
    <thead>
        <tr>
            <th>HTTP Method</th>
            <th>Endpoint</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>GET</td>
            <td>/api/bookings</td>
            <td>Fetch all bookings</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/api/bookings/{id}</td>
            <td>Fetch booking by ID</td>
        </tr>
        <tr>
            <td>POST</td>
            <td>/api/bookings</td>
            <td>Create a new booking</td>
        </tr>
        <tr>
            <td>PUT</td>
            <td>/api/bookings/{id}</td>
            <td>Update an existing booking</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td>/api/bookings/{id}</td>
            <td>Delete a booking</td>
        </tr>
    </tbody>
</table>

<h2>Swagger Documentation</h2>
<p>Access the Swagger UI for detailed API documentation at <a href="http://localhost:8080/swagger-ui.html" target="_blank">http://localhost:8080/swagger-ui.html</a>.</p>

<h2>H2 Database Console</h2>
<p>Access the H2 console at <a href="http://localhost:8080/h2-console" target="_blank">http://localhost:8080/h2-console</a>.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>

</body>
</html>
