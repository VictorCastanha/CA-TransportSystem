package RouteSelection;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *rpc stands for remote procedure call
 *containsString is the actual message that travel between client and server
 *a second message travels back
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: RouteSelection.proto")
public final class RouteSelectionGrpc {

  private RouteSelectionGrpc() {}

  public static final String SERVICE_NAME = "RouteSelection.RouteSelection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RouteSelection.route,
      RouteSelection.routeSelected> getSelectRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "selectRoute",
      requestType = RouteSelection.route.class,
      responseType = RouteSelection.routeSelected.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<RouteSelection.route,
      RouteSelection.routeSelected> getSelectRouteMethod() {
    io.grpc.MethodDescriptor<RouteSelection.route, RouteSelection.routeSelected> getSelectRouteMethod;
    if ((getSelectRouteMethod = RouteSelectionGrpc.getSelectRouteMethod) == null) {
      synchronized (RouteSelectionGrpc.class) {
        if ((getSelectRouteMethod = RouteSelectionGrpc.getSelectRouteMethod) == null) {
          RouteSelectionGrpc.getSelectRouteMethod = getSelectRouteMethod = 
              io.grpc.MethodDescriptor.<RouteSelection.route, RouteSelection.routeSelected>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RouteSelection.RouteSelection", "selectRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RouteSelection.route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RouteSelection.routeSelected.getDefaultInstance()))
                  .setSchemaDescriptor(new RouteSelectionMethodDescriptorSupplier("selectRoute"))
                  .build();
          }
        }
     }
     return getSelectRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RouteSelection.requestTransport,
      RouteSelection.transportAvailable> getTransportPublicAvailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transportPublicAvailable",
      requestType = RouteSelection.requestTransport.class,
      responseType = RouteSelection.transportAvailable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<RouteSelection.requestTransport,
      RouteSelection.transportAvailable> getTransportPublicAvailableMethod() {
    io.grpc.MethodDescriptor<RouteSelection.requestTransport, RouteSelection.transportAvailable> getTransportPublicAvailableMethod;
    if ((getTransportPublicAvailableMethod = RouteSelectionGrpc.getTransportPublicAvailableMethod) == null) {
      synchronized (RouteSelectionGrpc.class) {
        if ((getTransportPublicAvailableMethod = RouteSelectionGrpc.getTransportPublicAvailableMethod) == null) {
          RouteSelectionGrpc.getTransportPublicAvailableMethod = getTransportPublicAvailableMethod = 
              io.grpc.MethodDescriptor.<RouteSelection.requestTransport, RouteSelection.transportAvailable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RouteSelection.RouteSelection", "transportPublicAvailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RouteSelection.requestTransport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RouteSelection.transportAvailable.getDefaultInstance()))
                  .setSchemaDescriptor(new RouteSelectionMethodDescriptorSupplier("transportPublicAvailable"))
                  .build();
          }
        }
     }
     return getTransportPublicAvailableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteSelectionStub newStub(io.grpc.Channel channel) {
    return new RouteSelectionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteSelectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouteSelectionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteSelectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouteSelectionFutureStub(channel);
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static abstract class RouteSelectionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC Method 1 Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<RouteSelection.route> selectRoute(
        io.grpc.stub.StreamObserver<RouteSelection.routeSelected> responseObserver) {
      return asyncUnimplementedStreamingCall(getSelectRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2 Server Streaming
     * </pre>
     */
    public void transportPublicAvailable(RouteSelection.requestTransport request,
        io.grpc.stub.StreamObserver<RouteSelection.transportAvailable> responseObserver) {
      asyncUnimplementedUnaryCall(getTransportPublicAvailableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                RouteSelection.route,
                RouteSelection.routeSelected>(
                  this, METHODID_SELECT_ROUTE)))
          .addMethod(
            getTransportPublicAvailableMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                RouteSelection.requestTransport,
                RouteSelection.transportAvailable>(
                  this, METHODID_TRANSPORT_PUBLIC_AVAILABLE)))
          .build();
    }
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static final class RouteSelectionStub extends io.grpc.stub.AbstractStub<RouteSelectionStub> {
    private RouteSelectionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteSelectionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteSelectionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteSelectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1 Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<RouteSelection.route> selectRoute(
        io.grpc.stub.StreamObserver<RouteSelection.routeSelected> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSelectRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2 Server Streaming
     * </pre>
     */
    public void transportPublicAvailable(RouteSelection.requestTransport request,
        io.grpc.stub.StreamObserver<RouteSelection.transportAvailable> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTransportPublicAvailableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static final class RouteSelectionBlockingStub extends io.grpc.stub.AbstractStub<RouteSelectionBlockingStub> {
    private RouteSelectionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteSelectionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteSelectionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteSelectionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 2 Server Streaming
     * </pre>
     */
    public java.util.Iterator<RouteSelection.transportAvailable> transportPublicAvailable(
        RouteSelection.requestTransport request) {
      return blockingServerStreamingCall(
          getChannel(), getTransportPublicAvailableMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static final class RouteSelectionFutureStub extends io.grpc.stub.AbstractStub<RouteSelectionFutureStub> {
    private RouteSelectionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteSelectionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteSelectionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteSelectionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TRANSPORT_PUBLIC_AVAILABLE = 0;
  private static final int METHODID_SELECT_ROUTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteSelectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteSelectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSPORT_PUBLIC_AVAILABLE:
          serviceImpl.transportPublicAvailable((RouteSelection.requestTransport) request,
              (io.grpc.stub.StreamObserver<RouteSelection.transportAvailable>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.selectRoute(
              (io.grpc.stub.StreamObserver<RouteSelection.routeSelected>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RouteSelectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteSelectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RouteSelection.RouteSelectionImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteSelection");
    }
  }

  private static final class RouteSelectionFileDescriptorSupplier
      extends RouteSelectionBaseDescriptorSupplier {
    RouteSelectionFileDescriptorSupplier() {}
  }

  private static final class RouteSelectionMethodDescriptorSupplier
      extends RouteSelectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteSelectionMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RouteSelectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteSelectionFileDescriptorSupplier())
              .addMethod(getSelectRouteMethod())
              .addMethod(getTransportPublicAvailableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
