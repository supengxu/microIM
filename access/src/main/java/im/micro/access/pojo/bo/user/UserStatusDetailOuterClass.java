// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_status_detail.proto

package im.micro.access.pojo.bo.user;

public final class UserStatusDetailOuterClass {
  private UserStatusDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UserStatusDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UserStatusDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#model/user/user_status_detail.proto\022\016i" +
      "m.turms.proto\032\032constant/user_status.prot" +
      "o\032\032constant/device_type.proto\"\214\001\n\020UserSt" +
      "atusDetail\022\017\n\007user_id\030\001 \001(\003\022/\n\013user_stat" +
      "us\030\002 \001(\0162\032.im.turms.proto.UserStatus\0226\n\022" +
      "using_device_types\030\003 \003(\0162\032.im.turms.prot" +
      "o.DeviceTypeB \n\034im.micro.access.pojo.bo." +
      "userP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.micro.access.constant.UserStatusOuterClass.getDescriptor(),
          im.micro.access.constant.DeviceTypeOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UserStatusDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UserStatusDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UserStatusDetail_descriptor,
        new java.lang.String[] { "UserId", "UserStatus", "UsingDeviceTypes", });
    im.micro.access.constant.UserStatusOuterClass.getDescriptor();
    im.micro.access.constant.DeviceTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
