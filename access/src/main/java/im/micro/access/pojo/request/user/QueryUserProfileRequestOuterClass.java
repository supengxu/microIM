// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/query_user_profile_request.proto

package im.micro.access.pojo.request.user;

public final class QueryUserProfileRequestOuterClass {
  private QueryUserProfileRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QueryUserProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QueryUserProfileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-request/user/query_user_profile_reques" +
      "t.proto\022\016im.turms.proto\032\036google/protobuf" +
      "/wrappers.proto\"b\n\027QueryUserProfileReque" +
      "st\022\017\n\007user_id\030\001 \001(\003\0226\n\021last_updated_date" +
      "\030\002 \001(\0132\033.google.protobuf.Int64ValueB%\n!i" +
      "m.micro.access.pojo.request.userP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_QueryUserProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QueryUserProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QueryUserProfileRequest_descriptor,
        new java.lang.String[] { "UserId", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
