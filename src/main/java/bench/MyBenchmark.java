package bench;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1, warmups = 1)
public class MyBenchmark {

    private seqMessageBoard messageBoard;

    @Setup
    public void setup() {
        // Initialize the message board before each benchmark
        messageBoard = new seqMessageBoard();
    }

    @Benchmark
    @Threads(4) // Specify the number of threads for this benchmark
    public void writeMessageBenchmark() {
        // Perform the writeMessage operation in your benchmark
        messageBoard.writeMessage("Sample message");
    }

    @Benchmark
    @Threads(4) // Specify the number of threads for this benchmark
    public void readMessagesBenchmark() {
        // Perform the readMessages operation in your benchmark
        messageBoard.readMessages();
    }
}
