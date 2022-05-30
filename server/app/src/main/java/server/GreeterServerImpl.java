package server;

import io.grpc.examples.GreeterGrpc;
import io.grpc.examples.HelloReply;
import io.grpc.examples.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterServerImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        responseObserver.onNext(HelloReply.newBuilder().setMessage("moishe!").build());

        responseObserver.onCompleted();
    }
}
