// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/query_relationship_groups_request.proto

package im.micro.access.pojo.request.user.relationship;

public final class QueryRelationshipGroupsRequestOuterClass {
  private QueryRelationshipGroupsRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_micro_proto_QueryRelationshipGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_micro_proto_QueryRelationshipGroupsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nArequest/user/relationship/query_relati" +
      "onship_groups_request.proto\022\016im.micro.pr" +
      "oto\032\036google/protobuf/wrappers.proto\"X\n\036Q" +
      "ueryRelationshipGroupsRequest\0226\n\021last_up" +
      "dated_date\030\001 \001(\0132\033.google.protobuf.Int64" +
      "ValueB2\n.im.micro.access.pojo.request.us" +
      "er.relationshipP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_micro_proto_QueryRelationshipGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_micro_proto_QueryRelationshipGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_micro_proto_QueryRelationshipGroupsRequest_descriptor,
        new java.lang.String[] { "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
