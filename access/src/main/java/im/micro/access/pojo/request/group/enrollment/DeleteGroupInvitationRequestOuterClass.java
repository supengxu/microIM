// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/delete_group_invitation_request.proto

package im.micro.access.pojo.request.group.enrollment;

public final class DeleteGroupInvitationRequestOuterClass {
  private DeleteGroupInvitationRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_DeleteGroupInvitationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_DeleteGroupInvitationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>request/group/enrollment/delete_group_" +
      "invitation_request.proto\022\016im.micro.proto" +
      "\"5\n\034DeleteGroupInvitationRequest\022\025\n\rinvi" +
      "tation_id\030\001 \001(\003B1\n-im.micro.access.pojo." +
      "request.group.enrollmentP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_micro_proto_DeleteGroupInvitationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_DeleteGroupInvitationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_DeleteGroupInvitationRequest_descriptor,
        new java.lang.String[] { "InvitationId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
