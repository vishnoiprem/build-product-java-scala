public class ProcessExample {
    public static void main(String[] args) {
        try {
            // Start a new process
            Process process = Runtime.getRuntime().exec("ls -lrt -a");

            // Wait for the process to complete
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}