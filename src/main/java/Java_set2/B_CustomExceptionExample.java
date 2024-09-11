package Java_set2;

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

public class B_CustomExceptionExample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Regular expression to check for invalid characters
        if (name.matches(".*[&^*(%$#@!@].*")) {
            try {
                throw new InvalidNameException("You have entered an invalid name");
            } catch (InvalidNameException e) {
                e.printStackTrace();
                return;
            }
        }
        this.name = name;
    }

    public static void main(String[] args) {
        B_CustomExceptionExample obj = new B_CustomExceptionExample();
        obj.setName("wasim");         // This should be valid
        System.out.println(obj.getName());
        obj.setName("fbdhf!#@$%");    // This should trigger the custom exception
        System.out.println(obj.getName());
    }
}
