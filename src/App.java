public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("\n\nAndroid\n");
        Device d1 = new Android();
        boot1(d1);
        unlock(d1);
        share(d1);
        call(d1);
        System.out.printf("\n\nApple\n");
        Apple d2 = new Apple();
        boot1(d2);
        unlock(d2);
        share(d2);
        call(d2);
        shutdown(d2);
    }

    public static void boot1(Device d) {
        d.boot();
    }
    public static void shutdown(Device d) {
        d.shutdown();
    }
    public static void call(Device d) {
        d.call();
    }
    public static void unlock(Device d) {
        d.unlock();
    }
    public static void faceId(Device d) {
        d.unlock();
    }
    public static void share(Device d) {
        d.share();
    }
}
