package kg.peaksoft.taskTrackerb6.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnRequest {

    private String columnName;
    private Long boardId;
}
