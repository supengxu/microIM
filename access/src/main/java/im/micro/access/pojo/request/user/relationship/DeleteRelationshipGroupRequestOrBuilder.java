// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/delete_relationship_group_request.proto

package im.micro.access.pojo.request.user.relationship;

public interface DeleteRelationshipGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.DeleteRelationshipGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 group_index = 1;</code>
   * @return The groupIndex.
   */
  int getGroupIndex();

  /**
   * <code>.google.protobuf.Int32Value target_group_index = 2;</code>
   * @return Whether the targetGroupIndex field is set.
   */
  boolean hasTargetGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 2;</code>
   * @return The targetGroupIndex.
   */
  com.google.protobuf.Int32Value getTargetGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getTargetGroupIndexOrBuilder();
}
