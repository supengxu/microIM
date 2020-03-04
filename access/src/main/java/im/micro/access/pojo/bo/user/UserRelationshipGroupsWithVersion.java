// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_relationship_groups_with_version.proto

package im.micro.access.pojo.bo.user;

/**
 * Protobuf type {@code im.turms.proto.UserRelationshipGroupsWithVersion}
 */
public  final class UserRelationshipGroupsWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UserRelationshipGroupsWithVersion)
    UserRelationshipGroupsWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRelationshipGroupsWithVersion.newBuilder() to construct.
  private UserRelationshipGroupsWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRelationshipGroupsWithVersion() {
    userRelationshipGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserRelationshipGroupsWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRelationshipGroupsWithVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userRelationshipGroups_ = new java.util.ArrayList<im.micro.access.pojo.bo.user.UserRelationshipGroup>();
              mutable_bitField0_ |= 0x00000001;
            }
            userRelationshipGroups_.add(
                input.readMessage(im.micro.access.pojo.bo.user.UserRelationshipGroup.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (lastUpdatedDate_ != null) {
              subBuilder = lastUpdatedDate_.toBuilder();
            }
            lastUpdatedDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdatedDate_);
              lastUpdatedDate_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userRelationshipGroups_ = java.util.Collections.unmodifiableList(userRelationshipGroups_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipGroupsWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipGroupsWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.class, im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.Builder.class);
  }

  public static final int USER_RELATIONSHIP_GROUPS_FIELD_NUMBER = 1;
  private java.util.List<im.micro.access.pojo.bo.user.UserRelationshipGroup> userRelationshipGroups_;
  /**
   * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
   */
  public java.util.List<im.micro.access.pojo.bo.user.UserRelationshipGroup> getUserRelationshipGroupsList() {
    return userRelationshipGroups_;
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
   */
  public java.util.List<? extends im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder> 
      getUserRelationshipGroupsOrBuilderList() {
    return userRelationshipGroups_;
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
   */
  public int getUserRelationshipGroupsCount() {
    return userRelationshipGroups_.size();
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
   */
  public im.micro.access.pojo.bo.user.UserRelationshipGroup getUserRelationshipGroups(int index) {
    return userRelationshipGroups_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
   */
  public im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder getUserRelationshipGroupsOrBuilder(
      int index) {
    return userRelationshipGroups_.get(index);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value lastUpdatedDate_;
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  public boolean hasLastUpdatedDate() {
    return lastUpdatedDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  public com.google.protobuf.Int64Value getLastUpdatedDate() {
    return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
    return getLastUpdatedDate();
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
    for (int i = 0; i < userRelationshipGroups_.size(); i++) {
      output.writeMessage(1, userRelationshipGroups_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      output.writeMessage(2, getLastUpdatedDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userRelationshipGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userRelationshipGroups_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastUpdatedDate());
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
    if (!(obj instanceof im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion)) {
      return super.equals(obj);
    }
    im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion other = (im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion) obj;

    if (!getUserRelationshipGroupsList()
        .equals(other.getUserRelationshipGroupsList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (!getLastUpdatedDate()
          .equals(other.getLastUpdatedDate())) return false;
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
    if (getUserRelationshipGroupsCount() > 0) {
      hash = (37 * hash) + USER_RELATIONSHIP_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getUserRelationshipGroupsList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parseFrom(
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
  public static Builder newBuilder(im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion prototype) {
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
   * Protobuf type {@code im.turms.proto.UserRelationshipGroupsWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UserRelationshipGroupsWithVersion)
      im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipGroupsWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipGroupsWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.class, im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.Builder.class);
    }

    // Construct using im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.newBuilder()
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
        getUserRelationshipGroupsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userRelationshipGroupsBuilder_ == null) {
        userRelationshipGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userRelationshipGroupsBuilder_.clear();
      }
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipGroupsWithVersion_descriptor;
    }

    @java.lang.Override
    public im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion getDefaultInstanceForType() {
      return im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion build() {
      im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion buildPartial() {
      im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion result = new im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion(this);
      int from_bitField0_ = bitField0_;
      if (userRelationshipGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userRelationshipGroups_ = java.util.Collections.unmodifiableList(userRelationshipGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userRelationshipGroups_ = userRelationshipGroups_;
      } else {
        result.userRelationshipGroups_ = userRelationshipGroupsBuilder_.build();
      }
      if (lastUpdatedDateBuilder_ == null) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
      } else {
        result.lastUpdatedDate_ = lastUpdatedDateBuilder_.build();
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
      if (other instanceof im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion) {
        return mergeFrom((im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion other) {
      if (other == im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion.getDefaultInstance()) return this;
      if (userRelationshipGroupsBuilder_ == null) {
        if (!other.userRelationshipGroups_.isEmpty()) {
          if (userRelationshipGroups_.isEmpty()) {
            userRelationshipGroups_ = other.userRelationshipGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserRelationshipGroupsIsMutable();
            userRelationshipGroups_.addAll(other.userRelationshipGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.userRelationshipGroups_.isEmpty()) {
          if (userRelationshipGroupsBuilder_.isEmpty()) {
            userRelationshipGroupsBuilder_.dispose();
            userRelationshipGroupsBuilder_ = null;
            userRelationshipGroups_ = other.userRelationshipGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userRelationshipGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserRelationshipGroupsFieldBuilder() : null;
          } else {
            userRelationshipGroupsBuilder_.addAllMessages(other.userRelationshipGroups_);
          }
        }
      }
      if (other.hasLastUpdatedDate()) {
        mergeLastUpdatedDate(other.getLastUpdatedDate());
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
      im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.micro.access.pojo.bo.user.UserRelationshipGroup> userRelationshipGroups_ =
      java.util.Collections.emptyList();
    private void ensureUserRelationshipGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userRelationshipGroups_ = new java.util.ArrayList<im.micro.access.pojo.bo.user.UserRelationshipGroup>(userRelationshipGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.micro.access.pojo.bo.user.UserRelationshipGroup, im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder, im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder> userRelationshipGroupsBuilder_;

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public java.util.List<im.micro.access.pojo.bo.user.UserRelationshipGroup> getUserRelationshipGroupsList() {
      if (userRelationshipGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userRelationshipGroups_);
      } else {
        return userRelationshipGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public int getUserRelationshipGroupsCount() {
      if (userRelationshipGroupsBuilder_ == null) {
        return userRelationshipGroups_.size();
      } else {
        return userRelationshipGroupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public im.micro.access.pojo.bo.user.UserRelationshipGroup getUserRelationshipGroups(int index) {
      if (userRelationshipGroupsBuilder_ == null) {
        return userRelationshipGroups_.get(index);
      } else {
        return userRelationshipGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder setUserRelationshipGroups(
        int index, im.micro.access.pojo.bo.user.UserRelationshipGroup value) {
      if (userRelationshipGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.set(index, value);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder setUserRelationshipGroups(
        int index, im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder builderForValue) {
      if (userRelationshipGroupsBuilder_ == null) {
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder addUserRelationshipGroups(im.micro.access.pojo.bo.user.UserRelationshipGroup value) {
      if (userRelationshipGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(value);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder addUserRelationshipGroups(
        int index, im.micro.access.pojo.bo.user.UserRelationshipGroup value) {
      if (userRelationshipGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(index, value);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder addUserRelationshipGroups(
        im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder builderForValue) {
      if (userRelationshipGroupsBuilder_ == null) {
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(builderForValue.build());
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder addUserRelationshipGroups(
        int index, im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder builderForValue) {
      if (userRelationshipGroupsBuilder_ == null) {
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder addAllUserRelationshipGroups(
        java.lang.Iterable<? extends im.micro.access.pojo.bo.user.UserRelationshipGroup> values) {
      if (userRelationshipGroupsBuilder_ == null) {
        ensureUserRelationshipGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userRelationshipGroups_);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder clearUserRelationshipGroups() {
      if (userRelationshipGroupsBuilder_ == null) {
        userRelationshipGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public Builder removeUserRelationshipGroups(int index) {
      if (userRelationshipGroupsBuilder_ == null) {
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.remove(index);
        onChanged();
      } else {
        userRelationshipGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder getUserRelationshipGroupsBuilder(
        int index) {
      return getUserRelationshipGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder getUserRelationshipGroupsOrBuilder(
        int index) {
      if (userRelationshipGroupsBuilder_ == null) {
        return userRelationshipGroups_.get(index);  } else {
        return userRelationshipGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public java.util.List<? extends im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder> 
         getUserRelationshipGroupsOrBuilderList() {
      if (userRelationshipGroupsBuilder_ != null) {
        return userRelationshipGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userRelationshipGroups_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder addUserRelationshipGroupsBuilder() {
      return getUserRelationshipGroupsFieldBuilder().addBuilder(
          im.micro.access.pojo.bo.user.UserRelationshipGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder addUserRelationshipGroupsBuilder(
        int index) {
      return getUserRelationshipGroupsFieldBuilder().addBuilder(
          index, im.micro.access.pojo.bo.user.UserRelationshipGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public java.util.List<im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder> 
         getUserRelationshipGroupsBuilderList() {
      return getUserRelationshipGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.micro.access.pojo.bo.user.UserRelationshipGroup, im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder, im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder> 
        getUserRelationshipGroupsFieldBuilder() {
      if (userRelationshipGroupsBuilder_ == null) {
        userRelationshipGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.micro.access.pojo.bo.user.UserRelationshipGroup, im.micro.access.pojo.bo.user.UserRelationshipGroup.Builder, im.micro.access.pojo.bo.user.UserRelationshipGroupOrBuilder>(
                userRelationshipGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userRelationshipGroups_ = null;
      }
      return userRelationshipGroupsBuilder_;
    }

    private com.google.protobuf.Int64Value lastUpdatedDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> lastUpdatedDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    public boolean hasLastUpdatedDate() {
      return lastUpdatedDateBuilder_ != null || lastUpdatedDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    public com.google.protobuf.Int64Value getLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      } else {
        return lastUpdatedDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdatedDate_ = value;
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder mergeLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (lastUpdatedDate_ != null) {
          lastUpdatedDate_ =
            com.google.protobuf.Int64Value.newBuilder(lastUpdatedDate_).mergeFrom(value).buildPartial();
        } else {
          lastUpdatedDate_ = value;
        }
        onChanged();
      } else {
        lastUpdatedDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder clearLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
        onChanged();
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getLastUpdatedDateBuilder() {
      
      onChanged();
      return getLastUpdatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
      if (lastUpdatedDateBuilder_ != null) {
        return lastUpdatedDateBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdatedDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getLastUpdatedDateFieldBuilder() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getLastUpdatedDate(),
                getParentForChildren(),
                isClean());
        lastUpdatedDate_ = null;
      }
      return lastUpdatedDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UserRelationshipGroupsWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UserRelationshipGroupsWithVersion)
  private static final im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion();
  }

  public static im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRelationshipGroupsWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<UserRelationshipGroupsWithVersion>() {
    @java.lang.Override
    public UserRelationshipGroupsWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRelationshipGroupsWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRelationshipGroupsWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRelationshipGroupsWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.micro.access.pojo.bo.user.UserRelationshipGroupsWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

