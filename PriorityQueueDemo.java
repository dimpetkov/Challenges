import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

    static class Person implements Comparable<Person> {
        String name;
        int priority;

        public Person(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Person p) {
            if (this.priority < p.priority) {
                return 1;
            } else if (this.priority > p.priority) {
                return -1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "[" + name + " : " + priority + "]";
        }
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        PriorityQueue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("Maria", 8));
        queue.add(new Person("John", 8));
        queue.add(new Person("Peter", 5));
        queue.add(new Person("George", 7));
        queue.add(new Person("Sarah", 3));

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        }
}
