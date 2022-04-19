package CalculatingRoute;

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
    comments = "Source: CalculatingRoute.proto")
public final class CalculatingRouteGrpc {

  private CalculatingRouteGrpc() {}

  public static final String SERVICE_NAME = "CalculatingRoute.CalculatingRoute";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CalculatingRoute.requestAddress,
      CalculatingRoute.lookingAddress> getWriteAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "writeAddress",
      requestType = CalculatingRoute.requestAddress.class,
      responseType = CalculatingRoute.lookingAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CalculatingRoute.requestAddress,
      CalculatingRoute.lookingAddress> getWriteAddressMethod() {
    io.grpc.MethodDescriptor<CalculatingRoute.requestAddress, CalculatingRoute.lookingAddress> getWriteAddressMethod;
    if ((getWriteAddressMethod = CalculatingRouteGrpc.getWriteAddressMethod) == null) {
      synchronized (CalculatingRouteGrpc.class) {
        if ((getWriteAddressMethod = CalculatingRouteGrpc.getWriteAddressMethod) == null) {
          CalculatingRouteGrpc.getWriteAddressMethod = getWriteAddressMethod = 
              io.grpc.MethodDescriptor.<CalculatingRoute.requestAddress, CalculatingRoute.lookingAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CalculatingRoute.CalculatingRoute", "writeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CalculatingRoute.requestAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CalculatingRoute.lookingAddress.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatingRouteMethodDescriptorSupplier("writeAddress"))
                  .build();
          }
        }
     }
     return getWriteAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CalculatingRoute.requestAddress,
      CalculatingRoute.addressDistance> getDisplayDistanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayDistance",
      requestType = CalculatingRoute.requestAddress.class,
      responseType = CalculatingRoute.addressDistance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CalculatingRoute.requestAddress,
      CalculatingRoute.addressDistance> getDisplayDistanceMethod() {
    io.grpc.MethodDescriptor<CalculatingRoute.requestAddress, CalculatingRoute.addressDistance> getDisplayDistanceMethod;
    if ((getDisplayDistanceMethod = CalculatingRouteGrpc.getDisplayDistanceMethod) == null) {
      synchronized (CalculatingRouteGrpc.class) {
        if ((getDisplayDistanceMethod = CalculatingRouteGrpc.getDisplayDistanceMethod) == null) {
          CalculatingRouteGrpc.getDisplayDistanceMethod = getDisplayDistanceMethod = 
              io.grpc.MethodDescriptor.<CalculatingRoute.requestAddress, CalculatingRoute.addressDistance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CalculatingRoute.CalculatingRoute", "displayDistance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CalculatingRoute.requestAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CalculatingRoute.addressDistance.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatingRouteMethodDescriptorSupplier("displayDistance"))
                  .build();
          }
        }
     }
     return getDisplayDistanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatingRouteStub newStub(io.grpc.Channel channel) {
    return new CalculatingRouteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatingRouteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatingRouteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatingRouteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatingRouteFutureStub(channel);
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static abstract class CalculatingRouteImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC Method 1
     * </pre>
     */
    public void writeAddress(CalculatingRoute.requestAddress request,
        io.grpc.stub.StreamObserver<CalculatingRoute.lookingAddress> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 3
     * </pre>
     */
    public void displayDistance(CalculatingRoute.requestAddress request,
        io.grpc.stub.StreamObserver<CalculatingRoute.addressDistance> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayDistanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CalculatingRoute.requestAddress,
                CalculatingRoute.lookingAddress>(
                  this, METHODID_WRITE_ADDRESS)))
          .addMethod(
            getDisplayDistanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CalculatingRoute.requestAddress,
                CalculatingRoute.addressDistance>(
                  this, METHODID_DISPLAY_DISTANCE)))
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
  public static final class CalculatingRouteStub extends io.grpc.stub.AbstractStub<CalculatingRouteStub> {
    private CalculatingRouteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatingRouteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatingRouteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatingRouteStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1
     * </pre>
     */
    public void writeAddress(CalculatingRoute.requestAddress request,
        io.grpc.stub.StreamObserver<CalculatingRoute.lookingAddress> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC Method 3
     * </pre>
     */
    public void displayDistance(CalculatingRoute.requestAddress request,
        io.grpc.stub.StreamObserver<CalculatingRoute.addressDistance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisplayDistanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static final class CalculatingRouteBlockingStub extends io.grpc.stub.AbstractStub<CalculatingRouteBlockingStub> {
    private CalculatingRouteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatingRouteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatingRouteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatingRouteBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1
     * </pre>
     */
    public CalculatingRoute.lookingAddress writeAddress(CalculatingRoute.requestAddress request) {
      return blockingUnaryCall(
          getChannel(), getWriteAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC Method 3
     * </pre>
     */
    public CalculatingRoute.addressDistance displayDistance(CalculatingRoute.requestAddress request) {
      return blockingUnaryCall(
          getChannel(), getDisplayDistanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *rpc stands for remote procedure call
   *containsString is the actual message that travel between client and server
   *a second message travels back
   * </pre>
   */
  public static final class CalculatingRouteFutureStub extends io.grpc.stub.AbstractStub<CalculatingRouteFutureStub> {
    private CalculatingRouteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatingRouteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatingRouteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatingRouteFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CalculatingRoute.lookingAddress> writeAddress(
        CalculatingRoute.requestAddress request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC Method 3
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CalculatingRoute.addressDistance> displayDistance(
        CalculatingRoute.requestAddress request) {
      return futureUnaryCall(
          getChannel().newCall(getDisplayDistanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE_ADDRESS = 0;
  private static final int METHODID_DISPLAY_DISTANCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatingRouteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatingRouteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE_ADDRESS:
          serviceImpl.writeAddress((CalculatingRoute.requestAddress) request,
              (io.grpc.stub.StreamObserver<CalculatingRoute.lookingAddress>) responseObserver);
          break;
        case METHODID_DISPLAY_DISTANCE:
          serviceImpl.displayDistance((CalculatingRoute.requestAddress) request,
              (io.grpc.stub.StreamObserver<CalculatingRoute.addressDistance>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatingRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatingRouteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CalculatingRoute.CalculatingRouteImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatingRoute");
    }
  }

  private static final class CalculatingRouteFileDescriptorSupplier
      extends CalculatingRouteBaseDescriptorSupplier {
    CalculatingRouteFileDescriptorSupplier() {}
  }

  private static final class CalculatingRouteMethodDescriptorSupplier
      extends CalculatingRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatingRouteMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatingRouteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatingRouteFileDescriptorSupplier())
              .addMethod(getWriteAddressMethod())
              .addMethod(getDisplayDistanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
