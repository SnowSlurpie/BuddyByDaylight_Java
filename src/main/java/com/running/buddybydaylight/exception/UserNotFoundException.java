package com.running.buddybydaylight.exception;


// The purpose of this class is to handle cases where a user is not found in the database.
// The constructor of this class takes in a message parameter, which will be displayed to the user when this exception is thrown.
// When this exception is thrown, it will contain the message passed in the constructor, which will help identify the specific error that occurred.
public class UserNotFoundException extends Throwable {

    public UserNotFoundException(String message) {
        super(message);
    }
}
