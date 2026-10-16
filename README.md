# Home Services Booking API

## Overview
A REST API built using Java 17, Spring Boot, Spring Data JPA and MySQL for browsing home services and booking them.

## Technologies
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Bean Validation
- Postman

## Features
- List all home services
- Search services by name
- Get service details by ID
- Create a booking with input validation
- Retrieve all bookings
- Validate 10-digit phone numbers
- Reject past booking dates
- Return errors for invalid service IDs

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | /api/services | Get all services |
| GET | /api/services?search=clean | Search services |
| GET | /api/services/{id} | Get service by ID |
| POST | /api/bookings | Create a booking |
| GET | /api/bookings | Get all bookings |

## Database Setup
1. Install and start MySQL.
2. Create the database `home_services_db`.
3. Configure database username and password in `src/main/resources/application.properties`.
4. Run `HomeServicesApplication.java`.

## Run the Project
Run the application using Eclipse or execute:

`mvn spring-boot:run`

The API runs at `http://localhost:8080`.

## Booking Request Example

```json
{
  "serviceId": 1,
  "customerName": "Test User",
  "phone": "9876543210",
  "address": "Pune, Maharashtra",
  "bookingDate": "2026-10-17",
  "timeSlot": "10:00 AM - 12:00 PM"
}
```
