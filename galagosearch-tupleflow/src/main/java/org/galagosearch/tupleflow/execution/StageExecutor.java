// BSD License (http://www.galagosearch.org/license)

package org.galagosearch.tupleflow.execution;

/**
 * This interface marks classes that can be used to execute TupleFlow job
 * stages.
 * 
 * @author trevor
 */
public interface StageExecutor {
    StageExecutionStatus execute(StageGroupDescription stage, String temporary);
    void shutdown();
}
