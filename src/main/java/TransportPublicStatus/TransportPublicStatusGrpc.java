package TransportPublicStatus;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: TransportPublicStatus.proto")
public final class TransportPublicStatusGrpc {

  private TransportPublicStatusGrpc() {}

  public static final String SERVICE_NAME = "TransportPublicStatus.TransportPublicStatus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TransportPublicStatus.transpSelection,
      TransportPublicStatus.transpSelected> getSelectTransportPublicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "selectTransportPublic",
      requestType = TransportPublicStatus.transpSelection.class,
      responseType = TransportPublicStatus.transpSelected.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<TransportPublicStatus.transpSelection,
      TransportPublicStatus.transpSelected> getSelectTransportPublicMethod() {
    io.grpc.MethodDescriptor<TransportPublicStatus.transpSelection, TransportPublicStatus.transpSelected> getSelectTransportPublicMethod;
    if ((getSelectTransportPublicMethod = TransportPublicStatusGrpc.getSelectTransportPublicMethod) == null) {
      synchronized (TransportPublicStatusGrpc.class) {
        if ((getSelectTransportPublicMethod = TransportPublicStatusGrpc.getSelectTransportPublicMethod) == null) {
          TransportPublicStatusGrpc.getSelectTransportPublicMethod = getSelectTransportPublicMethod = 
              io.grpc.MethodDescriptor.<TransportPublicStatus.transpSelection, TransportPublicStatus.transpSelected>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TransportPublicStatus.TransportPublicStatus", "selectTransportPublic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransportPublicStatus.transpSelection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransportPublicStatus.transpSelected.getDefaultInstance()))
                  .setSchemaDescriptor(new TransportPublicStatusMethodDescriptorSupplier("selectTransportPublic"))
                  .build();
          }
        }
     }
     return getSelectTransportPublicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransportPublicStatus.transpStatus,
      TransportPublicStatus.transResponse> getStatusTransportPublicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "statusTransportPublic",
      requestType = TransportPublicStatus.transpStatus.class,
      responseType = TransportPublicStatus.transResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<TransportPublicStatus.transpStatus,
      TransportPublicStatus.transResponse> getStatusTransportPublicMethod() {
    io.grpc.MethodDescriptor<TransportPublicStatus.transpStatus, TransportPublicStatus.transResponse> getStatusTransportPublicMethod;
    if ((getStatusTransportPublicMethod = TransportPublicStatusGrpc.getStatusTransportPublicMethod) == null) {
      synchronized (TransportPublicStatusGrpc.class) {
        if ((getStatusTransportPublicMethod = TransportPublicStatusGrpc.getStatusTransportPublicMethod) == null) {
          TransportPublicStatusGrpc.getStatusTransportPublicMethod = getStatusTransportPublicMethod = 
              io.grpc.MethodDescriptor.<TransportPublicStatus.transpStatus, TransportPublicStatus.transResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TransportPublicStatus.TransportPublicStatus", "statusTransportPublic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransportPublicStatus.transpStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransportPublicStatus.transResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TransportPublicStatusMethodDescriptorSupplier("statusTransportPublic"))
                  .build();
          }
        }
     }
     return getStatusTransportPublicMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransportPublicStatusStub newStub(io.grpc.Channel channel) {
    return new TransportPublicStatusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransportPublicStatusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TransportPublicStatusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransportPublicStatusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TransportPublicStatusFutureStub(channel);
  }

  /**
   */
  public static abstract class TransportPublicStatusImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC Method 1 Client  Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<TransportPublicStatus.transpSelection> selectTransportPublic(
        io.grpc.stub.StreamObserver<TransportPublicStatus.transpSelected> responseObserver) {
      return asyncUnimplementedStreamingCall(getSelectTransportPublicMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2 Bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<TransportPublicStatus.transpStatus> statusTransportPublic(
        io.grpc.stub.StreamObserver<TransportPublicStatus.transResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStatusTransportPublicMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectTransportPublicMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                TransportPublicStatus.transpSelection,
                TransportPublicStatus.transpSelected>(
                  this, METHODID_SELECT_TRANSPORT_PUBLIC)))
          .addMethod(
            getStatusTransportPublicMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                TransportPublicStatus.transpStatus,
                TransportPublicStatus.transResponse>(
                  this, METHODID_STATUS_TRANSPORT_PUBLIC)))
          .build();
    }
  }

  /**
   */
  public static final class TransportPublicStatusStub extends io.grpc.stub.AbstractStub<TransportPublicStatusStub> {
    private TransportPublicStatusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransportPublicStatusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransportPublicStatusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransportPublicStatusStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1 Client  Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<TransportPublicStatus.transpSelection> selectTransportPublic(
        io.grpc.stub.StreamObserver<TransportPublicStatus.transpSelected> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSelectTransportPublicMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2 Bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<TransportPublicStatus.transpStatus> statusTransportPublic(
        io.grpc.stub.StreamObserver<TransportPublicStatus.transResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStatusTransportPublicMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TransportPublicStatusBlockingStub extends io.grpc.stub.AbstractStub<TransportPublicStatusBlockingStub> {
    private TransportPublicStatusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransportPublicStatusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransportPublicStatusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransportPublicStatusBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TransportPublicStatusFutureStub extends io.grpc.stub.AbstractStub<TransportPublicStatusFutureStub> {
    private TransportPublicStatusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransportPublicStatusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransportPublicStatusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransportPublicStatusFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SELECT_TRANSPORT_PUBLIC = 0;
  private static final int METHODID_STATUS_TRANSPORT_PUBLIC = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransportPublicStatusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransportPublicStatusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_TRANSPORT_PUBLIC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.selectTransportPublic(
              (io.grpc.stub.StreamObserver<TransportPublicStatus.transpSelected>) responseObserver);
        case METHODID_STATUS_TRANSPORT_PUBLIC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.statusTransportPublic(
              (io.grpc.stub.StreamObserver<TransportPublicStatus.transResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TransportPublicStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransportPublicStatusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TransportPublicStatus.TransportPublicStatusImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransportPublicStatus");
    }
  }

  private static final class TransportPublicStatusFileDescriptorSupplier
      extends TransportPublicStatusBaseDescriptorSupplier {
    TransportPublicStatusFileDescriptorSupplier() {}
  }

  private static final class TransportPublicStatusMethodDescriptorSupplier
      extends TransportPublicStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransportPublicStatusMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransportPublicStatusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransportPublicStatusFileDescriptorSupplier())
              .addMethod(getSelectTransportPublicMethod())
              .addMethod(getStatusTransportPublicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
