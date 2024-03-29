package kg.peaksoft.taskTrackerb6.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kg.peaksoft.taskTrackerb6.db.service.ColumnService;
import kg.peaksoft.taskTrackerb6.dto.request.ColumnRequest;
import kg.peaksoft.taskTrackerb6.dto.request.UpdateRequest;
import kg.peaksoft.taskTrackerb6.dto.response.AllBoardColumnsResponse;
import kg.peaksoft.taskTrackerb6.dto.response.ColumnResponse;
import kg.peaksoft.taskTrackerb6.dto.response.SimpleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/column")
@CrossOrigin(origins = "*", maxAge = 3600)
@Tag(name = "Column API", description = "All endpoints of column")
public class ColumnApi {

    private final ColumnService columnService;

    @Operation(summary = "Create column", description = "Create new column")
    @PostMapping
    public ColumnResponse createColumn(@RequestBody ColumnRequest request) {
        return columnService.createColumn(request);
    }

    @Operation(summary = "Update column", description = "Update column title")
    @PutMapping
    public ColumnResponse updateColumn(@RequestBody UpdateRequest request) {
        return columnService.updateColumn(request);
    }

    @Operation(summary = "Delete column", description = "Delete column by column id")
    @DeleteMapping("/{id}")
    public SimpleResponse deleteColumn(@PathVariable Long id) {
        return columnService.deleteColumn(id);
    }

    @Operation(summary = "Send to archive", description = "Send column to archive")
    @PutMapping("/archive/{id}")
    public ColumnResponse sendToArchive(@PathVariable Long id) {
        return columnService.sentToArchive(id);
    }

    @Operation(summary = "Get all columns", description = "Get all columns by board id")
    @GetMapping("/{id}")
    public AllBoardColumnsResponse findAllColumnsByBoardId(@PathVariable Long id) {
        return columnService.findAllColumns(id);
    }

    @Operation(summary = "Archive all cards of column", description = "Archive all cards by column id")
    @PutMapping("/archive-column-cards/{id}")
    public SimpleResponse archiveAllColumnCardsOfColumn(@PathVariable Long id) {
        return columnService.archiveAllCardsInColumn(id);
    }

    @Operation(summary = "Delete all cards from column", description = "Delete all cards by column id")
    @DeleteMapping("/cards/{columnId}")
    public SimpleResponse deleteAllCardsFromColumn(@PathVariable Long columnId) {
        return columnService.deleteAllCardsOfColumn(columnId);
    }
}
