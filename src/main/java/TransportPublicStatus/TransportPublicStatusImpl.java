// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransportPublicStatus.proto

package TransportPublicStatus;

public final class TransportPublicStatusImpl {
  private TransportPublicStatusImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransportPublicStatus_transpSelection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransportPublicStatus_transpSelection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransportPublicStatus_transpSelected_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransportPublicStatus_transpSelected_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransportPublicStatus_transpStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransportPublicStatus_transpStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransportPublicStatus_transResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransportPublicStatus_transResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033TransportPublicStatus.proto\022\025Transport" +
      "PublicStatus\"*\n\017transpSelection\022\027\n\017trans" +
      "portOption\030\001 \001(\t\"/\n\016transpSelected\022\035\n\025tr" +
      "ansportInformations\030\001 \001(\t\"*\n\014transpStatu" +
      "s\022\032\n\022transportSituation\030\001 \001(\t\",\n\rtransRe" +
      "sponse\022\033\n\023stringTransResponse\030\001 \001(\t2\355\001\n\025" +
      "TransportPublicStatus\022j\n\025selectTransport" +
      "Public\022&.TransportPublicStatus.transpSel" +
      "ection\032%.TransportPublicStatus.transpSel" +
      "ected\"\000(\001\022h\n\025statusTransportPublic\022#.Tra" +
      "nsportPublicStatus.transpStatus\032$.Transp" +
      "ortPublicStatus.transResponse\"\000(\0010\001B4\n\025T" +
      "ransportPublicStatusB\031TransportPublicSta" +
      "tusImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TransportPublicStatus_transpSelection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TransportPublicStatus_transpSelection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransportPublicStatus_transpSelection_descriptor,
        new java.lang.String[] { "TransportOption", });
    internal_static_TransportPublicStatus_transpSelected_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TransportPublicStatus_transpSelected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransportPublicStatus_transpSelected_descriptor,
        new java.lang.String[] { "TransportInformations", });
    internal_static_TransportPublicStatus_transpStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TransportPublicStatus_transpStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransportPublicStatus_transpStatus_descriptor,
        new java.lang.String[] { "TransportSituation", });
    internal_static_TransportPublicStatus_transResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_TransportPublicStatus_transResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransportPublicStatus_transResponse_descriptor,
        new java.lang.String[] { "StringTransResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
