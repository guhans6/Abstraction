public class Android extends Device {
    public void boot() {
        System.out.println("Booting ... Android"); // Every method in abstract class must be implemented
    }
    public void shutdown() {
        System.out.println("Shutting down ... Bye");
    }
    public void unlock() {       // Every device has various features 
        System.out.println("Fingerprint Successfull");
    }
    public void call() {
        System.out.println("Calling ...");
    }
    public void share() {
        System.out.println("Nearby Share");
    }
}
    
