// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/group_invitations_with_version.proto

package im.micro.access.pojo.bo.group;

public interface GroupInvitationsWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.micro.proto.GroupInvitationsWithVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .im.micro.proto.GroupInvitation group_invitations = 1;</code>
   */
  java.util.List<im.micro.access.pojo.bo.group.GroupInvitation> 
      getGroupInvitationsList();
  /**
   * <code>repeated .im.micro.proto.GroupInvitation group_invitations = 1;</code>
   */
  im.micro.access.pojo.bo.group.GroupInvitation getGroupInvitations(int index);
  /**
   * <code>repeated .im.micro.proto.GroupInvitation group_invitations = 1;</code>
   */
  int getGroupInvitationsCount();
  /**
   * <code>repeated .im.micro.proto.GroupInvitation group_invitations = 1;</code>
   */
  java.util.List<? extends im.micro.access.pojo.bo.group.GroupInvitationOrBuilder> 
      getGroupInvitationsOrBuilderList();
  /**
   * <code>repeated .im.micro.proto.GroupInvitation group_invitations = 1;</code>
   */
  im.micro.access.pojo.bo.group.GroupInvitationOrBuilder getGroupInvitationsOrBuilder(
      int index);

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
