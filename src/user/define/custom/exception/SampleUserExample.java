package user.define.custom.exception;

public class SampleUserExample {

    public static void main(String[] args) {

        try {
           String user = null;   // search user from the database

            if(user == null) {
                throw new UserNotFoundException("User not present");
            } else {
                System.out.println("User present");
            }
        } catch(UserNotFoundException e) {
            System.out.println(e.getMessage() + "---" + e.getClass());
        }
    }
}
