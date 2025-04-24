package week7.task2;

public class CustomerService {
  public String[] queue;
  int index;

  public CustomerService(int num) {
    queue = new String[num];
  }

  public void serveCustomer() {
    if (index == 0 || queue[0] == null) {
      System.out.println("No customers to serve");
    } else {
      System.out.println("Serving " + queue[0]);
      for (int i = 0; i < queue.length; i++) {
        if (i + 1 < queue.length) {
          queue[i] = queue[i + 1];
        }
      }
      queue[queue.length - 1] = null;
    }
  }

  public void addCustomer(String name) {
    if (index < queue.length || findEmpty() != -1) {
      System.out.println("Added " + name);
      if (index < queue.length) {
        queue[index++] = name;
      } else if (findEmpty() != -1) {
        queue[findEmpty()] = name;
      }
    } else {
      System.out.println("Queue is full. Cannot add " + name);
    }
  }

  public int findEmpty() {
    for (int i = 0; i < queue.length; i++) {
      if (queue[i] == null) {
        return i;
      }
    }
    return -1;
  }
}
