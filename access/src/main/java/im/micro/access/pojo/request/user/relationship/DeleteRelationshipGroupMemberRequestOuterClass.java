// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/delete_relationship_group_member_request.proto

package im.micro.access.pojo.request.user.relationship;

public final class DeleteRelationshipGroupMemberRequestOuterClass {
  private DeleteRelationshipGroupMemberRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_DeleteRelationshipGroupMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_DeleteRelationshipGroupMemberRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHrequest/user/relationship/delete_relat" +
      "ionship_group_member_request.proto\022\016im.m" +
      "icro.proto\032\036google/protobuf/wrappers.pro" +
      "to\"\205\001\n$DeleteRelationshipGroupMemberRequ" +
      "est\022\017\n\007user_id\030\001 \001(\003\022\023\n\013group_index\030\002 \001(" +
      "\005\0227\n\022target_group_index\030\003 \001(\0132\033.google.p" +
      "rotobuf.Int32ValueB2\n.im.micro.access.po" +
      "jo.request.user.relationshipP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_micro_proto_DeleteRelationshipGroupMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_DeleteRelationshipGroupMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_DeleteRelationshipGroupMemberRequest_descriptor,
        new java.lang.String[] { "UserId", "GroupIndex", "TargetGroupIndex", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
