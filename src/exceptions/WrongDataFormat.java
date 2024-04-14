package exceptions;

public class WrongDataFormat extends Exception{
    public WrongDataFormat() {
        super();
    }

    public WrongDataFormat(String message) {
        super(message);
    }
}