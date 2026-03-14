package com.scivicslab.llmconsole.vllm;

/**
 * Thrown when the vLLM server rejects a request because the input exceeds
 * the model's maximum context length.
 */
public class ContextLengthExceededException extends RuntimeException {
    public ContextLengthExceededException(String message) {
        super(message);
    }
}
