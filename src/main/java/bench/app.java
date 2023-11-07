package bench;
public class app{
    public static void main(String[] args){

        seqMessageBoard messageBoard = new seqMessageBoard();


        User user1 = new User(messageBoard, "Henry34Took");
        User user2 = new User(messageBoard, "GrinchKat");
        User user3 = new User(messageBoard, "CoyleKiller");
        User user4 = new User(messageBoard, "TommyCat");

        User[] threadpool = {user1, user2, user3, user4};
        for(User user:threadpool){
            user.start();
        }

        for(User user:threadpool){
            try {
                user.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}
