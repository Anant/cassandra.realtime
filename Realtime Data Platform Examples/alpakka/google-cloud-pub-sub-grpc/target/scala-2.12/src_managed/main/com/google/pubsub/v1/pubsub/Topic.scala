// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** A topic resource.
  *
  * @param name
  *   The name of the topic. It must have the format
  *   `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
  *   and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
  *   underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
  *   signs (`%`). It must be between 3 and 255 characters in length, and it
  *   must not start with `"goog"`.
  * @param labels
  *   User labels.
  */
@SerialVersionUID(0L)
final case class Topic(
    name: _root_.scala.Predef.String = "",
    labels: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Topic] with scalapb.lenses.Updatable[Topic] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      labels.foreach { __item =>
        val __value = com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      labels.foreach { __v =>
        val __m = com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toBase(__v)
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.Topic = {
      var __name = this.name
      val __labels = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.labels)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __labels += com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.google.pubsub.v1.pubsub.Topic.LabelsEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.Topic(
          name = __name,
          labels = __labels.result()
      )
    }
    def withName(__v: _root_.scala.Predef.String): Topic = copy(name = __v)
    def clearLabels = copy(labels = scala.collection.immutable.Map.empty)
    def addLabels(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): Topic = addAllLabels(__vs)
    def addAllLabels(__vs: TraversableOnce[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): Topic = copy(labels = labels ++ __vs)
    def withLabels(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): Topic = copy(labels = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => labels.map(com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toBase)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(labels.map(com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.Topic
}

object Topic extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.Topic] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.Topic] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.Topic = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.Topic(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic.LabelsEntry]].map(com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toCustom)(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.Topic] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.Topic(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic.LabelsEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.google.pubsub.v1.pubsub.Topic._typemapper_labels.toCustom)(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.pubsub.v1.pubsub.Topic.LabelsEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.com.google.pubsub.v1.pubsub.Topic.LabelsEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.Topic(
  )
  @SerialVersionUID(0L)
  final case class LabelsEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = ""
      ) extends scalapb.GeneratedMessage with scalapb.Message[LabelsEntry] with scalapb.lenses.Updatable[LabelsEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = value
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        __size
      }
      final override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        {
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != "") {
            _output__.writeString(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.Topic.LabelsEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.pubsub.v1.pubsub.Topic.LabelsEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): LabelsEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): LabelsEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.pubsub.v1.pubsub.Topic.LabelsEntry
  }
  
  object LabelsEntry extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.Topic.LabelsEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.Topic.LabelsEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.Topic.LabelsEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.pubsub.v1.pubsub.Topic.LabelsEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.Topic.LabelsEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.pubsub.v1.pubsub.Topic.LabelsEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.pubsub.v1.pubsub.Topic.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.pubsub.v1.pubsub.Topic.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.pubsub.v1.pubsub.Topic.LabelsEntry(
    )
    implicit class LabelsEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.Topic.LabelsEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.Topic.LabelsEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.Topic.LabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.Topic.LabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => com.google.pubsub.v1.pubsub.Topic.LabelsEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.com.google.pubsub.v1.pubsub.Topic.LabelsEntry = _root_.com.google.pubsub.v1.pubsub.Topic.LabelsEntry(
      key,
      value
    )
  }
  
  implicit class TopicLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.Topic]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.Topic](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def labels: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.labels)((c_, f_) => c_.copy(labels = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val LABELS_FIELD_NUMBER = 2
  @transient
  private val _typemapper_labels: _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.Topic.LabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.Topic.LabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    name: _root_.scala.Predef.String,
    labels: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]
  ): _root_.com.google.pubsub.v1.pubsub.Topic = _root_.com.google.pubsub.v1.pubsub.Topic(
    name,
    labels
  )
}