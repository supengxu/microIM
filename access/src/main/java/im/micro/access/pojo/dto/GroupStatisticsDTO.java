package im.micro.access.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
public class GroupStatisticsDTO {
    private Long deletedGroups;
    private Long groupsThatSentMessages;
    private Long createdGroups;

    private List<StatisticsRecordDTO> deletedGroupsRecords;
    private List<StatisticsRecordDTO> groupsThatSentMessagesRecords;
    private List<StatisticsRecordDTO> createdGroupsRecords;
}
