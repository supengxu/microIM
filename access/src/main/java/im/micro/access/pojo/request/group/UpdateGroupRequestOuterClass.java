// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/update_group_request.proto

package im.micro.access.pojo.request.group;

public final class UpdateGroupRequestOuterClass {
  private UpdateGroupRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_UpdateGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_UpdateGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(request/group/update_group_request.pro" +
      "to\022\016im.micro.proto\032\036google/protobuf/wrap" +
      "pers.proto\"\374\003\n\022UpdateGroupRequest\022\020\n\010gro" +
      "up_id\030\001 \001(\003\0220\n\ngroup_name\030\002 \001(\0132\034.google" +
      ".protobuf.StringValue\022+\n\005intro\030\003 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0222\n\014announceme" +
      "nt\030\004 \001(\0132\034.google.protobuf.StringValue\0229" +
      "\n\023profile_picture_url\030\005 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0222\n\rminimum_score\030\006 \001(\013" +
      "2\033.google.protobuf.Int32Value\0222\n\rgroup_t" +
      "ype_id\030\007 \001(\0132\033.google.protobuf.Int64Valu" +
      "e\0222\n\rmute_end_date\030\010 \001(\0132\033.google.protob" +
      "uf.Int64Value\0221\n\014successor_id\030\t \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\0227\n\023quit_after_t" +
      "ransfer\030\n \001(\0132\032.google.protobuf.BoolValu" +
      "eB&\n\"im.micro.access.pojo.request.groupP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_micro_proto_UpdateGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_UpdateGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_UpdateGroupRequest_descriptor,
        new java.lang.String[] { "GroupId", "GroupName", "Intro", "Announcement", "ProfilePictureUrl", "MinimumScore", "GroupTypeId", "MuteEndDate", "SuccessorId", "QuitAfterTransfer", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
