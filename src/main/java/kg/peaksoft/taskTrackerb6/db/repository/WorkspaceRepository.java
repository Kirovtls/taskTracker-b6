package kg.peaksoft.taskTrackerb6.db.repository;

import kg.peaksoft.taskTrackerb6.db.model.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {

    @Transactional
    @Modifying
    @Query("delete from Workspace w where w.id = :id")
    void deleteWorkspaceById(Long id);
}