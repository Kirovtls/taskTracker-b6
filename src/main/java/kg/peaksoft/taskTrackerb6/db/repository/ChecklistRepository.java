package kg.peaksoft.taskTrackerb6.db.repository;

import kg.peaksoft.taskTrackerb6.db.model.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ChecklistRepository extends JpaRepository<Checklist, Long> {

    @Query("select c from Checklist c where c.card.id = ?1")
    List<Checklist> findAllChecklists(Long cardId);

    @Transactional
    @Modifying
    @Query("delete from Checklist c where c.id = :id")
    void deleteChecklist(Long id);
}