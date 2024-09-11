package Java_set2;

class CustomAgeException extends Exception {
    public CustomAgeException(String message) {
        super(message);
    }
}
public class A_CustomException {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age < 18) {
                // Throwing custom exception if age is less than 18
                throw new CustomAgeException("Not a good age to vote");
            }
            this.age = age;
        } catch (CustomAgeException e) {
            // Handling custom exception
            e.printStackTrace();
        }
    }

        public static void main(String[] args){

            A_CustomException obj = new A_CustomException();
            obj.setAge(18);
            obj.getAge();
            System.out.println(obj.getAge());
        }



    }

