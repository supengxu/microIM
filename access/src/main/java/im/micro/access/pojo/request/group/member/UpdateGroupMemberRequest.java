// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/member/update_group_member_request.proto

package im.micro.access.pojo.request.group.member;

/**
 * Protobuf type {@code im.turms.proto.UpdateGroupMemberRequest}
 */
public  final class UpdateGroupMemberRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateGroupMemberRequest)
    UpdateGroupMemberRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGroupMemberRequest.newBuilder() to construct.
  private UpdateGroupMemberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGroupMemberRequest() {
    role_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGroupMemberRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateGroupMemberRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            groupId_ = input.readInt64();
            break;
          }
          case 16: {

            memberId_ = input.readInt64();
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            role_ = rawValue;
            break;
          }
          case 42: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (muteEndDate_ != null) {
              subBuilder = muteEndDate_.toBuilder();
            }
            muteEndDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(muteEndDate_);
              muteEndDate_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOuterClass.internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOuterClass.internal_static_im_turms_proto_UpdateGroupMemberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.class, im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private long groupId_;
  /**
   * <code>int64 group_id = 1;</code>
   * @return The groupId.
   */
  public long getGroupId() {
    return groupId_;
  }

  public static final int MEMBER_ID_FIELD_NUMBER = 2;
  private long memberId_;
  /**
   * <code>int64 member_id = 2;</code>
   * @return The memberId.
   */
  public long getMemberId() {
    return memberId_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return Whether the name field is set.
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return The name.
   */
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int ROLE_FIELD_NUMBER = 4;
  private int role_;
  /**
   * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
   * @return The enum numeric value on the wire for role.
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
   * @return The role.
   */
  public im.micro.access.constant.GroupMemberRole getRole() {
    @SuppressWarnings("deprecation")
    im.micro.access.constant.GroupMemberRole result = im.micro.access.constant.GroupMemberRole.valueOf(role_);
    return result == null ? im.micro.access.constant.GroupMemberRole.UNRECOGNIZED : result;
  }

  public static final int MUTE_END_DATE_FIELD_NUMBER = 5;
  private com.google.protobuf.Int64Value muteEndDate_;
  /**
   * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
   * @return Whether the muteEndDate field is set.
   */
  public boolean hasMuteEndDate() {
    return muteEndDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
   * @return The muteEndDate.
   */
  public com.google.protobuf.Int64Value getMuteEndDate() {
    return muteEndDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : muteEndDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getMuteEndDateOrBuilder() {
    return getMuteEndDate();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (groupId_ != 0L) {
      output.writeInt64(1, groupId_);
    }
    if (memberId_ != 0L) {
      output.writeInt64(2, memberId_);
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    if (role_ != im.micro.access.constant.GroupMemberRole.OWNER.getNumber()) {
      output.writeEnum(4, role_);
    }
    if (muteEndDate_ != null) {
      output.writeMessage(5, getMuteEndDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, groupId_);
    }
    if (memberId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, memberId_);
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
    }
    if (role_ != im.micro.access.constant.GroupMemberRole.OWNER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, role_);
    }
    if (muteEndDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMuteEndDate());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest)) {
      return super.equals(obj);
    }
    im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest other = (im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest) obj;

    if (getGroupId()
        != other.getGroupId()) return false;
    if (getMemberId()
        != other.getMemberId()) return false;
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (role_ != other.role_) return false;
    if (hasMuteEndDate() != other.hasMuteEndDate()) return false;
    if (hasMuteEndDate()) {
      if (!getMuteEndDate()
          .equals(other.getMuteEndDate())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGroupId());
    hash = (37 * hash) + MEMBER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemberId());
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    if (hasMuteEndDate()) {
      hash = (37 * hash) + MUTE_END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getMuteEndDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.UpdateGroupMemberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateGroupMemberRequest)
      im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOuterClass.internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOuterClass.internal_static_im_turms_proto_UpdateGroupMemberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.class, im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.Builder.class);
    }

    // Construct using im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupId_ = 0L;

      memberId_ = 0L;

      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      role_ = 0;

      if (muteEndDateBuilder_ == null) {
        muteEndDate_ = null;
      } else {
        muteEndDate_ = null;
        muteEndDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequestOuterClass.internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest getDefaultInstanceForType() {
      return im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest build() {
      im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest buildPartial() {
      im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest result = new im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest(this);
      result.groupId_ = groupId_;
      result.memberId_ = memberId_;
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      result.role_ = role_;
      if (muteEndDateBuilder_ == null) {
        result.muteEndDate_ = muteEndDate_;
      } else {
        result.muteEndDate_ = muteEndDateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest) {
        return mergeFrom((im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest other) {
      if (other == im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest.getDefaultInstance()) return this;
      if (other.getGroupId() != 0L) {
        setGroupId(other.getGroupId());
      }
      if (other.getMemberId() != 0L) {
        setMemberId(other.getMemberId());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      if (other.hasMuteEndDate()) {
        mergeMuteEndDate(other.getMuteEndDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long groupId_ ;
    /**
     * <code>int64 group_id = 1;</code>
     * @return The groupId.
     */
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {
      
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private long memberId_ ;
    /**
     * <code>int64 member_id = 2;</code>
     * @return The memberId.
     */
    public long getMemberId() {
      return memberId_;
    }
    /**
     * <code>int64 member_id = 2;</code>
     * @param value The memberId to set.
     * @return This builder for chaining.
     */
    public Builder setMemberId(long value) {
      
      memberId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 member_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberId() {
      
      memberId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private int role_ = 0;
    /**
     * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
     * @return The enum numeric value on the wire for role.
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
     * @return The role.
     */
    public im.micro.access.constant.GroupMemberRole getRole() {
      @SuppressWarnings("deprecation")
      im.micro.access.constant.GroupMemberRole result = im.micro.access.constant.GroupMemberRole.valueOf(role_);
      return result == null ? im.micro.access.constant.GroupMemberRole.UNRECOGNIZED : result;
    }
    /**
     * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(im.micro.access.constant.GroupMemberRole value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.im.turms.proto.GroupMemberRole role = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      
      role_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value muteEndDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> muteEndDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     * @return Whether the muteEndDate field is set.
     */
    public boolean hasMuteEndDate() {
      return muteEndDateBuilder_ != null || muteEndDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     * @return The muteEndDate.
     */
    public com.google.protobuf.Int64Value getMuteEndDate() {
      if (muteEndDateBuilder_ == null) {
        return muteEndDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : muteEndDate_;
      } else {
        return muteEndDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public Builder setMuteEndDate(com.google.protobuf.Int64Value value) {
      if (muteEndDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        muteEndDate_ = value;
        onChanged();
      } else {
        muteEndDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public Builder setMuteEndDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (muteEndDateBuilder_ == null) {
        muteEndDate_ = builderForValue.build();
        onChanged();
      } else {
        muteEndDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public Builder mergeMuteEndDate(com.google.protobuf.Int64Value value) {
      if (muteEndDateBuilder_ == null) {
        if (muteEndDate_ != null) {
          muteEndDate_ =
            com.google.protobuf.Int64Value.newBuilder(muteEndDate_).mergeFrom(value).buildPartial();
        } else {
          muteEndDate_ = value;
        }
        onChanged();
      } else {
        muteEndDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public Builder clearMuteEndDate() {
      if (muteEndDateBuilder_ == null) {
        muteEndDate_ = null;
        onChanged();
      } else {
        muteEndDate_ = null;
        muteEndDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public com.google.protobuf.Int64Value.Builder getMuteEndDateBuilder() {
      
      onChanged();
      return getMuteEndDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getMuteEndDateOrBuilder() {
      if (muteEndDateBuilder_ != null) {
        return muteEndDateBuilder_.getMessageOrBuilder();
      } else {
        return muteEndDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : muteEndDate_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value mute_end_date = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getMuteEndDateFieldBuilder() {
      if (muteEndDateBuilder_ == null) {
        muteEndDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getMuteEndDate(),
                getParentForChildren(),
                isClean());
        muteEndDate_ = null;
      }
      return muteEndDateBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateGroupMemberRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateGroupMemberRequest)
  private static final im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest();
  }

  public static im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGroupMemberRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGroupMemberRequest>() {
    @java.lang.Override
    public UpdateGroupMemberRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateGroupMemberRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateGroupMemberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGroupMemberRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.micro.access.pojo.request.group.member.UpdateGroupMemberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

