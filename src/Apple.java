public class Apple extends Device {

    public void boot() {
        System.out.println("Booting ... Hello");
    }
    public void shutdown() {
        System.out.println("Shutting down ... Bye");
    }
    public void unlock() {
        System.out.println("Face ID");
    }
    public void call() {
        System.out.println("Calling ...");   
    }
    @Override
    public void share() {
        System.out.println("AirDrop");
    }
}
    
