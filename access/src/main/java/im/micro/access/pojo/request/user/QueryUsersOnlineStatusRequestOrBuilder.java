// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/query_users_online_status_request.proto

package im.micro.access.pojo.request.user;

public interface QueryUsersOnlineStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.micro.proto.QueryUsersOnlineStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 users_ids = 1;</code>
   * @return A list containing the usersIds.
   */
  java.util.List<java.lang.Long> getUsersIdsList();
  /**
   * <code>repeated int64 users_ids = 1;</code>
   * @return The count of usersIds.
   */
  int getUsersIdsCount();
  /**
   * <code>repeated int64 users_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The usersIds at the given index.
   */
  long getUsersIds(int index);
}
