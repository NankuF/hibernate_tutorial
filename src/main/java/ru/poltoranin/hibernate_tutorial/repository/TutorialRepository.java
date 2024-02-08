package ru.poltoranin.hibernate_tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.poltoranin.hibernate_tutorial.model.Tutorial;
import java.util.List;


public interface TutorialRepository extends JpaRepository<Tutorial, Long>{

    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
