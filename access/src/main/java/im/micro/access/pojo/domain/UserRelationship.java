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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
@FieldNameConstants
@AllArgsConstructor
@NoArgsConstructor
public class UserRelationship {
    @Id
    private Key key;

    @Indexed
    private Boolean isBlocked;

    @Indexed
    private Date establishmentDate;

    public UserRelationship(Long ownerId, Long relatedUserId, Boolean isBlocked, Date establishmentDate) {
        this.key = new Key(ownerId, relatedUserId);
        this.isBlocked = isBlocked;
        this.establishmentDate = establishmentDate;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class Key {
        @Indexed
        private Long ownerId;

        @Indexed
        private Long relatedUserId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class KeyList {
        List<Key> keys;
    }
}