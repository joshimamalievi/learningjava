public class Main implements Runnable {// implementing an interface
  public static int amount = 0;
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();// starting the thread
    // Wait for the thread to finish
    while(thread.isAlive()) {
      System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Now " + amount);
    amount++;
    System.out.println("Now " + amount);
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    amount++;
    System.out.println("This code is running in a thread");
  }
}

//Threads run in unpredictable order