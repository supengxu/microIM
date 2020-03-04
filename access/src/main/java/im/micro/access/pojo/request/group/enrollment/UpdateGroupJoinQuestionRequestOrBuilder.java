// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/update_group_join_question_request.proto

package im.micro.access.pojo.request.group.enrollment;

public interface UpdateGroupJoinQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UpdateGroupJoinQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 question_id = 1;</code>
   * @return The questionId.
   */
  long getQuestionId();

  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   * @return Whether the question field is set.
   */
  boolean hasQuestion();
  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   * @return The question.
   */
  com.google.protobuf.StringValue getQuestion();
  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getQuestionOrBuilder();

  /**
   * <code>repeated string answers = 3;</code>
   * @return A list containing the answers.
   */
  java.util.List<java.lang.String>
      getAnswersList();
  /**
   * <code>repeated string answers = 3;</code>
   * @return The count of answers.
   */
  int getAnswersCount();
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  java.lang.String getAnswers(int index);
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  com.google.protobuf.ByteString
      getAnswersBytes(int index);

  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   * @return The score.
   */
  com.google.protobuf.Int32Value getScore();
  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getScoreOrBuilder();
}
