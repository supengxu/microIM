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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
@FieldNameConstants
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    private Long id;

    @Indexed
    private Long typeId;

    @Indexed
    private Long creatorId;

    @Indexed
    private Long ownerId;

    private String name;

    private String intro;

    private String announcement;

    private String profilePictureUrl;

    private Integer minimumScore;

    @Indexed
    private Date creationDate;

    @Indexed
    private Date deletionDate;

    @Indexed
    private Date muteEndDate;

    @Indexed
    private Boolean active;
}