package cz.upce.fe.cv01.dto;

public class SimpleBody {
    private String message;

    public SimpleBody() {
    }

    public SimpleBody(String message) {
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
        return "SimpleBody{" +
                "message='" + message + '\'' +
                '}';
    }
}
