package kg.peaksoft.taskTrackerb6.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubTaskResponse {

    private Long id;
    private String description;
    private Boolean isDone;
    private List<MemberResponse> memberResponses;
    private EstimationResponse estimationResponse;

    public SubTaskResponse(Long id, String description, Boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }
}
