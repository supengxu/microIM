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

package im.micro.access.pojo.dto;

import im.micro.access.constant.GroupInvitationStrategy;
import im.micro.access.constant.GroupJoinStrategy;
import im.micro.access.constant.GroupUpdateStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateGroupTypeDTO {
    private String name;

    private Integer groupSizeLimit;

    private GroupInvitationStrategy invitationStrategy;

    private GroupJoinStrategy joinStrategy;

    private GroupUpdateStrategy groupInfoUpdateStrategy;

    private GroupUpdateStrategy memberInfoUpdateStrategy;

    private Boolean guestSpeakable;

    private Boolean selfInfoUpdatable;

    private Boolean enableReadReceipt;

    private Boolean messageEditable;
}
