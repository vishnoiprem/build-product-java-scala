public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        // Create a new thread
        ThreadExample thread = new ThreadExample();

        // Start the thread
        thread.start();

        // Wait for the thread to complete
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main program finished.");
    }
}