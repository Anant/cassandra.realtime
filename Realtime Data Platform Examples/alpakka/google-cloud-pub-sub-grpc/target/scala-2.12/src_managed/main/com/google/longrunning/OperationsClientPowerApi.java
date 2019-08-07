
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.longrunning;

import akka.grpc.javadsl.SingleResponseRequestBuilder;
import akka.grpc.javadsl.StreamResponseRequestBuilder;

import static com.google.longrunning.Operations.Serializers.*;

public abstract class OperationsClientPowerApi {
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer listOperations(com.google.longrunning.ListOperationsRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<com.google.longrunning.ListOperationsRequest, com.google.longrunning.ListOperationsResponse> listOperations()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer getOperation(com.google.longrunning.GetOperationRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation> getOperation()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer deleteOperation(com.google.longrunning.DeleteOperationRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty> deleteOperation()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer cancelOperation(com.google.longrunning.CancelOperationRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty> cancelOperation()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
}