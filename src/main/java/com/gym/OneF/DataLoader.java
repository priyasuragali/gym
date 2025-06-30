package com.gym.OneF;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final EquipmentRepository repo;

    public DataLoader(EquipmentRepository repo) { this.repo = repo; }

    @Override
    public void run(String... args) {
        repo.save(Equipment.builder().name("Treadmill")
            .description("High-quality running treadmill")
            .price(999.99)
            .imageUrl("http://localhost:8080/assets/gym-img.jpg")
            .build());
        repo.save(Equipment.builder().name("Dumbbells Set")
            .description("Adjustable dumbbells up to 50lbs")
            .price(199.99)
            .imageUrl("http://localhost:8080/assets/gym-img.jpg")
            .build());
    }
}