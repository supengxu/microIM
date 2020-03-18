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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.IdentifiedDataSerializable;
import im.micro.access.config.hazelcast.IdentifiedDataFactory;
import im.micro.access.constant.AdminPermission;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Document
@FieldNameConstants
@AllArgsConstructor
@NoArgsConstructor
/**
 * Note that a built-in admin role {
 *     id: 0,
 *     name: "ROOT",
 *     permissions: all permissions
 *     rank: Integer.MAX_VALUE
 * } always exists in Turms
 */
public class AdminRole implements IdentifiedDataSerializable {
    @Id
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    @Indexed
    private Set<AdminPermission> permissions;
    /**
     * Only the admins with higher rank can add/delete/update
     * the records of admins with lower rank.
     */
    private Integer rank;

    @JsonIgnore
    @Override
    public int getFactoryId() {
        return IdentifiedDataFactory.FACTORY_ID;
    }

    @JsonIgnore
    @Override
    public int getClassId() {
        return IdentifiedDataFactory.Type.DOMAIN_ADMIN_ROLE.getValue();
    }

    @Override
    public void writeData(ObjectDataOutput out) throws IOException {
        out.writeLong(id);
        out.writeUTF(name);
        out.writeIntArray(permissions
                .stream()
                .mapToInt(Enum::ordinal)
                .toArray());
        out.writeInt(rank);
    }

    @Override
    public void readData(ObjectDataInput in) throws IOException {
        id = in.readLong();
        name = in.readUTF();
        permissions = Arrays.stream(in.readIntArray())
                .mapToObj(value -> AdminPermission.values()[value])
                .collect(Collectors.toSet());
        rank = in.readInt();
    }
}