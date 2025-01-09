package Day11.Concurrentmap;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

class OnlineVotingSystem {
    ConcurrentHashMap<String, Integer> votes = new ConcurrentHashMap<>();

    public void addNewCandidate(String name) {
        votes.putIfAbsent(name, 0);
    }

    public void voteForCandidate(String name) {
        votes.compute(name, (key, val) -> val + 1);
    }

    public void disply() {
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println("Final Vote Counts: ");
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OnlineVotingSystem voting = new OnlineVotingSystem();
        Scanner sc = new Scanner(System.in);
        voting.addNewCandidate("Alice");
        voting.addNewCandidate("Bob");

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                voting.voteForCandidate("Alice");
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                voting.voteForCandidate("Bob");
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                voting.voteForCandidate("Alice");

            }
        };

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                String name = sc.nextLine();
                voting.addNewCandidate(name);
                voting.voteForCandidate(name);

            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        sc.close();
        voting.disply();
    }
}