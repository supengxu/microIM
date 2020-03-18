/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.micro.access.pojo.domain;

import im.micro.access.constant.ChatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@FieldNameConstants
public class Message {
    @Id
    private Long id;

    @Indexed
    private ChatType chatType;

    @Indexed
    private Boolean isSystemMessage;

    @Indexed
    private Date deliveryDate;

    @Indexed
    private Date deletionDate;

    private String text;

    @Indexed
    private Long senderId;

    /**
     * Use "target" rather than "recipient" because the target may be a recipient or a group.
     */
    @Indexed
    private Long targetId;

    /**
     * Use list to keep order
     */
    private List<byte[]> records;

    private Integer burnAfter;

    @Indexed
    private Long referenceId;

    public Message(
            @NotNull Long id,
            @NotNull ChatType chatType,
            @NotNull Boolean isSystemMessage,
            @NotNull Date deliveryDate,
            @NotNull String text,
            @NotNull Long senderId,
            @NotNull Long targetId,
            @Nullable List<byte[]> records,
            @Nullable Integer burnAfter,
            @Nullable Long referenceId) {
        this.id = id;
        this.text = text;
        this.chatType = chatType;
        this.isSystemMessage = isSystemMessage;
        this.senderId = senderId;
        this.targetId = targetId;
        this.deliveryDate = deliveryDate;
        this.records = records;
        this.burnAfter = burnAfter;
        this.referenceId = referenceId;
    }

    public Long groupId() {
        return chatType == ChatType.GROUP ? targetId : null;
    }
}