package com.example.hello;

/**
 * a Greeting POJO that will be serialized as JSON by our RESTFUL service
 */
public class Greeting {
    private String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return  "Greeting{"+
                "message='" + message + '\'' +
                '}';
    }
}
