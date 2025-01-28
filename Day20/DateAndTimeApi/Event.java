package Day20.DateAndTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Event {
    private String name;
    private LocalDateTime dateTime;
    private double duration;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Event(String name, LocalDateTime dateTime, double duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "\"" + name + "\"" + ", " + dateTime + ", " + duration + " hour.";
    }

    public static void main(String[] args) {
        List<Event> events = List.of(new Event("Meeting", LocalDateTime.of(2025, 01, 28, 10, 00, 00), 1),
                new Event("Workshop", LocalDateTime.of(2025, 1, 28, 9, 30, 00), 2),
                new Event("Walking", LocalDateTime.of(2025, 1, 28, 11, 30, 00), 2.5),
                new Event("Gyming", LocalDateTime.of(2025, 1, 28, 6, 45, 00), 1.5));
        // Displaying all events
        System.out.println("");
        System.out.println("Displaying all events:");
        events.forEach(System.out::println);

        // Displaying event name on spesified date
        System.out.println("");
        System.out.println("Displaying event name on spesified date:");
        List<String> eventNames = events.stream()
                .filter((e) -> e.getDateTime().toLocalDate().equals(LocalDate.of(2025, 1, 28)))
                .map(Event::getName).collect(Collectors.toList());
        System.out.println("Events on " + LocalDate.of(2025, 1, 28)+":");
        eventNames.forEach(System.out::println);

        // displaying duration between events
        System.out.println("");
        System.out.println("Displaying duration between events:");
        for (int i = 0; i < events.size() - 1; i++) {
            System.out.println("Event name: " + events.get(i).getName() + " and Duration:"
                    + Duration.between(events.get(i).getDateTime(), events.get(i + 1).getDateTime()));
        }

    }
}
