// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/blacklist/query_group_blacklisted_users_ids_request.proto

package im.micro.access.pojo.request.group.blacklist;

public interface QueryGroupBlacklistedUsersIdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.micro.proto.QueryGroupBlacklistedUsersIdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 group_id = 1;</code>
   * @return The groupId.
   */
  long getGroupId();

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  boolean hasLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  com.google.protobuf.Int64Value getLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder();
}
