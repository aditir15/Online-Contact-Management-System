# Online-Contact-Management-System

## Features

### User Management

- **Create User**: This feature allows the creation of a new user. The user details are stored in the database.

- **Update User**: This feature allows updating an existing user's details. If the user does not exist, a `UserNotFoundException` is thrown.

- **Delete User**: This feature allows the deletion of an existing user. If the user does not exist, a `UserNotFoundException` is thrown.

- **Get User**: This feature allows retrieving the details of an existing user. If the user does not exist, a `UserNotFoundException` is thrown.

### Logging

- **User Creation Logging**: Logs are generated after a user is created.

- **User Update Logging**: Logs are generated before and after a user is updated.

## Running the Application

Run the main function in class `OnlineContactManagementSystemApplication` present

## API Usage Guide

The API is running on `localhost` at port `8080`.

### User Management

- **Create User**: Send a `POST` request to `http://localhost:8080/api/v1/users` with the user details in the request body. The user details should be in JSON format, like this:

    ```json
    {
        "userName": "Aditi Rao",
        "email": "ar@gmail.com",
        "phoneNumber": "8008569420"
    }
    ```

- **Get User**: Send a `GET` request to `http://localhost:8080/api/v1/users/{userId}`, replacing `{userId}` with the id of the user you want to retrieve.

- **Update User**: Send a `PUT` request to `http://localhost:8080/api/v1/users/{userId}`, replacing `{userId}` with the id of the user you want to update. Include the updated user details in the request body, in the same format as the `POST` request.

- **Delete User**: Send a `DELETE` request to `http://localhost:8080/api/v1/users/{userId}`, replacing `{userId}` with the id of the user you want to delete.

Please note that all requests should be sent with the `Content-Type` header set to `application/json`.

This guide assumes that you are using a tool like `Postman` to send HTTP requests. If you are using a different tool, the exact steps may vary.

## Accessing the H2 Database Console

1. Open your web browser and navigate to `http://localhost:8080/h2-console`.

2. You will see a login form. Fill in the following details:

    - **JDBC URL**: `jdbc:h2:mem:testDb`
    - **User Name**: `sa`
    - **Password**: `1234`

3. Click on the "Connect" button.

## Testing

Test for Creating User present at class `UserControllerTest` 

## Submission Requirements

Screenshots required for the submission added.
