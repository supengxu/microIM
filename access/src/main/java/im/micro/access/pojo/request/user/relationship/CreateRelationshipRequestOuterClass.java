// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/create_relationship_request.proto

package im.micro.access.pojo.request.user.relationship;

public final class CreateRelationshipRequestOuterClass {
  private CreateRelationshipRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_CreateRelationshipRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_CreateRelationshipRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;request/user/relationship/create_relat" +
      "ionship_request.proto\022\016im.micro.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\"r\n\031CreateR" +
      "elationshipRequest\022\017\n\007user_id\030\001 \001(\003\022\022\n\ni" +
      "s_blocked\030\002 \001(\010\0220\n\013group_index\030\003 \001(\0132\033.g" +
      "oogle.protobuf.Int32ValueB2\n.im.micro.ac" +
      "cess.pojo.request.user.relationshipP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_micro_proto_CreateRelationshipRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_CreateRelationshipRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_CreateRelationshipRequest_descriptor,
        new java.lang.String[] { "UserId", "IsBlocked", "GroupIndex", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
