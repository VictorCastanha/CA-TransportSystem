// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RouteSelection.proto

package RouteSelection;

public final class RouteSelectionImpl {
  private RouteSelectionImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RouteSelection_route_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RouteSelection_route_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RouteSelection_routeSelected_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RouteSelection_routeSelected_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RouteSelection_requestTransport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RouteSelection_requestTransport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RouteSelection_transportAvailable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RouteSelection_transportAvailable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RouteSelection.proto\022\016RouteSelection\"\036" +
      "\n\005route\022\025\n\rstringAddress\030\001 \001(\t\"$\n\rrouteS" +
      "elected\022\023\n\013destination\030\001 \001(\t\"(\n\020requestT" +
      "ransport\022\024\n\014reqTransport\030\001 \001(\t\"+\n\022transp" +
      "ortAvailable\022\025\n\rkindTransport\030\001 \001(\t2\277\001\n\016" +
      "RouteSelection\022G\n\013selectRoute\022\025.RouteSel" +
      "ection.route\032\035.RouteSelection.routeSelec" +
      "ted\"\000(\001\022d\n\030transportPublicAvailable\022 .Ro" +
      "uteSelection.requestTransport\032\".RouteSel" +
      "ection.transportAvailable\"\0000\001B&\n\016RouteSe" +
      "lectionB\022RouteSelectionImplP\001b\006proto3"
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
    internal_static_RouteSelection_route_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RouteSelection_route_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RouteSelection_route_descriptor,
        new java.lang.String[] { "StringAddress", });
    internal_static_RouteSelection_routeSelected_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RouteSelection_routeSelected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RouteSelection_routeSelected_descriptor,
        new java.lang.String[] { "Destination", });
    internal_static_RouteSelection_requestTransport_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RouteSelection_requestTransport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RouteSelection_requestTransport_descriptor,
        new java.lang.String[] { "ReqTransport", });
    internal_static_RouteSelection_transportAvailable_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_RouteSelection_transportAvailable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RouteSelection_transportAvailable_descriptor,
        new java.lang.String[] { "KindTransport", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
