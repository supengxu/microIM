// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/blacklist/delete_group_blacklisted_user_request.proto

package im.micro.access.pojo.request.group.blacklist;

public final class DeleteGroupBlacklistedUserRequestOuterClass {
  private DeleteGroupBlacklistedUserRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_DeleteGroupBlacklistedUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_DeleteGroupBlacklistedUserRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCrequest/group/blacklist/delete_group_b" +
      "lacklisted_user_request.proto\022\016im.micro." +
      "proto\"T\n!DeleteGroupBlacklistedUserReque" +
      "st\022\020\n\010group_id\030\001 \001(\003\022\035\n\025unblacklisted_us" +
      "er_id\030\002 \001(\003B0\n,im.micro.access.pojo.requ" +
      "est.group.blacklistP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_micro_proto_DeleteGroupBlacklistedUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_DeleteGroupBlacklistedUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_DeleteGroupBlacklistedUserRequest_descriptor,
        new java.lang.String[] { "GroupId", "UnblacklistedUserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
