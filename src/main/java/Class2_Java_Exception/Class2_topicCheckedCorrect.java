package Class2_Java_Exception;
class Class2_topicCheckedCorrect {
    static void setName(String name) {
        try {
            if (name == null) {
                throw new Exception("Invalid name");
            }
            System.out.println("Name set: " + name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        setName(null);
    }
}
