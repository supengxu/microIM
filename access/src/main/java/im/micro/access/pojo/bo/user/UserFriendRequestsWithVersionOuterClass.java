// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_friend_requests_with_version.proto

package im.micro.access.pojo.bo.user;

public final class UserFriendRequestsWithVersionOuterClass {
  private UserFriendRequestsWithVersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UserFriendRequestsWithVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2model/user/user_friend_requests_with_v" +
      "ersion.proto\022\016im.turms.proto\032\036google/pro" +
      "tobuf/wrappers.proto\032$model/user/user_fr" +
      "iend_request.proto\"\230\001\n\035UserFriendRequest" +
      "sWithVersion\022?\n\024user_friend_requests\030\001 \003" +
      "(\0132!.im.turms.proto.UserFriendRequest\0226\n" +
      "\021last_updated_date\030\002 \001(\0132\033.google.protob" +
      "uf.Int64ValueB \n\034im.micro.access.pojo.bo" +
      ".userP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.micro.access.pojo.bo.user.UserFriendRequestOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UserFriendRequestsWithVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor,
        new java.lang.String[] { "UserFriendRequests", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.micro.access.pojo.bo.user.UserFriendRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
