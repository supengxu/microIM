// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/update_relationship_request.proto

package im.micro.access.pojo.request.user.relationship;

public final class UpdateRelationshipRequestOuterClass {
  private UpdateRelationshipRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UpdateRelationshipRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UpdateRelationshipRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;request/user/relationship/update_relat" +
      "ionship_request.proto\022\016im.turms.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\"\320\001\n\031Update" +
      "RelationshipRequest\022\027\n\017related_user_id\030\001" +
      " \001(\003\022+\n\007blocked\030\002 \001(\0132\032.google.protobuf." +
      "BoolValue\0224\n\017new_group_index\030\003 \001(\0132\033.goo" +
      "gle.protobuf.Int32Value\0227\n\022delete_group_" +
      "index\030\004 \001(\0132\033.google.protobuf.Int32Value" +
      "B2\n.im.micro.access.pojo.request.user.re" +
      "lationshipP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_UpdateRelationshipRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UpdateRelationshipRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UpdateRelationshipRequest_descriptor,
        new java.lang.String[] { "RelatedUserId", "Blocked", "NewGroupIndex", "DeleteGroupIndex", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
