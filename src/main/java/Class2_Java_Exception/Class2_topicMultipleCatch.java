package Class2_Java_Exception;
class Class2_topicMultipleCatch {
    public static void main(String[] args) {
        try {
            String s = "wasim";
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null value error");
        } catch (Exception e) {
            System.out.println("General exception");
        }
        finally {
			System.out.println("Execution completed");
		}
    }
}
