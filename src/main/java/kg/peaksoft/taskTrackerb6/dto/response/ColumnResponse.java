package kg.peaksoft.taskTrackerb6.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ColumnResponse {

    private Long id;
    private String columnName;
    private Boolean isArchived;
    private CreatorResponse creator;
    private Long boardId;
    private Long workspaceId;
}
