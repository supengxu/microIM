// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/group_join_question.proto

package im.micro.access.pojo.bo.group;

public interface GroupJoinQuestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.GroupJoinQuestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   * @return The groupId.
   */
  com.google.protobuf.Int64Value getGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue question = 3;</code>
   * @return Whether the question field is set.
   */
  boolean hasQuestion();
  /**
   * <code>.google.protobuf.StringValue question = 3;</code>
   * @return The question.
   */
  com.google.protobuf.StringValue getQuestion();
  /**
   * <code>.google.protobuf.StringValue question = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getQuestionOrBuilder();

  /**
   * <code>repeated .google.protobuf.StringValue answers = 4;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getAnswersList();
  /**
   * <code>repeated .google.protobuf.StringValue answers = 4;</code>
   */
  com.google.protobuf.StringValue getAnswers(int index);
  /**
   * <code>repeated .google.protobuf.StringValue answers = 4;</code>
   */
  int getAnswersCount();
  /**
   * <code>repeated .google.protobuf.StringValue answers = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getAnswersOrBuilderList();
  /**
   * <code>repeated .google.protobuf.StringValue answers = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAnswersOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int32Value score = 5;</code>
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   * <code>.google.protobuf.Int32Value score = 5;</code>
   * @return The score.
   */
  com.google.protobuf.Int32Value getScore();
  /**
   * <code>.google.protobuf.Int32Value score = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getScoreOrBuilder();
}
